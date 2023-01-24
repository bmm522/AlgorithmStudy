package baekjoon.sort;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B10986 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stk = new StringTokenizer(br.readLine());

       int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());

        long[] arr = new long[n+1];
        long[] cntArr = new long[m];
        long sum = 0;
        long cnt;

        StringTokenizer stk2 = new StringTokenizer(br.readLine());
        for(int i = 1 ; i <= n ; i ++){
            sum += Integer.parseInt(stk2.nextToken());
            arr[i] = sum;
        }

        for(int i = 1 ; i <= n ; i ++){
            cntArr[(int) (arr[i]%m)] ++;
        }

        cnt = (int)cntArr[0];

        for(int i = 0 ; i < m ; i++){
            cnt += (long)(cntArr[i] * (cntArr[i] -1 )) / 2;
        }
        br.close();
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}
