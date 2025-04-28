import org.example.Library;
import org.example.Students;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Create Student objects
        Students student1 = new Students();
        student1.setName("John Doe");
        student1.setAge(20);
        student1.setRollNumber(101);
        student1.setDepartment("Computer Science");

        Students student2 = new Students();
        student2.setName("Jane Smith");
        student2.setAge(22);
        student2.setRollNumber(102);
        student2.setDepartment("Electrical Engineering");


        Library svhlibrary = new Library();

        // Register students
        svhlibrary.registerStudent(student1);
        svhlibrary.registerStudent(student2);

        // Add books to the library
        svhlibrary.addBook("The Art of War");
        svhlibrary.addBook("1984");
        svhlibrary.addBook("Pride and Prejudice");
        svhlibrary.addBook("The Catcher in the Rye");
        svhlibrary.addBook("To Kill a Mockingbird");
        svhlibrary.addBook("The Great Gatsby");
        svhlibrary.addBook("Moby-Dick");
        svhlibrary.addBook("The Picture of Dorian Gray");
        svhlibrary.addBook("Wuthering Heights");
        svhlibrary.addBook("Dracula");
        svhlibrary.addBook("The Stranger");
        svhlibrary.addBook("The Grapes of Wrath");
        svhlibrary.addBook("The Trial");
        svhlibrary.addBook("The Metamorphosis");
        svhlibrary.addBook("The Kite Runner");
        svhlibrary.addBook("A Tale of Two Cities");
        svhlibrary.addBook("The Road");
        svhlibrary.addBook("Slaughterhouse-Five");
        svhlibrary.addBook("The Secret Garden");
        svhlibrary.addBook("The Sun Also Rises");
        svhlibrary.addBook("The Bell Jar");
        svhlibrary.addBook("The Outsiders");
        svhlibrary.addBook("A Clockwork Orange");
        svhlibrary.addBook("One Hundred Years of Solitude");
        svhlibrary.addBook("The Shining");
        svhlibrary.addBook("The Hitchhiker's Guide to the Galaxy");
        svhlibrary.addBook("The Color Purple");
        svhlibrary.addBook("A Midsummer Night's Dream");
        svhlibrary.addBook("The Handmaid's Tale");
        svhlibrary.addBook("Lord of the Flies");
        svhlibrary.addBook("Siddhartha");
        svhlibrary.addBook("The Alchemist");
        svhlibrary.addBook("The Wind-Up Bird Chronicle");
        svhlibrary.addBook("The Fault in Our Stars");
        svhlibrary.addBook("Gone with the Wind");


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate borrowDate = LocalDate.parse("12-12-2025", formatter);


        svhlibrary.borrowBook("1984", student1, borrowDate);  // Corrected this line
        svhlibrary.borrowBook("The Catcher in the Rye", student2, borrowDate) ; // Added borrow date

        // Return books
        svhlibrary.returnBook("1984", student1);
        svhlibrary.returnBook("The Catcher in the Rye", student2);
    }
}
