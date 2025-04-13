package example1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Example7 {

//    public Map<String, Integer> getConstantValues() {
//        return constantValues;
//    }
//
//    public void setConstantValues(Map<String, Integer> constantValues) {
//        this.constantValues = constantValues;
//    }

    public Map<String, Integer> constantValues;

    public static void main(String[] args) {

        List<String> list = List.of("AAA","B","CCCC","DDD","FFFFFF","DDD","AAA");

        List<Integer> result = list.stream()
                .collect(Collectors.mapping(
                        s -> s.length(), //string to int
                        Collectors.toList() // downstreaming
                ));
        System.out.println(result);

//        Example7 obj = new Example7();
//        HashMap<String, Integer> valuesToAdd = new HashMap<>();
//        valuesToAdd.put("A",0);
//        valuesToAdd.put("Z",10);
//        valuesToAdd.put("B",1);
//        valuesToAdd.put("E",3);
//        obj.setConstantValues(valuesToAdd);
//        System.out.println(obj.getConstantValues());



    }
}
