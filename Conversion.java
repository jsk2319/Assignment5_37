import java.util.Scanner;

public class Conversion {

    public static void main(String [] args) {

        Scanner userI = new Scanner(System.in);
        int intUser, remainUser, quotentUser;
        
            System.out.println("Type an integer to have it returned as a binary.");
            intUser = userI.nextInt();

            String output = "";
        
            do{

                quotentUser = intUser / 2;
                remainUser = intUser % 2;
                intUser = quotentUser;
                output += remainUser;

            }while (quotentUser != 0);

        StringBuilder turnAround = new StringBuilder(output);
        turnAround.reverse();
        System.out.println(turnAround);


    }

}