package org.example;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<String> availableBooks;
    private List<Students> registeredStudents;  // Ensure Student class is defined

    // Constructor
    public Library() {
        availableBooks = new ArrayList<>();  // Initialize the class-level availableBooks list
        registeredStudents = new ArrayList<>();  // Initialize the class-level registeredStudents list
    }

    // Method to add a book
    public void addBook(String bookName) {
        availableBooks.add(bookName);
    }

    // Method to register a student
    public void registerStudent(Students student) {
        registeredStudents.add(student);// Add a student to the registeredStudents list
        System.out.println("Student " + student.getName() + " registered successfully!");
    }


    // Method to borrow a book
    public void borrowBook(String bookName, Students student, LocalDate borrowDate) {
        // Check if the book is available
        if (availableBooks.contains(bookName)) {
            student.borrowBook(bookName, borrowDate);
            availableBooks.remove(bookName);
            System.out.println(bookName + " borrowed successfully! by " + student.getName() );
        } else {
            System.out.println("Book not available.");
        }
    }
    // Method to return a book
    public void returnBook(String bookName, Students student, LocalDate returnDate) {
        List<BorrowedBook> borrowedBooks = student.getBorrowedBooks();
        boolean found = false;
        for (BorrowedBook borrowedBook : borrowedBooks) {
            if (borrowedBook.getBookName().equals(bookName)) {
                int lateFee = borrowedBook.calculateLateFee(returnDate);
                if (lateFee > 0) {
                    System.out.println("Late fee charged: " + lateFee);
                }
                borrowedBooks.remove(borrowedBook);
                availableBooks.add(bookName);
                System.out.println(student.getName() + " Book returned successfully!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("This book was not borrowed by the student.");
        }
    }

}
