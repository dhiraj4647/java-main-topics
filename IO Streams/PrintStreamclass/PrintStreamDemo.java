/*
PrintStream Class:This class is used to write the data into the given format. means 
97 is printed as 97 not 'a'. because it iternally converts this value into string 
using String.valueOf() method.
-In addition to write() method it provides print() and println() method. this two methods
are overloaded to print all types of java data types values including Object.
Ex:public void print(int x);
public void print(int x);
public void println(String x);
public void print(char c);
PrintStream object is created in System class using static variable out so we are calling
this method using System.out.println()
-we can not pass null literal directly in the print and println method it gives the ambigious error becoz 
of String and char[] parameter method. but we can pass null in terms of reference variable.
-We can also explicitly create the object of PrintStream class using the following constructor:
1)public PrintStream(OutputStream out)
2)public PrintStream(OutputStream out, boolean autoFlush)
3)public PrintStream(String FlieName)
4)public PrintStream(File file)

the difference between print() and write() method print() method directly write the data as it is while 
write() method converts numbers into characters.
*/

import java.io.*;
class PrintStreamDemo{
	public static void main(String[] args) throws FileNotFoundException{
		//System.out.print();//We dont have non param constructor for print() so its error
		System.out.println();// it is possible becoz it println the one \n inbulit
		//System.out.println(null);//We cannot print null directly
		String s = null;
		System.out.println(s);//It is also possible
	    System.out.println("================================");
		PrintStream ps = new PrintStream(new File("123.txt"));
		ps.print("Dhiraj");
		ps.println(20);
		ps.print(12.3f);
		ps.write(97);
		ps.write(98);
		System.out.println("Data is written to file");
	}
}	