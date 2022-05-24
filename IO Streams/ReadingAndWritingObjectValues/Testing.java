import java.io.*;

class A implements Serializable{
	int a;
	A(){
		a=50;
		System.out.println("A is modified");
	}
}
class B extends A{
	int b;
	B(){
		b = 40;
		System.out.println("b is modified");
	}
	public String toString(){
		return a+"-----"+b;
	}
}

class ISRelationWriteDemo{
	public static void main(String[] args) throws Exception{
		B obj = new B();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("demo.ser"));
        
		obj.a=10;obj.b=20;
		System.out.println("Values are modified");
		oos.writeObject(obj);
		System.out.println("Data is returned to file");
	}
}

class ISRelationReadDemo{
	public static void main(String[] args) throws Exception{

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("demo.ser"));
        
		
		B obj = (B) ois.readObject();
		System.out.println(obj);
	}
}

/*
D:\Hk\IoStream>javac Testing.java

D:\Hk\IoStream>java ISRelationWriteDemo
A is modified
b is modified
Values are modified
Data is returned to file

D:\Hk\IoStream>java ISRelationReadDemo
10-----20

D:\Hk\IoStream>
*/