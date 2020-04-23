package com.github.phuctle.textttt.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class FileParser {

    static File testoutput = new File("testOutput.txt");

    public static void write(char[] test){
        try (FileWriter fw = new FileWriter(testoutput, false);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);)
        {
            pw.println(test);
        } catch (IOException e){
            e.printStackTrace();
        }
        
    }


}