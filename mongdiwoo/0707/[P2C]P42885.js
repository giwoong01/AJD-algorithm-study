function solution(people, limit) {
    var answer = 0;

    // 몸무게가 제일 적은 사람과 제일 많은 사람 비교를 위해 오름차순 정렬
    people.sort((a, b) => a - b);

    while (people.length > 0) {
        // 맨 앞 사람과 맨 뒷사람이 limit 기준을 충족하여 둘 다 탈출할 때
        if (people[0] + people[people.length - 1] <= limit) {
            people.pop();
            people.shift();

            answer++;
        }
        // 한 명만 남았을 때 바로 탈출
        else if (people.length == 1) {
            people.pop();

            answer++;
        }
        // limit을 넘으면 맨 뒷사람만 탈출
        else {
            people.pop();

            answer++;
        }
    }

    console.log(people);

    return answer;
}

console.log(solution([70, 80, 50], 100));

// P42885: 구명보트
// 몸무게 배열 => people
// 무게 제한 => limit
