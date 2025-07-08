# Quantum Book Store – Java OOP Internship Task

This project is a simulation of an online book store system developed using object-oriented programming in Java. It was created as part of an internship application and includes functionality for managing different types of books, purchasing them, and removing outdated entries from inventory.

## Features

- Add books to inventory with:
  - ISBN
  - Title
  - Year of publication
  - Price
  - Additional properties depending on the book type (stock, file type, etc.)

- Book types supported:
  - PaperBook: has stock and can be shipped to an address
  - EBook: has a file type and can be emailed to a reader
  - DemoBook: display-only book that cannot be purchased
  - AudioBook: a new type added to show how the system can be easily extensible, so that we don’t need to modify it if we’ve added a new type of products

- Purchase functionality:
  - Search by ISBN
  - Check availability
  - Reduce quantity
  - Simulate shipping or email delivery
  - Return total price

- Remove outdated books based on year as choosen
- All output messages begin with: "Quantum Book Store"

## Design Note

/* IMPORTANT NOTE: I added a new product type (AudioBook) to show how the system can be easily  
   extensible, so that we don’t need to modify it if we’ve added a new type of products */

The system is designed using abstraction and polymorphism, so new product types can be added by simply extending the base class without modifying existing code.

## How to Run

NOTE: ACCESS THE CLASSES DIRECTLY OR DOWNLOAD THE ZIP FILE.

1. Open a terminal in the folder containing the file.
2. Compile the Java file:

   javac QuantumBookstoreFullTest.java

3. Run the program:

   java QuantumBookstoreFullTest

## Author

This project was written manually in plain Java as part of an internship application. It follows the requirements provided in the task.

Yomna Medhat Saad Hashem
