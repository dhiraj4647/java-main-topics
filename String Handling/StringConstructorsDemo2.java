/*
3)String(StringBuffer obj):create String object with StringBuffer object data
it perform string copy operation
4)String(StringBuilder obj):create String object with StringBuilder object data
it perform string copy operation
5)String(Char []ch):create String object with given character array data. and perform 
String copy operation from char [] array to String.
6)String(char [] ch, int offset, int count):Cretae the String object with given 
number of count from particular offset index.
7)String(byte[] b):Create String object by converting the byte number into ASCII values 
using the constructor
8)String(byte [] ch, int offset, int count):Cretae the String object with given 
number of count from particular offset index by converting numbers into ASCII values.

Rules:
1)for char[] and byte[] values String constructor the value of offset and count should be within
range else it leads to StringIndexOutOfBoundsException.
2)We cannot pass null directly as an argument becoz it matches with all the constructors so
it gives ambigious error. 
3)We cannot create String object with null reference else leads to NullPointerException
*/
class Demo2{
	public static void main(String[] args){
		char ch[] = {'D','H','I','R','A','J'};
		String s1 = new String(ch);
		System.out.println(s1);
		System.out.println("======================================");
		char ch1[] = {'G','A','R','D','I'};
		String s2 = new String(ch1,1,3);
		System.out.println(s2);//GAR
		System.out.println("======================================");
		byte b[] = {97,98,99,100,101,102,48};
		String s3 = new String(b);
		System.out.println(s3);//abcdef0
		System.out.println("======================================");
		byte b2[] = {97,98,99,100,101,102,103,104};
		String s4 = new String(b2,1,3);
		System.out.println(s4);//bcd
		/*System.out.println("======================================");
		char ch1[] = {'G','A','R','D','I'};
		String s2 = new String(ch1,1,3);//StringIndexOutOfBoundsException
		System.out.println(s2);//GAR
		System.out.println("======================================");*/
		/*System.out.println("======================================");
		String s6 = new String(null);
		System.out.println(s6);//GAR
		System.out.println("======================================");*/
		/*String s8 = null;
		String s9 = new String(s8);//NPE
		System.out.println(s9);*/
	}
}