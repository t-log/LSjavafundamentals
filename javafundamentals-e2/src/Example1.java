public class Example1 {
    public static void main(String[] args) {
        byte b1;
        b1 = 10;
        byte b2 = 20; // these are local variables
        /*
        * all integral types are of int by default which is then type converted
        * */
        long w1 = 99999999999L; // we use L at the end to make the number be considered as long otherwise it would
                                // be int by default

        int base8 = 047;
        System.out.println(base8);
        int base16 = 0xFF;
        System.out.println(base16);
        int binary = 0b101011001;
        System.out.println(binary);
    }
}