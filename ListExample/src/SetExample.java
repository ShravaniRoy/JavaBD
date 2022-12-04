import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        //Set is a collection that doesn't contain duplicates.
        //Collections allow 3 implementations of Sets - HashSet, TreeSet, and LinkedSet
        HashSet<String> hs = new HashSet<>();

        hs.add("Rihu");
        hs.add("Shivin");
        hs.add("Roshan");

        hs.add("Rihu");

        System.out.println("HashSet " + hs);
        System.out.println("Size of Hashset "+ hs.size() );
    }
}
