package com.github.phuctle.textttt.turniterator;

import java.util.HashSet;
import java.util.Set;

public abstract class TurnDataVars {
    private int[] pos = {0,0,0,0,0,0,0,0,0};
    private int turnNum;
    private char[] boardState;
    private int userInput;
    private HashSet<Integer> numSet = new HashSet<Integer>();

    public TurnDataVars(){
        
    }

    public int[] getPos() {
        return pos;
    }

    public void setPos(int[] posIn) {
        pos = posIn;
    }

    public int getTurnNum() {
        return turnNum;
    }

    public char[] getBoardState() {
        return boardState;
    }

    public void setBoardState(char[] boardStateIn) {
        boardState = boardStateIn;
    }

    public int getUserInput() {
        return userInput;
    }

    public void setUserInput(int userInputIn) {
        userInput = userInputIn;
    }

    public HashSet<Integer> getHashSet() {
        return numSet;
    }

    public void setHashSet(HashSet<Integer> numSetIn) {
        numSet = numSetIn;
    }
}