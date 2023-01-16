package Recursive_Tree_Graph;

import java.util.Scanner;

//재귀를 이용한 이진수 출력
public class ex2 {
    public static void solution(String n){
        int two = Integer.parseInt(n, 2);
        System.out.println(two);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        solution(n);
    }

}
