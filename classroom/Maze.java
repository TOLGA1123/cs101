public class Maze{

  private final int TRIED = 3;
  private final int PATH = 7;
  private int[][] grid ={ {1,1,1,0,1,1,0,0,0,1,1,1,1},
                          {1,0,1,1,1,0,1,1,1,1,0,0,1},
                          {1,0,0,0,1,0,1,0,1,0,1,0,0},
                          {1,1,1,0,1,1,1,0,1,0,1,1,1},
                          {1,0,1,0,0,0,0,1,1,1,0,0,1},
                          {1,0,1,1,1,1,1,1,0,1,1,1,1},
                          {1,0,0,0,0,0,0,0,0,0,0,0,0},
                          {1,1,1,1,1,1,1,1,1,1,1,1,1}
                        };
  public boolean traverse (int row, int column){
    boolean done = false;
    if(valid(row,column)){
      grid[row][column] = TRIED;
      if((row==grid.length-1)&&(column==grid[0].length-1))
         done = true;  
     else{
        done = traverse(row,column+1); //right
       if(!done)
        done = traverse(row+1,column); //down
       if(!done)
        done = traverse(row-1,column); //up
       if(!done)
        done = traverse(row,column-1); //left
     }
    }
    if(done)
      grid[row][column] = PATH;
    return done; 
  }  
  
  private boolean valid (int row, int column){
   boolean isValid = false;
   // Check if we are in the correct range
   if((row>=0)&&(row<grid.length)&& (column>=0)&&(column<grid[0].length)){
     if(grid[row][column] == 1)
       isValid = true;   
   }
   return isValid;
  }
  
  public String toString(){
    String result = "\n";
    for(int i=0; i<grid.length; i++){
      for(int j=0; j<grid[0].length; j++)
        result+= ","+grid[i][j];
      result+= "\n";      
    }
    return result;
  }
  
  
}
