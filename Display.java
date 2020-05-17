/**
 *  Final Project
 *  This class allows us to see the display screen about the books
 *  CS108
 *  May 14, 2020
 *  @author Jesus Davila
 */
import java.util.ArrayList;
import java.util.Iterator;

public class Display {
    public void display(ArrayList<String> arr){
        // this method shows in the screen is the library is empty
        if(arr.size() == 0){
            System.out.println("----------------------");
            System.out.println("The library is empty!");
            System.out.println("----------------------");
        }
        else{
            System.out.println("----------------------");
            Iterator<String> itr=arr.iterator();
            while(((Iterator) itr).hasNext()){
                System.out.println(itr.next());
            }
            System.out.println("----------------------");
            System.out.println("\n");
        }
    }
}
