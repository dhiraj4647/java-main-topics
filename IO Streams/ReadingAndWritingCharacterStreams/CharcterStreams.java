import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Reader is super class of Character Input Streams.
 * Writer is super class of Character Output Streams.
 * FileReader and FileWriter are two classes used to read and write the text data from the files where as 
 * FileInputStream and FileOutputStream are used to read and erite the data from the image files.
 * 
 * below are the constructors available in the both classes.
 * FileReader(File f) throws FileNotFoundException.
 * FileReader(FileDescriptor fd)throws FileNotFoundException.
 * FileReader(String name)throws FileNotFoundException.
 *  
 * FileWriter(File f) throws FileNotFoundException.
 * FileWriter(FileDescriptor fd)throws FileNotFoundException.
 * FileWriter(String name)throws FileNotFoundException.
 * FileWriter(File f,boolean append)throws FileNotFoundException
 * FileWriter(String name,boolean append)throws FileNotFoundException.
 */
class CharacterStreams{
    public static void main(String[] arhs) throws  FileNotFoundException,IOException{
        //read the data from the file.
        FileReader fr = new FileReader("abcd.txt");
        FileWriter fw = new FileWriter("character1.txt");
        int data;
        while((data=fr.read())!=-1){
            System.out.print(data+"--");
            System.out.println((char)data);
            fw.write(data);
        }
        fw.flush();
        

    }
}