package com.github.phuctle.textttt.winverify;

public class CheckState {
    public int checkIn(int[] arg) {
        int retVal = 0;
        if (arg[0] == arg[1] && arg[0] == arg[2])//first row 
        retVal = arg[0];
        else if (arg[3] == arg[4] && arg[3] == arg[5])//second row 
        retVal = arg[3];
        else if (arg[6] == arg[7] && arg[6] == arg[8])//third row 
        retVal = arg[6];
        else if (arg[0] == arg[3] && arg[0] == arg[6])//first col
        retVal = arg[0];
        else if (arg[1] == arg[4] && arg[1] == arg[7])//second col
        retVal = arg[1];
        else if (arg[2] == arg[5] && arg[2] == arg[8])//third col
        retVal = arg[2];
        else if (arg[0] == arg[4] && arg[0] == arg[8])//diag down
        retVal = arg[0];
        else if (arg[6] == arg[4] && arg[6] == arg[2])//diag up
        retVal = arg[6];

    return retVal;
    }
}