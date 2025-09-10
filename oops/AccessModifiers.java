package oops;
class MyEmployee{
    private int id;
    private String name;
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
}

public class AccessModifiers {
    public static void main(String[] args) {
        MyEmployee harry = new MyEmployee();
//        harry.id = 45;
//        harry.name = "CodeWithHarry";   --> THROES AN ERROR DUE TO PRIVATE ACCESS MODIFIERS
        harry.setName("CodeWithHarry");     // USED TO SET THE NAME
        System.out.println(harry.getName());    // USED TO GET THE UPDATED NAME

        harry.setId(234);
        System.out.println(harry.getId());
    }
}
