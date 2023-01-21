package baekjoon.sort;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B11659 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

        StringTokenizer stk = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(stk.nextToken());
        int inputCnt = Integer.parseInt(stk.nextToken());

        StringTokenizer stk2 = new StringTokenizer(br.readLine());


        int[] arr = new int[size];
        int[] sumArr = new int[size];
        for(int i = 0 ; i < size ; i ++){
            arr[i] = Integer.parseInt(stk2.nextToken());
        }

        for(int i = 0 ; i < size ; i ++){
            if(i == 0){
                sumArr[i] = arr[i];
            } else {
                sumArr[i] = sumArr[i-1] + arr[i];
            }
        }


        for(int i = 0 ; i < inputCnt ; i++){
            StringTokenizer stk3 = new StringTokenizer(br.readLine());
            int result = 0;

            int z = Integer.parseInt(stk3.nextToken());
            int y = Integer.parseInt(stk3.nextToken());

            if(z == 1){
                result = sumArr[y-1];
                bw.write( result + "\n");
            } else {
                result = sumArr[y-1] - sumArr[z - 2];
                bw.write(result + "\n");
            }

        }
        br.close();
        bw.flush();
        bw.close();


    }
}
