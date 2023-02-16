import java.util.ArrayList;
import java.util.List;

public class ProgrammersSkillCheck1 {

    public static void main(String[] args) {
        Solution testObj = new Solution();

        System.out.println("testObj = " + testObj.solution("125623232132131321312132213213351436665765426143121332123", "13321322142321332153253214333331122"));
    }
}

class Solution{
    public String solution(String x, String y){
        String answer = "";

        List<Character> num = new ArrayList<>();

        String a ="";
        String b ="";

        if(x.length()>y.length()){
            a = x;
            b = y;
        } else {
            a = y;
            b = x;
        }

        for(int i=0; i<b.length(); i++){
             if(a.charAt(i)==b.charAt(i)){
                num.add(a.charAt(i));
             }
        }

        List<String> allStr = new ArrayList<>();

        for(int i=0; i<num.size(); i++){
            String str = "";

            for(int j=0; j<num.size(); j++){
                str += num.get(j);
            }

            allStr.add(str);
            num.add(num.get(0));
            num.remove(0);
        }

        long col = Long.parseLong(allStr.get(0));
        for(int i=1; i<num.size(); i++){
            long col2 = Long.parseLong(allStr.get(i));
            if(col<col2){
                col = col2;
            }
        }
        answer = String.valueOf(col);

        return answer;
    }
}
