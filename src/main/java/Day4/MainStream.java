package Day4;

import sun.applet.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainStream {
    public static void main(String[] args){
        MainStream p = new MainStream();
        p.start();
    }

    private void start(){
        // Stream can be used only one time.
        // If you need to use stream more one time, you need to declare stream again.
        // Stream is suitable for process data.

        String[] datas = new String[]{"one","two","three"};
        Stream<String> stream = Arrays.stream(datas);
        //stream.forEach(System.out::print);

        List<String> lists = new ArrayList<>();
        lists.add("one");
        lists.add("two");
        lists.add("three");
        Stream<String> stream2 = lists.stream();
        //stream2.forEach(System.out::print);

        //lists.stream().forEach(System.out::print);

        // Normal Java for Filter data which start with "t"
        List<String> after = new ArrayList<>();
        for(String string: lists){
            if(string.startsWith("t")) after.add(string);
        }
        //after.forEach(System.out::print);

        // Stream
        List<String> result =
                lists.stream()
                .filter(string -> string.startsWith("t")) // Filter data which start with "t"
                .map(string -> string.toLowerCase()) // Change string to lowercase
                .collect((Collectors.toList())); // Collect string into List
                //.forEach(System.out::print); // Print string in list by using foreach
        result.forEach(System.out::print);
    }
}
