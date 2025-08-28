 interface K {
    int x=90;
}
class  l implements K{
    public static void main(String[] args) {
       
        K.x=45;
        
    }
    

}
/*
 * K.java:7: error: cannot assign a value to static final variable x
        K.x=45;
         ^
1 error

 */
