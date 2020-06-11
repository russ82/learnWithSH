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

import resource.MenuR;
import view.View;

public class MenuController implements MenuR{
	
		public void menuprocess() {
			
			out.println("menucontroller 실행");
			
			menu.show();
			
			View view = null;
			
			switch((int)request.get("selectNo")){
			case 1:
				out.println("로그인 선택");
				view = login;
				break;
			case 2:
				out.println("회원가입 선택");
				view = signup;
				break;
			case 3:
				out.println("나가기");
				view = exit;
				break;
			default:
				out.println("다시 선택해주세요");
				menuprocess();	
			}
			view.show();
	}
		
		
		public void menuSignUp(List<String> user) {
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
		        
		        public static List<List<String>> readCSV(String path){
			        //반환용 리스트
			        List<List<String>> ret = new ArrayList<List<String>>();
			        BufferedReader br = null;
			        
			        try{
			            br = Files.newBufferedReader(Paths.get(path));
			            //Charset.forName("UTF-8");
			            String line = "";
			            
			            while((line = br.readLine()) != null){
			                //CSV 1행을 저장하는 리스트
			                List<String> tmpList = new ArrayList<String>();
			                String array[] = line.split(",");
			                //배열에서 리스트 반환
			                tmpList = Arrays.asList(array);
			                System.out.println(tmpList);
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
		
}
