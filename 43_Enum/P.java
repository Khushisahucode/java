
enum coffemugsize{
    large(200),medium(500),small(700);
    private int size;
    coffemugsize(int size ){
      this.size=size;
    }
    int getsize(){
        return size;
    }
    // public String toString(){
    //     return this+ "...."+ size;
    // }
    public String toStringify(){
         return this + "......"+ size;
    }
}
class P{
    public static void main(String[] args) {
        coffemugsize x=coffemugsize.small;
        System.out.println(x);
        System.out.println(x.getsize());
        System.out.println(x.toStringify());
    }
}
// small
// 700
// small......700