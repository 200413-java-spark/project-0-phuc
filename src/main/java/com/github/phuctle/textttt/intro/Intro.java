package com.github.phuctle.textttt.intro;

import java.io.IOError;
import java.util.HashSet;

public class Intro {
    private String selection;

    public String runIntro(){
        CreateBlankBoard newBoard = CreateBlankBoard.getInstance();
        newBoard.createGameBoard();
        HashSet<String> selectionsHash = new HashSet<String>();//more selections can be added if needed
        selectionsHash.add("q");
        selectionsHash.add("1");
        selectionsHash.add("2");

    System.out.println("\nText Tic-Tac-Toe\nSelect one of the options below "+
    "or type 'q' to quit the program.\n"
    +"Type '1' to play a single game of Tic-Tac-Toe between two human players.\n"
    +"Type '2' to type in the name of a file with game moves to record to the database.");
    
        while(true){
    try {
        System.out.print("Selection: ");
        this.selection = System.console().readLine();//reads in userinput
    } catch (IOError e) {
        e.printStackTrace();
    }

	if (selectionsHash.contains(this.selection)){
        return this.selection;
    }
    else{
        System.out.println("Invalid Input. Try again.");
    }
}

    }
}