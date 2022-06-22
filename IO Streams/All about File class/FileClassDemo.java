/*
 * File class is used to represent files and directory path. this class is used to create, delete, rename files and 
 * directories.
 * constructors:
 * 1)public File(String); used from the current working directory.
 * 2)public File(String parent, String child);create the new file instance with given parent file and child path.
 * 3)public File(File parent,String child);create a new file instance with give parent file and child path.
 * File f1 = new File("IOStream");
 * File f2 = new File(f1,"abc.txt"); abc is used from the IOStream folder from current working directory.
 * 4)public File(URI uri); create the new file instance by converting the given file
 * When File object is cretaed then jvm only creates the File class object with given file name, it will not 
 * check for file in current directory.
 * File class does not creates the files.
 * to do that File class uses its methods.
 * 
 */


import java.io.File;

public class FileClassDemo {

	public static void main(String[] args) {
		File f1 = new File("abc.txt");
		File f2 = new File("test","abc.txt");
		File f = new File("test");
		File f3 = new File(f,"abc.txt");
		File f4 = new File(f1.toURI());
		
		System.out.println("f1:"+f1);
		System.out.println("f2:"+f2);
		System.out.println("f3:"+f3);
		System.out.println("f:"+f);
		System.out.println("f4:"+f4);

	}

}
/*
f1:abc.txt
f2:test\abc.txt
f3:test\abc.txt
f:test
f4:D:\Hk\IoStream\abc.txt
 */
