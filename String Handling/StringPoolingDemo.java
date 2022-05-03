/*
String Polling Concept:
If we create String object by assigning the same string literal then only one object is created
and all referenced variable are initialized with same String object reference.
-This is reason java String are immutable. immutable means if same literal create same memory else 
create seprate.	
-The String pooling is not applicable for String object created using new and constructor. 
They are created in heap area not in String pooled area. also the String object created using
the expression (+operator), method returned String object does not comes under String pooling
-String pooling concept is given to increase the performance by saving memory. 
-If an expression has only String literal that expression is calculated by compiler and 
place result as literal and then jvm creates it in StringPooled area.
-If expression contains variable then it is calculated by jvm and created that object in heap area.
*/
class StringPoolingDemo{
	public static void main(String[] args){
		String s1 = "A";
		String s2 = "A";
		
		System.out.println(s1 == s2);//true
		System.out.println(s1+"--"+s2);//A--A
		s2="K";
		System.out.println(s1+"--"+s2);//A--K
		System.out.println(s1 == s2);//false
		
		System.out.println("============================");
		
		String s3 = new String("A");
		String s4 = new String("A");
		System.out.println(s3 == s4);//false
		System.out.println(s3.hashCode()+"--"+s4.hashCode());//true becoz hashcode and equal are override in String class
		System.out.println(s3.equals(s4));//true
		System.out.println("============================");
		
		String s11 = "a";//created in string pooled area
		String s12 = "a";//created in string pooled area
		String s13 = "b";//created in string pooled area
		
		String s14 = new String("a");//created in string heap area
		String s15 = new String("a");//created in string heap area
		String s16 = "ab";//created in string pooled area
		String s17 = s11+"b";//created in string heap area
		String s18 = "a"+"b";//created in string pooled area
		System.out.println(s11 == s12);//true
		System.out.println(s11 == s13);//false
		System.out.println(s14 == s15);//false
		System.out.println(s16 == s17);//false
		System.out.println(s16 == s18);//true
		
	}
}
