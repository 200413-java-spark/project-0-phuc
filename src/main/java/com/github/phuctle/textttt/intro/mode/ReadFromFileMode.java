package com.github.phuctle.textttt.intro.mode;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.github.phuctle.textttt.io.Dao;
import com.github.phuctle.textttt.io.FileInputRepo;
import com.github.phuctle.textttt.io.SqlDataSource;
import com.github.phuctle.textttt.io.SqlRecordsRepo;
import com.github.phuctle.textttt.turniterator.FileReadPlay;
import com.github.phuctle.textttt.turniterator.TurnDataVars;

public class ReadFromFileMode {
    private int[] numPlays;
    private TurnDataVars retVal;
    private String boardString;
    private List<String[]> sqlPushList = new ArrayList<>();

        public void readFromFile(){
            System.out.print("Input the name of the file: ");
            File fileName = new File(System.console().readLine());
            Dao<int[]> fileParser = new FileInputRepo(fileName);
            List<int[]> playOrder = fileParser.readAll();
            FileReadPlay readPlay = new FileReadPlay();
            
            for(int i = 0; i <playOrder.size();i++){
                int indLength = playOrder.get(i).length;
                this.numPlays = playOrder.get(i);
                //System.out.println("");
                for(int j = 0; j <indLength;j++){
                    //System.out.print(this.numPlays[j]);
                    if(j==indLength-1){
                        this.retVal = readPlay.autoPlay(this.numPlays);
                        //System.out.println("\n"+this.retVal.getRetValue());
                        this.boardString = String.valueOf(retVal.getBoardState());
                        //System.out.println(this.boardString);
                        String vicMessage;
                        if(this.retVal.getRetValue() == -1){
                            vicMessage = "It was a tie.";
                        }
                        else if (this.retVal.getRetValue() == 1){
                            vicMessage = "Player 1 (x) won.";
                        }
                        else if (this.retVal.getRetValue() == 2){
                            vicMessage = "Player 2 (o) won.";
                        }
                        else{
                            vicMessage = "The game was incomplete.";
                        }
                        String[] inputString = new String[2];
                        inputString[0] = vicMessage;
                        inputString[1] = boardString;
                        this.sqlPushList.add(inputString);
                    }
                }
            
            }


            //for(int i=0; i< this.sqlPushList.size() ;i++){
             //   System.out.println(this.sqlPushList.get(i)[0]);
             //   System.out.println(this.sqlPushList.get(i)[1]);}

             // Insert operations into database
				SqlDataSource dataSource = SqlDataSource.getInstance();
				Dao<String[]> fileInRepo = new SqlRecordsRepo(dataSource);
				fileInRepo.insertAll(sqlPushList);

            // Read all operations from database
                List<String[]> outData = new ArrayList<>();
				outData = fileInRepo.readAll();
				for (int i = 0; i< outData.size();i++) {
					System.out.println(outData);
				}
    }
}