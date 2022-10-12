package kyu7;
// Return the List with the Strings filtered out

import java.util.List;
import java.util.stream.Collectors;

public class ListFiltering {
    public static void main(String[] args) {
        System.out.println(filterList(List.of(1, 2, "a", "b", 8, "test")));
    }

    public static List<Object> filterList(final List<Object> list) {
        return (List) list.stream().filter(e -> !(e instanceof String)).collect(Collectors.toList());
    }
}
