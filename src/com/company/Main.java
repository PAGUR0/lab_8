package com.company;

import java.util.Scanner;

class Reader{

    protected String name;
    protected int number;
    protected String faculty;
    private String data;
    private int phone;

    Reader(String name, int number, String faculty, String data, int phone){
        this.name = name;
        this.number = number;
        this.faculty = faculty;
        this.data = data;
        this.phone = phone;
    }

    public void takeBook(int number_books) {
        System.out.println(this.name + " взял " + number_books + " книги.");
    }

    public void takeBook(String[] book_title) {
        String books = String.join(",",book_title);
        System.out.println(this.name + "взял книги : " + books + ".");
    }

    public void returnBook(int number_books) {
        System.out.println(this.name + " вернул " + number_books + " книги.");
    }

    public void returnBook(String[] book_title) {
        String books = String.join(",",book_title);
        System.out.println(this.name + " вернул книги: " + books + ".");
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

	    Reader[] array_reader = new Reader[5];

        for(int i = 0; i < array_reader.length; i++){
            String name = in.next();
            int number = in.nextInt();
            String faculty = in.next();
            String data = in.next();
            int phone = in.nextInt();
            array_reader[i] = new Reader(name, number, faculty, data, phone);
        }
    }
}
