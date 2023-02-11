package Algorithm.bruteforce;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_S4_1018_체스판_다시_칠하기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int min = 64;
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(stk.nextToken());
        int y = Integer.parseInt(stk.nextToken());

        String[][] arr = new String[x][y];

        for(int i = 0; i < x ; i++){
            String str =  br.readLine();
            String[] strArr = str.split("");
            for(int j = 0 ; j < y ; j ++){
                arr[i][j] = strArr[j];
            }
        }




        for(int i = 0 ; i < x-7 ; i ++){


            for(int j = 0; j < y-7 ; j ++){

                int check = 0;
                for(int i2 = i ; i2 < i+7 ; i2++){
                    for(int j2 = j ; j2<j+7 ; j2++){

                        if(arr[i2][j2].equals(arr[i2][j2+1])){
                                check ++;
                            if(arr[i2][j2].equals("W")){
                                arr[i2][j2+1] = "B";
                            } else {
                                arr[i2][j2+1] = "W";
                            }
                        }
                    }
                    if(arr[i2][0].equals(arr[i2+1][0])){
                        check++;
                        if(arr[i2][0].equals("W")){
                            arr[i2+1][0] = "B";
                        } else {
                            arr[i2+1][0] = "W";
                        }
                    }


                }
                System.out.println("check : " + check);
               min = Math.min(min, check);

            }


        }

        bw.write(String.valueOf(min));
        bw.flush();
        bw.close();
        br.close();

    }
}
