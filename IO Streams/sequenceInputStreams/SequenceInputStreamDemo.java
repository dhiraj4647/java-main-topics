/*
It used to read data from multiple input streams in sequence util first file is completed 
then second is readed.
wap to read data from 3 files
*/
import java.io.*;    
import java.util.*; 
 class SequenceInputStreamDemo{
	public static void main(String[] args) throws IOException{
        FileInputStream fin=new FileInputStream("a.txt");    
		FileInputStream fin2=new FileInputStream("b.txt");    
		FileInputStream fin3=new FileInputStream("c.txt");    
		FileInputStream fin4=new FileInputStream("d.txt");
        FileOutputStream obj = new FileOutputStream("abcd.txt");		
		Vector v=new Vector();    
		v.add(fin);    
		v.add(fin2);    
		v.add(fin3);    
		v.add(fin4);  
		Enumeration e=v.elements();
		int i=0;    
        SequenceInputStream bin=new SequenceInputStream(e);   		
		while((i=bin.read())!=-1){    
		    obj.write(i);    
		}     
		bin.close();    
		fin.close();    
		fin2.close(); 
	}
}


	