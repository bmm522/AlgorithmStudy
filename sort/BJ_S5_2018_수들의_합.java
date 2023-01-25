package Algorithm.sort;

import java.io.*;

public class BJ_S5_2018_수들의_합 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int cnt = 0;

        for(int i = 0 ; i <= n ; i ++){
            int sum = 0;
            for(int j = i+1 ; j <= n ; j ++){
                sum = sum + j;
                if(sum == n){
                    cnt ++;
                    break;
                }
                if(sum > n){
                    break;
                }

            }
        }


        br.close();
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();


    }
}
