/*
FilterInputStream and FilterOutputStream: It uses another InputStream and OutputStream
object for reading and writing data.
DataInputStream: (Extends FilterInputStream and Implements DataInput interface)Used to read bytes from the InputStream and convert them into 
correspondance java primitive type object
DataOutputStream: (Extends FilterOutputStream and implements DataOutput interface)
UEInfoServiceContextsed to write the the java primitive type values into sequence 
of bytes and write this bytes into binary OutputStream
->To read data as input primitive values use readXXX() method and to write primitive data 
values as binary using writeXXX();
->readXXX() method must be called as writeXXX() method otherwise wrong values are written
or EOFException is raised
 
*/
import java.io.*;
class DataOutputStreamAndDataInputStreamDemo  {
	static void readMethod()throws IOException {
		FileInputStream fis = new FileInputStream("e://data.txt");
        DataInputStream dis = new DataInputStream(fis);
        int a = dis.readInt();
        float b = dis.readFloat();
		long c = dis.readLong();
		double d = dis.readDouble();
		String s = dis.readUTF();
		char e = dis.readChar();
		boolean f = dis.readBoolean();
		//int k= dis.readInt(); EOFException
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(s);
		System.out.println(e);
		System.out.println(f);
		
	    System.out.println("Data is read");
	}
	static void writeMethod()throws IOException{
		FileOutputStream fos = new FileOutputStream("e://data.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeInt(10);
        dos.writeFloat(10.8f);
		dos.writeLong(30L);
		dos.writeDouble(12.3);
		dos.writeUTF("Dhiraj");
		dos.writeChar('a');
		dos.writeBoolean(true);
		dos.flush();
	    System.out.println("Data is written");
	}
	public static void main(String args[]) throws IOException{
        writeMethod();
		readMethod();
    }
}	
//Here if use readInt() method then it reads the four bytes from the file like wise
//if we change the order then program gets executed but with wrong answers.
//If the file to read 4 bytes and file has only 3 bytes available then it throws EOFException
//at runtime.
//Here limitation of using DataInputStream and DataOutputStream is that it can 
//only able to read the primitive values. it cannot read Object values. use ObjectInputStream and
//ObjectOutputStream.