package com.example.demo;

public class Reception {

    public String get(String name){
        //return "Hello " + name;
        //return String.join(" ", "Hello", name);
        //return "Hello ".concat(name);
        //return String.format("Hello %s", name);
        StringBuilder builder = new StringBuilder();
        builder.append("Hello ").append(name);
        return builder.toString();
    }
}
