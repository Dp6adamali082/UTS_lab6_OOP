public class Employee {
    // Atribut untuk ID, nama depan, nama belakang, dan gaji
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    // Konstruktor untuk inisialisasi objek Employee
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Getter untuk ID
    public int getID() {
        return id;
    }

    // Getter untuk nama depan
    public String getFirstName() {
        return firstName;
    }

    // Getter untuk nama belakang
    public String getLastName() {
        return lastName;
    }

    // Getter untuk gaji
    public int getSalary() {
        return salary;
    }

    // Setter untuk gaji
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Method untuk mendapatkan nama lengkap
    public String getName() {
        return firstName + " " + lastName;
    }

    // Method untuk mendapatkan gaji tahunan
    public int getAnnualSalary() {
        return salary * 12;
    }

    // Method untuk menaikkan gaji berdasarkan persentase
    public int raiseSalary(int percent) {
        salary += salary * percent / 100;
        return salary;
    }

    // Override method toString untuk representasi string dari objek
    @Override
    public String toString() {
        return "Employee[id=" + id + ",name=" + firstName + " " + lastName + ",salary=" + salary + "]";
    }
}
