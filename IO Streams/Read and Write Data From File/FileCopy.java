import java.io.*;
class FileCopy{
    public static void fileCopy(String srcFile, String destFile) throws IOException{
		FileInputStream fis = new FileInputStream(srcFile);
		FileOutputStream fos = new FileOutputStream(destFile,true);
		int i;
		while((i=fis.read())!= -1){
			fos.write(i);
		}	
		System.out.println("Data is written succesfully");
				
	}
}	
class Test{
    public static void main(String args[]){
		try{
			FileCopy.fileCopy(args[0],args[1]);
		}
		catch(ArrayIndexOutOfBoundsException ae){
			ae.printStackTrace();
		}	
		catch(FileNotFoundException fe){
			fe.printStackTrace();
		}
		catch(IOException ie){
			ie.printStackTrace();
		}
	}
}
//Using FileInputStream and FileOutputStream data can be only read and write 
//in the form of byte not possible to read or write data in the format of primitive data and object.
/*
D:\Hk\IoStream>javac FileCopy.java

D:\Hk\IoStream>java Test e://source.txt e://destination.txt
Data is written succesfully
*/