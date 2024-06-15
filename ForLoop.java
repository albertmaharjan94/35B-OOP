public class ForLoop{
    public static void main(String[] args){
        /* For loop takes initialization
        * condition
        * modify/update */
        for(int index = 0; index <=5; index ++){
            System.out.println("For Index " + index);
        }
        /* can use different update logic like
        * for(int index = 0; index <=5 ; index += 3) */

        /* Using decrement */
        for(int index = 10; index >=0 ; index --){
                System.out.println("For Index Decrement " + index);
        }   
        /* Make a index table for decrement */

        /* Task 
        * Make a multiplication table of 2
        * For eg:
        * 2 x 1 = 2
        * 2 x 2 = 4
        * ..
        * 2 x 10 = 20
        * Note: Loop from 1 to 10 and multiply the index
        */
        for(int index = 1; index <= 10; index ++){
            System.out.println("2 x " + index + " = " + index * 2);
        }

        /* Nested for loop
        * Using for loop inside the scope of for loop */
        for(int outer = 0; outer < 2; outer ++){
            for(int inner = 3; inner > 0; inner --){
                System.out.println("Inner Index " + inner);
            }
            System.out.println("Outer Index " + outer);
        }

        /* Task
        * Make a multiplication table like the following
        * Multiplication table of 10
        * 10 x 1 = 10
        * 10 x 2 = 20
        * ..
        * 10 x 10 = 100
        * ..
        * Multiplication table of 1
        * 1 x 1 = 1
        * 1 x 2 = 2
        * ..
        * 1 x 10 = 10
        */
        for(int outer = 10; outer >=1; outer --){
            System.out.println("Multiplication of " + outer);
            for(int inner = 1; inner <=10; inner ++){
                System.out.print(outer);
                System.out.print(" x ");
                System.out.print(inner);
                System.out.print(" = ");
                System.out.println(inner * outer);
            }
        }

    }
}