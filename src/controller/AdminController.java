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
		
		System.out.println("=====������ �޴�======");
		
		//admin menu ����
		adminMenu.adminshow();
		
		AdminView view = null;
		
		//switch�� ����
		switch((int)adminrequest.get("selectNo")){
		case 1:
			System.out.println("å ���� ����");
			bookDelete.adminshow();
			break;
		case 2:
			System.out.println("å �˻� ����");
			view = bookSearch;
			break;
		case 3:
			System.out.println("���� ���� ����");
			view = userDelete;
			break;
		case 4:
			System.out.println("ȸ�� ���� ���� ����");
			view = userSetting;
			break;
		case 5:
			System.out.println("������ ����");
			exit.adminshow();
			break;
		default:
			System.out.println("�ٽ� �������ּ���");
			adminprocess();	
		}
		view.adminshow();
		
 }
	public static void adminSearchBook(String title){
        //��ȯ�� ����Ʈ
        List<List<String>> ret = new ArrayList<List<String>>();
        BufferedReader br = null;
        
        try{
            br = Files.newBufferedReader(Paths.get("C:\\Users\\jin\\test.csv"));
            //Charset.forName("UTF-8");
            String line = "";
            
            while((line = br.readLine()) != null){
            	int count =0;
            	
                //CSV 1���� �����ϴ� ����Ʈ
                List<String> tmpList = new ArrayList<String>();
                String array[] = line.split(",");
                //�迭���� ����Ʈ ��ȯ
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
