public class VariableClass{
    /* Instance variable
     * Access with object
     * Is not shared with other object
     */
    int instanceVariable = 120;
    /* Static variable
     * Access with Class
     * Is shared with other object
     */
    static int staticVariable = 2000;

    public static void main(String[] args) {
        /* Non primitive data type */
        /* Decalaration */
        byte byteValue;
        /* Initialization */
        byteValue = 10;
        /* Declaration and intilization */
        short shortValue = 100;
        /* Multiple Declaration */
        int intValue1, intValue2;
        /* Multiple Initilization */
        intValue1 = -99; intValue2 = 99;
        /* Multiple Declaration and Initilization */
        long longValue1 = -999, longValue2 = 999;
        float floatValue = 1.90f; // the letter 'f' is required
        double doubleValue = 28.88d; // the letter 'd' is optional
        char charValue = 'C'; // single letter in single quote
        boolean boolValue = false; // true/false lowercase

        /* Non primitive Data type */
        /* String */
        String stringInfo1 = "This is a variable";
        /* Using Class */
        String stringInfo2 = new String("Class");
        /* Object use the same class as written above */
        VariableClass variableObj = new VariableClass();

        /* Illegal actions following */
        /* byte byteValue = 10;// You cannot redeclare */
        /* byteValue = 20; //instead reassign */
        /* boolean boolVal3 = 'false';// wrong data type
         * short shortVal = 10000000;// cannot exceed min/max
         */
        /* We need to use object to access instance variable */
        System.out.println(variableObj.instanceVariable);
        /* We can access the static variable with class */
        System.out.println(VariableClass.staticVariable);

        /* Type casting */
        /* Implicit type casting (automatic)
        * From smaller type to larger type */
        int intValueConvert = 10;
        double intValueConvertedToDouble = intValueConvert;
        /* Explicit type casting (manual) 
        * From larger type to smaller type*/
        double doubleValueConvert = 19.23d;
        int doubleValueConvertedToInt = (int) doubleValue; 

    }
}