package com.github.phuctle.textttt.turniterator;

import com.github.phuctle.textttt.winverify.CheckState;
import com.github.phuctle.textttt.io.FileParser;

public class TurnChange {
    
    CheckState checkState = new CheckState();
    private int posSelectInt;

    public void turnIterator(char gameBoardOut[]){

        int[] pos = {0,0,0,0,0,0,0,0,0};

        for(int turnCounter = 1; turnCounter < 10; turnCounter++)
        {
            //turn counter is used to determe which player is playing
            if ((turnCounter % 2) == 1)//odd for P1 and even for P2
            {
                System.out.print("Player 1: "); 

                try {
                    String posSelect = System.console().readLine();//reads in userinput
                    this.posSelectInt = Integer.parseInt(posSelect);   
                } catch (NumberFormatException e) {
                    this.posSelectInt = -1;
                }
                
              
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
                    default: System.out.println("Invalid Input! Try again.");
                                turnCounter--;
                                continue;

            }
            
        }
        if ((turnCounter % 2) == 0)
            {
                System.out.print("Player 2: ");
                try {
                    String posSelect = System.console().readLine();//reads in userinput
                    this.posSelectInt = Integer.parseInt(posSelect);   
                } catch (NumberFormatException e) {
                    this.posSelectInt = -1;
                }

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
                    default: System.out.println("Invalid Input! Try again.");
                                turnCounter--;
                                continue;
            }
            
        }
        System.out.println(" ");
        System.out.println(gameBoardOut);
        
        FileParser.write(gameBoardOut);


        int retVal = checkState.checkIn(pos);

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