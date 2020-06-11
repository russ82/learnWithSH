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
		
		out.println("=====������ �޴�======");
		
		//admin menu ����
		
		//switch�� ����
		/*switch((int)request.get("selectNo")){
		case 1:
			out.println("�α��� ����");
			view = login;
			break;
		case 2:
			out.println("ȸ������ ����");
			view = signup;
			break;
		case 3:
			out.println("������");
			view = exit;
			break;
		default:
			out.println("�ٽ� �������ּ���");
			menuprocess();	
		}*/
		
		
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
