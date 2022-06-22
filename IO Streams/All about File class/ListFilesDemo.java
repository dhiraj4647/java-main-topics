import java.io.File;

public class ListFilesDemo {
    public static void main(String args[]){
        File f = new File("List");
        if(f != null){
            File[] f1 = f.listFiles();
            if(f1 != null){
                for(int i=0;i<f1.length;i++){
                    File f3 = f1[i];
                    if(f3.isFile()){
                        System.out.println("file:"+f3);
                    }
                    else{
                        System.out.println("folder:"+f3);

                    }
                }
            }

            else{
                System.out.println("directory is null");
            }
        }
    }
}
