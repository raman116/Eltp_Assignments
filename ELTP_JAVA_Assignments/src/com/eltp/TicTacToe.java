public class TicTacToe {
    public static void main(String[] args) {

    }
    public static String ticTac(char[][] game)
    {
       if((game[0][0]=='X')&&(game[0][1]=='X')&&(game[0][2]=='X'))
       {
           return "X";
        }
        if((game[1][0]=='X')&&(game[1][1]=='X')&&(game[1][2]=='X'))
        {
            return "X";
        }
        if((game[2][0]=='X')&&(game[2][1]=='X')&&(game[2][2]=='X'))
        {
            return "X";
        }
        if((game[0][0]=='X')&&(game[1][0]=='X')&&(game[2][0]=='X'))
        {
            return "X";
        }
        if((game[0][1]=='X')&&(game[1][1]=='X')&&(game[0][2]=='X'))
        {
            return "X";
        }
        if((game[0][0]=='X')&&(game[0][1]=='X')&&(game[0][2]=='X'))
        {
            return "X";
        }
        return null;
    }
}
