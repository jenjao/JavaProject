import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MyJavaProgram {

	// method - takes input and output
	public static void main(String[] args) throws FileNotFoundException {
        // LinkedList as a stack 
        LinkedList<String> names = new LinkedList<String>();
        names.push("Frankie");
        names.push("Mochi");
        names.push("Axel");

        Iterator<String> it = names.iterator();
        
        while(it.hasNext()) {
            System.out.println((it.next()));
        }

        names.add(2, "Felix");

        for(String s: names) {
            System.out.println(s);
        }

        
	}

}
