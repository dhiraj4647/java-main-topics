import java.io.File;
import java.io.IOException;

public class DeleteDirectoryFiles {
    public static void main(String args[]) throws IOException{
        File d = new File("List");

        DeleteDirectoryFiles.deleteDirectory(d);
    }
    public static void deleteDirectory(File f){
        
        if(f != null){
            File[] f1 = f.listFiles();
            if(f1 != null){
                for(int i=0;i<f1.length;i++){
                    File f3 = f1[i];
                    if(f3.isFile()){
                        f3.delete();
                    }
                    else{
                        deleteDirectory(f3);

                    }
                }
            }

            else{
                System.out.println("directory is null");
            }
        }
    }
}

