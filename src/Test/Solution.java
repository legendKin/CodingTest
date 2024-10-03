package Test;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    // x부터 시작해 x씩 증가하는 숫자를 n개 생성해 반환
    public static List<Long> solution(int x, int n) {
        List<Long> result = new ArrayList<>();

        // 1부터 n까지 x의 배수를 리스트에 추가
        for (int i = 1; i <= n; i++) {
            result.add((long) x * i);
        }

        return result;
    }
    // 출력
    public static void main(String[] args) {
        System.out.println(solution(2, 5));  // [2, 4, 6, 8, 10]
        System.out.println(solution(4, 3));  // [4, 8, 12]
        System.out.println(solution(-4, 2)); // [-4, -8]
    }
}

