package com.example.java_design.ch10.ex;

public class BasicEmailContent extends EmailContent {
    private String content;

    public BasicEmailContent(String content) {
        this.content = content;
    }

    @Override
    String getContent() {
        return content;
    }
}
