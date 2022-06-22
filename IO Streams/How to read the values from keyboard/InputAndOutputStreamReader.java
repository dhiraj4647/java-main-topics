/*
We can directly read the values from the keyboard using the BufferedReader
method.
BufferedReader br = new BufferedReader(System.in);
it will throw error because the BufferedReader does not have constructor with
InputStream value. it has Reader param constructor. so we need Reader subclass that has
InputStream param constructor that is:
InputStreamReader:-This class acts as bridge between 
binary stream to character stream it reads bytes and decode them into character.
public InputStreamReader(InputStream in)
OutputStreamReader:-This class acts as bridge between 
character stream to binary stream it reads character and decode them into binary.
public InputStreamReader(InputStream in)
*/
import java.io.*;
class Sample{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the no");
		String no = br.readLine();
		int no1 = Integer.parseInt(no);
		System.out.println("Enter the no");
	    String name = br.readLine();
		System.out.println(no1);
		System.out.println(name);
	}
}