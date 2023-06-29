package level_2;


public class P12985 {
	public static int solution(int n, int a, int b)
    { 
		int answer = 0;
		while(true) {
			if((a+1) / 2 == (b+1) / 2) {  
				answer++;
				break;
			}
			else {
				a = (a+1) / 2;
				b = (b+1) / 2;
				answer++;
			}
		}
        return answer;
}
	public static void main(String [] args) {
		System.out.println(solution(8, 4, 7));
	}
}
