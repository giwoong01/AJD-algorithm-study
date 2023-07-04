import java.util.Arrays;

class Solution {
	public int solution(int[] people, int limit) {
		int answer = 0;
		// 최대 2명만 탈 수 있다. ok
		Arrays.sort(people);
		int people_number = people.length;
		int num = 0; // - 인덱스 안 되려고 만든 변수.
		int j = -1; // 같이 보내려면 횟수를 줄여야 하는데 i값을 움직이면 for문 안에서 i를 쓸 수가 없어서 하나 만듬.
		for (int i = 0; i < people.length; i++) { // 사람 수만큼
			j++;
			if (people[j + num] + people[people_number - 1] > limit) { // 최소값+최대값이 limit보다 크면 최대값 혼자 보냄.
				num--; // 최소값은 그대로 두고 다시 비교.
				people_number--; // 최대값 보내기.
				answer++; // 쓴 구명보트 추가.
			} else {// 최소값+최대값이 limit보다 작으면 같이 보냄.
				i++; // for문 횟수 줄이기
				people_number--; // 최대값이랑 최소값 같이 보내기.
				answer++; // 쓴 구명보트 추가.
			}

		}
		return answer;
	}
}
// 50 50 70 80

public class P42885 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
