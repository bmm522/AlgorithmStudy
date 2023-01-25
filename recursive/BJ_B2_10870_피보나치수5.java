package Algorithm.recursive;

import java.io.*;

public class BJ_B2_10870_피보나치수5 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[21];
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2; i < 21 ; i ++){
            arr[i] = arr[i-1] + arr[i-2];
        }

        bw.write(String.valueOf(arr[Integer.parseInt(br.readLine())]));
        br.close();
        bw.flush();
        bw.close();
    }
}
