package Algorithm.implement;

import java.io.*;
import java.util.StringTokenizer;

public class BJ_S5_2563_색종이 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] m = new int[100][100];
        int n = Integer.parseInt(br.readLine());
        int cnt = 0 ;
        for(int i = 0 ; i < n ; i ++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(stk.nextToken());
            int y = Integer.parseInt(stk.nextToken());

               for(int x1 = x ; x1< x+10 ; x1 ++){
                   for(int y1 = y ; y1 < y+10 ; y1++){
                       m[x1][y1] = 1;
                   }
               }

        }

        for(int i = 0 ; i < 100 ; i ++){
            for(int j = 0 ; j < 100 ; j ++){
                if(m[i][j] == 1){
                    cnt++;
                }
            }
        }



        br.close();
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}
