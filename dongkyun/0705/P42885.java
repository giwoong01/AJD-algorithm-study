package level_2;

import java.util.Arrays;

public class P42885 {
	    public static int solution(int[] people, int limit) {
	        int answer = 0;
	        Arrays.sort(people);
	        
	        int min = 0;
	        int max = people.length -1;
	        
	        while(max >= min) {
	        	if(people[max] + people[min] <= limit) {
	        		answer ++;
	        		max--;
	        		min++;
	        	}
	        	else {
	        		answer++;
	        		max--;
	        	}
	        }
	        return answer;  
	}
	public static void main(String[] args) {
		int arr[] = {70, 50, 80, 50};
		System.out.println((solution(arr, 100)));

	}

}