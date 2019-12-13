import java.util.Scanner;

public class MatrixEx {
    public static void main(String[] args) {
        int[][]a = new  int [4][4];
        int col = 3;
        int row = 3;
        int x = 0;
        input(a, col, row);
        System.out.print("cac gia tri trong mang  la :");
        output(a, col , row);
        System.out.println("tong cac so duong trong ma tran so thuc " + sumPositiveNumbers(a,col, row));
        System.out.println("tich cac gia tri le trong ma tran so nguyen " + multiplyEvenNumbers(a,col, row));
        System.out.println("tong cac gia tri trong mot hang " + sumRow(a,col, row, x));
        System.out.println(" tich cac gia tri duong tren mot cot  ma tran so thuc " + multiplyPositive(a,col, row,x));
        System.out.println(" tong  cac gia tri duong tren mot dong  ma tran so thuc " + sumPositive(a,col, row,x));
        System.out.println(" tinh trung binh cong cac so duong trong ma tran  " + averageNumber(a,col, row));
        System.out.println(" gia tri bien trong ma tran  " + giatriBien(a,col, row));
        System.out.println(" gia tri tuyet doi trong mang  : ");
        giaTriTuyetDoi(a,col,row);
        System.out.println(" ....................");
        sumWithRows(a,col,row,x);

    }
    static  void input(int a[][], int col ,int row){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < col ; i++) {
            for (int j = 0; j < row ; j++) {
                System.out.println("[" + i + "]" + "[" +j +"]");
                a[i][j] = scanner.nextInt();
            }
        }

    }
    static void output(int a[][] , int col , int row){
        for (int i = 0; i <col ; i++) {
            for (int j = 0; j <row ; j++) {
                System.out.println(" " + a[i][j] );
            }

        }
    }
    //  2.tinh tong cac   so duong trong day so thuc trong ma tran
    static  int sumPositiveNumbers(int a[][], int col, int row){
        int sumPositive = 0;
        for (int i = 0; i <col ; i++) {
            for (int j = 0; j <row ; j++) {
                if(a[i][j]>0) {

                    sumPositive += a[i][j];
                }
            }
        }
        return sumPositive;
    }
    // 3.tinh tich cac gia tri le trong ma tran so nguyen
    static int multiplyEvenNumbers(int a[][] , int col, int row){
        int multiply = 1;
        for (int i = 0; i <col ; i++) {
            for (int j = 0; j < row ; j++) {
                if(a[i][j] % 2 !=0){
                    multiply = multiply * a[i][j];

                }
            }
        }
        return  multiply;
    }
    //4. tinh tong cac gia tri tren mot dong trong ma tran so thuc
    static int sumRow( int [][] a, int col , int row ,int x){
     int total = 0;
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                total = total + a[x][j];

            }


        }
        return total;
    }
   // 5.tinh tich cac gia tri duong tren mot cot  ma tran so thuc
    static int multiplyPositive( int [][]a , int col, int row , int x){
        int positive= 1;
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row ; j++) {
                if(a[x][i]>0){
                    positive = positive*a[x][i];
                }
            }

        }
        return  positive;
    }
    //6. tinh tong cac gia tri duong tren mot dong trong ma tran
    static int sumPositive(int[][]a , int col, int row ,int x ){
        int sum = 0 ;
        for (int i = 0; i < col ; i++) {
            for (int j = 0; j < row ; j++) {
                if(a[x][j] > 0){
                    sum += a[x][j];
                }
            }

        }
        return sum;
    }
    // 7. tinh tich cac so chan tren cung mot cot tren ma tran so nguyen
    static  int multiplyOdd(int[][]a , int col, int row , int x ) {
        int multi = 1;
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (a[x][i] % 2 == 0) {
                    multi = multi * a[x][i];
                }

            }

        }
        return multi;
    }
    //8. tinh trung binh cong cac so duong trong ma tran cac so thuc
    static int averageNumber(int[][]a , int col, int row){
        int average = 0;
        int count = 0;
        for (int i = 0; i < col ; i++) {
            for (int j = 0; j < row ; j++) {
              if(a[i][j]> 0){
                  average += a[i][j];
                  count++;
              }
            }

        }
        return average/count;
    }
    // 9.tinh tong cac gia tri nam tren gia tri bien cua ma tran

    static int giatriBien( int [][]a, int col, int row){
        int sum = 0;
        for (int i = 0; i < col ; i++) {
            for (int j = 0; j < row ; j++) {
                if(i==0){
                    sum+= a[i][j];
                }else if(i == col-1){
                    sum+= a[i][j];
                }else if(j==0){
                    sum+= a[i][j];
                }else if(j == row-1){
                    sum+= a[i][j];
                }
            }

        }
     return sum;
    }
    //  bien doi cac gia tri am thanh gia tri tuyet doi
    static void giaTriTuyetDoi( int [][]a , int col, int row){
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row ; j++) {
                if(a[i][j]<0){
                    System.out.println(  " " + Math.abs(a[i][j]));
                }
            }

        }
    }
    // viet ham tinh tong cac gia tri tung hang vi du 1 +2+3 = 6
    static  void sumWithRows(int [][]a , int col, int row, int x){
        int sum = 0;
//        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                sum += a[x][j];
            }

            System.out.println(" tong dong "  + sum);


    }
//        return sum;

    }
//}
