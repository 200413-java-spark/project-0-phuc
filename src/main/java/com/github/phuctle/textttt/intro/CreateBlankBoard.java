package com.github.phuctle.textttt.intro;

public class CreateBlankBoard {
    private static CreateBlankBoard instance;
    private char[] blankBoard;
    private int[] pos;

    private CreateBlankBoard(){

    }

    public static CreateBlankBoard getInstance() {
        if (instance == null) {
            instance = new CreateBlankBoard();
        }
        return instance;
    }

    public void createGameBoard(){
        String row1 = " 1 | 2 | 3 \n";
        String row2 = "-----------\n";
        String row3 = " 4 | 5 | 6 \n";
        String row4 = "-----------\n";
        String row5 = " 7 | 8 | 9 \n";
        String gameBoardStr = row1+row2+row3+row4+row5;
    
        //creating a character array
        this.blankBoard= new char[gameBoardStr.length()];
        int strLength = gameBoardStr.length();
        //duplicating the string into the char array
        for(int i = 0; i <strLength; i++){
            this.blankBoard[i] = gameBoardStr.charAt(i);
        }
    }

    public char[] getNewBoard(){
        return this.blankBoard;
    }

    public void createNewPos(){
        this.pos = new int[9];
        for(int i = 0; i<9; i++){
            this.pos[i] = i*(-1);
        }
    }

    public int[] getNewPos(){
        return this.pos;
    }
}