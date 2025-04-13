import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Example6 {
    /* Optional Class
    * introduced in java 8
    *
    * */
    public static void main(String[] args) {

        String s1 = null; //
        int n = s1.length(); // :( NullPointerException
        //NullPointerExceptions are trouble for devs
    }
    static Optional<String> m1(){
        //code here...
//        return null; //
        return Optional.empty();
    }
}
