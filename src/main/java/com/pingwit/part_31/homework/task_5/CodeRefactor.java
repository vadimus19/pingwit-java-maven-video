package com.pingwit.part_31.homework.task_5;

public class CodeRefactor {
    public static void main(String[] args) {
        Website website = new Website("https://www.uefa.com", WebsiteType.SPORT);

        String url = website.getUrl();

        WebsiteType type = website.getType();

        System.out.println(url);
// лишняя строка, удали
        System.out.println(type);
// лишняя строка, удали
    }

}



