import java.util.Arrays;
import java.util.Collections;

class Solution {
	public int[] solution(int k, int[] score) {
		int[] answer = new int[score.length]; // return 값

		for (int i = 0; i < score.length; i++) { // socre의 길이만큼 반복
			Integer[] array = new Integer[i + 1]; // 옮길 배열 생성. Collections 메소드를 위해 Integer로 생성.
			for (int j = 0; j <= i; j++) { // 현재 i의 크기만큼 반복
				array[j] = score[j]; // array배열에 옮기기
			}
			Arrays.sort(array, Collections.reverseOrder()); // 내림차순
			if (i < k) {
				answer[i] = array[array.length - 1]; // 마지막 값
			} else {
				answer[i] = array[k - 1]; // k번째 값
			}
		}

		return answer;
	}
}

public class P138477 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
