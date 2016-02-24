package com.rocky.filter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String msg = "filter the symbol $ and &";
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new Filter1()).addFilter(new Filter2());
        msg = filterChain.doFilter(msg);
        System.out.println(msg);
    }
}
