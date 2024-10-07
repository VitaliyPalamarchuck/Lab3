public abstract class Employee {
    private String name;
    private String  surname;
    private String department;
    private boolean isMilitary;

    public Employee(String name, String surname, String department, boolean isMilitary) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.isMilitary = isMilitary;
    }

    public abstract void calculateSalary(); //метод

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDepartment() {
        return department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setMilitary(boolean military) {
        isMilitary = military;
    }


    public void setDepartment(){
        this.department=department;
    }

    public boolean isMilitary(){
        return isMilitary;
    }

    public void setMilitary(){
        this.isMilitary=isMilitary;
    }

    public void displayInfo(){
        System.out.println("Ім'я: "+name+" Прізвище: "+surname);
        System.out.println("Місце роботи: "+ department);
        System.out.println("Військовий: "+(isMilitary ? "Так":"Ні"));
    }
    public boolean isDuty() {
        return isMilitary;
    }


}

