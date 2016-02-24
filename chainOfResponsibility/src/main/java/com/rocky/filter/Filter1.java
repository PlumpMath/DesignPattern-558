package com.rocky.filter;

public class Filter1 implements Filter {

    public String doFilter(String msg) {
        return msg.replace("$", "");
    }
}
