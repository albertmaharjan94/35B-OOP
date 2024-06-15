import java.util.Scanner;
/*
 * or use
 * import java.util.*; // imports all utils
 */
public class InputOutput{
    public static void main(String[] args) {
        /* User output 
         * System.out.println("Print next line");
         * "sout" for shortcut
        */
        System.out.println("This string breaks line");
        /* System.out.print */
        System.out.print("This will not break line.");
        System.out.print("This will continue");
        /* System.out.printf
         * String formatter
         * %s String, %d Integra, %f Floating Point, %b boolean
         */
        System.out.printf("Hello %s, Nice", "world");
        System.out.printf("This is num %d", 10);
        /* You can use multiple foramtter */
        System.out.printf("Num %f and bool %b", 10.3f, false);

        /* User Input */    
        Scanner scan = new Scanner(System.in);
        System.out.println("The following takes whole sentence");
        String wholeWString = scan.nextLine();
        System.out.println("The input is " + wholeWString);
        System.out.println("The following takes integer");
        int intInput = scan.nextInt();
        System.out.println("The input is " + intInput);
        System.out.println("The following takes double ");
        double doubleInput = scan.nextDouble();
        System.out.println("THe input is "+ doubleInput );
        System.out.println("The following take boolean");
        boolean booleanInput = scan.nextBoolean();
        System.out.println("The input is " + booleanInput);
        scan.close(); // close after taking all the input

        /* Task 
         * Make a new scanner object/variable scan1
         * Prompt the following
         * What is your name? -> save as string, name
         * Are you over 18? -> save as boolean, status
         * How many siblings? -> save as int, sibling
         * Print the following
         * Hello, name
         * Over 18? status
         * You have sibling num of sibling
         * // comment the previous scanner for ease of use
         */
        Scanner scan1 = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan1.nextLine();
        System.out.println("Are you over 18?");
        boolean status = scan1.nextBoolean();
        System.out.println("How many siblings?");
        int sibling = scan1.nextInt();
        System.out.println("Hello " + name);
        System.out.println("Over 18? "  + status);
        System.out.println("You have " + sibling + " no siblings");
        scan1.close();
        
    }
}