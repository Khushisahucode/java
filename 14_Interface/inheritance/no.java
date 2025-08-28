class B {
    
}
class C{

}
interface D2{

}
interface E2{

}
//ok 

interface c2 extends E2{

}
interface c3 extends E2,D2{
      }
      
     
     
      //not ok
     /* interface c1 extends B{
        
      } interface c2 extends B,C{
        
      }

       interface c3 implements D2 ,E2{
        
      }
      interface c4 implements D2 {
        
      }
      interface c5 implements  E2{
        
      }
      interface c6 implements  B ,C{
        
      }*/