public class ConstructorParam extends ConstructorDef{
    String message;

    public ConstructorParam(String message){
        this();
        this.message = message; //arg copied to obj's message
        System.out.println("In parameterized constructor of ConstructorParam class");
    }

    public ConstructorParam(){

        System.out.println("In default constructor of ConstructorParam class");
    }

    public ConstructorParam(int n){

        System.out.println("In another parameterized constructor of ConstructorParam class");
    }
}
