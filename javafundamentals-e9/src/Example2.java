public class Example2 {
    public static void main(String[] args) {
        /*
        types of declarations
        * */
        int [] x;
        x = new int[5];

        int [] y;
//        y = {}; // not correct
        int [] y1 = {}; // correct
//        y1 = {1,2,3,4,5}; // not correct
        int [] y2 = {1,2,3,4,5};

        int [] w;
        w = new int[] {1,2,3,4,5};

        var a = new int[10];
//        var b = {1,2,3,4,5}; //not correct
        var c = new int[] {1,2,3,4,5};
        m(new int[]{1,2,3,4,5});
    }
    static void m(int [] arr){

    }
}