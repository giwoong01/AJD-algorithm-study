class Solution {
	public int solution(String s) {
		int answer = 1; // 분리한 문자열의 개수
		int num = 1; // num을 가지고 횟수가 같아지는 경우를 찾음
		char c = s.charAt(0); // 첫 글자
		for (int i = 1; i < s.length(); i++) { // 단어 길이만큼 반복
			if (num == 0) { // 횟수가 같아질 때
				answer++;
				c = s.charAt(i); // c를 새롭게 정의
			}

			if (c == s.charAt(i)) { // i번째 글자가 c와 같다면
				num++;
			} else
				num--;
		}
		return answer;
	}
}

public class P140108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
