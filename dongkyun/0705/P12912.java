package level_1;
class Solution12912_1 {  // 방법 1
	public long solution(int a, int b) {
		long answer = 0;
		if(a < b) {
			for(int i = a; i <= b; i++) {
				answer += i;
			}
		}
		else {
			for(int i = b; i <=a; i++)
				answer += i;
		}	
		return answer;
	}
}
class Solution12912_2 {  // 방법 2, 시간 비슷
	public long solution(int a, int b) {
		long answer = 0;
		for(int i = Math.min(a, b); i <= Math.max(a, b); i++) {
			answer += i;
		}
		return answer;
	}
}
class Solution12912_3 {  // 다른 사람 풀이, 시간 제일 빠름

    public long solution(int a, int b) {
        return sumAtoB(Math.min(a, b), Math.max(b, a));
    }

    private long sumAtoB(long a, long b) {  // 등차수열 합 공식
        return (b - a + 1) * (a + b) / 2;
    }
}
public class P12912 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
