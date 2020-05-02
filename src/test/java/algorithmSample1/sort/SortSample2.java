package algorithmSample1.sort;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class SortSample2 {
    final String[] strings = {"z","x","y","abc","zzz","zazzy"};
    final String[] expected = {"abc","x","y","z","zazzy","zzz"};
    final List<String> expected2 = Arrays.asList("abc","x","y","z","zazzy","zzz");

    @Test
    public void String순서대로_정렬1(){
        Arrays.sort(strings);

        System.out.println(Arrays.toString(strings));

        assertArrayEquals(expected, strings);
    }

    @Test
    public void String순서대로_정렬2(){
        String[] strings2 = Stream.of(this.strings).sorted().toArray(String[]::new);

        System.out.println(Arrays.toString(strings2));

        assertArrayEquals(expected, strings2);
    }

    @Test
    public void String순서대로_정렬3(){
        List<String> collect = Stream.of(this.strings).sorted().collect(Collectors.toList());

        System.out.println(Arrays.toString(collect.toArray()));

        assertArrayEquals(expected2.toArray(), collect.toArray());
    }




}
