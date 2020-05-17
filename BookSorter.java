/*
 *  Final Project
 *  This abstract class allows us to see books
 *  CS108
 *  May 14, 2020
 *  @author Jesus Davila
 */
import java.util.ArrayList;

public abstract class BookSorter implements BookFinder {
    // This for statement finds the number of books there is
    public void sort(ArrayList<String> arr){
        for (int i = 0; i < arr.size(); i++) {
            for (int j = arr.size() - 1; j > i; j--) {
                if ( arr.get(i).compareTo(arr.get(j)) > 0 ) {
                    String tmp = arr.get(i);
                    arr.set(i,arr.get(j));
                    arr.set(j,tmp);
                }
            }
        }
    }
}
