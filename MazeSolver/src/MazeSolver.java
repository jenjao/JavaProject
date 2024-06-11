import java.util.LinkedList;

public class MazeSolver {

    // making this static makes it accessible in main
    static int[][] maze = {
        {2, 0, 1, 1},
        {1, 1, 0, 1},
        {0, 1, 1, 1}
    };
    // 0 = wall
    // 1 = path
    // 2 = destination

    // we use stacks here, FILO
    // Position type is custom
    static LinkedList<Position> path = new LinkedList<Position>();

	public static void main(String[] args) {
        Position p = new Position(3, 0);
        // can access path bc we defined it static above
        path.push(p); // "push" adds to beginning of list. "add" adds to the end of list
        
        maze[path.peek().y][path.peek().x] = 0;
	}

}
