import java.io.File;
import java.io.IOException;

public class FileCreation {
    public static void main(String [] args)throws IOException{
        File f = new File("xyx.txt");//it will only create object not File
        if(!f.exists()){
            System.out.println("new file created:"+f.createNewFile());
        }
        else{
            System.out.println("file is already present");
            System.out.println("file name::"+f.getName());
            System.out.println("file is readable:"+f.canRead());
            System.out.println("file is writable::"+f.canWrite());
            System.out.println("file absolute path:"+f.getAbsolutePath());
            System.out.println("file path:"+f.getPath());
            System.out.println("set file as read only:"+f.setReadOnly());
            System.out.println("checking whether we can write:"+f.canWrite());
        }

    }
}
/*
 D:\Hk\IoStream>java FileCreation
new file created:true

D:\Hk\IoStream>java FileCreation
file is already present
file name::xyx.txt
file is readable:true
file is writable::true
file absolute path:D:\Hk\IoStream\xyx.txt
file path:xyx.txt
set file as read only:true
checking whether we can write:false

So FileInputStream and FileOutputStream used this File class method to check whethher 
the files are existed or not in current directory.
->First they create the file class object with given name then they call exist() method 
to check whether given file is available in current directory if not then FileInputStream throws 
exception called FileNotFoundException and FileOutputStream create file with given name
using the createNewFile() method of file class.
 */