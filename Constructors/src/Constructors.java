public class Constructors {
    public static void main(String[] args) {

        ConstructorDef cd = new ConstructorDef();
        cd.message = "Default constructor";

        ConstructorParam cp = new ConstructorParam();
        cp.message = "Param constructor";

        ConstructorParam cp1 = new ConstructorParam("Hello Hello");
//        cp1.message = "Param constructor";

    }
}