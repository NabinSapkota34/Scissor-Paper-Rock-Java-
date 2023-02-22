import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //take input from the user, S,P,R
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Please enter S,P,R");
        char userMove = inputObj.next().charAt(0);

        //make computer to  make three move
        char[] arr = {'S', 'R', 'P' };
        Random random = new Random();
        int guessnumber = random.nextInt(3);
        char computermove = arr[guessnumber];

        if(computermove== arr[0] && userMove=='R')
        {
            System.out.println("User Wins");
        }
        else if (computermove== arr[1] && userMove=='P') {
            System.out.println("User Wins");
        }
        else if (computermove== arr[1] && userMove=='S') {
            System.out.println("Computer Wins");
        }
        else if (computermove== arr[2] && userMove=='R') {
            System.out.println("Draw");
        }
        else {
            System.out.println("Please enter");
        }

    }
}