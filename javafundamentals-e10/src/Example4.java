public class Example4 {
    public static void main(String[] args) {
        int [] [] a = {{1,2},{3},{4}};
        for(int [] item : a){
            for(int element : item){
                System.out.print(element+" ");
            }
            System.out.println();
        }

    }
}
