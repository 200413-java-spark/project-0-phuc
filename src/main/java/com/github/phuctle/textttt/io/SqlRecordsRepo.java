package com.github.phuctle.textttt.io;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.postgresql.replication.fluent.physical.StartPhysicalReplicationCallback;

public class SqlRecordsRepo implements Dao<String[]>{
    private SqlDataSource dataSource;
    private List<String[]> dataList;
    
    public SqlRecordsRepo(SqlDataSource source){
        this.dataSource = source;
        dataList = new ArrayList<>();
    }

    @Override
    public void insertAll(List<String[]> dataVars) {
        String sql = "insert into gameresults(gameresult, gameboard) values(?,?)";
        try(Connection connection = this.dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);){
        for (int i =0; i< dataVars.size();i++){
                statement.setString(1, dataVars.get(i)[0]);


                //System.out.println("-------------------------------------------");
                //System.out.println(dataVars.get(i)[0]);
                //System.out.println("-------------------------------------------");


                statement.setString(2, dataVars.get(i)[1]);
                statement.addBatch();
            }
            statement.executeBatch();
        }
        catch (SQLException e) {
            System.err.println(e.getMessage());
            }

    }

    @Override
    public List<String[]> readAll() {
        if (dataList.isEmpty()){
            String sql = "select * from gameresults";

            try (Connection connection = this.dataSource.getConnection();
                    Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery(sql);){
                
                while(resultSet.next()){
                    String vicMessage = resultSet.getString("gameresult");

                    //System.out.println("-------------------------------------------");
                    //System.out.println(vicMessage);
                    //System.out.println("-------------------------------------------");

                    String gameBoard = resultSet.getString("gameboard");
                    String[] outResult = new String[2];
                    outResult[0] = vicMessage;
                    outResult[1] = gameBoard;
                    dataList.add(outResult);
                }
            } catch(SQLException e){
                System.err.println(e.getMessage());
                }   
            return dataList;} 
        else {
            return dataList;}
    }
}