package controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class csvController {

	
	public List<List<String>> readCSV(String path) {
		//반환용 리스트
        List<List<String>> ret = new ArrayList<List<String>>();
        BufferedReader br = null;
        
        try{
        	path = "C:\\Users\\jin\\eclipse-workspace\\Used Book Marketplace\\src\\" + path;
            br = Files.newBufferedReader(Paths.get(path));
            //Charset.forName("UTF-8");
            String line = "";
            
            while((line = br.readLine()) != null){
                //CSV 1행을 저장하는 리스트
                List<String> tmpList = new ArrayList<String>();
                String array[] = line.split(",");
                //배열에서 리스트 반환
                tmpList = Arrays.asList(array);
                /*System.out.println(tmpList);*/
                ret.add(tmpList);
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                if(br != null){
                    br.close();
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }

        return ret;
	}
	
	public void appendCSV(String path, List<String> inputData) {
		BufferedWriter bufWriter = null;
        try{		//먼저 DB역할하는 csv가 초기에 존재한다고 가정(없을수 없다)
        	path = "C:\\Users\\jin\\eclipse-workspace\\Used Book Marketplace\\src\\" + path;
        	bufWriter = Files.newBufferedWriter(Paths.get(path),Charset.forName("UTF-8"), StandardOpenOption.APPEND);
            
            //List<String> userData = user.UserLineup();
            
            for(String data : inputData){
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
	
	public void admindeleteCSV(String path, String input, String type) {
		
		List<List<String>> allData = readCSV(path);
		List<List<String>> removeData = new ArrayList<List<String>>();
		
		for (List<String> data: allData) {
			if (type.equals("user")) {
				if (data.get(0).equals(input)) {
					removeData.add(data);
				}
			} else if (type.equals("book")) {
				if (data.get(7).equals(input)) {
					removeData.add(data);
				}
			}
		}
		allData.removeAll(removeData);
		
		writeCSV(path,allData);
	}
	
	public void userdeleteCSV(String path, String input , String userId) {
		
		List<List<String>> allData = readCSV(path);
		List<List<String>> removeData = new ArrayList<List<String>>();
		
		for (List<String> data: allData) {
			if (data.contains(input) && data.contains(userId)) {
				removeData.add(data);
			}
		}
		allData.removeAll(removeData);
		
		writeCSV(path,allData);
	}
	
	public void writeCSV(String path, List<List<String>> inputData) {
		BufferedWriter bufWriter = null;
		try{		//먼저 DB역할하는 csv가 초기에 존재한다고 가정(없을수 없다)
        	path = "C:\\Users\\jin\\eclipse-workspace\\Used Book Marketplace\\src\\" + path;
        	bufWriter = Files.newBufferedWriter(Paths.get(path),Charset.forName("UTF-8"));
            
            //List<String> userData = user.UserLineup();
            
        	for(List<String> newLine : inputData){
                List<String> list = newLine;
                for(String data : list){
                    bufWriter.write(data);
                    bufWriter.write(",");
                }
                bufWriter.newLine();
        	}
            
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