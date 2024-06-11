public class MyJavaProgram {

	// method - takes input and output
	public static void main(String[] args) {
        int[][] data = {
            {4, 1, 64, 22},
            {5, 7, 11, 23, 4, 6, 12, 92},
            {9, 78, 31, 56}
        };

        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
	}
}
