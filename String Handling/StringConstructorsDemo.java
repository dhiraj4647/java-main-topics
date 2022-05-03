/*
String class:
it is sequence of characters, their values cannot be changed after the creation in memory.(Immutable)
-We can use character array to store the characters but due to its size limitations sun provided the String class.


*/
class Demo{
	public static void main(String[] args){
		String s = "Dhiraj";
		s = "Gardi";
		System.out.println(s);
		System.out.println(s instanceof java.lang.String);//true
		//1)using String() create empty String object
		String s1 = new String();
		System.out.println(s1);
		System.out.println("=========================================");
		//2)create string with given string characters
		String s2 = new String("Dhiraj");
		String s3 = new String(s2);
		//here value of s2 (Dhiraj) is copied to newly created ref s3 
		System.out.println(s2);
		System.out.println(s3);
		String s4 = new String("Gardi");
		String s5 = s4;
		//using above line the ref is copied into s5 means both s4 and s5 are pointing to same location 
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s2 == s3);//false
		System.out.println(s4 == s5);//true
		
		System.out.println("=========================================");
	}
}