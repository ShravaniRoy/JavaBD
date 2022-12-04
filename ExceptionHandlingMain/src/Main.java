import java.io.FileNotFoundException;
import java.io.*;
public class Main {
    public static void main(String[] args) throws InvalidAgeException{

        Employee e1 = new Employee();

        try {
            System.out.println("We are inside try block");
            e1.loadEmployeeFile(new File("abc.txt"));


        } catch(FileNotFoundException fe){
//            fe.printStackTrace();
        } finally {
            System.out.println("We are in finally block");
        }

        int age = 2;

        if(age < 18){
            throw new InvalidAgeException("Age is less than 18");
        } else {
            e1.age = age;
            System.out.println(e1.age);
        }


    }
}