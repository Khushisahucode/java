class E{
    public static void main(String[]args){
       try{
        int x=12/0;
    }catch(ArithmeticException e){

        System.out.println("some problm ");
    }
       System.out.println("start ");
       
         System.out.println("end ");
    }
}
// some problm 
// start
// end

