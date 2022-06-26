import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import javax.naming.NamingException;

/*
 * public Method[] getDeclaredMethods(){}:-it return all the methods including private methods but not inherited methods.
 * public method[] getMethods(){}:-It returns only public method including the public inherited methods.
 * public int getModifiers()
 * public Class getReturnType()
 * public String getName()
 * public Class[] getParameterTypes()
 * public Class[] getExceptionTypes()
 * public Object invoke(Object Loadedclassobj, Object method Args)throws IllegalArgumentException
 * we cant call invoke method commonly becoz the parameter list is changed. if all are no arg then we can call it.
 */
interface I{
    public String m1(Integer i1, Integer i2);
    public int m2();
}
class Sample implements I{
    
    @Override
    public String m1(Integer i1, Integer i2) {
        // TODO Auto-generated method stub
        return "dhiraj";
    }
    @Override
    public int m2() {
        // TODO Auto-generated method stub
        return 100;
    }
}
public class MethodClassMethods {
    public static void main(String[] args){
        try{
            Class c = Class.forName("Sample");
            //create object for this
            Object obj = c.newInstance();
            Method[] method = c.getDeclaredMethods();
            System.out.println("the total number of methods:"+c.getDeclaredMethods().length);//it only include the declared methods in sample class.
            System.out.println("get total public methods:"+c.getMethods().length);//it include object public inherited methods(9 object public method+3 sample public method)
            for(Method fk: method){
                //get the modifiers
                int m = fk.getModifiers();
                //convert it into String
                String modifiers = Modifier.toString(m);
                System.out.println(modifiers);
                //get the data type
                Class dt = fk.getReturnType();
                //convert it into String
                String returnType = dt.getName();
                System.out.println(returnType);
                //get the parameters types name
                Class cd[] = fk.getParameterTypes();
                for(Class ck : cd){
                    System.out.print(ck.getName()+"-");  
                }
                System.out.println();
                Class cf [] = fk.getExceptionTypes();
                for(Class ck : cf){
                    System.out.print(ck.getName()+"-");  
                }
                System.out.println();
            }
            //to invoke the methods m1 and m2
            Method m1 = c.getMethod("m1", Interger.class,Integer.class);
            Method m2 = c.getMethod("m2");
            Object ob = m1.invoke(obj, 10,10);
            Object ob2 = m2.invoke(obj);
            System.out.println("return value:"+ob);
            System.out.println("return value:"+ob2);

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
