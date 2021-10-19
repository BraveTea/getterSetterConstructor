public class Student{
    private String name;
    private String surname;
    private int studentNumber;

    Student(String name, String surname, int studentNumber){
        this.name = name;
        this.surname = surname;
        this.studentNumber = studentNumber;
    }

    Student(){
        this.name = "!John!";
        this.surname = "!Doe!";
        this.studentNumber = 0;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getSurname(){
        return surname;
    }

    public void setStudentNumber(int studentNumber){
        this.studentNumber = studentNumber;
    }

    public int getStudentNumber(){
        return studentNumber;
    }

}