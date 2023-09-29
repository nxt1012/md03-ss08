package ra;

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee saleEmployee = new SaleEmployee(1, "Lan Hương", 23, "JLPT N1");
        Employee developer = new Developer(2, "Minh Hưng", 25, "Java");

        saleEmployee.chamCong();
        saleEmployee.work();
        doing(saleEmployee);

        developer.chamCong();
        developer.work();
        doing(developer);
    }
    public static void doing(Employee employee){
        if(employee instanceof Developer){
            ((Developer) employee).fixBug();
        } else {
            ((SaleEmployee) employee).sale();
        }
    }
}
