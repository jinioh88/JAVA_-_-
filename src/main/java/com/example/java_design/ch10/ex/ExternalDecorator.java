package com.example.java_design.ch10.ex;

public class ExternalDecorator extends ContentDecorator {
    public ExternalDecorator(EmailContent emailContent) {
        super(emailContent);
    }

    @Override
    String getContent() {
        String content = super.getContent();
        String externalContent = addDisclaimer(content);
        return externalContent;
    }

    private String addDisclaimer(String content) {
        return content + " Company Disclaimer";
    }
}
