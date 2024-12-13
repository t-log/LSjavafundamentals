public class Example1 {
    public static void main(String[] args) {
        /*naming your loop : labelling
        * labelling should be avoided for clean code practices
        * you will not see this in production ready code but for ocp exam it would be there
        * */
        var i = 1; var j = 1;
        A: while(i<=3){
            B: while(j<=3){
                System.out.println(":)");
                if(j%2==0) break A;
                j = j + 1;
            }
            i = i + 1;
        }
    }
}