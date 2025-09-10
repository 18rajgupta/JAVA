package oops;
class Employee2{
    private int id;
    private String name;
    private int salary;
    public Employee2(){     // MAKING A CONSTRUCTOR...
        id = 45;
        name = "Your-Name-Here";
    }
    public Employee2(String myName, int myId, int mySalary){     // CONSTRUCTOR OVERLOADING...
        id = myId;
        name = myName;
        salary = mySalary;
        System.out.println(salary);
    }
    public String getName(){         //GETTERS AND SETTERS
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        id = i;
    }
    public int getSalary(){
        return salary;
    }
}

public class Constructors {
    public static void main(String[] args) {
        Employee2 marry = new Employee2("bjdh sjdhsahu", 12, 10000);
        System.out.println(marry.getName());
        System.out.println(marry.getId());
        System.out.println(marry.getSalary());
    }
}
