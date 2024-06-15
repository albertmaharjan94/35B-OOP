public class FunctionClass{
    /* Function are made inside a class scope
    * above or below main not inside */
    void printSomething(){
        System.out.println("This function prints");
    }
    /* with return type */
    int returnInt(){
        int value = 10;
        return value;
    }
    double addValue(int num1, double num2){
        double sum = num1 + num2;
        return sum;
    }
    /* Make a function isEqual
    * that takes two double value and returns boolean
    * return if the values are equal or not */
    boolean isEqual(double num1, double num2){
        boolean equal = num1 == num2;
        return equal;
    }
    public static void main(String[] args){
        /* To call a normal/non static function we need to create object
        * just remember the syntax for now */
        FunctionClass fc = new FunctionClass();
        /* Call function from object/ variable of FunctionClass */
        fc.printSomething();
        /* Can call multiple times */
        fc.printSomething();
        int returnFromFunction = fc.returnInt();
        System.out.println("Return from function is " + returnFromFunction);
        double returnFromAdd = fc.addValue(10, 20.2);
        System.out.println("Add returns " + returnFromAdd);
    }
}