package oops;
class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("My name is " + name);
    }
    public int getSalary(){
        return salary;
    }
}
class Employee1{
    String name;
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

public class Oops {
    public static void main(String[] args){
        Employee harry = new Employee(); // INSTANTIATING A NEW EMPLOYEE OBJECT
        Employee john = new Employee();
        //SETTING ATTRIBUTES
        harry.id = 12;
        harry.name = "CodeWithHarry";
        harry.salary = 34;

        john.id = 17;
        john.name = "John Khandelwal";
        john.salary = 12;
        //PRINTING THE ATTRIBUTES
//        System.out.println(harry.id);
//        System.out.println(harry.name);
        harry.printDetails();
        john.printDetails();
        int salary = harry.getSalary();
        System.out.println(salary);

        //PROBLEM 1
        Employee1 e1 = new Employee1();
        e1.name = "Rajat";
        System.out.println(e1.getName());
        e1.setName("Raj");
        System.out.println(e1.getName());
    }
}

