/*
write() method always write data in ASCII character value
write() does not throws any exception for file, if file is not available then it creates
the file with that name. 
-If file is not available then it FileOutputStream creates empty file and add the data into that file.
FileOutputStream("abc.txt",true) is used for append the data
-Write method always write character ASCII data and the read method always reads the ASCII data.
*/
import java.io.*;
public class WritingDataToFile{
	public static void main(String args[])throws IOException{
		File fk = new File("e://abc.txt");
		FileOutputStream fos = new FileOutputStream(fk,true);
		fos.write(' ');
		fos.write('G');
		fos.write('a');
		fos.write('r');
		fos.write('d');
		fos.write('i');
		System.out.println("Data written");		
	}
}	
