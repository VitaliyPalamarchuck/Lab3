class Professor extends Employee{
    private int numberOfLectures;
    private double perLecture;


    public Professor(String name, String surname, String department, boolean isMilitary, int numberOfLectures, double perLecture) {
        super(name, surname, department, isMilitary);
        this.numberOfLectures = numberOfLectures;
        this.perLecture = perLecture;
    }

    @Override
    public void calculateSalary(){
       double s = numberOfLectures*perLecture;
        System.out.println("Зарплата адміністратора: "+s);
    }

    public String performDuties(){
        return "Навчати студентів, проводити лекції";
    }


}
