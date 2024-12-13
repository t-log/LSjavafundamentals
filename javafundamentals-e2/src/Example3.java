public class Example3 {
    public static void main(String[] args) {
       /*
       * char
       * char is a numeric datatype
       * */
        char c1,c2,c3,c4;
        c1='a';
        c2='\n'; //escape sequences
        c3='a';
        c4='\u0062'; //unicode representation UTF of b
        System.out.print(c1);
        System.out.print(c2);
        System.out.print(c3);
        System.out.print(c2);
        System.out.print(c4);
        System.out.println();
        int a = c1;
        System.out.println(a);
    }
}