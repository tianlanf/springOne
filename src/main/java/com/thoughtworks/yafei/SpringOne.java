package com.thoughtworks.yafei;

public class SpringOne {

    private String name;

    public String sayOne() {
        return "This is spring one created by " + this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
