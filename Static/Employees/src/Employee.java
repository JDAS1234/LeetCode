/*Static question
Make an employee class with a id (static) that increments everytime a new instance of employee is created  */
public class Employee {

    static int id = 0; 
       

    public Employee() {
        id++;
        System.out.println("Employee ID: " + id);
    }


    public static void main(String[] args) throws Exception {
        
        new Employee();
        new Employee();
        new Employee();
    }
}
