package com.github.phuctle.textttt.turniterator;

import java.util.HashSet;
import java.util.Set;

public class TurnDataVars {
    private String messageFinal;
    private int retVal;
    private char[] boardState;
    private String gameBoardFinal;
    private HashSet<Integer> numSet = new HashSet<Integer>();

    public TurnDataVars(){
        
    }

    public void addData(int retVal, char[] boardState) {
        this.retVal = retVal;
        this.boardState = boardState;
    }

    public void addToList(String messageFinal, String gameBoardFinal){
        this.messageFinal = messageFinal;
        this.gameBoardFinal = gameBoardFinal;
    }

    public String getMessageFinal() {
        return messageFinal;
    }



    public int getTurnNum() {
        return retVal;
    }

    public char[] getBoardState() {
        return boardState;
    }

    public void setBoardState(char[] boardStateIn) {
        boardState = boardStateIn;
    }

    public int getRetValue() {
        return retVal;
    }

    public String getFinalBoard(){
        return gameBoardFinal;
    }

    public HashSet<Integer> getHashSet() {
        return numSet;
    }

    public void setHashSet(HashSet<Integer> numSetIn) {
        numSet = numSetIn;
    }
}