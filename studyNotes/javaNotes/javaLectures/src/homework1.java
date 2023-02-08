import java.util.Arrays;
import java.util.Scanner;
// not complete
public class homework1 {
    public static void main(String[] args) {
        int arr[][] = new int[4][7];
        int rank[][] = new int[2][4];
        int[][] temp = getInput(arr);
        rank = getRank(arr, rank);
//        int[][] temp2 = getMax(arr);
//        print(temp, temp2);
          print(temp, rank);
    }
    public static int[][] getRank(int[][] arr, int[][] rank){
        for(int j=0;j<4;j++){
            rank[1][j] = j;
        }
        for(int j=1;j<4;j++){
            rank[2][j] = arr[j][4];
        }
        Arrays.sort(rank);
        return rank;
    };
    public static int[][] getInput(int arr[][]){
        Scanner scr = new Scanner(System.in);
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++) {
                if(j<3){
                    arr[i][j] = scr.nextInt();
                }else if(j<4){
                    arr[i][j] = arr[i][j-1] + arr[i][j-2] + arr[i][j-3];
                }else if(j<5){
                    arr[i][j] = (arr[i][j-1])/3;
                }
            }
        }
        return arr;
    };
//    public static int[][] getMax(int[][] arr){
//        int arr2[][] = new int [4][1];
//        for(int i=0;i<4;i++){
//            for(int j=3;j<4;j++){
//                arr2[i][j-3] = arr[i][j];
//            }
//        }
//        Arrays.sort(arr2);
//        return arr2;
//    };

    public static void print(int[][] temp, int[][] temp2){

        System.out.print("\t번호\t성명\t국어\t영어\t수학\t총점\t평균\t학점\t등수");
        System.out.println();

        for(int i=0;i<4;i++){
            System.out.print("\t");
                if(i==0){
                    System.out.print(i + 1);
                    System.out.print("\t김씨");
                }else if(i==1){
                    System.out.print(i + 1);
                    System.out.print("\t이씨");
                }else if(i==2){
                    System.out.print(i + 1);
                    System.out.print("\t박씨");
                }else if(i==3){
                    System.out.print(i + 1);
                    System.out.print("\t최씨");
                }

            for(int j=0;j<6;j++){

                if(j==5){
                    if(temp[i][j-1]>=90){
                        System.out.print("\tA");
                    }else if(temp[i][j-1]>=80){
                        System.out.print("\tB");
                    }else if(temp[i][j-1]>=70){
                        System.out.print("\tC");
                    }else if(temp[i][j-1]>=60){
                        System.out.print("\tD");
                    }else {
                        System.out.print("\tF");
                    }
                }else if(j==6){
//                    if()
                }
                System.out.print("\t"+temp[i][j]);
            }
            System.out.println();
        }
    }
}

/*
*
*
* else if(j<6){
                    if(arr[i][j-1]>90){
                        arr[i][j] = 'A';
                    }else if(arr[i][j-1]>80){
                        arr[i][j] = 'B';
                    }else if(arr[i][j-1]>70){
                        arr[i][j] = 'C';
                    }else{
                        arr[i][j] = 'F';
                    }
                }
*
*
*
*
*
*
* */