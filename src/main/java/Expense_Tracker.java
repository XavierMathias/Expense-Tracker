import java.util.Scanner;

public class Expense_Tracker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello there! Would you like to start recording your expenses? Y/N");
        String response = input.next();

        if(response.equals("Yes")){

        } else {

            System.out.println("Goodbye");
        }

    } // end of main method

} // end of class
