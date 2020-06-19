package com.example.java_design.ch10.ex;

public class SecureDecorator extends ContentDecorator {
    public SecureDecorator(EmailContent emailContent) {
        super(emailContent);
    }

    @Override
    String getContent() {
        String content = super.getContent();
        String encryptedContent = encrypt(content);
        return encryptedContent;
    }

    private String encrypt(String content) {
        return content + " Encrypted";
    }
}
