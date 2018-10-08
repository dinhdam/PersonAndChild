package Person;

public class Person {
    private String name ="Hoa";
    private String address = "Hoàn Kiếm, Hà Nội";
    public Person(){
    }
    public Person(String name,String address){
        this.name = name;
        this.address =address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return  "Person [Name =" +getName()+",address ="+getAddress()+"]";
    }
}
