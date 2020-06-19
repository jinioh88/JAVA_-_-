package com.example.java_design.ch11.ex;

import java.util.List;

public class ComplexReportGenerator extends ReportGenerator {
    @Override
    protected boolean customerReportCondition(Customer c) {
        return c.getPoint() >= 100;
    }

    @Override
    protected String getReportHeader(List<Customer> selectedCustomers) {
        return String.format("고객 수: %d명 입니다\n", selectedCustomers.size());
    }

    @Override
    protected String getReportForCustomer(Customer customer) {
        return String.format("%d: %s\n", customer.getPoint(), customer.getName());
    }

    @Override
    protected String getReportFooter(List<Customer> selectedCustomers) {
        int totalPoint = 0;

        for(Customer customer : selectedCustomers) {
            totalPoint += customer.getPoint();
        }

        return String.format("%d", totalPoint);
    }
}
