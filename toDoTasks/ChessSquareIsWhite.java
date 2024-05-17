package toDoTasks;

public class ChessSquareIsWhite {

	public boolean squareIsWhite(String coordinates) {
        
       int digit = coordinates.charAt(1) - '0';
       int letter = coordinates.charAt(0) - '0';
        if(letter%2 != 0 )
        {
            if(digit%2 != 0)
                return false;
            else return true;
        }
        else if(letter%2 == 0 )
        {
            if(digit%2 != 0)
                return true;
            else return false;
        }
        return false;
    }
}
