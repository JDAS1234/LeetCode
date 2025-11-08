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
        
        
        Employees e1 = new Employees();
        Employees e2 = new Employees();
        Employees e3 = new Employees(10);
        Employees e4 = new Employees();


    }
}
