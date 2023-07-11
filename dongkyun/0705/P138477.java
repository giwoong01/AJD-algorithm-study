package level_1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class P138477 {
	public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];      
        ArrayList<Integer> a = new ArrayList<Integer>();  // 명예의 전당
        
        for(int i = 0; i < score.length; i++) {
        	if(a.size() < k)
        		a.add(score[i]);
        	else {
        		if(a.get(0) < score[i])
        			a.set(0, score[i]);
        	}
        	Collections.sort(a);
        	answer[i] = a.get(0);
        	}
        
        return answer;
    }
	public static void main(String[] args) {
		int list[] = {10, 100, 20, 150, 1, 100, 200};
		System.out.println(Arrays.toString(solution(3,list)));
	}
}
