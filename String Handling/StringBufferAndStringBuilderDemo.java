/*
StringBuffer and StringBuilder:
StringBufferClass:It is mutable class and can be modified in the same memory.
-We can only create StringBufferClass using the constructor.
1)public StringBuffer(): creates the empty stringbuffer object with 16 buffers means 16 empty 
locations.
2)public StringBuffer(int capacity): creates the empty string with given capacity. and capacity
should be +ve else it throws the NegativeArraySizeException
3)public StringBuffer(String s): craetes the StringBuffer object with given string object data 
performs string copy operation. and the capacity is (16+s.length()).
4)public StringBuffer(charSequence cs):creates the new stringbuffer object with the given cs object
characters and performs the string copy operation from cs object to stringbuffer object and capacity
is [16+cs.length()].
-Stringbuffer and stringbuilder are same only difference is StringBuffer is synchronized so 
used in multithreading and stringbuilder is non synchronized so used where single thread is there.
--->Controlling string buffer capacity:
1)public void ensureCapacity(int minCapacity):
ensure that capacity is equal to specified minimum if current capacity is less than the argument
then new array is created with greater capacity (twice the old capacity+2) if capacity is negative then
current capacity is returned.
2)public void trimToSize(): reduces the sb capacity to its size.
3)public void setLength(int newLength):sets the length of the buffer to given length
*/
class StringBufferAndStringBuilderDemo{
	public static void main(String[] args){
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity());//16
		StringBuffer sb2 = new StringBuffer(5);
		System.out.println(sb2.capacity());//5
		//StringBuffer sb3 = new StringBuffer(-9);java.lang.NegativeArraySizeException
		StringBuffer sb4 = new StringBuffer("Dhiraj");
		System.out.println(sb4);//Dhiraj
		System.out.println(sb4.capacity());//22
		StringBuffer sb5 = new StringBuffer("Pavam");
		StringBuffer sb6 = new StringBuffer(sb5);
		System.out.println(sb5.capacity());//21
		System.out.println(sb6.capacity());///21
		System.out.println(sb5 == sb6);//false
		//We cannot create /stringbuffer object by passing null it leads to NPE not ambigous problem
		//beacause here string and charSequence are overloaded in super and subclass.
		System.out.println("=======================================================");
		//append method:
		StringBuffer sb7 = new StringBuffer("Dhiraj");
		StringBuffer sb8 = sb7.append(" Gardi");
		System.out.println(sb7+"----"+sb7.capacity());
		System.out.println(sb8+"------"+sb8.capacity());
		System.out.println(sb7 == sb8);
		System.out.println("=========================================");
		//insert method
		StringBuffer sb9 = new StringBuffer("18082001");
		sb9.insert(2,'/');
		System.out.println(sb9);
		sb9.insert(5,'/');
		System.out.println(sb9);
		System.out.println(sb9.capacity());
		//delete operation
		System.out.println("=========================================================");
		StringBuffer sb10 = new StringBuffer("Dhiraj Gardi");
		sb10.delete(2,5);
		System.out.println(sb10);
		sb10.deleteCharAt(2);
		System.out.println(sb10);
		System.out.println(sb10.capacity());
		System.out.println("============================================================");
		//reverse the string
		StringBuffer sb11 = new StringBuffer("Dhiraj");
		sb11.reverse();
		System.out.println(sb11);
		StringBuffer sb12 = new StringBuffer("Dhiram");
		System.out.println(sb12.capacity());//22
		System.out.println(sb12.length());//6
		sb12.insert(5,"Gardi");
		System.out.println(sb12);
		System.out.println(sb12.capacity());//22
		System.out.println(sb12.length());//11
		System.out.println(sb12);
		System.out.println("========================================================");
		StringBuffer sb13 = new StringBuffer();
		System.out.println(sb13.capacity());//16
		sb13.ensureCapacity(17);
		System.out.println(sb13.capacity());//(16*2+2)=34>17
		sb13.ensureCapacity(100);
		System.out.println(sb13.capacity());//(34*2+2)=70<100
		sb13.ensureCapacity(-8);
		System.out.println(sb13);//100
		System.out.println("==========================================================");
		StringBuffer sb14 = new StringBuffer();
		System.out.println(sb14.capacity());
		System.out.println(sb14.length());
		sb14.append("Dhiraj");
		System.out.println(sb14.capacity());
		System.out.println(sb14.length());
		sb14.trimToSize();
		System.out.println(sb14.capacity());
		System.out.println(sb14.length());
		System.out.println("===================================================");
		System.out.println("setLength cases");
		//case1 if passes length is grether than current length it places empty spaces.
		StringBuffer sb15 = new StringBuffer("abcdefg");
		System.out.println(sb15.capacity());
		System.out.println(sb15.length());
		System.out.println(sb15);
		
		sb15.setLength(9);
		System.out.println(sb15.capacity());
		System.out.println(sb15.length());
		System.out.println(sb15);
		//the length must not be negative else leads to IndexOutOfBoundsException
		System.out.println("===================================================");
		//case2 if passes length is smaller then it removes the extra characters
		StringBuffer sb16 = new StringBuffer("abcdefg");
		System.out.println(sb16.capacity());//23
		System.out.println(sb16.length());//7
		System.out.println(sb16);//abcdefg
		
		sb15.setLength(4);
		System.out.println(sb16.capacity());//23
		System.out.println(sb16.length());//4
		System.out.println(sb16);//abcd
		System.out.println("===================================================");
		//case1 if passes length is grether than current length, first it increase the capacity
//by calling ensureCapacity method and then increase the length with given number.		
		StringBuffer sb17 = new StringBuffer("abcdefg");
		System.out.println(sb17.capacity());//23
		System.out.println(sb17.length());//7
		System.out.println(sb17);//abcdefg
		
		sb17.setLength(24);
		System.out.println(sb17.capacity());//46
		System.out.println(sb17.length());//18
		System.out.println(sb17);//abcdefg

		StringBuffer sb19 = new StringBuffer("dhirak");
		StringBuffer sb20 = new StringBuffer("dhirak");
		System.out.println(sb19==sb20);//false
		//toString method demo:toString is override in all the three classes to print state.
		String s1 = "Dhiraj";
		StringBuffer s2 = new StringBuffer("Dhiraj");
		StringBuilder s3 = new StringBuilder("Dhiraj");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		//equals() method is overriden in only String class so it compare with state. 
		//equals() method is not overriden is StringBuffer and StringBuilder class. so both == and equals() method print same.
		System.out.println("===================================================");
		System.out.println("Project development rules");
		/*In project we store data in java.lang.String for any modification we convert in into StringBuffer
		or StringBuilder and after that modification we covrt them back to string 
		we use generally StringBuffer(String) and String(StringBuffer) for conversion.
	}
}