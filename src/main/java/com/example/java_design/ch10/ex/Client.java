package com.example.java_design.ch10.ex;

import java.awt.*;

public class Client {
    public static void main(String[] args) {
        EmailContent simple = new BasicEmailContent("Hello");
        System.out.println(simple.getContent());

        EmailContent external = new ExternalDecorator(simple);
        System.out.println(external.getContent());

        EmailContent secureDecorator = new SecureDecorator(simple);
        System.out.println(secureDecorator.getContent());

        EmailContent externalAndSecureDeco = new SecureDecorator(external);
        System.out.println(externalAndSecureDeco.getContent());
    }
}
