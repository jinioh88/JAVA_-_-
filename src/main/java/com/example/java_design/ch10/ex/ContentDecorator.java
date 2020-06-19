package com.example.java_design.ch10.ex;

public abstract class ContentDecorator extends EmailContent {
    private EmailContent emailContent;

    public ContentDecorator(EmailContent emailContent) {
        this.emailContent = emailContent;
    }

    @Override
    String getContent() {
        return emailContent.getContent();
    }
}
