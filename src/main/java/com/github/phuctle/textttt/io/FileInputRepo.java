package com.github.phuctle.textttt.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileInputRepo implements Dao<int[]> {
    private File inputFile;
    private String[] tokens;
    private int[] numIterator;

    public FileInputRepo(File input){
        this.inputFile = input;
    }

    @Override
    public void insertAll(List<int[]> test){
        
    }

    @Override
    public List<int[]> readAll(){
        List<int[]> playOrder = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
			String line = br.readLine();
			while (line != null) {
                this.tokens = line.split(",");
                this.numIterator = new int[this.tokens.length];
                for(int i =0; i< this.tokens.length;i++){
                    try{
                        numIterator[i] = Integer.parseInt(tokens[i]);
                        if (i == (this.tokens.length-1)){
                            playOrder.add(numIterator);
                        }   
                    }
                    catch(NumberFormatException e){
                        System.out.println("Invalid data in file.");
                    }
                }
                
                line = br.readLine();
            }
		} catch (FileNotFoundException e) {
			System.err.println("Input file not found.");
		} catch (IOException e) {
			e.printStackTrace();
		}
        
        

        return playOrder;
        
    }
}