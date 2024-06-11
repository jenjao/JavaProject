import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MyJavaProgram {

	// method - takes input and output
	public static void main(String[] args) throws FileNotFoundException {
        // LinkedList as a queue
        LinkedList<String> names = new LinkedList<String>();
        names.add("Frankie");
        names.add("Mochi");
        names.add("Axel");

        System.out.println(names.remove());
        System.out.println(names.remove());
        System.out.println(names.remove());
	}

}
