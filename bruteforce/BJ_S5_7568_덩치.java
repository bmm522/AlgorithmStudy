package Algorithm.bruteforce;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_S5_7568_덩치 {

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for(int i = 0 ; i < n ; i ++){

            StringTokenizer stk = new StringTokenizer(br.readLine());

            int w = Integer.parseInt(stk.nextToken());
            int h = Integer.parseInt(stk.nextToken());
            arr[i][0] = w;
            arr[i][1] = h;
        }




        for(int i = 0; i < n ; i++){
            int rank = 1;

            for(int j = 0 ; j < n ; j ++){
                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]){
                    rank ++;
                }
            }

            bw.write(String.valueOf(rank) + " ");
        }





        bw.flush();
        br.close();
        bw.close();



    }
}
