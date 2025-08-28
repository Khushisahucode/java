 class y {

    Y(int x){

    }
}
class H extends y{
    int q=90;
    H(){
    super(q);
    System.out.println("value of q :"+ q);
    }
}
/*
 * H.java:3: error: invalid method declaration; return type required
    Y(int x){
    ^
1 error
 */