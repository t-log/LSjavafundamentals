public class Example3 {
    public static void main(String[] args) {
        int [] [] [] a = {{{1,2,3}},{{1}},{null},null};
        System.out.println(a[2].length);
        System.out.println(a[2][0].length); //exception thrown here because the reference is null
    }
}
