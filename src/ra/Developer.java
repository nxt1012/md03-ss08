package ra;

public class Developer extends Employee {
    private String programmingLanguage;
    public Developer() {
    }

    public Developer(int id, String name, int age, String programmingLanguage) {
        super(id, name, age);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    public void work(){
        super.work();
        System.out.println("Đây là developer.");
    }
    public void fixBug(){
        System.out.println("Đang fix bug.");
    }
}
