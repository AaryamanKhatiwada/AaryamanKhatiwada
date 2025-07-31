// Aryaman Khatiwada Section-H
import java.util.*;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String toString() {
        return title + " by " + author;
    }
}

public class LibraryManagementSystem {

    // Wildcard method to print any List of Book or its subclasses
    public static void printBookList(List<? extends Book> bookList) {
        for (Book b : bookList) {
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        // Books added in ArrayList
        ArrayList<Book> bookObject = new ArrayList<>();
        bookObject.add(new Book("Moby-Dick", "Herman Melville"));
        bookObject.add(new Book("Pride and Prejudice", "Jane Austen"));
        bookObject.add(new Book("The Red and the Black", "Stendhal"));
        bookObject.add(new Book("Le Père Goriot", "Honoré de Balzac"));
        bookObject.add(new Book("Madame Bovary", "Gustave Flaubert"));

        // Borrowed books maintained in a HashSet
        HashSet<Book> borrowedBooksObj = new HashSet<>();
        borrowedBooksObj.add(new Book("Pride and Prejudice", "Jane Austen"));
        borrowedBooksObj.add(new Book("Le Père Goriot", "Honoré de Balzac"));

        // Convert HashSet to ArrayList for map assignment
        ArrayList<Book> borrowedBookList = new ArrayList<>(borrowedBooksObj);

        // Assign each member ID to its list of borrowed books
        HashMap<String, ArrayList<Book>> memberID = new HashMap<>();
        memberID.put("8917", borrowedBookList);
        memberID.put("key891", new ArrayList<>(borrowedBookList));

        // Using enhanced loop to print all books
        System.out.println("All Books:");
        for (Book book : bookObject) {
            System.out.println(book);
        }

        // Using iterator to print borrowed books
        System.out.println("\nBorrowed Books:");
        Iterator<Book> it = borrowedBooksObj.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Using wildcard method to print member-borrowed books
        System.out.println("\nMember Borrow Details:");
        for (String memberIDKey : memberID.keySet()) {
            System.out.println("Member ID: " + memberIDKey);
            printBookList(memberID.get(memberIDKey));
        }
    }
}
