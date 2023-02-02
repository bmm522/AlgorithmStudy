package Algorithm.geometry;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_B3_4153_직각삼각형 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true){
            int[] arr = new int[3];
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(stk.nextToken());
            int y = Integer.parseInt(stk.nextToken());
            int z = Integer.parseInt(stk.nextToken());
            if(x == 0){
                if(y == 0){
                    if(z== 0){
                        break;
                    }
                }
            }
            arr[0] = x;
            arr[1] = y;
            arr[2] = z;

            Arrays.sort(arr);
            if((arr[0]*arr[0]) + (arr[1]*arr[1]) == arr[2]*arr[2]){
                bw.write("right\n");
            } else {
                bw.write("wrong\n");
            }




        }

        bw.flush();
        bw.close();
        br.close();
    }
}
