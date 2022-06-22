import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * This classes are used to reading and writeing capacity of Input and Output Stream.
 * 
 * below are the constructors available :
 * public BufferedReader(Reader in)
 * public BufferedReader(Reader in,int size)
 * public BufferedWriter(Writer out)
 * public BufferedWriter(Writer out, int size) 
 * 
 * It used readLine() method to read the one line at a time
 */
public class BufferReaderAndWriterDemo {
    public static void main(String[] args)throws IOException,FileNotFoundException{
        BufferedReader bfr = new BufferedReader(new FileReader("buffer.txt"));
        BufferedWriter bwr = new BufferedWriter(new FileWriter("write.docx"));
        String line = null;
        while((line=bfr.readLine())!= null){
            bwr.write(line);
            System.out.println(line);
        }
    }
}
