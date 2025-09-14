package oops;

class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been added!");
    }

    void showAvailableBooks(){
        System.out.println("Available Books are: ");
        for(String book: this.books){
            if(book == null) continue;
            System.out.println("* " + book);
        }
    }

    void issueBook(String book){
        for(int i=0; i<this.books.length; i++){
            if(this.books[i] != null && this.books[i].equals(book)){
                System.out.println("The book has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not exist !!");
    }

    void returnBook(String book){
        addBook(book);
    }
}
public class LibraryManagement {
    public static void main(String[] args) {
        // You have to implement a library using a java class "Library"
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books
        // Array to store the issued books

        Library library = new Library();
        library.addBook("Think and grow Rich");
        library.addBook("Data Structures and Algorithms");
        library.addBook("C++");
//        library.showAvailableBooks();
        library.issueBook("Data Structures and Algorithms");
        library.showAvailableBooks();

        library.returnBook("Data Structures and Algorithms");
        library.showAvailableBooks();
    }
}
