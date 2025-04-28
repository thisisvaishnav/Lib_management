package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class BorrowedBook {
    private String bookName;
    private LocalDate borrowDate;
    private LocalDate dueDate;
    private static final double LATE_FEE_PER_DAY = 10;


    // Constructor to initialize with borrow date
    public BorrowedBook(String bookName, LocalDate borrowDate) {
        this.bookName = bookName;
        this.borrowDate = borrowDate;
        this.dueDate = borrowDate.plusDays(30);

    }

    public String getBookName() {
        return bookName;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }


    public String getFormattedBorrowDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return borrowDate.format(formatter);
    }


    public String getFormattedDueDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return dueDate.format(formatter);
    }
    public int calculateLateFee(LocalDate returnDate) {
        if(returnDate.isAfter(dueDate)){
            double overdueDays = ChronoUnit.DAYS.between(dueDate, returnDate);
            return (int) (overdueDays * LATE_FEE_PER_DAY);
        }
        return 0;
    }
}
