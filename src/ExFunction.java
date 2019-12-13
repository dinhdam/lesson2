import java.util.Scanner;

public class ExFunction {
    public static void main(String[] args) {
        int[][]a = new int[4][4];
        int col = 3;
        int row = 3;

        input(a,col, row);
        System.out.println("phan tu trong mang : ");
        output(a,col,row);
        System.out.println();
        System.out.println(" vi tri phan tu am trong mang");
        negative(a,col,row);
        System.out.println();
        System.out.println(" gia tri max  trong mang " + " :" + maxArr(a,col,row));
        System.out.println(" tong gia duong cheo chinh trong mang  " + sumArr(a, col, row));
        System.out.println();
        oddArr(a, col, row);


    }
    //nhap mang 2 chieu
    static void input(int[][]a, int col, int row){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <col ; i++) {
            for (int j = 0; j <row ; j++) {
                System.out.println(" nhap vao phan tu trong mang"+"[" + i +']'+"["+j+"]");
                a[i][j] = scanner.nextInt();
            }

        }
    }
    //xuat mang 2 chieu
    static void output(int[][]a , int col, int row){
        for (int i = 0; i <col; i++) {
            System.out.println();
            for (int j = 0; j <row; j++) {
                System.out.print(a[i][j] + " ");
            }

        }
    }
    // tìm vị trí giá trị âm trong mảng
    static  void negative(int [][]a , int col, int row){
        for (int i = 0; i < col; i++) {

            for (int j = 0; j <row ; j++) {
                if(a[i][j] <0){
                    System.out.println("[" +i+ "]" +"["+j +"]");
                }
            }

        }
    }
    // tìm giá trị max trong mảng
    static int maxArr( int[][] a , int col, int row){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < col; i++) {
            for (int j = 0; j <row ; j++) {
               if(max< a[i][j]){
                   max=a[i][j];
               }
            }

        }
        return max;
    }
    static int sumArr(int[][] a, int col, int row ){
        int sum = 0 ;
        for (int i = 0; i < col ; i++) {
            for (int j = 0; j <row ; j++) {
               if(i == j ){
                   sum = sum + a[i][j];
               }

            }

        }
        return  sum;
    }
    // 1 2 3 4 5
    // result = phạm vi bài toán
    // Liệt kê số phần tử chẵn trên đơờng chéo chính
    static void oddArr(int[][]a , int col, int row ){
        int result = 0 ;
        for (int i = 0; i <col ; i++) {
            for (int j = 0; j < row ; j++) {
                if(i==j){
                    if( a[i][j]%2 ==0){
                        System.out.println("so phan tu chan trong mang " + a[i][j]);

                }else {
                        result++;
                    }

                }
            }

        }
        if(result == row){ //3 !=8
            System.out.println(" khong co phan tu chan nao ton tai trong duong cheo chinh");
        }

    }


}
