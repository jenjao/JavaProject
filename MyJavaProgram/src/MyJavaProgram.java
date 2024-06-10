import java.util.Scanner;

public class MyJavaProgram {
	// method - takes input and output
	public static void main(String[] args) { // main(parameter)
		System.out.println("Enter your name");

        // input
        Scanner in = new Scanner(System.in);
        // take i/p from console and store in s
        String s = in.nextLine();
        // class -instantiation-> object
        
        if(s.equals("Jen")) {
            System.out.println("Hey Jen");
        } else if(s.equals("Frankie")) {
            System.out.println("Hey Frankie");
        } else {
            System.out.println("You're not welcome here");

        }
        
        in.close();
	}

}
