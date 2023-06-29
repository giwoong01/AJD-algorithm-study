package programmers;

public class P140108 {
    public static void main(String[] args) {
        String s = "aaabbaccccabba";

        char same = s.charAt(0);
        int sameCount = 0;
        int otherCount = 0;
        int splitCount = 0;


        for(int i=0; i<s.length(); i++){
            if(sameCount == 0){
                same = s.charAt(i);
                splitCount++;
            }

            System.out.println("이거랑 같아야해: " + same);
            System.out.println("이번에 검사할 문자는: " +  s.charAt(i));


            if(same == s.charAt(i)){
                System.out.println("same");
                sameCount++;
            } else{
                System.out.println("other");
                otherCount++;
                if(sameCount == otherCount){
                    sameCount = 0;
                    otherCount = 0;
                }
            }
            System.out.println("--------------------");
        }

        System.out.println("최종 나눠진 단위는: " + splitCount);

    }
}

// P140108 : 문자열 자르기



/*  <제출 답안>
class Solution {
    public int solution(String s) {
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

        return answer;
    }
}
* */