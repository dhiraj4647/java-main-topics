import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Scanner;

/*
 * Reflection API is used to get the information of runtime class without having .class/.java
 * available physically at developement or compilation time.
 * But .class file must be present at program execution time else it will throws an error like java.lang.ClassNotFoundException.
 * 
 * there are five main reflection api classes:
 * the main class is java.lang.Class and others are available in the java.lang.reflect package.
 * 1)Field:To store the variable information/
 * 2)Constructor: To store the constructor information/
 * 3)Method: To store the method information/
 * 4)Modifiers: It has static methods an constants to decode the class and member access modifiers, 
 * means Field and Method class returns the variable and method modifiers as int value.
 * 
 * java.lang.Class methods :
 * 1) public Field[] getDeclaredFields():- returns all the constructors.
 * 2)public Fiels[] getFields():-returns only public constructors.
 * 3)public static Class forName(String name) throws ClassNotFoundException:- this methods returns the arg class bytecode
 * and load that class into jvm and returns Class object. 
 * 4)public Object newInstance() throws InstantiationException,IllegalAccessException:- to create the object of class.
 * it throws IllefalAccessException if no-arg constructor is not accessble.
 * it throws InstaantiationException if the passes string to forName method is abstract, interface, array class, primitive or void 
 * or if it does not have no arg constructor or it fails due to exception raised in constructors.
 * Field class methods:
 * 1)public int getModifiers() it returns the modifiers of current variable in the int form.
 * to get the modifiers in the String format use the toString method of java.lang.reflect.Modifiers class.
 * public static String toString(int n)
 * 2)public class getType() returns the data type of variable in the Class object form.
 * 3)public String getName() returns the variable name.
 * 4)public Object get(Object loadedClassObj):- return the variable vaalue in the object form
 * if the variable is private then it throws java.lang.IllegalAccessException but we can get the other details.
 */
class Example{
    private static int a=10;
    int b =90;
    protected int c;
    public int d =-90;

}
class PrintVariablesDetails{
    public static void main(String[] args){
        System.out.println("Enter the class name");
        Scanner sc = new Scanner(System.in);
        String className = sc.nextLine();
        try{
            //load the class
            Class c = Class.forName(className);
            //create the object of the class
            Object obj = c.newInstance();
            Field f[] = c.getDeclaredFields();
            System.out.println("the toatal nummber of fields are:"+f.length);
            for(Field fk:f){
                //get the modifiers
                int m = fk.getModifiers();
                //convert it into String
                String modifiers = Modifier.toString(m);
                System.out.println(modifiers);
                //get the data type
                Class dt = fk.getType();
                //convert it into String
                String dataType = dt.getName();
                System.out.println(dataType);
                //get the variable name
                String variableName = fk.getName();
                System.out.println(variableName);
                if(modifiers.contains("private")){
                    
                }
                else{
                    Object o = fk.get(obj);
                    System.out.println(o);
                }
                System.out.println();
            }
        }
        catch(ClassNotFoundException cnf){
            cnf.printStackTrace();
        }
        catch(IllegalAccessException ie){
            ie.printStackTrace();
        }
        catch(InstantiationException ie1){
            ie1.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}