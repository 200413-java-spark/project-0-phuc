package com.github.phuctle.textttt.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FileParser {

    static File testoutput = new File("testOutput.txt");

    public static void write(char[] test){
        try (FileWriter fw = new FileWriter(testoutput, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);)
        {
            pw.println(test);
        } catch (IOException e){
            e.printStackTrace();
        }
        
    }

    public static List<String> read(String fileName) {
        List<String> test = new ArrayList<String>();
        try(FileReader in = new FileReader(fileName);
        BufferedReader br = new BufferedReader(in);){
            String line = br.readLine();
            while (line != null) {
				//String[] tokens = line.split(",");
                test.add(line);
                line = br.readLine();
                System.out.println(line);
                //test.add(line);
                //System.out.println(tokens.length);
                //for (int i = 0; i < tokens.length; i++){
                    //char[] a = new char[tokens.length];
                    //System.out.println(a[i]);
                    //System.out.println(tokens[i].charAt(0));
                    //a[i] = tokens[i].charAt(0);
                    //test.add(a);
                //}
                
                
        }
    }
            catch(FileNotFoundException e){
                e.printStackTrace();
            }
            catch(IOException e){
                e.printStackTrace();
            }
        
        
        
        
        return (ArrayList<String>) test;
    }

}