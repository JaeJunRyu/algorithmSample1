package algorithmSample1.sort;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class SortSample2 {
    final String[] strings = {"z","x","y","abc","zzz","zazzy"};

    final String[] expected = {"abc","x","y","z","zazzy","zzz"};
    final List<String> expected2 = Arrays.asList("abc","x","y","z","zazzy","zzz");

    final List<String> expected3 = Arrays.asList("zzz", "zazzy", "z", "y", "x", "abc");


    @Test
    public void String순서대로_정렬1(){
        Arrays.sort(strings);

        System.out.println(Arrays.toString(strings));
//[abc, x, y, z, zazzy, zzz]
        assertArrayEquals(expected, strings);
    }

    @Test
    public void String순서대로_정렬2(){
        String[] strings2 = Stream.of(this.strings).sorted().toArray(String[]::new);

        System.out.println(Arrays.toString(strings2));
//[abc, x, y, z, zazzy, zzz]
        assertArrayEquals(expected, strings2);
    }

    @Test
    public void String순서대로_정렬3(){
        List<String> collect = Stream.of(this.strings).sorted().collect(Collectors.toList());

        System.out.println(Arrays.toString(collect.toArray()));
//[abc, x, y, z, zazzy, zzz]
        assertArrayEquals(expected2.toArray(), collect.toArray());
    }

    @Test
    public void String반대로_정렬1(){
        List<String> collect = Stream.of(this.strings).sorted(Collections.reverseOrder()).collect(Collectors.toList());

        System.out.println(Arrays.toString(collect.toArray()));
//[zzz, zazzy, z, y, x, abc]
        assertArrayEquals(expected3.toArray(), collect.toArray());
    }

    @Test
    public void String반대로_정렬2(){
        String[] strings2 = Stream.of(this.strings).sorted(Collections.reverseOrder()).toArray(String[]::new);

        System.out.println(Arrays.toString(strings2));
//[zzz, zazzy, z, y, x, abc]
        assertArrayEquals(expected3.toArray(), strings2);
    }

    @Test
    public void String반대로_정렬3(){
        Arrays.sort(strings,Collections.reverseOrder());

        System.out.println(Arrays.toString(strings));
//[zzz, zazzy, z, y, x, abc]
        assertArrayEquals(expected3.toArray(), strings);
    }

    @Test
    public void String_List_정렬(){
        List<String> list = Arrays.asList("1", "2", "3", "A", "B", "C", "a", "b", "c");

        List<String> sortedList = list.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        //[1, 2, 3, A, B, C, a, b, c]
        System.out.println(Arrays.toString(sortedList.toArray()));

        List<String> sortedList1 = list.stream()
                .sorted((o1,o2)-> o1.compareTo(o2))
                .collect(Collectors.toList());

        //[1, 2, 3, A, B, C, a, b, c]
        System.out.println(Arrays.toString(sortedList1.toArray()));

        List<String> sortedList3 = list.stream().sorted().collect(Collectors.toList());

        //[1, 2, 3, A, B, C, a, b, c]
        System.out.println(Arrays.toString(sortedList3.toArray()));
    }

    @Test
    public void String_List_역순_정렬(){
        List<String> list = Arrays.asList("1", "2", "3", "A", "B", "C", "a", "b", "c");

        List<String> sortedList = list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        //[c, b, a, C, B, A, 3, 2, 1]
        System.out.println(Arrays.toString(sortedList.toArray()));

        List<String> sortedList1 = list.stream()
                .sorted((o1,o2)-> o2.compareTo(o1))
                .collect(Collectors.toList());

        //[c, b, a, C, B, A, 3, 2, 1]
        System.out.println(Arrays.toString(sortedList1.toArray()));
    }



}

