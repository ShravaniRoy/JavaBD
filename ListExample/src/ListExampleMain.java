import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListExampleMain {
    public static void main(String[] args) {
        //List is the parent of ArrayList, so we can use them in any order.
        List<String> listExample = new ArrayList<>();

        listExample.add("Shravani");
        listExample.add("Rahul");
        listExample.add("Rihansh");


        System.out.println(listExample.size());
        System.out.println(listExample.get(0));

        //Iterator that will iterate over listExample
        for(Iterator iterator = listExample.iterator(); iterator.hasNext();){
            String string = (String) iterator.next();
            System.out.println(string);
        }

        //algorithms on list are Sort, Shuffle, Reverse, Rotate
        //All these algorithms are available in Collections Class - this is like ES6 for javascript.
        Collections.sort(listExample);
        System.out.println(listExample);

        Collections.shuffle(listExample);
        System.out.println("Shuffled list" + listExample);



    }
}