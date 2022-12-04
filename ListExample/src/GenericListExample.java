import java.util.ArrayList;
import java.util.Collections;

public class GenericListExample {
    public static void main(String args[]){
        ArrayList<Student> al = new ArrayList<>();
        Student st;

        for(int i=0; i<5; i++){
            st = new Student("Student"+i, "50005" +i);
            al.add(st);
        }
        System.out.println(al); //list of student objects.

        Collections.shuffle(al);
        System.out.println("Shuffled list of student"+ al);

    }
}
