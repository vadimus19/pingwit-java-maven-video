package com.pingwit.part_31.homework.task_5;

public class CodeRefactor {
    public static void main(String[] args) {
        Website website = new Website("https://www.uefa.com", WebsiteType.SPORT);

        String url = website.getUrl();

        WebsiteType type = website.getType();

        System.out.println(url);

        System.out.println(type);

    }

}

class Website {

    private String url;

    private WebsiteType type;


    public Website(String url, WebsiteType type) {

        this.url = url;

        this.type = type;

    }

    public String getUrl() {

        return url;

    }

    public WebsiteType getType() {

        return type;

    }

}

enum WebsiteType {

    NEWS,

    MUSIC,

    SPORT

}



