import java.util.*;
class book{
   private String title;
   private String author;
   private String isbn;
   private boolean isAvailable;
}

book(String title, String author, String isbn){
    this.title = title;
    this.author = author;
    this.isbn = isbn;
    this.isAvailable = true;
}

void borrowbook(){
 if(isAvailable){
    isAvailable = false;
    System.out.println("book borrowd successfully");
 }
 else if(!isAvailable){
System.out.println("Book already borrowed");
 }
}

public void returnbook(){
    isAvailable = true;
    System.out.println("book is returned successfully");
}

public String gettitle(){
    return title;
}
public String getisbn(){
    return isbn;
}
public boolean getisAvailable(){
    return isAvailable;
}

public void displayBook(){
    System.out.println("Title" + ":" + title + " "
     + "Author" + ":" + author + "isbn" + ":" + 
     isbn + "Available" + ":" + isAvailable);
}

public class library(){
private List<book> books = new ArrayList<>();

public void addBook(book b){
    books.add(b);
    System.out.println("Books added successfully");
}

public void SearchBook(String title){
    boolean found = false;
for(book b : books){
    if(b.gettitle.equalsIgnoreCase(title)){
b.display();
found = true;
    }
    else if(!found){
        System.out.println("Book is not found");
    }
}
}

public void borrowBook(String isbn){
    for(book b : books){
        if(b.getisbn.equals(isbn)){
            b.borrowbook();
            return;
        }
    }
    System.out.println("Bookss are not found");
}
public void displayAvailableBooks(){
    System.out.println("Available books");
    for(book b: books){
        if(b.isAvailable){
            b.display();
        }
    }
}
}
public class library{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        library lib = new Library();
         int choice;
         do{
            System.out.println("1.Add book");
            System.out.println("2.Search book");
            System.out.println("3.Borrow books");
            System.out.println("4.Availability cheack");
            System.out.println("5.Exit");
            choice = scan.nextInt();
            scan.nextLine();

            Switch(choice){
                case 1:
                    System.out.println("Enter title");
                    String title = scan.nextLine();
    
                    System.out.println("Enter author");
                    String author = scan.nextLine();
    
                    System.out.println("Enter isbn");
                    String isbn = scan.nextLine();
    
                    book Boo = new book(title, author, isbn);
                    lib.addBook(book);
                    break;

                case 2:
                    System.out.println("Search the book");
                    String Search = scan.nextLine();
                    lib.SearchBook(Search);
                    break;

                case 3:
                    System.out.println("Borrow books");
                    String borrow = scan.nextLine();
                    lib.borrowBook(borrow);
                    break;

                case 4:
                    System.out.println("Availability cheak");
                    lib.displayAvailableBooks();
                    break;

                case 5:
                    Ststem.out.println("Exiting");

                default:
                System.out.println("Invalid choice");
            }
            }while(choice!=5);
         }
    }



