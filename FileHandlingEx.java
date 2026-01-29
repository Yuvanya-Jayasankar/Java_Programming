package first;
import java.io.*;
/*import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader; */
import java.util.Scanner;
public class FileHandlingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("Demo.txt");
			if(file.createNewFile()) {
				System.out.println("File created Successfully");
			}else {
				System.out.println("Already Created");
			}
			/*Writing in the file through FileWriter
			FileWriter fw = new FileWriter("Demo.txt");
			fw.write("Hiii everyone, This is Yuvanya");
			fw.close();*/
			
			//Writing in the file through BufferedWriter
			BufferedWriter bw = new BufferedWriter(new FileWriter("Demo.txt"));
	        bw.write("Hello Everyone,");
	        bw.newLine();
	        bw.write("Let me introduce myself to you");
	        bw.close();
	        
	      //Append Data to a file
            FileWriter fw = new FileWriter("Demo.txt",true);
            fw.write("\nI'm Yuvanya");
            fw.close();
            
			/*Reading the file through FileReader
			FileReader fr = new FileReader("Demo.txt");
		    int i;
	        while ((i = fr.read()) != -1) {
	            System.out.print((char)i);
	        }
	        fr.close();*/
	        
			/*Reading the file through BufferedReader
			BufferedReader br = new BufferedReader(new FileReader("Demo.txt"));
	        String line;
	        while ((line = br.readLine()) != null) {
	            System.out.println(line);
	        }
	        br.close();
			*/
	        
	        //Reading the file using Scanner
	        File file1 = new File("Demo.txt");
            Scanner sc = new Scanner(file1);

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

            sc.close();
            
            
            
            /*Deleting the file
            File file2 = new File("Demo.txt");
            file2.delete(); */
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
