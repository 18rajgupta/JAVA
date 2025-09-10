package dsa;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Alice", 20);
        Person[] people = new Person[3]; // Create array of size 3
        
        people[0] = new Person("Alice", 25);
        people[1] = new Person("Bob", 30);
        people[2] = new Person("Charlie", 28);
        
        System.out.println(people[0].name); // Output: Alice
    }
}

