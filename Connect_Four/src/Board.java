
import java.awt.Color;
import java.util.Arrays;
import java.lang.Exception;

public class Board extends GameObject{


    //The number of columns in the board.
    
   private static final int BOARD_WIDTH  = 7;
   
    //The number of rows in the board.
    
   private static final int BOARD_HEIGHT = 6;

    //The minimum length of a winning pattern.
    
   private static final int WINNING_PATTERN_LENGTH = 4;

	private static final String None = null;

   
   //
   static String[][] board = new String[BOARD_WIDTH][BOARD_HEIGHT];
   
   // create empty board .......part b)
   public Board() {
	   
       //fills board with '[]' for the width and height
       for (int w = 0; BOARD_WIDTH > w; w += 1) {
           for (int h = 0; BOARD_HEIGHT > h; h += 1) {
               board[w][h] =  "[]";
               
           }
       }
       //prints the board
       for (int w = 0; BOARD_WIDTH > w; w += 1) {
           for (int h = 0; BOARD_HEIGHT > h; h += 1) {
               System.out.print(board[w][h]);
           }
           System.out.println();
       }
       System.out.println();
   }
   
   // C)
   
   public void dropToken(Color color, int columnIndex) throws  ColumnFullException{
	   for (int BOARD_HEIGHT = 0; BOARD_HEIGHT < BOARD_HEIGHT ; BOARD_HEIGHT ++) {
   		if( board [ BOARD_HEIGHT ][ BOARD_WIDTH ] == None ) {
   			board [BOARD_HEIGHT ][ BOARD_WIDTH ] = color ;
   			break ;
   		}
	   }
   }
   public boolean canDrop(int columnIndex) throws Exception {
	   for (int column = 0; column < BOARD_WIDTH ; column ++) {
   		if( board [BOARD_HEIGHT -1][ column ] == None ) 
   			throw new  Exception("ColumnFullException");
   			return false ;
   	}
   	return true ;
   }


    
}
