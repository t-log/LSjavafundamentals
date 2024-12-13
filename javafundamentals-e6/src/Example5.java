public class Example5 {
    public static void main(String[] args) {
        var i = 0;
        while(i<10){
            System.out.println(i);
//            i++;
            i=i++; //error infinite loop
        }
    }
}
