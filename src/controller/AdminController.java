package controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import resource.AdminMenuR;

public class AdminController implements AdminMenuR {
	public void adminprocess() {
		
		out.println("=====관리자 메뉴======");
		
		//admin menu 구현
		
		//switch문 선택
		/*switch((int)request.get("selectNo")){
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
		}*/
		
		
 }
	public static void adminSearchBook(String title){
        //반환용 리스트
        List<List<String>> ret = new ArrayList<List<String>>();
        BufferedReader br = null;
        
        try{
            br = Files.newBufferedReader(Paths.get("C:\\Users\\jin\\test.csv"));
            //Charset.forName("UTF-8");
            String line = "";
            
            while((line = br.readLine()) != null){
            	int count =0;
            	
                //CSV 1행을 저장하는 리스트
                List<String> tmpList = new ArrayList<String>();
                String array[] = line.split(",");
                //배열에서 리스트 반환
                tmpList = Arrays.asList(array);
                if (tmpList.contains(title)) {
                	System.out.print(count);
                	System.out.println(tmpList);
                	ret.add(tmpList);
                }
                count++;
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
    }
	
	
}
