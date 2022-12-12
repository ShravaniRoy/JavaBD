import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        File myObj = new File("myFile.txt");

        if(myObj.exists()){
            System.out.println("File already exists");
        } else {
            System.out.println("Creating new file");
            myObj.createNewFile();
        }

        System.out.println("Is directory? " + myObj.isDirectory());
        System.out.println("length of file " + myObj.length());
        System.out.println("Name of file " + myObj.getName());

        File newFile = new File("abcFolder/path1");

        System.out.println("File " + newFile.getAbsolutePath());
        System.out.println(("File path canonical "+ newFile.getCanonicalPath()));
        //these paths are different in windows and might have to use it to create files according to that.

        if(newFile.mkdirs()){
            System.out.println("All folders created");
        } else {
            System.out.println("All folders could not be created or already exist ");
        }

        //let us create a new file in the above path

        File anotherNewFile = new File(newFile.getAbsolutePath() + "/test.txt");
        if(anotherNewFile.createNewFile()){
            System.out.println("File creation in specific path is successful");
        }

        //Assignment - find and print the file names from root directory
        //Assignment - Imagine you are given a path, find the largest depth
        //Assignment - Identify if there is file duplicacy - name cannot be criteria. may be we can use HashSet.

    }
}