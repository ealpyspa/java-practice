package hw3_static_final_access_modificators;

public class Company {
    public static void main(String[] args) {
        Company employee1 = new Company(200101, "Alice Cooper");
        Company employee2 = new Company(200102, "Tom Ford");
        Company employee3 = new Company(200103, "Julia Fox");

        companyName = "Table and Chairs";

        employee1.printCompanyName();
        employee2.printCompanyName();
        employee3.printCompanyName();
    }

    static String companyName;
    final int employeeID;
    String employeeName;

    Company(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    static void printCompanyName() {
        System.out.println("Название компании: " + companyName);
    }

    String getEmployeeName() {
        return employeeName;
    }

    void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
