/*
 *  Final Project
 *  This class allows us to test our code about our books
 *  CS108
 *  May 14, 2020
 *  @author Jesus Davila
 */
import java.util.ArrayList;

public class UnitTests {
    // these methods show the tests that are going on
    public static void DisplayTest(ArrayList<String> arr){
        Display d = new Display();
        d.display(arr);
    }

    public static void BookSortTest(ArrayList<String> arr){
        BookFinder a = new BookSearcher();
        a.sort(arr);
        DisplayTest(arr);
    }

    public static void BookSearchTest(ArrayList<String> arr, String book){
        BookFinder a=new BookSearcher();
        a.sort(arr);
        int last = arr.size();
        int result = a.binarySearch(arr,0,last,book);
        if (result == -1){
            // This if statement tells the screen if the books were found or not
            System.out.println("\n-----------------------------------------------");
            System.out.println("Sorry, the Book " + book +" is not found in your library!");
            System.out.println("-----------------------------------------------\n");
        }
        else{
            System.out.println("\n-----------------------------------------------");
            System.out.println("The Book " + book +" is present in your library!");
            System.out.println("-----------------------------------------------\n");
        }
    }
}
