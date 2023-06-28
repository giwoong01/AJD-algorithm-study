class Solution {
	public int solution(int n, int a, int b) {
		int answer = 0;
		while (true) {
			a = a / 2 + a % 2; // ex) 1,2 -> 1 3,4 -> 2 ...
			b = b / 2 + b % 2;
			answer++;
			if (a == b)
				break;
		}

		return answer;
	}
}

public class P12985 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
