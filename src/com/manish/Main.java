package com.manish;

public class Main {

    public static void main(String[] args) {
	  Email emp = new Email("Tim", "Smith");
	  emp.setAlternateEmail("smithtim@gmail.com");
        System.out.println("Your alternative email: "+emp.getAlternateEmail());
        System.out.println(emp.toString());


    }
}
