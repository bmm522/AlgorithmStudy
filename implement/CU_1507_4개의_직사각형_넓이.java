package Algorithm.implement;

import java.io.*;
import java.util.StringTokenizer;

public class CU_1507_4개의_직사각형_넓이 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] arr = new int[100][100];

        int cnt = 0;
        for(int i = 0 ; i < 4 ; i ++){
            StringTokenizer stk = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(stk.nextToken());
            int y1 = Integer.parseInt(stk.nextToken());
            int x2 = Integer.parseInt(stk.nextToken());
            int y2 = Integer.parseInt(stk.nextToken());


            for(int x = x1 ; x < x2 ; x++){
                for(int y = y1 ; y < y2 ; y++){
                    arr[x][y] = 1;
                }
            }
        }

        for(int i = 0 ; i < 100 ; i ++){
            for(int j = 0 ; j < 100 ; j ++){
                if(arr[i][j] == 1){
                    cnt ++;
                }
            }
        }
        br.close();
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}
