import java.util.HashMap;

public class HashmapExampleMain {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();

        hm.put("1", "ABC");
        hm.put("2", "DEF");
        hm.put("3", "XYZ");
        hm.put("2", "QRV");

        System.out.println(hm);

        HashMap<Integer, String> hmIntType = new HashMap<>();

        hmIntType.put(Integer.valueOf(1), "ABCD");
        hmIntType.put(Integer.valueOf(2), "BDP");

        System.out.println(hmIntType);
    }
}
