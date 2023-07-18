package level_1;
// https://school.programmers.co.kr/learn/courses/30/lessons/140108

class Solution140108 {
    public int solution(String s) {
    	int answer = 0;
    	char x = s.charAt(0);  // 첫 글자를 x로 정의
    	int count_x = 0; // x가 나온 횟수
    	int count_other = 0;  // x가 아닌 다른 글자들이 나온 횟수
    	
    	for(int i = 0; i < s.length(); i++) {
    		if (count_x == count_other) {  
    			answer++;
    			x = s.charAt(i);
    		}
    		if(x == s.charAt(i)) {
    			count_x++;
    		}
    		else {
    			count_other++;
    		}
    	}
    	return answer;
    }
}
public class P140108 {
	
}

