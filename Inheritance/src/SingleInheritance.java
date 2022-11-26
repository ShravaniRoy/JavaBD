public class SingleInheritance {
    public static void main(String[] args) {
        //make an object of parent- Employee and child- trainee and try accessing their methods here
        Employee emp = new Employee();
//        emp.id=1;
//        emp.name="Aditya";
        emp.salary=10000;
        emp.designation="Engineer";

        emp.display();//here we have no clue what is happening inside display method, but only we see output. so this is abstraction

        Trainee p = new Trainee();
        p.tenure=1;
//        p.id=1;
//        p.name="ABC";

        p.display();
    }
}