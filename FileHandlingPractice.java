package first;
import java.io.*;
public class FileHandlingPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("Demo.java");
			if(file.createNewFile()) {
				System.out.println("File Created");
			}else {
				System.out.println("Already exists");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
