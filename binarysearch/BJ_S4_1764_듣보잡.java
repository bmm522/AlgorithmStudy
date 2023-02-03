package Algorithm.binarysearch;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_S4_1764_듣보잡 {

    static String[] strArr;
    static String[] strArr2;
    static int cnt;
//    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static ArrayList<String> list = new ArrayList<>();

 //   static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stk = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());


            strArr = new String[n];
            strArr2 = new String[m];


//        String[] strArr = new String[n];
//        strArr2 = new String[m];

        for(int i = 0 ; i < n ; i ++){
            strArr[i] = br.readLine();
        }

        for(int i = 0 ; i < m ; i ++){
            strArr2[i] = br.readLine();
        }
        Arrays.sort(strArr);
        Arrays.sort(strArr2);

        for(int i = 0 ; i < n ; i ++){
            binarySearch(strArr[i], 0, m-1);
        }

        System.out.println(cnt);
        for(int i = 0 ; i < list.size() ; i++){
            System.out.println(list.get(i));
        }

        br.close();
    }

    private static void binarySearch(String strArr, int lo, int hi) throws IOException {

            int mid = (lo+hi)/2;

            if(strArr.equals(strArr2[mid])){
                cnt++;
                list.add(strArr);
                return;
            }
         if(lo >= hi){
            return;
          }
            if(strArr.compareTo(strArr2[mid])< 0){
                hi=mid-1;
                binarySearch(strArr, lo, hi);
            } else {
                lo = mid +1;
                binarySearch(strArr, lo, hi);
            }






    }
}
