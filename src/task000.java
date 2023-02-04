import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class task000 {
    public static void main(String[] args){
        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1,2,3,4,5,6));
//        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1,2,3,3,2,1));
        boolean palindrome = checkOn(deque);
        if (palindrome) {System.out.println("Последовательность чисел является палиндромом.");
        } else {System.out.println("Последовательность чисел не является палиндромом.");
        }
    }

    public static boolean checkOn(Deque<Integer> deque){
        while (deque.size() > 1){
            if (deque.pollFirst().equals(deque.pollLast())){
                return true;
            }
        }
        return false;
    }
}
