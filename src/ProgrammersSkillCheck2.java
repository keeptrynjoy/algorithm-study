import java.util.ArrayList;
import java.util.List;

class Solution2{

    public int solution(int n){
        int answer = 0;

        List<Integer> arrNum = new ArrayList<>();

        while ( n > 0){
            arrNum.add(n%10);
            n /=10;
        }

        for(Integer i : arrNum){
            answer += i.intValue();
        }

        return  answer;
    }
}


public class ProgrammersSkillCheck2 {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();

        System.out.println("solution2 = " +solution2.solution(123123312));

    }
}
