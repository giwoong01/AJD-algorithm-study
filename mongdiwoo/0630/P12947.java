package programmers;

import java.util.stream.Stream;

public class P12947 {
    public static void main(String[] args) {
        boolean answer = true;
        int x = 10;

        int sum = 0;

        int[] digits = Stream.of(String.valueOf(x).split("")).mapToInt(Integer::parseInt).toArray();
        for(int i=0; i<digits.length; i++) sum += digits[i];

        if(x%sum != 0) answer = false;

        System.out.println(answer);

    }
}

// P12947 : 하샤드 수
// num을 자릿수마다 더하고 그 합계로 num을 나눴을 때 나눠 떨어지면 하샤드 수
