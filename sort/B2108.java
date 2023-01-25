package Algorithm.sort;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class B2108 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[Integer.parseInt(br.readLine())];

        for(int i = 0; i < arr.length ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }



        int sum = 0;
        int firstResult = 0;
        for(int i = 0; i < arr.length ; i++){
            sum += arr[i];
        }

            if(sum % arr.length < 5){
                firstResult = sum/ arr.length;
            } else {
                firstResult  = sum/ arr.length + 1;
            }

        bw.write(firstResult + "\n");

        Arrays.sort(arr);
        bw.write(arr[arr.length/2] + "\n");

        int[] cntArr = new int[8001];
        List checkArr = new ArrayList<>();
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] >= 0){
                cntArr[4000+arr[i]]++;
            } else {

                cntArr[arr[i]*-1]++;
            }
        }
        int maxIndex = 0;
        int cnt = 0;
        for(int i = 0; i < cntArr.length ; i ++){
            if(i == 0){
                maxIndex = i;
            } else {
                if(cntArr[i] > maxIndex){
                    maxIndex = cntArr[i];
                    cnt++;
                    checkArr.add(maxIndex);
                }
            }
        }

        if(cnt > 1){
            bw.write(String.valueOf(checkArr.get(1)));
        } else {
            bw.write(String.valueOf(checkArr.get(0)));
        }


        bw.flush();
        bw.close();


    }
}
