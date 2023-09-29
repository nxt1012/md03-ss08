package ra;

public class SaleEmployee extends Employee{
    private String language;
    public SaleEmployee() {
        super();
    }
    public SaleEmployee(int id, String name, int age, String language) {
        super(id, name, age);
        this.language = language;
    }

    @Override
    public void work(){
        super.work();
        System.out.println("Đây là nhân viên sale.");
    }
    public void sale(){
        System.out.println("Đang bán hàng");
    }
}
