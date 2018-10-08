package Student;

import Person.Person;

public class Student extends Person {
    private String program = "College";
    private int year = 4;
    private double fee = 450000;
    public Student(){
    }
    public Student(String program,int year,double fee,String name,String address){
        super(name,address);
        this.program = program;
        this.year = year ;
        this.fee = fee ;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student[Person[name = " + super.getName() + " ,address = " + super.getAddress() +"]" +
                ",program = " + getProgram() + " ,year = " + getYear() + " ,fee = " + getFee() + "]";
    }
}
