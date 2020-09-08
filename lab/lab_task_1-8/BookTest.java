package com.company;


public class BookTest {

    public static void main(String[] args) {
	Book Remark = new Book("Ремарк", "Three Friends", 1950);

	System.out.println(Remark.getAuthor());
	System.out.println(Remark.getYear());

	Remark.setName("Искра жизни");

	System.out.println(Remark.getName());

    }

}
