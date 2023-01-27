package Algorithm.stack;

import java.io.*;
import java.util.Stack;

public class BJ_S3_1874_스택수열 {

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        boolean result = true;
        int[] arr = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < n ; i ++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int num = 1;

        for(int i = 0 ; i < n ; i ++){

            for(; num <= arr[i] ; num ++){
                stack.push(num);
               sb.append("+\n");
            }

            if(stack.peek() == arr[i]){
                stack.pop();
                sb.append("-\n");
            } else {
                result = false;
                System.out.println("NO");
                return;
            }
        }

        if(result){
            System.out.println(sb);
        } else {
            System.out.println("NO");
        }

        br.close();

    }
}
