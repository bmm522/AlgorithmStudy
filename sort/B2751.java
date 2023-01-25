package Algorithm.sort;

import java.io.*;

public class B2751 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(br.readLine());

        int[] arr = new int[size];
        for(int i = 0 ; i < size ; i ++){
            arr[i] = Integer.parseInt(br.readLine());

        }

//        Arrays.sort(arr);
        br.close();
        quickSort(arr);

        for(int i : arr){
            bw.write(i+"\n");
        }
        bw.flush();
        bw.close();

    }

    private static void quickSort(int[] arr){
        quickSort(arr, 0, arr.length -1);
    }

    private static void quickSort(int[] arr, int start, int end){
        int part2 = partition(arr, start, end);

        if(start < part2 - 1){
            quickSort(arr, start, part2 - 1);
        }

        if(part2<end){
            quickSort(arr, part2, end);
        }
    }

    private static int partition(int[] arr, int start, int end){
        int pivot = arr[(start + end) / 2];
        while(start <= end){
            while(arr[start] < pivot){
                start ++;
            }

            while (arr[end] > pivot){
                end --;
            }

            if(start <= end){
                swap(arr, start, end);
                start ++;
                end --;
            }
        }
        return start;
    }

    private static void swap(int[] arr, int start, int end){
        int temp =  arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }


}
