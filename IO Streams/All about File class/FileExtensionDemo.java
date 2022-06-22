import java.io.File;
import java.io.FilenameFilter;

class FileExtension implements FilenameFilter{
   
    String ext;
    public FileExtension(String ext){
        this.ext = "."+ext;

    }
    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }

}
public class FileExtensionDemo {
    public static void main(String [] rhd){
        String dir = "../IOSTREAM";
        File f = new File(dir);
        FilenameFilter file = new FileExtension("java");
        String f1[] = f.list(file);
        for(int i=0;i<f1.length;i++){
            System.out.println(f1[i]);
        }

    }
}
/*
 D:\Hk\IoStream>java FileExtensionDemo
BufferReaderAndWriterDemo.java
CharacterStreamDemo.java
CharcterStreams.java
DefaultSreamObjects.java
FileClassDemo.java
FileCopy.java
FileCreation.java
FileExtensionDemo.java
FileParentDirectoryDemo.java
InputAndOutputStreamReader.java
ListFilesDemo.java
PrintStreamDemo.java
ReadingAndWritingData.java
ReadingAndWritingObjectData.java
ReadingAndWritingObjectValues.java
ReadingAndWritingPrimitiveValues.java
ReadingDataFromFile.java
ReadingDataFromKeyboard.java
SequenceInputStreamDemo.java
SystemOutPrintlnDemo.java
Testing.java
WritingDataToFile.java
 */