public class HelloWorld{
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.print("This");
        System.out.print("I\ns");
        System.out.print("\"Java\"");
        // Single line comment, ignored by the program
        System.out.println("Next Line");
        /* Multi line comment, ignored by the program */
        System.out.println("End");
        /** Java docs, ignored by the program */

        // Task 1
        // Print the following using System.out.print()
        // This
        // is my first's
        // "Java" program
        System.out.print("This\n");
        System.out.print("is my first\'s");
        System.out.println("\"Java\" program");

        // Task 2
        // Print the following using only one System.out.print()
        // This
        // can be "Done"
        // in one's "Single Line"
        System.out.print("This\ncan be\"Done\"\nin one\'s \"Single Line\"");

        // Task 3
        // Print the following
        // '*'
        // "**"'
        // \***\
        // "*"'*'"*"'*'
        // "*""*""*""*""*"
        System.out.println("\'*\'");
        System.out.println("\"**\"\'");
        System.out.println("\\***\\");
        System.out.println("\"*\"\'*\'\"*\"\'*\'");
        System.out.println("\"*\"\"*\"\"*\"\"*\"\"*\"");
    }
}