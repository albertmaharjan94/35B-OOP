public class FirstOop{
    public static void main(String[] args){
        Person p1 = new Person();
        p1.name = "Ram";
        p1.age = 12;
        p1.gender = 'M';
        System.out.println(p1.name);
        p1.introduction();

        Person p2 = new Person();
        p2.name = "afno nam";
        p2.age = 0;
        p2.gender = 'M';
        p2.introduction();
        Square s1 = new Square();
        s1.sides = 10;
        int s1Area = s1.area();
        System.out.println(s1Area);
        s1.addSides(2);
        System.out.println(s1.area());
    }
}
// Task 
// make a class Rectangle
// make 2 attributes in double, length and breadth
// make a function areaOfRectangle that returns length * breadth
// make a function perimeterOfRectangle that returns 2(length + breadth)
// make an Object of Rectangle and print area and perimeter
class Rectangle{
    double length, breadth;
    double area(){
        return length * breadth;
    }
    double perimeter(){
        return 2 * (length + breadth);
    }
}
class Car{
    // make attributes: name, brand, year, color
    // make a function modify() that takes new color and set to old color
    // make a function expiry() that returns 100 added to year
    // make a function start() that prints(name is starting)
    // make a function stop() that print(name, brand is stopping)
    // make a function detail() that print(name, brand, color and year)
    // make 3 Object of Car
    // Start all 3 object
    // Stop only 1st object
    // Modify 2nd car to Green color
    // Print the expiry of 3rd Object
    // Print detail of all 3 object
    String name, brand, color;
    int year;
    void modify(String newColor){
        color = newColor;
    }
    int expiry(){
        return 100 + year;
    }
    void start(){
        System.out.println(name + " is starting");
    }
    void stop(){
        System.out.println(name + ", " + brand + " is stopping");
    }
    void detail(){
        System.out.println(name + ", " + brand + ", " + color + " and " + year);
    }
}
class Square{
    int sides;
    int area(){
        int area = sides * sides;
        return area;
    }
    void addSides(int val){
        sides = sides + val; // sides will retain state/data
    }
}

class Person{
    // data/fields/attributes/properties
    String name;
    int age;
    char gender;

    // procedures/functions/methods
    void introduction(){
        System.out.println("Hi my name is " + name);
    }
}