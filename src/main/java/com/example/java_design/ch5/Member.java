package com.example.java_design.ch5;

public class Member {
    private String name;
    private int sumPrice;
    private AddPriceStrategy priceStrategy;

    public void buyBook(Book book) {
        System.out.println("buy " + book.getName());
        if(book.getYear() >= 10) {
            setPriceStrategy(new TenYearStrategy());
        } else if (this.getSumPrice() > 10000) {
            setPriceStrategy(new MemberPriceStrategy());
        }

        addSumPrice();
    }

    public int getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(int sumPrice) {
        this.sumPrice = sumPrice;
    }

    public void setPriceStrategy(AddPriceStrategy priceStrategy) {
        this.priceStrategy = priceStrategy;
    }

    private void addSumPrice() {
        priceStrategy.addPrice();
    }

    public static void main(String[] args) {
        Member member = new Member();
        member.buyBook(new Book("hong", 10, 9900));

        Member member2 = new Member();
        member2.setSumPrice(15000);
        member2.buyBook(new Book("Choon", 6, 8500));
    }
}
