public class Example1 {
    public static void main(String[] args) {
        //++ --
        /*pre-increment and post-increment
        * i+1 does not mean i++ , i++ means i=i+1;
        * */
        var i =10;
//        System.out.println(i+1);
//        System.out.println(i++); //post-increment , first evaluate then execute
//        System.out.println(i);

        m(i++);
        System.out.println(i);

    }
    static void m(int copyOfI){
        System.out.println(copyOfI);
    }
}