/*
String methods:
1)checking string is empty or not
2)Finding the length of String
3)comapring two strings
*/
class Example{
	public static void main(String[] are){
		String s1 = "Dhiraj";
		System.out.println("checking String empty or not");
		System.out.println(s1.isEmpty());//false
		System.out.println("================================");
		
	    System.out.println("Finding length of String");
		String s2 = "";
		String s3 = new String();
		String s4 = " ";
		System.out.println(s2.isEmpty());//true
		System.out.println(s2.length());//0
		System.out.println(s1.length());//6
		System.out.println(s3.length());//0
		System.out.println(s4.length());//1
		System.out.println("================================");
        System.out.println("comparing two strings");
		
		String s5 = new String("abc");
		String s6 = new String("abc");
		String s7 = new String("Abc");
		String s8 = "Dhiraj";
		System.out.println(s5.equals(s6));//true
		System.out.println(s5 == s6);//false
		System.out.println(s5.equals(s7));//false
		System.out.println(s1 == s8 );//true
		System.out.println(s1.equals(s8));//true
		System.out.println("==============================");
		
		System.out.println("comparing String objects without case");
		System.out.println(s5.equalsIgnoreCase(s6));//true
		System.out.println(s5 == s6);//false
		System.out.println(s5.equalsIgnoreCase(s7));//true
		System.out.println(s1 == s8 );//true
		System.out.println(s1.equalsIgnoreCase(s8));//true
		System.out.println("==============================");
		
		System.out.println("comparing String lexicographically using compareTo and CompareToIgnoreCase");
		String s9 = new String("a");
		String s10 = new String("A");
		String s11 = new String("Dhiraj");
		System.out.println(s9.compareTo(s10));//97-65=32
		System.out.println(s10.compareTo(s9));//65-97=-32
		System.out.println(s9.compareToIgnoreCase(s10));//0
		System.out.println(s10.compareToIgnoreCase(s9));//0
		System.out.println(s1.compareTo(s11));//0
		String s12 = "abc";
		String s13 = "abcdef";
		System.out.println(s12.compareTo(s13));//s12.length()-s13.length()=-3
		System.out.println(s13.compareTo(s12));//s13.length()-s12.length()=3
		System.out.println(s12.compareToIgnoreCase(s13));//-3
		System.out.println(s13.compareToIgnoreCase(s12));//3
        System.out.println("==============================");
		
		System.out.println("checking start with and ends with");
		String s14 ="Java Programming Language";
		System.out.println(s14.startsWith("java"));//false
		System.out.println(s14.startsWith("Java"));//true
		System.out.println(s14.endsWith("hari"));//false
		System.out.println(s14.endsWith("Language"));//true
		System.out.println("==============================");
		
		System.out.println("print character at given index");//index starts with zero
		System.out.println("Character at 10 th index is "+s14.charAt(10));//a
		for(int i=0;i<s14.length();i++){
			System.out.print(s14.charAt(i));
		}
		System.out.println("==============================");
		
		System.out.println("Finding the index of given character of String");
		//It has 8 methods to find out index from start and end of both character and string and 
		//finding the index of particular charcter or string from given index
		String s15 = "Dhiraj Subhash Gardi";
		System.out.println(s15.indexOf('a'));//4
		System.out.println(s15.indexOf('G'));//15
		System.out.println(s15.lastIndexOf('a'));//16
		System.out.println(s15.lastIndexOf('i'));//19
		System.out.println(s15.indexOf('a',4));//4
		System.out.println(s15.indexOf('G',5));//15
		System.out.println(s15.lastIndexOf('a',10));//4
		System.out.println(s15.lastIndexOf('G',15));//15
		System.out.println(s15.indexOf("Gar"));//15
		System.out.println(s15.lastIndexOf("Su"));//7
		System.out.println(s15.indexOf("raj",2));//3
		System.out.println(s15.lastIndexOf("Gar",15));//15
		System.out.println(s15.indexOf('z'));//-1 if anything not found it return -1
		System.out.println("==============================");
		
		System.out.println("substring method that return the particular string");
		String s17 = "Suraj Subhash Gardi";
		System.out.println(s17.substring(5));// Subhash Gardi
		System.out.println(s17.substring(5,15));//
		System.out.println(s17.substring(5,16));//
		//System.out.println(s17.substring(-6));//SIOBE
		//System.out.println(s17.substring(5,56));//SIOBE
		System.out.println(s17.substring(5,5));//
		System.out.println(s17.substring(8,9));//
		System.out.println(s17.substring(s17.indexOf('a'),s17.indexOf('G')));//
		//System.out.println(s17.substring(16,5));//SIOBE
		//System.out.println(s17.substring(-1,5));//SIOBE
		System.out.println("==============================");
		
		System.out.println("Concatenation of string");
		//using + operator
		String s18 = "Dhiraj "+"Gardi";
		String s19 = s18+" Wadwani";
		System.out.println(s18);
		System.out.println(s19);
		//using concat method
		String s20 = "Dhiraj";
		String s21 = s20.concat(" Gardi");
		System.out.println(s21);
		//here s21 is new created object it does not perform modification on s20
		
		//Due to string method call, if string object is not chnaged then current string object ref is returned
		String s22 = "Dhiraj";
		String s23 = s22.concat("");
		System.out.println(s22+"----"+s23);
		System.out.println(s23==s22);//true
		String s24 = new String("Dhiram");
		String s25 = s24.concat("");
		System.out.println(s24+"----"+s25);
		System.out.println(s24==s25);//true
//      //if we are using + operator then it will create new object irrespective of modification
        String s26 = "Dhiraj";
		String s27 = s26+"";
		System.out.println(s26+"----"+s27);
		System.out.println(s26==s27);//false
		System.out.println("==============================");
		
		System.out.println("Converting string into uppercase and lowercase");
		String s28 = "dhiraj";
		String s29 = s28.toUpperCase();
		String s30 = s28.toLowerCase();
		System.out.println(s28);
		System.out.println(s29);
		System.out.println(s30);
		System.out.println(s28 == s29);//false
		System.out.println(s28 == s30);//true
		System.out.println("==============================");
		
		System.out.println("Replacing the character with given character string");
		String s31 = "Java Programming Language";
		String s32 = s31.replace('a','k');
		System.out.println(s31);
		System.out.println(s32);
		String s33 = s31.replace("Programming","Object Oriented");
		System.out.println(s33);
		String s34 = "Hi Hi Hi";
		String s35 = s34.replace("Hi","Hello");
		System.out.println(s35);
		String s36 = s34.replaceFirst("Hi","Hello");
		System.out.println(s36);
		System.out.println("==============================");
		
		System.out.println("deleteing trailing and leading spaces(Not middle) of string");
		String s37 = " Dhiraj Subhash Gardi ";
		String s38 = s37.trim();
		System.out.println(s38);
		System.out.println(s37 == s38);
		System.out.println(s37.length());
		System.out.println(s38.length());
		System.out.println("==============================");
		
		System.out.println("Spilt method of string");
		String s39 = "Dhiraj Subhash Gardi";
		String []array = s39.split(" ");
		for(int i=0 ;i<array.length;i++){
			System.out.println(array[i]);
		}
		String s40 = "Dhiraj Subhash gardi";
		System.out.println(s40.contains("gardi"));
		System.out.println(s40.indexOf("gardi"));
		
	}
}