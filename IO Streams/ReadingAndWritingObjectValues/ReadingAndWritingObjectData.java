/*
ObjectInputStream(ObjectInput(I)) and ObjectOutputStream(ObjectOutput(I)):
Used to store Object data permantely in files. For reading and writing object data into files we 
are using this two classes. For doing this the class must subclass of java.io.Serializable interface
which is a marker interface.
-We cannot connect source to destination directly we have to used the following constructors:
public ObjectInputStream(InputStream in)
public ObjectOutputStream(OutputStream out) 

Serialization: it is process of converting the object into stream of bytes and sending them to underlying 
OutputStream here we can store object data permantely into file.
-It is performed by writeObject method
-->In serialization writeObject method stores below information in the file:
1. its class name
2. Current .class file serialVersionUID
3. its non transient variable and data types.
4. those variable currntly modified values.

Deserialization:
-Process of converting stream of bytes into original object and it is performed by readObject method.
-readObject method load the class using the class name writtened in the file.
-->In deserialization readObject method creates the object with given state as below.
1. readObject first reads the class name from serialized file and loads the class using class.forName() method.
2. while loading this static variables gets the memory with originally assigned values and static block are exceuted.
3.then it compares the serialVersionUID of current loaded class and serialVersionUID in the serialized file and
if it different it stops the deserialization process by throwing InvalidClassException.
4. if it is same then it creates the object of current loaded class without new keyword.
5.then readObject assignes the values to non transient variables from serialized file and defaukt values 
to transient and non static variable which are not available in serialized file.



*/
import java.io.*;
class StudentObjectDemo implements Serializable{
	static {
		System.out.println("I am here");
	}
	private String sname = "Dhiraj";
	private String sadd = "Beed";
	private double savg = 90.5;
	public String toString(){
		return "student name "+sname+"----"+" student addd "+sadd+" student avg "+savg;
	}
}
class WriteDemo{
	public static void main(String[] args) throws Exception{
		StudentObjectDemo obj = new StudentObjectDemo();
		//creating the stream object
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"));
        
		oos.writeObject(obj);
		System.out.println("Data is returned to file");
		//code to get the serialVersionID
		long serialVersionID = ObjectStreamClass.lookup(obj.getClass()).getSerialVersionUID();
		System.out.println(serialVersionID);
	}
}

class ReadDemo{
	public static void main(String[] args) throws Exception{
		
		//creating the stream object
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"));
        
		StudentObjectDemo obj = (StudentObjectDemo)ois.readObject();
		
		System.out.println("Data"+obj);
		
	}
}
//long serialVersionID = ObjectStreamClass.lookup(i.getClass()).getSerialVersionUID();

        
		
	
	