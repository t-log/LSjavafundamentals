public class Example_E_4_8 {
    public static void main(String[] args) {
        /*continue
        * avoid using break and continue in real-world apps
        * */
       var i = 0;
       while(i<10){
           i+=1;
           if(i%2==0){
               continue;
           }
           System.out.println(i);
       }

    }
}
