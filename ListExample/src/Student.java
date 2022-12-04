public class Student {

    //we can use command+n(here)/sources( in eclipse) to create constructor of diff types, boiler code inside a class

    String name;
    String city;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public Student(String  name, String city) {
        this.name = name;
        this.city = city;
    }

    public Student() {

    }
}
