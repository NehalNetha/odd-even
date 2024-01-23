
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class userInput {
    public void input(){

    ArrayList<Integer> numbers = new ArrayList<>();
    ArrayList<Integer> odd = new ArrayList<>();
    ArrayList<Integer> even = new ArrayList<>();



    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the number of inputs: ");

    int userInput = scan.nextInt();
    for(int i = 0 ; i < userInput; i++){
        Scanner scanNumber = new Scanner(System.in);

        System.out.println("enter the number  ");

        int number = scanNumber.nextInt();
        numbers.add(number);
    }

    for(int j = 0; j <  numbers.size(); j++){
        if(numbers.get(j) % 2 == 0){
            even.add(numbers.get(j));
        }else{
            odd.add(numbers.get(j));
        }
    }




    System.out.print("the even array list\n");

    for(int k =0; k < even.size(); k++){
        System.out.print(even.get(k));
        System.out.print("\n");

    }

    System.out.print("the odd array list\n");

    for(int q =0; q < odd.size(); q++){
        System.out.print(odd.get(q));
        System.out.print("\n");

    }

    }
}