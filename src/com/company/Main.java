package com.company;

public class Main {



    public static void main(String[] args) {
        StoringInt store = new StoringInt(10);

        store.addInt(10);
        store.addInt(11);
        store.addInt(12);
        store.addInt(13);
        store.addInt(14);
        store.display();
        store.removeInt(2);
        store.display();

    }
}
