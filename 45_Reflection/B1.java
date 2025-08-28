class B1 {
public static void main(String[]args) throws ClassNotFoundException{

    Class klass=Class.forName("Golu");//Golu.java are not compiled
    System.out.println(klass);
}
}
// Exception in thread "main" java.lang.ClassNotFoundException: Golu
//         at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
//         at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
//         at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:528)
//         at java.base/java.lang.Class.forName0(Native Method)
//         at java.base/java.lang.Class.forName(Class.java:462)
//         at java.base/java.lang.Class.forName(Class.java:453)
//         at B1.main(B1.java:4)