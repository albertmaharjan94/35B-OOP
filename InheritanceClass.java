public class InheritanceClass{
    public static void main(String[] args){
        ChildClass cc = new ChildClass();
        cc.firstname = "XYZ";
        cc.lastname = "ANC";
        cc.expenses = 100.11;
        // cc.salary = 10000; // 
        cc.info();
        cc.detail();
    }
}
class ParentClass{
    public String lastname;
    private int salary;
    protected double expenses;
    void info(){
        System.out.println("Parent Function " + lastname);
    }
}
// To use inheritance use the keyword "extends"
// single level inheritance, one parent/super - one child/sub
class ChildClass extends ParentClass{
    String firstname;
    void detail(){
        System.out.println(firstname + " " + lastname);
    }
}
// Multi level inheritance, nested class, child class has another child class
class GrandChildClass extends ChildClass{
    String middlename;
    void description(){
        System.out.println(firstname + " " + middlename + " " + lastname);
    }
}
// Tree/ heirarical inheritance
// One parent, multiple children
class BrotherClass extends ParentClass{
    String address;
    void living(){
        System.out.println(lastname + " " + address);
    }
}

class Animal{

}
class Mammal extends Animal{

}
class Reptile extends Animal{

}
class Amphibian extends Reptile{

}
class Dog extends Mammal{

}
class Cat extends Mammal{

}
class Labrador extends Dog{

}
class GermanShepard extends Dog{
    
}