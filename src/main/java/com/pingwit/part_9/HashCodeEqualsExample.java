package com.pingwit.part_9;

public class HashCodeEqualsExample {
    public static void main(String[] args) {
        Cat murzik = new Cat("Siam", "black");
        Cat sharik = new Cat("Siam", "black");
        Cat white = new Cat("pers", "white");

        Cat murzikClone = murzik;

        System.out.println(murzik == sharik);
        System.out.println(murzik.equals(sharik));
        System.out.println(murzikClone.equals(murzik));
        System.out.println(murzik.hashCode());
        System.out.println(sharik.hashCode());
        System.out.println(white.hashCode());

    }
}
