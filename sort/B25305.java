package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B25305 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cut = 0;

        String str = br.readLine();

        StringTokenizer stk = new StringTokenizer(str);


        int[] arr = new int[Integer.parseInt(stk.nextToken())];

        String str2 = br.readLine();

        StringTokenizer stk2 = new StringTokenizer(str2);
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = Integer.parseInt(stk2.nextToken());
        }

        cut = Integer.parseInt(stk.nextToken());

        for(int i = 0 ; i < arr.length - 1 ; i ++){
            for(int j = i + 1 ; j < arr.length ; j++){
                if(arr[i]<arr[j]){
                    int temp =0;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(arr[cut-1]);



    }
}
