import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
 * 1)public Constructor[] getDeclaredConstructors():-return the public and private constructor
 * 2)public Constructor[] getConstructors():-return only the public constructor.
 * newInstance() method only creates the object by using the no arg constructor.if it does not
 * have no arg constructor it terminates by throwing the instatntiation exception.
 * if loaded class is interface or no arg constructor is declared as private it throws exception.
 */
class ConstrDemo{
    public ConstrDemo(){}
    public ConstrDemo(Integer a){}
    public ConstrDemo(float a, int b){}
    protected ConstrDemo(char c){}
    ConstrDemo(double d){}
}
class ConstructorClassDemo{
    public static void main(String [] arhs) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
        Class cd = Class.forName("ConstrDemo");
        Constructor con[] = cd.getDeclaredConstructors();
        Constructor con1[] = cd.getConstructors();
        System.out.println(con.length);
        System.out.println(con1.length);
        //createing the specific constructor object.
        Constructor con2 = cd.getConstructor(Integer.class);
        Object obj = con2.newInstance(10);
        System.out.println(obj);
    }

}