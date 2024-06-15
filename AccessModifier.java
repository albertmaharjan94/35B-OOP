public class AccessModifier{
    public static void main(String[] args){
        AccessExample ae = new AccessExample();
        ae.name = "Ram";
        ae.age = 12;
        // ae.salary = 1000.21; // 
        ae.defaultFunction();
        ae.publicFunction();
        // ae.privateFunction(); // 
        ae.accessPrivate();
        ae.setSalary(1002.22);
        System.out.println(ae.getSalary());
        
        Dog d1 = new Dog();
        d1.breed = "Shepard";
        d1.setName("Tommy");
        d1.setAge(5);
        System.out.println("Name " + d1.getName());
        System.out.println("Breed " + d1.breed);
        System.out.println("Age " + d1.getAge());
    }
}
// Task 
// Make a class Dog
// Make a private attribute name and age
// Make a public attribute breed
// Make setter for name and age
// Make getter for name and age
// Make an Object for dog
// Fill all attribute
// Print the following using object
// Name: XYZ
// Breed: ABC
// Age: 10
class Dog{
    private String name;
    private int age;
    public String breed;
    void setName(String n){
        name = n;
    }
    void setAge(int a){
        age = a;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
}
class AccessExample{
    String name; // Automatically default, package/folder can access
    public int age; // Can be accessed from anywhere
    private double salary; // Can only be accessed inside this class
    void setSalary(double s){
        salary = s;
    }
    double getSalary(){
        return salary;
    }
    // same concept in function
    void defaultFunction(){
        System.out.println("I can be accessed inside a package");
    }
    public void publicFunction(){
        System.out.println("I can be accessed from anywhere");
    }
    private void privateFunction(){
        System.out.println("I can be only accessed inside class");
    }
    void accessPrivate(){
        System.out.println(salary);
        privateFunction();
    }
}