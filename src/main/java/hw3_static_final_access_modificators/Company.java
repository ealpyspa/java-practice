package hw3_static_final_access_modificators;

public class Company {
    public static void main(String[] args) {
        Company employee1 = new Company(200101, "Alice Cooper");
        Company employee2 = new Company(200102, "Tom Ford");

        Company.companyName = "Table and Chairs";

        employee1.printCompanyName();
        employee2.printCompanyName();

    }

    private static String companyName;
    private final int employeeID;
    private String employeeName;

    public Company(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    public static void printCompanyName() {
        System.out.println("Название компании: " + companyName);
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

}
