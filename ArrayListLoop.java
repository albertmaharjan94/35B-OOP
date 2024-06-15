import java.util.ArrayList;
public class ArrayListLoop{
    public static void main(String[] args){
        /* Import ArrayList on top, import java.util.ArrayList */
        ArrayList<Integer> intArr = new ArrayList<>();
        intArr.add(10);
        intArr.add(20);
        intArr.add(30);
        intArr.add(50);
        /* To loop ArrayList, same as array, get lenght/size first */
        /* To get lenght use .size() */
        int arrLen = intArr.size();
        /* Loop from 0 to size/len -1 */
        for(int index = 0; index < arrLen; index ++ ){
            System.out.println("Index " + index + " Value "+ intArr.get(index));
        }

        // Using for each
        for(Integer element: intArr){
            System.out.println(element);
        }

        /* Make an ArrayList as student as following
        * ["Aruna", "Shreeya", "Yudip", "Anjali", "Nishcay", "Krishna"]
        * Make 2 another ArrayList males and females
        * Loop the students ArrayList
        * add "Yudip", "Nischay" and "Krihsna" in males
        * add "Aruna", "Shreeya" and "Anjali" in females
        * Print Anjali from females
        * Print Yudip from males
        */
        ArrayList<String> students = new ArrayList<>();
        students.add("Aruna");
        students.add("Shreeya");
        students.add("Yudip");
        students.add("Anjali");
        students.add("Nischay");
        students.add("Krishna");
        ArrayList<String> males = new ArrayList<>();
        ArrayList<String> females = new ArrayList<>();
        // using for loop
        for(int index = 0; index < students.size(); index ++ ){
            String value = students.get(index);
            if(value == "Aruna" || value == "Shreeya" || value == "Anjali"){
                females.add(value);
            }else{
                males.add(value);
            }
        }
        // Using foreach
        for(String value: students){
            if(value == "Aruna" || value == "Shreeya" || value == "Anjali"){
                females.add(value);
            }else{
                males.add(value);
            }
        }


    }
}