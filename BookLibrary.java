/**
 *  Final Project
 *  This class allows us to store books and see if we already have them
 *  CS108
 *  May 14, 2020
 *  @author Jesus Davila
 */
import java.util.ArrayList;
import java.util.Scanner;

public class BookLibrary {
    // This method tells us the option if the books are available
    public static void main(String args[]){
        BookFinder a=new BookSearcher();
        Display d = new Display();
        ArrayList<String> books = new ArrayList<String>();
        Scanner sc= new Scanner(System.in);
        String book;
        int choice;

        do{
            // This method allows us to interact to enter a book we want to see
            System.out.println("\n1. Store a book name");
            System.out.println("2. Exit\n");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1){
                System.out.print("\nEnter a book name you want to add to your library: ");
                book = sc.nextLine();
                books.add(book);
            }
            else if(choice == 2){
                break;
            }
            else{
                System.out.print("\nPlease choose a valid option");
            }
        }while(true);

        System.out.print("\nEnter a book name you want to search in your library: ");
        book = sc.nextLine();

        a.sort(books);
        int last = books.size();
        int result = a.binarySearch(books,0,last,book);

        if (result == -1){
            System.out.println("\n-----------------------------------------------");
            System.out.println("Sorry, the Book " + book +" is not found in your library!");
            System.out.println("-----------------------------------------------\n");
        }
        else{
            System.out.println("\n-----------------------------------------------");
            System.out.println("The Book " + book +" is present in your library!");
            System.out.println("-----------------------------------------------\n");
        }

        System.out.println("\nYour Book library in sorted order is:\n");
        d.display(books);

        System.out.println("\n================ UNIT TESTING ================\n");
        // The books are added to your list
        ArrayList<String> booksTest_1 = new ArrayList<String>();
        booksTest_1.add("The Origin");
        booksTest_1.add("Half Girlfriend");
        booksTest_1.add("To Kill a Mockingbird");
        booksTest_1.add("A Time to Kill");
        booksTest_1.add("Journey to the Center of the Earth");

        ArrayList<String> booksTest_2 = new ArrayList<String>();
        booksTest_2.add("What a Time to live");

        ArrayList<String> booksTest_3 = new ArrayList<String>();

        UnitTests u = new UnitTests();

        do{
            System.out.println("1. BookSearchTest");
            System.out.println("2. BookSortTest");
            System.out.println("3. DisplayTest");
            System.out.println("4. Exit");
            System.out.print("Please choose an option to test respective method: ");
            choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                System.out.println("\nTesting with booksTest_1\n");
                u.BookSearchTest(booksTest_1, "To Kill a Mockingbird");
                u.BookSearchTest(booksTest_1, "Hello World!");

                System.out.println("Testing with booksTest_2\n");
                u.BookSearchTest(booksTest_2, "What a Time to live");
                u.BookSearchTest(booksTest_2, "Hello World!");

                System.out.println("Testing with booksTest_3\n");
                u.BookSearchTest(booksTest_3, "Hello World!");
            }
            else if (choice == 2){
                System.out.println("\nTesting with booksTest_1\n");
                u.BookSortTest(booksTest_1);
                System.out.println("Testing with booksTest_2\n");
                u.BookSortTest(booksTest_2);
                System.out.println("Testing with booksTest_3\n");
                u.BookSortTest(booksTest_3);
            }
            else if (choice == 3){
                System.out.println("\nTesting with booksTest_1\n");
                u.DisplayTest(booksTest_1);
                System.out.println("Testing with booksTest_2\n");
                u.DisplayTest(booksTest_2);

                System.out.println("Testing with booksTest_3\n");
                u.DisplayTest(booksTest_3);
            }
            else if (choice == 4){
                break;
            }
            else
                System.out.println("Please choose a valid option!");
        }while(true);
    }
}
