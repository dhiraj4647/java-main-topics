import java.io.File;
import java.io.IOException;

public class FileParentDirectoryDemo {
    public static void main(String[] args) throws IOException{
        File f1 = new File("1.txt");
        f1.createNewFile();//1.txt is created

        File f2 = new File("2.txt");
        f2.mkdir();//2.txt is created as directory in current working directory as 2.txt as folder suppports this name also.

        File f3 = new File("test");
        f3.mkdir();//creates test as directory.

        File f4 = new File(f3,"3.txt");
        f4.createNewFile();//3.txt is created inside test directory.

        File f5 = new File(f3,"abc");
        f5.mkdir();//creates abc directory inside test directory.

        File f6 = new File("pqr","stv");
        f6.mkdirs();//creates pqr directory in curr working directory and inside that stv is created.

        System.out.println("f1:"+f1);
		System.out.println("f2:"+f2);
		System.out.println("f3:"+f3);
		System.out.println("f4:"+f4);
		System.out.println("f5:"+f5);
        System.out.println("f6:"+f6);
    }
}
/*
 D:\Hk\IoStream>java FileParentDirectoryDemo      
f1:1.txt
f2:2.txt
f3:test
f4:test\3.txt
f5:test\abc
f6:pqr\stv
 */