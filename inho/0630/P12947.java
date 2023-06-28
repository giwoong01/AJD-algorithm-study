//하샤드 수
class Solution {
	public boolean solution(int x) {
		String[] s = Integer.toString(x).split(""); // 숫자를 문자열 배열에 하나씩 잘라서 저장
		int sum = 0;
		for (int i = 0; i < s.length; i++) { //
			sum += Integer.parseInt(s[i]); // 저장된 문자열 배열 값들을 더함
		}
		if (x % sum == 0)
			return true; // 숫자가 각 자리 숫자의 합으로 나누어지면 true
		else
			return false;
	}
}

public class P12947 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
