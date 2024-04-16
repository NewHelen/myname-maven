package org.example;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {

        String name = "Olena";
        String lastName = "Zakharina";

        Gson gson = new Gson();
        String json = gson.toJson(new Name(name, lastName));
        System.out.println(json);
    }
    public static class Name {
        String name;
        String lastName;

        public Name(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }
    }
}
