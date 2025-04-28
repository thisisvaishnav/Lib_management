package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Students {
    private String name;
    private int age;
    private int rollNumber;
    private String department;
    private List<BorrowedBook> borrowedBooks;

    // Setters
    public Students() {
        borrowedBooks = new ArrayList<>(); // Initialize borrowedBooks list
    }
    public Students(String name, int age, int rollNumber, String department) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.department = department;
        this.borrowedBooks = new ArrayList<>();  // Initialize the list
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setBorrowedBooks(List<BorrowedBook> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getDepartment() {
        return department;
    }

    public List<BorrowedBook> getBorrowedBooks() {
        return borrowedBooks;
    }
    public void borrowBook(String bookName, LocalDate borrowDate){
        BorrowedBook borrowedBook = new BorrowedBook(bookName, borrowDate);
        borrowedBooks.add(borrowedBook);
    }

}
