package com.fyd.ioc_05;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/1/27  21:21
 * Description:
 */
public class JavaBean {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "JavaBean{" +
                "name='" + name + '\'' +
                '}';
    }
}
