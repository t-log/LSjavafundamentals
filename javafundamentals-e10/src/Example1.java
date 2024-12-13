import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
        /*arrays part-2
        * normal for vs enhanced for
        * never get into infinite loop with enhanced for
        * */
        var x = new int[]{1,2,3,4,5};
        for(int a : x){
            a = 10; // only a will be changed and the array will be unchanged
        }
        System.out.println(Arrays.toString(x));
    }
}