class Student {
    private String FIO;
    private int Date;
    private String Adress;
    private String Number;
    private int Course;
    private String Facultet;

    Student(String fio, int date, String adress, String number, int course, String facultet){
        this.FIO = fio;
        this.Date = date;
        this.Adress = adress;
        this.Number = number;
        this.Course = course;
        this.Facultet = facultet;
    }

    public String getFIO(){
        return this.FIO;
    }
    public void setFIO(String fio){
        this.FIO = fio;
    }

    public int getDate(){
        return this.Date;
    }
    public void setDate(int yearOfInvite){
        this.Date = yearOfInvite;
    }

    public String getadress(){
        return this.Adress;
    }

    public String getNumber(){
        return this.Number;
    }
    public void setNumber(String number){
        this.Number = number;
    }

    public void setCourse(int course){
        this.Course = course;
    }

    public String getFacultet(){
        return this.Facultet;
    }
}
public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Ермохин Д.Е.", 2021, "ул.Карпинского 33Б", "+79875260892", 3, "Информационные системы и программирование"),
                new Student("Дулатов И.И.", 2022, "ул.Вяземская 13", "+79671234567", 2, "Информационные системы и программирование"),
                new Student("Лапицкий Д.В.", 2023, "ул..Суворова 56", "+79876543211", 1, "Электрик")
        };
        System.out.println("ФИО студентов: ");
        for ( int i = 0; i < students.length; i++){
            System.out.println(students[i].getFIO());
        }
        System.out.println("Студенты с факультета 'Электрик': ");
        for ( int i = 0; i < students.length; i++){
            if ( students[i].getFacultet() == "Электрик") {
                System.out.println(students[i].getFIO());
            }
        }
        System.out.println("Студенты, поступившие после 2021 года: ");
        for (int i = 0; i < students.length; i++){
            if ( students[i].getDate() > 2021) {
                System.out.println(students[i].getFIO());
            }
        }
    }
}