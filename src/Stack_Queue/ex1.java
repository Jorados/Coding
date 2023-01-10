package Stack_Queue;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class ex1 {
    public static String solution(String s){
        String answer = "NO";
        int cnt =0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(') cnt++;
            else cnt--;
        }
        if(s.charAt(0) == ')' || s.charAt(s.length()-1) == '(') answer="NO";
        else if(cnt == 0) answer="YES";

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print(solution(s));
    }
}
