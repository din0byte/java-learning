package filestream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class mainObjectIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinhVien sinhVien = new SinhVien();
		sinhVien.setMa(1);
		sinhVien.setTen("Dinh");
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		try {	
			fileOutputStream = new FileOutputStream("D:/STUDY/Java/sinhvien.dat");
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(sinhVien);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
