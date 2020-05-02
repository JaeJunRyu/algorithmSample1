package algorithmSample1.sort;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

import static org.junit.Assert.assertArrayEquals;

public class SortSample1 {

    final int[] numbers = {-3, -5, 1, 7, 4, -2};
    final int[] expected = {-5, -3, -2, 1, 4, 7};
    final int[] expected1 = {7, 4, 1, -2, -3, -5};

    @Test
    public void 기본_정렬1() {
        Arrays.sort(numbers);
        for (int item : numbers ) {
            System.out.println(item);
        }
        //{-5, -3, -2, 1, 4, 7}
        assertArrayEquals(expected, numbers);
    }

    @Test
    public void 기본_정렬2() {
        int[] numbers1 = IntStream.of(numbers).sorted().toArray();

        for (int item : numbers1) {
            System.out.println(item);
        }
        //{-5, -3, -2, 1, 4, 7}
        assertArrayEquals(expected, numbers1);
    }

    @Test
    public void 정렬순서_역순으로_정렬1() {
        int[] numbers2 = IntStream.of(numbers).map(i -> -i).sorted().map(i -> -i).toArray();

        for (int item : numbers2) {
            System.out.println(item);
        }
//        {7, 4, 1, -2, -3, -5}
        assertArrayEquals(expected1, numbers2);
    }

    @Test
    public void 정렬순서_역순으로_정렬2() {
        int[] numbers2 = IntStream.of(numbers)
        .boxed()
        .sorted(Collections.reverseOrder())
        .mapToInt(v -> v.intValue()).toArray();

        for (int item : numbers2) {
            System.out.println(item);
        }
//        {7, 4, 1, -2, -3, -5}
        assertArrayEquals(expected1, numbers2);
    }






}
