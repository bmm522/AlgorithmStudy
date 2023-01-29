package Algorithm.bruteforce;

import java.io.*;

public class BJ_B2_2231_분해합 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int size = 0;
        int result = 0;
        if(n>=10 && n < 100){
            size = 18;
        } else if (100<=n && n<1000) {
            size = 27;
        } else if (1000<=n && n < 10000) {
            size = 36;
        } else if (10000 <=n && n < 100000) {
            size = 45;
        } else if (100000 <= n && n < 1000000) {
            size = 54;
        } else if (n == 2 ) {
            result = 1;
        } else if (n == 4 ){
            result = 2;
        } else if (n == 8 ){
            result = 4;
        }
//        System.out.println("size : " + size);

        for(int i = n-size ; i < n ; i++){
            if(n>=10 && n < 100){
                if((i + (i /10) + (i % 10)) == n){
                    result = i;
                }
            } else if (100<=n && n<1000) {
//                System.out.println("i : " + i);
//                System.out.println("(i/100) : " + (i/100));
//                System.out.println("(i%100)/10 : " + (i%100)/10);
//                System.out.println("(i%10) : " + (i%10));
                if((i + (i/100)+((i %100)/10) + (i % 10)) == n){
                    result = i;
                    break;
                }
            } else if (1000<=n && n < 10000) {
                if((i + (i/1000) + ((i%1000)/100) + ((i%100)/10) + (i%10)) == n){
                    result = i;
                    break;
                }
            } else if (10000 <=n && n < 100000) {
                if((i + (i/10000) + ((i%10000)/1000) + ((i%1000)/100) + ((i%100)/10) +(i % 10)) == n){
                    result = i;
                    break;
                }
            } else if (100000 <= n && n < 1000000) {
                if((i + (i/100000)+((i%100000)/10000)+ ((i%10000)/1000) + ((i%1000)/100) + ((i%100)/10) + (i % 10)) == n){
                    result = i;
                    break;
                }
            }
        }
        br.close();
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
