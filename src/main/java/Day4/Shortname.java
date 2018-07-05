package Day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Shortname {

    public String genStream(String str){
        return Stream.of(str.toUpperCase().split("\\s"))
                .filter(string -> !"of".equalsIgnoreCase(string))
                .map(string -> String.valueOf(string.charAt(0)))
                .collect(Collectors.joining(""));
    }

    public String gen(String str){
        List<String> afterFilter = filterName(str);
        String result = "";
        for(String string: afterFilter){
            result += string.charAt(0);
        }
        return result.toUpperCase();
    }

    public List<String> filterName(String str){
        return Arrays.stream(splitName(str)).filter(string -> !"of".equalsIgnoreCase(string)).collect((Collectors.toList()));
    }

    public String[] splitName(String str){
        return str.split("\\s");
    }

}
