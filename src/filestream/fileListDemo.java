package filestream;

import java.io.File;

public class fileListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dirPath = "D:/STUDY/Java";
		File file = new File(dirPath);
		if (!file.isDirectory()) {
			
		} else {
			String[] fileListName = file.list();
			for (int i = 0; i<fileListName.length; i++) {
				System.out.println(fileListName[i]);
			}
		}
		
	}

}
