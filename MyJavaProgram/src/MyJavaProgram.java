import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyJavaProgram {
	// method - takes input and output
	public static void main(String[] args) throws FileNotFoundException{ // main(parameter)

//         Scanner in = new Scanner(System.in);
// 
//         System.out.println("Give us a size");
//         int size = in.nextInt();
// 
//         System.out.println("Enter " + size + " numbers. Press enter after each");
// 
//         int[] grades = new int[size];
// 
//         for(int i = 0; i < size; i++) {
//             grades[i] = in.nextInt();
//         }
// 
//         in.close();
// 
//         for(int i = 0; i < size; i++) {
//             System.out.println(grades[i]);
//         }

        Scanner in = new Scanner(new File("students.txt"));

        List<String> students = new ArrayList<String>();

        while(in.hasNextLine()) {
            students.add(in.nextLine());
        }

        for(int i = 0; i < students.size(); i++) {
            System.out.println("name: " + students.get(i));
        }

        in.close();

	}

}
