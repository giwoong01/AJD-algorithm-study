package programmers;

public class P140108 {
    public static void main(String[] args) {
        String s = "aaabbaccccabba";

        int answer = 0;

        char same = s.charAt(0);
        int sameCount = 0;
        int otherCount = 0;


        for(int i=0; i<s.length(); i++){
            if(sameCount == 0){
                same = s.charAt(i);
                answer++;
            }

            if(same == s.charAt(i)){
                sameCount++;
            }
            else{
                otherCount++;
                if(sameCount == otherCount){
                    sameCount = 0;
                    otherCount = 0;
                }
            }
        }

        System.out.println(answer);

    }
}

// P140108 : 문자열 자르기