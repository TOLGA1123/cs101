/**
 * Auto Generated Java Class.
 */
public class MazeRunner {
  
  
  public static void main(String[] args) { 
    Maze labyrinth = new Maze();
    System.out.println(labyrinth);
    if(labyrinth.traverse(0,0))
      System.out.println("Solved!");
    else
      System.out.println("No solution!");
    System.out.println(labyrinth);    
  }
  
  /* ADD YOUR CODE HERE */
  
}
