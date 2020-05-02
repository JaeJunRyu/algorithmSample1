package algorithmSample1.sort;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;
import static org.junit.Assert.assertArrayEquals;

public class SortSample1 {

    //입력 값
    final int[] numbers = {-3, -5, 1, 7, 4, -2};

    //검증 값
    final int[] expected = {-5, -3, -2, 1, 4, 7};
    final int[] expected1 = {7, 4, 1, -2, -3, -5};
    final List<Integer> expected2 = Arrays.asList(7, 4, 1, -2, -3, -5);

    @Test
    public void 기본_정렬1() {
        Arrays.sort(numbers);

//        for (int item : numbers ) {
//            System.out.println(item);
//        }
        System.out.println(Arrays.toString(numbers));
        //{-5, -3, -2, 1, 4, 7}
        assertArrayEquals(expected, numbers);
    }

    @Test
    public void 기본_정렬2() {
        int[] numbers1 = IntStream.of(numbers).sorted().toArray();

        System.out.println(Arrays.toString(numbers1));
        //{-5, -3, -2, 1, 4, 7}
        assertArrayEquals(expected, numbers1);
    }

    @Test
    public void 정렬순서_역순으로_정렬1() {
        int[] numbers2 = IntStream.of(numbers).map(i -> -i).sorted().map(i -> -i).toArray();

        System.out.println(Arrays.toString(numbers2));

//        {7, 4, 1, -2, -3, -5}
        assertArrayEquals(expected1, numbers2);
    }

    @Test
    public void 정렬순서_역순으로_정렬2() {
        int[] numbers2 = IntStream.of(numbers)
        .boxed()
        .sorted(Collections.reverseOrder())
        .mapToInt(v -> v.intValue()).toArray();

        System.out.println(Arrays.toString(numbers2));

//        {7, 4, 1, -2, -3, -5}
        assertArrayEquals(expected1, numbers2);
    }

    @Test
    public void 정렬순서_역순으로_정렬3() {
        List<Integer> collect = Arrays.stream(numbers).boxed().collect(toList());

        Collections.sort(collect, Collections.reverseOrder());

        System.out.println(Arrays.toString(collect.toArray()));

//        {7, 4, 1, -2, -3, -5}
        assertArrayEquals(expected2.toArray(), collect.toArray());
    }





}
