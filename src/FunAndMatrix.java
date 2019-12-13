import java.util.Scanner;

public class FunAndMatrix {
    private int sum;

    public static void main(String[] args) {
        /*Hàm dùng để chia nhỏ các chức năng, tái sử dụng lại code
        * Hàm có 2 loai
        * 1 Có kểu trả về  cú pháp kêểu trả về tên hàm ( tham so ){ return ;}
        * 2 khong co kieu tra ve cu phap void ten ham (tham so) {}
        *
        * MA TRAN
        * Gồm 2 mảng 1 chiều
        * cách khởi tạo */
        int A[][] =new int[4][4]; // ma trận 3 hàng và 4 cột
        int col =3;
        int row =3;
        intputMatrix(A,row,col);
        System.out.println("Ma tran vua nhap la");
        outputMatrix(A,row,col);
        System.out.println("Phaanf tu owr oo so 0 2");
        System.out.println(A[0][2]);

       /* int B[]=new int [10];
        int n =3;
        input(B,n);
        System.out.println("Mang vua nhap la");
        output(B,n);
        System.out.println();
        int sum = sumArray(B);
        System.out.println("Tong cac phan tu trong mang la "+sumArray(B));
         even(B,n);
        System.out.println();*/
        // odd(B,n);

    }

    private static void intputMatrix(int[][] A, int row, int col) {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println("A["+i+"]["+j+"]= ");
                A[i][j] = sc.nextInt();
            }
        }
    }

    static  void outputMatrix (int A[][],int row ,int col){
        for(int i=0;i<row;i++){
            System.out.println();
            for(int j=0;j<col;j++){
                System.out.print(A[i][j]+" ");
            }
        }
    }
    // vd 1 in ra các phần tử lẻ trong mảng

    // vd 2 dếm số lơợng các số chẵn trong mang

    // tinh tong cac phan tu trong mang
    static int sumArray(int A[]){
        int sum = 0;
        for (int x: A) {
            sum+=x;
        }
        return sum;
    }

    static void input(int A[],int n){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.println("A["+i+"] = ");
            A[i]=sc.nextInt();
        }
    }

    static void output(int A[],int n){
        for(int i=0;i<n;i++){

            System.out.print(A[i]+" ");
        }
    }

   static void even ( int A[] , int n){
       System.out.println("cac phan tu le trong mang :" );
        for (int i = 0; i < n ; i++) {
            if(A[i]%2 !=0) {
                System.out.print(A[i]+" ");
            }
        }
    }
    static int odd( int A[] , int n){

        int total = 0 ;
        for (int i = 0; i <n ; i++) {
            if(A[i]%2 ==0){
                total+=1;

            }
        }
      return  total;
    }


}
