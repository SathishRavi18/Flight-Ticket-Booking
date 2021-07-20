import java.util.*;
import java.util.ArrayList;

public class Book{


    public static void main(String args[]){
        ArrayList<Flight> flights = new ArrayList<>();
        for(int i=0;i<2;i++){
            flights.add(new Flight());
        }

        int passengerID = 1;
        Scanner sc = new Scanner(System.in);


        while(true){
            System.out.println("1.Book 2.Cancel 3.Print");
            int choice = sc.nextInt();
            System.out.println(choice);

        }
    }
}