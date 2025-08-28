class B extends RuntimeException{
    public static void main(String [] args){
        try{
         B x=new B(); //unchecked  ---->Exception
         throw x;
        }catch(  B e){  //checked + unchecked  ---->Exception 

        }
    }
}
