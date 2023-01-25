package Algorithm.sort;

import java.io.*;
import java.util.*;

public class B11660 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stk = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(stk.nextToken());
        int inputCnt = Integer.parseInt(stk.nextToken());
        int[][] arr = new int[1025][1025];
        int[][] sumArr = new int[1025][1025];
        for(int i = 1; i <= size; i ++){
            StringTokenizer stk2 = new StringTokenizer(br.readLine());
            for(int j = 1 ; j <= size ; j ++){
              arr[i][j] = Integer.parseInt(stk2.nextToken());
            }
        }

        for(int i = 1 ; i <= size ; i ++ ){
            for(int j = 1 ; j <= size ; j ++){
                    sumArr[i][j] = sumArr[i][j-1] + sumArr[i-1][j] - sumArr[i-1][j-1] + arr[i][j];
            }
        }

        for(int i = 1 ; i <= inputCnt ; i ++){
            StringTokenizer stk3 = new StringTokenizer(br.readLine());

            int sum = 0;
            int x1 = Integer.parseInt(stk3.nextToken());
            int y1 = Integer.parseInt(stk3.nextToken());
            int x2 = Integer.parseInt(stk3.nextToken());
            int y2 = Integer.parseInt(stk3.nextToken());

            sum += sumArr[x2][y2] - sumArr[x2][y1-1] - sumArr[x1-1][y2] + sumArr[x1-1][y1-1];
            bw.write(sum + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }


}
