package com.github.phuctle.textttt;

import static org.junit.Assert.assertEquals;

import com.github.phuctle.textttt.intro.CreateBlankBoard;

import org.junit.Before;
import org.junit.Test;

public class TestFile {
    CreateBlankBoard blankBoard;

    @Before
    public void setup(){
        blankBoard = CreateBlankBoard.getInstance();
    }

    
}