public class Main {
    public static void main(String[] args) {
        Professor pr1 = new Professor("Yuriy","Bard","IT",true,14,400);
        Administrator admin1 = new Administrator("Olena","Kripko","MainDepartment",false, 35,700);
        pr1.displayInfo();
        pr1.calculateSalary();
        System.out.println("Обов'язки професора: "+pr1.performDuties());
        System.out.println("Професор на чергуванні: "+(pr1.isDuty() ? "Так":"Ні"));
        System.out.println();
        admin1.displayInfo();
        admin1.calculateSalary();
        System.out.println("Обов'язки адміністратора: "+admin1.performDuties());
        System.out.println("Адміністратор на чергуванні: "+(admin1.isDuty() ? "Так":"Ні"));
    }
}
