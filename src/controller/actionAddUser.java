package controller;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

import model.UserId;

public class actionAddUser {
	
	public void actionaddUser(UserId user) {
		
		//csv에 추가하기
			 BufferedWriter bufWriter = null;
		        try{
		        	String path = "C:\\Users\\jin\\writetest.csv";
		            bufWriter = Files.newBufferedWriter(Paths.get(path),Charset.forName("UTF-8"), StandardOpenOption.APPEND);
		            
		            /*List<List<String>> allData = readCSV(path);
		            
		            for(List<String> newLine : allData){
		                List<String> list = newLine;
		                for(String data : list){
		                    bufWriter.write(data);
		                    bufWriter.write(",");
		                }
		                //개행코드추가
		            bufWriter.newLine();
		            }
		            */
		            for(String data : user){
		                bufWriter.write(data);
		                bufWriter.write(",");
		            }
		            
		            bufWriter.newLine();
		                
		            
		        }catch(FileNotFoundException e){
		            e.printStackTrace();
		        }catch(IOException e){
		            e.printStackTrace();
		        }finally{
		            try{
		                if(bufWriter != null){
		                    bufWriter.close();
		                }
		            }catch(IOException e){
		                e.printStackTrace();
		            }
		        }
		}
		
		
	}
