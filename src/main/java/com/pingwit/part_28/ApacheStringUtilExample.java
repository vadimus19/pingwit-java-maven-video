package com.pingwit.part_28;

import org.apache.commons.lang3.StringUtils;

public class ApacheStringUtilExample {
    public static void main(String[] args) {
        System.out.println("===capitalize==");
        System.out.println(StringUtils.capitalize("cat"));
        System.out.println(StringUtils.capitalize("cAT"));
        System.out.println(StringUtils.capitalize("cAt"));

        System.out.println("===is empty==");
        System.out.println(StringUtils.isEmpty(null));
        System.out.println(StringUtils.isEmpty("A"));
        System.out.println(StringUtils.isEmpty(" "));

        System.out.println("===isNotEmpty===");
        System.out.println(StringUtils.isNotEmpty(null));
        System.out.println(StringUtils.isNotEmpty("A"));
        System.out.println(StringUtils.isNotEmpty(" "));

        System.out.println("===isBlank");
        System.out.println(StringUtils.isBlank(null));
        System.out.println(StringUtils.isBlank("A"));
        System.out.println(StringUtils.isBlank(" "));

        System.out.println("===centre");
        System.out.println(StringUtils.center("aa", 4));
        System.out.println(StringUtils.center("a", 4,"y"));

    }
}
