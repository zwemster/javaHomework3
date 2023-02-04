import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class task001 {
    public static void main(String[] args){
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1,2,3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5,4,7));

        Deque<Integer> result = sum(d2, d1);
        System.out.println(result);
    }

    public static Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
        Deque<Integer> result = new ArrayDeque<>();
        int temp = 0;

        while (!d1.isEmpty() || !d2.isEmpty() || temp > 0) {
            int number1 = 0;
            if (!d1.isEmpty()) {
                number1 = d1.removeFirst();
            }
            int number2 = 0;
            if (!d2.isEmpty()) {
                number2 = d2.removeFirst();
            }
            int summary = number1 + number2 + temp;
            result.addLast(summary % 10);
            temp = summary / 10;
        }

        return result;
    }
}