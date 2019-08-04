package com.springcloud.book.ch5_3_hystrix_collapsing.provider.model;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2019/8/4
 * @Time: 18:11
 * @email: inwsy@hotmail.com
 * Description:
 */
public class User {
    private String name;
    private int age;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

}
