/*Static question
Make an employee class with a id (static) that increments everytime a new instance of employee is created  */
public class Employees {

    static int id = 0; 
       

    public Employees() {
        id++;
        System.out.println("Employee ID: " + id);
    }

    public Employees(int id){
        Employees.id = id;
        System.out.println("Employee ID: " + id);
    }

    public static void main(String[] args) throws Exception {
        
        new Employees();
        new Employees();
        new Employees(10);
        new Employees();

    }
}
