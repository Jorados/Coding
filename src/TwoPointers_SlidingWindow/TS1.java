package TwoPointers_SlidingWindow;

import java.util.Arrays;
import java.util.Scanner;

public class TS1 {
    public static int[] solution(int n, int n2, int[] arr, int arr2[]){
        int[] answer = new int[arr.length + arr2.length];
        int index = 0;
        for(int x : arr){
            answer[index ++] = x;
        }
        for(int x : arr2){
            answer[index ++] = x;
        }
        Arrays.sort(answer);
        return answer;
    }

    //ex) 동적 배열을 정렬하는 법
    //List<Integer> numbers = Arrays.asList(5, 3, 1, 2, 4);
    //Collections.sort(numbers);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for(int i=0; i<n2; i++){
            arr2[i] = sc.nextInt();
        }

        for(int x:solution(n,n2,arr,arr2)){
            System.out.print(x + " ");
        }
    }
}
