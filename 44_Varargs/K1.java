 class K1{
    static void pro(int...x) {
        for(int next:x)
        System.out.println(next);
    }   
     public static void main(String[] args) {
        float f=34.5f;
        byte b=13;
        short s=127;
        double d=34.78;
        long l=45657l;
        char c=65; int i=56;
          K1.pro(c,s,b,i);
        K1.pro((int)l);
         K1.pro((int)d);
          K1.pro((int)f);
     }}
//      65
// 127
// 13
// 56
// 45657
// 34
// 34