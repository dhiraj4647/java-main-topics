import java.io.File;

/*
 * In windows we need to use "\\" and in linux we need use "\" so to solve this problem 
 * in File class two variable are given and based on platform it will adjust the seprators
 * 
 * public static final char sepratorChar
 * public static final String separator
 */
public class FileSepratorsDemo {
    public static void main(String [] args){
        String fs = File.separator;
        File f = new File("D:"+fs+"exam"+fs+"test"+fs+"abc.txt");
        System.out.println(f);

    }
}
/*
D:\Hk\IoStream> java FileSepratorsDemo
D:\exam\test\abc.txt
 */