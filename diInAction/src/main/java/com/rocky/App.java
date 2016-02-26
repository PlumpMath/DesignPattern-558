package com.rocky;

import com.rocky.spring.BeanFactory;
import com.rocky.spring.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main ( String[] args ) throws Exception
    {

        BeanFactory beanFactory = new ClassPathXmlApplicationContext();
        UserService userService = (UserService)beanFactory.getBean("userService");

        userService.addUser(new User());
    }
}
