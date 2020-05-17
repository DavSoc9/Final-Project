/**
 *  Final Project
 *  This class allows us to find books in our search history
 *  CS108
 *  May 14, 2020
 *  @author Jesus Davila
 */
import java.util.ArrayList;

public class BookSearcher extends BookSorter {
    public int binarySearch(ArrayList<String> arr, int first, int last, String book){
        //These if else statements helps us find the book as needed

        if(arr.size() == 0){
            System.out.println("\n-----------------------------------------------");
            System.out.println("Your library is empty!");
            System.out.println("-----------------------------------------------\n");
            return -1;
        }
        else if (arr.size() == 1){
            if(book.equals(arr.get(0))){
                return 0;
            }
            else{
                return -1;
            }
        }
        else{
            // Need to find the books
            if (last >= first){
                int mid = first + (last - first)/2;
                if ( (arr.get(mid)).equals(book) ){
                    return mid;
                }
                if ( (arr.get(mid)).compareTo(book) > 0){
                    return binarySearch(arr, first, mid-1, book);
                }else{
                    return binarySearch(arr, mid+1, last, book);
                }
            }
        }
        return -1;
    }
}
