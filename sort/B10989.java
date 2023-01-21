package baekjoon.sort;

import java.io.*;
public class B10989 {

//    N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(br.readLine());

        int[] arr = new int[10000001];
        int[] cntArr = new int[10000001];

        for(int i = 0 ; i < size ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        br.close();
        for(int i = 0 ; i < size ; i++){
            cntArr[arr[i]]++;
        }


        for(int i = 0 ; i <10000001 ; i++){
            if(cntArr[i] != 0){
                int j = 0;
                while (j<cntArr[i]){
                    bw.write(i + "\n");
                    j++;
                }
            }
        }

        bw.flush();
        bw.close();
    }
}
