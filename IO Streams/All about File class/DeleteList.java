import java.io.File;
import java.io.IOException;

public class DeleteList{
    public static void main(String [] args) throws IOException{
        File f = new File("D:\\Hk\\IoStream\\1.txt");
        f.delete();
        if(f.exists()){
            System.out.println("1.txt file not deleted");
        }
        else{
            System.out.println("1.txt file deleted");
        }

        File f1 = new File("D:\\Hk\\IoStream\\2.txt");
        f1.createNewFile();
        f.deleteOnExit();
        if(f1.exists()){
            System.out.println("2.txt not deleted");
        }
        else{
            System.out.println("2.txt file deleted");
        }

        File f3 = new File("D:\\Hk\\IoStream\\List");
        f3.delete();
        if(f3.exists()){
            System.out.println("list folder not deleted");
        }
        else{
            System.out.println("list folder is deleted");
        }
    }
}
/*
 D:\Hk\IoStream>java DeleteList
1.txt file deleted
2.txt not deleted
list folder not deleted

2.txt is not seen in current director means it will delete when jvmm terminates its execution.
list folder not deleted becoz its not empty.
 */