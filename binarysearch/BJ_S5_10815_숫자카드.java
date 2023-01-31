package Algorithm.binarysearch;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_S5_10815_숫자카드 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;
    static int n, m;
    static int arr[], arr2[];

    public static void main(String[] args) throws IOException {

        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        stk = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n ; i ++){
            int check = Integer.parseInt(stk.nextToken());
            arr[i] = check;
        }
        Arrays.sort(arr);

        m = Integer.parseInt(br.readLine());

        arr2= new int[m];
        stk = new StringTokenizer(br.readLine());
        for(int i = 0; i < m ; i ++){
            int x = Integer.parseInt(stk.nextToken());

            int lo = 0;
            int hi = n-1;
            int mid = 0;
            while(true){
                mid = (lo+hi)/2;
                if(mid >= arr.length){
                    sb.append(0+" ");
                    break;
                } else {


                    if(arr[mid] == x){
                        sb.append(1+" ");
                        break;
                    }
                    if(lo > hi ){
                        sb.append(0 + " ");
                        break;
                    }
                    if(arr[mid] < x){
                        lo = mid+1;
                        //                  mid = hi/2;
                    }
                    if(arr[mid] > x){
                        hi = mid-1;
                        //                  mid = mid/2;
                    }
                }



            }


    //        search(arr, Integer.parseInt(stk.nextToken()), m/2, 1, m);
        }
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }

//    static void search(int[] arr, int x, int mid, int lo, int hi) throws IOException {
//
//
//        if(arr[mid] == x){
//            sb.append(1+" ");
//            return;
//        }
//        if(lo+1 == hi || mid ==0){
//            sb.append(0 + " ");
//            return;
//        }
//        if(arr[mid] < x){
//            lo = mid+1;
//            mid = hi/2;
//            search(arr, x, mid, lo, hi);
//        }
//
//        if(arr[mid] > x){
//            hi = mid-1;
//            mid = mid/2;
//            search(arr, x , mid, lo, hi);
//        }
//
//
//    }



}
