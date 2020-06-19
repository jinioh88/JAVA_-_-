package com.example.java_design.ch11.ex;

import java.util.ArrayList;
import java.util.List;

public abstract class ReportGenerator {
    public String generate(List<Customer> customers) {
        List<Customer> selectedCustomers = select(customers);
        String report = getReportHeader(selectedCustomers);

        for(int i = 0; i < selectedCustomers.size(); i++) {
            Customer customer = selectedCustomers.get(i);
            report += getReportForCustomer(customer);
        }

        report += getReportFooter(selectedCustomers);

        return report;
    }

    protected List<Customer> select(List<Customer> customers) {
        List<Customer> selected = new ArrayList<>();
        for(Customer c : customers) {
            if(customerReportCondition(c)) {
                selected.add(c);
            }
        }

        return selected;
    }

    protected abstract boolean customerReportCondition(Customer c);
    protected abstract String getReportHeader(List<Customer> selectedCustomers);
    protected abstract String getReportForCustomer(Customer customer);
    protected abstract String getReportFooter(List<Customer> selectedCustomers);
}
