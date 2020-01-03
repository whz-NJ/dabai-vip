package com.gupao.edu.vip.nio.demo;

public class User {
        private int id;

        private String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }
        public String getName2() {
            return "hahah";
        }
        public String getName() {
            String str1 = getName2();
            return str1;
        }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}