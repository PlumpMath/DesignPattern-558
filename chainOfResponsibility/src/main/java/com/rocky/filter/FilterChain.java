package com.rocky.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {

    List<Filter> filters = new ArrayList<Filter>();

    public FilterChain addFilter(Filter filter) {
        filters.add(filter);
        return this;
    }

    public String doFilter(String msg) {
        String result = msg;
        for (Filter filter : filters) {
            result = filter.doFilter(result);
        }
        return result;
    }
}
