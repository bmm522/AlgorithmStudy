package Algorithm.sort;

import java.io.*;
import java.util.StringTokenizer;

public class BJ_B3_2566_최댓값 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int result = 0;
        int x = 0;
        int y = 0;
        for(int i = 0 ; i < 9 ; i ++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < 9 ; j++){
                int checkNum = Integer.parseInt(stk.nextToken());
                if(result<checkNum){
                    result = checkNum;
                    x = i+1;
                    y = j+1;
                }

            }
        }

        if(x ==0&& y ==0){
            x=1;
            y=1;
        }

        br.close();
        bw.write(String.valueOf(result) + "\n");
        bw.write(String.valueOf(x) + " " + String.valueOf(y));
        bw.flush();
        bw.close();

    }
}
