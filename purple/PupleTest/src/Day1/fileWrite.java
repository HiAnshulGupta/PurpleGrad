//Write a Java Program to write data into file...

package Day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String filePath="file.txt";
		
		try {
			
			FileWriter writer=new FileWriter(filePath);
			
			writer.write("hello world");
			
			writer.close();
			System.out.println("Data add succesfully ");
			BufferedReader br=new BufferedReader(new FileReader(filePath));
			String line;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			
		} catch (IOException e) {
			// TODO: handle exception
			System.err.println("An error occured :"+ e.getMessage());
		}

	}

}
