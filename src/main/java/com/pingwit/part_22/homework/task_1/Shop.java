package com.pingwit.part_22.homework.task_1;

 class Shop { // ShopsList -> у тебя этот класс отвечает за 1 магазин, слово List из названия стоит убрать
     private String name;
     private String id;

     public Shop(String name, String id) {
         this.name = name;
         this.id = id;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getId() {
         return id;
     }

     public void setId(String id) {
         this.id = id;
     }

     @Override
     public String toString() {
         return "ShopsList{" +
                 "name='" + name + '\'' +
                 ", id='" + id + '\'' +
                 '}';
     }
 }
