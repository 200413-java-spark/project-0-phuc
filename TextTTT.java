public class TextTTT {
    public static void main(String[] args) {
        //initializing variables
        int pos1 = 0;
        int pos2 = 0;
        int pos3 = 0;
        int pos4 = 0;
        int pos5 = 0;
        int pos6 = 0;
        int pos7 = 0;
        int pos8 = 0;
        int pos9 = 0;
        
        //instructions for game
        System.out.println("\nTic-Tac-Toe\nFirst player inputs a number to");
        System.out.println("select where to place the first x.");

        String row1 = " 1 | 2 | 3 \n";
        String row2 = "-----------\n";
        String row3 = " 4 | 5 | 6 \n";
        String row4 = "-----------\n";
        String row5 = " 7 | 8 | 9 \n";
        String gameBoardStr = row1+row2+row3+row4+row5;
        
        

        //creating a character array
        char[] gameBoardOut= new char[gameBoardStr.length()];
        int strLength = gameBoardStr.length();
        //duplicating the string into the char array
        for(int i = 0; i <strLength; i++){
            gameBoardOut[i] = gameBoardStr.charAt(i);
        }
        
        System.out.print(gameBoardOut);

        for(int turnCounter = 1; turnCounter < 10; turnCounter++)
        {
            if ((turnCounter % 2) == 1)
            {
                System.out.print("Player 1: "); 
                String posSelect = System.console().readLine();
                int posSelectInt = Integer.parseInt(posSelect);
                //System.out.println(posSelectInt);

                switch (posSelectInt) {
                    case 1:  gameBoardOut[1] ='x';
                             break;
                    case 2:  gameBoardOut[5] ='x';
                             break;
                    case 3:  gameBoardOut[9] ='x';
                             break;
                    case 4:  gameBoardOut[25] ='x';
                             break;
                    case 5:  gameBoardOut[29] ='x';
                             break;
                    case 6:  gameBoardOut[33] ='x';
                             break;
                    case 7:  gameBoardOut[49] ='x';
                             break;
                    case 8:  gameBoardOut[53] ='x';
                             break;
                    case 9:  gameBoardOut[57] ='x';
                             break;
                    default: System.out.println("Invalid Input");
                             break;
            }
            
        }
        if ((turnCounter % 2) == 0)
            {
                System.out.print("Player 2: "); 
                String posSelect = System.console().readLine();
                int posSelectInt = Integer.parseInt(posSelect);
                //System.out.println(posSelectInt);

                switch (posSelectInt) {
                    case 1:  gameBoardOut[1] ='o';
                             break;
                    case 2:  gameBoardOut[5] ='o';
                             break;
                    case 3:  gameBoardOut[9] ='o';
                             break;
                    case 4:  gameBoardOut[25] ='o';
                             break;
                    case 5:  gameBoardOut[29] ='o';
                             break;
                    case 6:  gameBoardOut[33] ='o';
                             break;
                    case 7:  gameBoardOut[49] ='o';
                             break;
                    case 8:  gameBoardOut[53] ='o';
                             break;
                    case 9:  gameBoardOut[57] ='o';
                             break;
                    default: System.out.println("Invalid Input");
                             break;
            }
            
        }
        System.out.println(" ");
        System.out.println(gameBoardOut);
        
    }
}
}