package com.github.phuctle.textttt.io;

import java.util.List;

public class InputArray {
    private static InputArray instance;

    private InputArray(){}

    public static InputArray getInstance(){
        if (instance == null){
            instance = new InputArray();
        }
        return instance;
    }

    //public CharMemArray createCharArray(List<char[]> charList){
        
        
    //}

}