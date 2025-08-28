public class G {
    public static void main(String[] args) {
        product<order> p=new product<order>();
        System.out.println(p);
    }
}
// G.java:3: error: cannot find symbol
//         product<order> p=new product<order>();
//                 ^
//   symbol:   class order
//   location: class G
// G.java:3: error: cannot find symbol
//         product<order> p=new product<order>();
//                                      ^
//   symbol:   class order
//   location: class G
// 2 errors