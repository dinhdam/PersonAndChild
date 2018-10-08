package Staff;

import Person.Person;

public class Staff extends Person {
    private String school;
    private double pay;
    public Staff(){
    }
    public Staff(String school,double pay,String name,String address){
        super(name,address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff[Person[name = " + super.getName() + " ,address = " + super.getAddress()
                +"]" + "pay =" + getPay()+"school="+ getSchool();
    }
}
