package com.infoshare.User;

public class Admin implements User {

    @Override
    public void showInfo(String name, String role) {

        System.out.println(name+" - "+role);

    }
}
