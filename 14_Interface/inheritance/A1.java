class B{ }

class C{ }

interface D{ }
interface E{ }
interface F{ }
 

 
//ok
 //public class A1 extends B{ } 
//not ok
   public  class A1 extends D{   
      
   }
  //ok
   //class A2 extends C{ }
//not ok
  class A2 extends B,C{ }
  class A4 extends E{ }
 class A3 extends F{ }
//not ok
 class A7 implements B{ }
//not ok
 class A12 C { }
//ok
/* class b1 implements D{ }
class b2 implements E{ }
class b3 implements D,F{ }
class b4 implements F{ }
class b5 implements E,F{ }
class b6 implements D,E{ }
*/


