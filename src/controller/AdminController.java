package controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import resource.AdminMenuR;
import view.AdminView;

public class AdminController implements AdminMenuR {
	
	public void adminprocess() {
		
		System.out.println("=====관리자 메뉴======");
		
		//admin menu 구현
		adminMenu.adminshow();
		
		AdminView view = null;
		
		//switch문 선택
		switch((int)adminrequest.get("selectNo")){
		case 1:
			System.out.println("책 삭제 선택");
			bookDelete.adminshow();
			break;
		case 2:
			System.out.println("책 검색 선택");
			view = bookSearch;
			break;
		case 3:
			System.out.println("유저 삭제 선택");
			view = userDelete;
			break;
		case 4:
			System.out.println("회원 설정 변경 선택");
			view = userSetting;
			break;
		case 5:
			System.out.println("나가기 선택");
			exit.adminshow();
			break;
		default:
			System.out.println("다시 선택해주세요");
			adminprocess();	
		}
		view.adminshow();
		
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
