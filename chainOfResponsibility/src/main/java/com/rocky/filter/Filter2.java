package com.rocky.filter;

public class Filter2 implements Filter {

    public String doFilter(String msg) {
        return msg.replace("&", "");
    }
}
