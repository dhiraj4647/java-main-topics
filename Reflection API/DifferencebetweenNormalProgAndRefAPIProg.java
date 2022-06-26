
/*
class NormalProgramming{
    static{
        System.out.println("Normal class is loaded");
    }

    public static void main(String [] args){
        System.out.println("Np Main method");
        A obj = new A();//here first A class is loaded and then object is created
        obj.m1();
        A obj2 = new A();//here just oobject is created bcoz object is  alredy present.
        obj2.m1();

    }
}
*/
class ReflectionAPIProg{
    static{
        System.out.println("Reflection api class is loaded");
    }

    public static void main(String [] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        System.out.println("reflection api Main method");
        Class cd =Class.forName("A");
        Object obj = cd.newInstance();
        A obj1 = (A)obj;
        obj1.m1();
        
        Class cd1 =Class.forName("A");
        System.out.println(cd1==cd);//returns true becoz class A is already loaded so same ref is returned.
        Object obj2 = cd1.newInstance();
        A obj3 = (A)obj2;
        obj3.m1();

    }
}
/*
 * Here in reflection api code it takes more time for exceution ecoz code is also increased and also 
 * the excution steps are increased.
 * we must devlope the code if we want to use the more operations on the method of object.
 * 
 * case1)
 * A obj = new A();
 * here compilers earches for A.class file in the current folder if not found throws error cant find symbol A.
 * 
 * Class.forName("A").newInstance():
 * here compiler does not search for A.class file it just consider as string and code is compiled but jvm 
 * treat this as class Name and searches the A.class file if not found it throws exception.
 * 
 * case2)
 * If we compile the A.java its all internal classes are also compiled and in reflection api it does not 
 * compile the internal classes.
 *
 */