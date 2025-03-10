import java.util.Scanner;
//class book
class Book {
    //attributes
    String title;
    String author;
    int price;

    //display method
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
class HandleBookDetails{
     public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
         //creating the book object
         Book book =new Book();
         //input
         System.out.print("Enter the title of book: ");
         book.title =sc.nextLine();
         System.out.print("Enter the author of book: ");
         book.author =sc.nextLine();
         System.out.print("Enter the price of book: ");
         book.price =sc.nextInt();
         //output
         book.display();

     }
}
/*Enter the title of book: hello
Enter the author of book: world
Enter the price of book: 2000
Title: hello
Author: world
Price: 2000
 */