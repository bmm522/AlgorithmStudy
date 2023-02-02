package Algorithm.geometry;

import java.io.*;
import java.util.StringTokenizer;

public class BJ_S2_2477_참외밭 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(br.readLine());

        int[] check = new int[4];
        int[][] arr = new int[6][2];

        for(int i = 0 ; i < 6 ; i ++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int direction = Integer.parseInt(stk.nextToken());
            check[direction-1]++;
            arr[i][0] = direction;
            arr[i][1] = Integer.parseInt(stk.nextToken());
        }
        int x = 0;
        int y = 0;
        if(check[1] == 1 && check[3] == 1){

            for(int i = 0; i < 6 ; i++){

                if(i == 5){
                    if(arr[5][0] ==4 && arr[0][0] ==2){
                        x = arr[5][1] * arr[0][1];
                    }

                    if(arr[5][0] == 1 && arr[0][0] ==3){
                        y = arr[5][1] * arr[0][1];
                    }
                } else {
                    if(arr[i][0] ==4 && arr[i+1][0] ==2){
                        x = arr[i][1] * arr[i+1][1];
                    }

                    if(arr[i][0] == 1 && arr[i+1][0] ==3){
                        y = arr[i][1] * arr[i+1][1];
                    }
                }
            }
            bw.write(String.valueOf((x-y) * k));
        }

        if(check[1] == 1 && check[2] == 1){

            for(int i = 0; i < 6 ; i++){

                if(i == 5){
                    if(arr[5][0] ==2 && arr[0][0] ==3){
                        x = arr[5][1] * arr[0][1];
                    }

                    if(arr[5][0] == 4 && arr[0][0] ==1){
                        y = arr[5][1] * arr[0][1];
                    }
                } else {
                    if(arr[i][0] ==2 && arr[i+1][0] ==3){
                        x = arr[i][1] * arr[i+1][1];
                    }

                    if(arr[i][0] == 4 && arr[i+1][0] ==1){
                        y = arr[i][1] * arr[i+1][1];
                    }
                }
            }
            bw.write(String.valueOf((x-y) * k));
        }

        if(check[0] == 1 && check[3] == 1){
            for(int i = 0; i < 6 ; i++){

                if(i == 5){
                    if(arr[5][0] ==1 && arr[0][0] ==4){
                        x = arr[5][1] * arr[0][1];
                    }

                    if(arr[5][0] == 3 && arr[0][0] ==2){
                        y = arr[5][1] * arr[0][1];
                    }
                } else {
                    if(arr[i][0] ==1 && arr[i+1][0] ==4){
                        x = arr[i][1] * arr[i+1][1];
                    }

                    if(arr[i][0] == 3 && arr[i+1][0] ==2){
                        y = arr[i][1] * arr[i+1][1];
                    }
                }
            }
            bw.write(String.valueOf((x-y) * k));
        }

        if(check[0] == 1 && check[2] == 1){
            for(int i = 0; i < 6 ; i++){

                if(i == 5){
                    if(arr[5][0] ==3 && arr[0][0] ==1){
                        x = arr[5][1] * arr[0][1];
                    }

                    if(arr[5][0] == 2 && arr[0][0] ==4){
                        y = arr[5][1] * arr[0][1];
                    }
                } else {
                    if(arr[i][0] ==3 && arr[i+1][0] ==1){
                        x = arr[i][1] * arr[i+1][1];
                    }

                    if(arr[i][0] == 2 && arr[i+1][0] ==4){
                        y = arr[i][1] * arr[i+1][1];
                    }
                }
            }
            bw.write(String.valueOf((x-y) * k));
        }


        bw.flush();
        bw.close();
        br.close();


    }
}
