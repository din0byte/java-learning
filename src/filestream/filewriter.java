package filestream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filewriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("D:/STUDY/Java/demo.txt");
			String s = "Hello world";
			fos.write(s.getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("D:/STUDY/Java/demo.txt");
			int l;
			while ((l = fis.read())!=-1) {
				System.out.print((char) l);
			
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		FileWriter fw;
		try {
			fw = new FileWriter("D:/STUDY/Java/demo.txt");
			BufferedWriter bufferedWriter = new BufferedWriter(fw);
			String s = "Hello world 2";
			bufferedWriter.write(s);
			bufferedWriter.newLine();
			bufferedWriter.write("Hello world 3");
			bufferedWriter.newLine();
			bufferedWriter.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;
		try {
			String s;
			fileReader = new FileReader("D:/STUDY/Java/demo.txt");
			bufferedReader = new BufferedReader(fileReader);
			fileWriter = new FileWriter("D:/STUDY/Java/demo2.txt");
			bufferedWriter = new BufferedWriter(fileWriter);
			while ((s = bufferedReader.readLine()) != null) {
				bufferedWriter.write(s);
				bufferedWriter.newLine();
			}
			bufferedWriter.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
