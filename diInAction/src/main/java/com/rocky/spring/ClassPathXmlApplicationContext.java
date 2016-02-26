package com.rocky.spring;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassPathXmlApplicationContext implements BeanFactory {

    private Map<String, Object> beans = new HashMap<String, Object>();

    public ClassPathXmlApplicationContext () throws Exception{

        SAXBuilder saxBuilder = new SAXBuilder();
        Document document = saxBuilder.build(this.getClass().getClassLoader().getResourceAsStream("beans.xml"));
        Element rooElement = document.getRootElement();

        List beanList = rooElement.getChildren("bean");
        for (int i=0; i < beanList.size(); i++) {
            Element bean = (Element)beanList.get(i);
            String id = bean.getAttributeValue("id");
            String className = bean.getAttributeValue("class");
            Object o = Class.forName(className).newInstance();
            beans.put(id, o);

            List properties = bean.getChildren("property");
            for (int j=0; j < properties.size(); j++) {
                Element property = (Element)properties.get(j);
                String propertyName = property.getAttributeValue("name");
                String propertyBean = property.getAttributeValue("bean");

                String methodName = "set" + propertyName.substring(0, 1).toUpperCase() + propertyName.substring(1);

                Method propertySetter = o.getClass().getMethod(methodName, beans.get(propertyBean).getClass());
                propertySetter.invoke(o, beans.get(propertyBean));
            }
        }
    }

    public Object getBean(String id) {
        return beans.get(id);
    }
}
