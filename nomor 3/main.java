public class TestMain {
    public static void main(String[] args) {
        // Uji konstruktor dan toString()
        Employee e1 = new Employee(8, "Xavier", "Valave", 2500);
        System.out.println(e1); // toString()

        // Uji setter dan getter
        e1.setSalary(999);
        System.out.println(e1); // toString()
        System.out.println("id is: " + e1.getID());
        System.out.println("firstname is: " + e1.getFirstName());
        System.out.println("lastname is: " + e1.getLastName());
        System.out.println("salary is: " + e1.getSalary());
        System.out.println("name is: " + e1.getName());
        System.out.println("annual salary is: " + e1.getAnnualSalary());

        // Uji method raiseSalary()
        System.out.println(e1.raiseSalary(10));
        System.out.println(e1);
    }
}
