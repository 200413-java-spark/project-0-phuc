package com.github.phuctle.textttt.intro.mode;

import java.io.File;
import java.util.List;

import com.github.phuctle.textttt.io.Dao;
import com.github.phuctle.textttt.io.FileInputRepo;

public class ReadFromFileMode {
    private int[] numPlays;
        public void readFromFile(){
            System.out.print("Input the name of the file: ");
            File fileName = new File(System.console().readLine());
            Dao<int[]> fileParser = new FileInputRepo(fileName);
            List<int[]> playOrder = fileParser.readAll();
            
            
            for(int i = 0; i <playOrder.size();i++){
                int indLength = playOrder.get(i).length;
                this.numPlays = playOrder.get(i);
                System.out.println("");
                for(int j = 0; j <indLength;j++){
                    System.out.print(this.numPlays[j]);
                    if(j==indLength-1){
                        
                    }
            }
            
    }
}
}


/*
        List<String> testList = new ArrayList<String>();
        System.out.println("This is the test for the file reader.");
        String fileName;
        fileName = System.console().readLine();//reads in userinput
        
        testList = FileParser.read(fileName);
        String testInOut;
        for(int i = 0; i < testList.size();i++){
            //testInOut[i] = testList.get(i);
            System.out.println("This is back in main.");
            System.out.println(testList.get(i));
        }
        */
        //FileParser.write(testInOut);

        /*for(int i = 0; i<testList.size();i++) {
            testInput[i] = testList.get(i);
        }*/