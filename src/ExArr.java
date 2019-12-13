import java.util.Scanner;

public class ExArr {
    public static void main(String[] args) {
    int [] a = new int [4];
        input(a);
        System.out.println("Các phần tử trong mảng bao gồm ");
        output(a);
        System.out.println("vị trí chẵn của giá trị đầu tiên trong mảng" + " ");
        even(a);
        System.out.println( "số lượng số chẵn trong mảng là : " + locationEven(a));
        System.out.println("phần tử lớn nhất trong mang là" + " " + maxArr(a));
        System.out.println();
        minArr(a);
        System.out.println();
        oddArr(a);
        System.out.println( "so luong cac  phan tu le va nho hon 100 trong mang la : " +  countEvenArr(a));
        System.out.println("tong cac gia tri am trong mang " + totalNegativeArr(a) );
        System.out.println(" kiem tra gia 0 co ton tai trong mang khong  " + checkZero(a));
        System.out.println(" kiem tra mang so nguyen co ton tai gia tri chan hay khong  " + checkOdd(a));
        System.out.println(" kiem tra mang so nguyen xem co gia tri 0 lien tiep hay khong  " + checkConsecutiveNumbers(a));




    }
    //nhap gia tri vao mang
    static void input (int []a){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <a.length ; i++) {

            System.out.println("[" + i + "]");
           a[i]= scanner.nextInt();

        }
    }
    //xuat gia tri trong mang
    static void output(int[]a){
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);

        }
    }
    // tim vi tri chan dau tien trong mang
    static  void even(int[]a ){

        for (int i = 0; i < a.length ; i++) {
           if(a[i]%2 == 0){
               System.out.println("[" + i  +"]");
             break;
           }

        }

    }
    // đếm số lương giá trị chẵn trong mảng
    static int  locationEven(int[]a){
        int total = 0;
        for (int i = 0; i <a.length ; i++) {
            if(a[i]%2 ==0) {
                total +=1;
            }
            }
        return total;
        }
      // tìm giá trị phần tử max trong mảng
        static int maxArr(int[]a){
            int max = Integer.MIN_VALUE;
            for (int i = 0; i <a.length ; i++) {
              if(max < a[i]){
                  max = a[i];
              }
            }
            return max;
        }
        // tìm vị trí min  trong mảng
        static void minArr(int[]a){
        int number = 0;
        int min = Integer.MAX_VALUE;
            for (int i = 0; i <a.length ; i++) {
                if(min >a[i]){
                    min = a[i];
                    number = i;

                }


            }
            System.out.println(" vi tri nho nhat trong mang "+" [" + number + "]");



        }
        // tim gia tri chan nho hon 2004
    // 1 3 5 7 8 9
        static void oddArr(int[]a){

        int flag = 0;
            for (int i = 0; i <a.length ; i++) {
                if(a[i]%2 == 0 && a[i]< 2004){
                    System.out.println(" gia tri chan nho hon 2004 la :" + a[i]);

                }else {
                    flag++; //3
                }
            }

            if(flag == a.length){
                System.out.println("Không có phần tử thỏa mãn");
            }


        }
        // ddeems so luong so  lẻ và nhỏ hơn 100 trong mang
        static int  countEvenArr(int []a){
        int count = 0 ;
            for (int i = 0; i < a.length ; i++) {
                if(a[i]%2 !=0 && a[i]<100){
                  count+=1;
                }

            }
            return  count;
        }
        // tìm tổng các giá trị âm trong mảng
        static int totalNegativeArr(int[]a){
        int total = 0;
            for (int i = 0; i <a.length ; i++) {
                if(a[i]<0){
                    total= total+a[i];
                }

            }
            return  total;
        }
        // check giá trị 0 trong mảng nếu có trả về 0 không có trả về 1
        static int checkZero(int[]a){
            for (int i = 0; i <a.length ; i++) {
                if(a[i] ==0){
                    return 0;
                }

            }
            return 1;
        }
        // check gia tri chan trong mang neu co phan tu chẵn thì trả về 0 còn không có trả về 1
        static int checkOdd(int[]a){
            for (int i = 0; i <a.length ; i++) {
                if(a[i]%2 ==0){
                    return 0;
                }
            }
            return 1;
        }
        // check xem trong mảng có hai giá trị 0 liên tiếp trong mảng hay không
        static  int checkConsecutiveNumbers(int []a){
            for (int i = 0; i <a.length; i++) {
                if(a[i]==0 && a[i +1] ==0){
                    return 0;
                }
            }
            return 1;
        }


    }





