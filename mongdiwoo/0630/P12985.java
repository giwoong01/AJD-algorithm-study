package programmers;

public class P12985 {
    public static void main(String[] args) {
        int n = 16;
        int a = 4;
        int b = 5;

        int answer = 0;
        while(b-a>=1 || a-b>=1){
            a = (int) Math.ceil((double) a/2);
            b = (int) Math.ceil((double) b/2);
            answer ++;
        }

        System.out.println(answer);
    }
}

// P12985: 예상 대진표