class Administrator extends Employee {
        private int hoursOfWork;
        private double perHour;


        public Administrator(String name, String surname, String department, boolean isMilitary, int numberOfLectures, double perLecture) {
            super(name, surname, department, isMilitary);
            this.hoursOfWork = numberOfLectures;
            this.perHour = perLecture;
        }

        @Override
        public void calculateSalary() {
            double s = hoursOfWork * perHour;
            System.out.println("Зарплата адміністратора: "+s);
        }
        public String performDuties(){
        return "Організовувати роботу "+getDepartment();
        }
}

