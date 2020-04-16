package com.github.phuctle.textttt.turniterator;

//import com.github.phuctle.textttt.winverify.CheckState;

public class TurnChange {
    public void turnIterator(char gameBoardOut[]){

        int[] pos = {0,0,0,0,0,0,0,0,0};

        for(int turnCounter = 1; turnCounter < 10; turnCounter++)
        {
            //turn counter is used to determe which player is playing
            if ((turnCounter % 2) == 1)//odd for P1 and even for P2
            {
                System.out.print("Player 1: "); 
                String posSelect = System.console().readLine();//reads in userinput
                int posSelectInt = Integer.parseInt(posSelect);
                //System.out.println(posSelectInt);

                switch (posSelectInt) {
                    case 1:  {if(pos[0] == 0){//checks to see if position on board
                    gameBoardOut[1] ='x'; //is taken, if not makes that player
                        pos[0] = 1;} //occupy that space
                        else {
                            System.out.println("That slot is already taken. Try again.");
                            turnCounter--;//otherwise, forces them to pick again
                            continue;}
                            break;}
                    case 2:  {if(pos[1] == 0){
                    gameBoardOut[5] ='x';
                        pos[1] = 1;}
                        else {
                            System.out.println("That slot is already taken. Try again.");
                            turnCounter--;
                            continue;}
                            break;}
                    case 3:  {if(pos[2] == 0){
                        gameBoardOut[9] ='x';
                        pos[2] = 1;}
                            else {
                                System.out.println("That slot is already taken. Try again.");
                                turnCounter--;
                                continue;}
                                break;}
                    case 4:  {if(pos[3] == 0){
                        gameBoardOut[25] ='x';
                        pos[3] = 1;}
                            else {
                                System.out.println("That slot is already taken. Try again.");
                                turnCounter--;
                                continue;}
                                break;}
                    case 5:  {if(pos[4] == 0){
                        gameBoardOut[29] ='x';
                        pos[4] = 1;}
                            else {
                                System.out.println("That slot is already taken. Try again.");
                                turnCounter--;
                                continue;}
                                break;}
                    case 6:  {if(pos[5] == 0){
                        gameBoardOut[33] ='x';
                        pos[5] = 1;}
                            else {
                                System.out.println("That slot is already taken. Try again.");
                                turnCounter--;
                                continue;}
                                break;}
                    case 7:  {if(pos[6] == 0){
                        gameBoardOut[49] ='x';
                        pos[6] = 1;}
                            else {
                                System.out.println("That slot is already taken. Try again.");
                                turnCounter--;
                                continue;}
                                break;}
                    case 8:  {if(pos[7] == 0){
                        gameBoardOut[53] ='x';
                        pos[7] = 1;}
                            else {
                                System.out.println("That slot is already taken. Try again.");
                                turnCounter--;
                                continue;}
                                break;}
                    case 9:  {if(pos[8] == 0){
                        gameBoardOut[57] ='x';
                        pos[8] = 1;}
                            else {
                                System.out.println("That slot is already taken. Try again.");
                                turnCounter--;
                                continue;}
                                break;}
                    default: System.out.println("Invalid Input");
                                turnCounter--;
                                continue;

            }
            
        }
        if ((turnCounter % 2) == 0)
            {
                System.out.print("Player 2: "); 
                String posSelect = System.console().readLine();
                int posSelectInt = Integer.parseInt(posSelect);
                //System.out.println(posSelectInt);

                switch (posSelectInt) {
                    case 1:  {if(pos[0] == 0){
                        gameBoardOut[1] ='o';
                        pos[0] = 2;}
                            else {
                                System.out.println("That slot is already taken. Try again.");
                                turnCounter--;
                                continue;}
                                break;}
                    case 2:  {if(pos[1] == 0){
                        gameBoardOut[5] ='o';
                        pos[1] = 2;}
                            else {
                                System.out.println("That slot is already taken. Try again.");
                                turnCounter--;
                                continue;}
                                break;}
                    case 3:  {if(pos[2] == 0){
                        gameBoardOut[9] ='o';
                        pos[2] = 2;}
                            else {
                                System.out.println("That slot is already taken. Try again.");
                                turnCounter--;
                                continue;}
                                break;}
                    case 4:  {if(pos[3] == 0){
                        gameBoardOut[25] ='o';
                        pos[3] = 2;}
                            else {
                                System.out.println("That slot is already taken. Try again.");
                                turnCounter--;
                                continue;}
                                break;}
                    case 5:  {if(pos[4] == 0){
                        gameBoardOut[29] ='o';
                        pos[4] = 2;}
                            else {
                                System.out.println("That slot is already taken. Try again.");
                                turnCounter--;
                                continue;}
                                break;}
                    case 6:  {if(pos[5] == 0){
                        gameBoardOut[33] ='o';
                        pos[5] = 2;}
                            else {
                                System.out.println("That slot is already taken. Try again.");
                                turnCounter--;
                                continue;}
                                break;}
                    case 7:  {if(pos[6] == 0){
                        gameBoardOut[49] ='o';
                        pos[6] = 2;}
                            else {
                                System.out.println("That slot is already taken. Try again.");
                                turnCounter--;
                                continue;}
                                break;}
                    case 8:  {if(pos[7] == 0){
                        gameBoardOut[53] ='o';
                        pos[7] = 2;}
                            else {
                                System.out.println("That slot is already taken. Try again.");
                                turnCounter--;
                                continue;}
                                break;}
                    case 9:  {if(pos[8] == 0){
                        gameBoardOut[57] ='o';
                        pos[8] = 2;}
                            else {
                                System.out.println("That slot is already taken. Try again.");
                                turnCounter--;
                                continue;}
                                break;}
                    default: System.out.println("Invalid Input");
                                turnCounter--;
                                continue;
            }
            
        }
        System.out.println(" ");
        System.out.println(gameBoardOut);
        
        int retVal = 0;
        if (pos[0] == pos[1] && pos[0] == pos[2])//first row 
        retVal = pos[0];
        else if (pos[3] == pos[4] && pos[3] == pos[5])//second row 
        retVal = pos[3];
        else if (pos[6] == pos[7] && pos[6] == pos[8])//third row 
        retVal = pos[6];
        else if (pos[0] == pos[3] && pos[0] == pos[6])//first col
        retVal = pos[0];
        else if (pos[1] == pos[4] && pos[1] == pos[7])//second col
        retVal = pos[1];
        else if (pos[2] == pos[5] && pos[2] == pos[8])//third col
        retVal = pos[2];
        else if (pos[0] == pos[4] && pos[0] == pos[8])//diag down
        retVal = pos[0];
        else if (pos[6] == pos[4] && pos[6] == pos[2])//diag up
        retVal = pos[6];

        if (retVal == 1){
            System.out.println("Player 1 wins!");
            break;
        }
        else if (retVal == 2){
            System.out.println("Player 2 wins!");
            break;
        }
    }
}
}