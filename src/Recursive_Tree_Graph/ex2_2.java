package Recursive_Tree_Graph;

import java.util.Scanner;

public class ex2_2 {
    public static void DFS(int n){
        if(n==0) return;
        else{
            DFS(n/2);
            System.out.println(n + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DFS(n);
    }
}
