/*
Stream:(InputStream and OutputStream)
Stream is a java object allows to read and write data from persistance store.
=>Types of java Streams:
1)BinaryStreams
2)CharacterStreams
1)FileInputStream:
it has below constructors:

Read() methods always written ASCII integer data and it read one byte at a time so use it in 
loop for reading all the bytes.
*/
import java.io.*;
public class ReadingDataFromFile{
	public static void main(String args[])throws IOException{
		FileInputStream fis = new FileInputStream("E:\\test.txt");
		int i;
		while((i=fis.read()) != -1){
			System.out.println(i+"\t"+(char)i);
		}
	}
}	
/*output :
68      D
104     h
105     i
114     r
97      a
106     j
*/