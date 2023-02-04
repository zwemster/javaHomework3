# Знакомство с языком Java

## Домашнее задание 3.

### Решение двух задач.

1. Задача 1. Дан Deque состоящий из последовательности цифр. Необходимо проверить, что последовательность цифр является палиндромом.
```
public static void main(String[] args) {
    Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1,2,3,4,5,6));

}


public boolean checkOn(Deque<Integer> deque){

    return false;
}
}
```

2. Задача 2. Даны два Deque представляющие два неотрицательных целых числа. Цифры хранятся в обратном порядке, и каждый из их узлов содержит одну цифру. 
Сложите два числа и верните сумму в виде связанного списка.
```
public static void main(String[] args) {
    Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1,2,3));
    Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5,4,7));
    // result [6,6,0,1]

}


public Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {

    return new ArrayDeque<>();
}
}
```
