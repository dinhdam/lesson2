

import java.util.Arrays;
import java.util.Scanner;

public class ImportAndExportArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[]{2,4,6,8,9};
        System.out.println(" nhap vao so n :");
        int n = scanner.nextInt();
        Arrays.sort(a);
        int count=0;
        for (int i = a.length -1; i >=n ; i--) {
            count++;
            if(count<=n){
            System.out.println(a[i]);
            }else {
                break;
            }
        }
        //nhap mang
//        int [] number = new int[5];
// 2 3 -4 5 -6 -7
        //  a[2]=-4 a[4]=-6 a[5]-7
        // nhaapj mangr
//        System.out.println(" cac gia tri cua mang hien tai : ");
//        for (int i = 0; i < number.length ; i++) { // duyet qua het cac phan tu trong mang.
//            System.out.println(" moi ban nhap vao gia tri cua vi tri tai : " + "[" + i + "]"); // vi tri nay se chay tu 0 den vi tri cuoi cung cua mang
//            number[i] = scanner.nextInt(); //nhap tung vi tri trong mang.
//        }
        //

//        System.out.print("cac gia tri am trong mang  : ");
//        System.out.print("vi tri chan dau tien cua mang  : ");
//        for (int i = 0; i < number.length ; i++) {
////            System.out.print(number[i] + " ");
//            if(number[i] <0){
//                System.out.print(i  + " ");}
//            if(number[i] %2 ==0){
//                System.out.println("[" +i +"]");
//                break;
//            }
//        }
//
    }

   /* Tìm n phẩn tử lớn nhất trong mảng và in ra vị trí của nó
    Ví dụ mảng a: 20 7 8 9 1 8
    nhập n =3, thì sẽ in ra 20,9,8
    1 7 8 8 9 20
    0 1 2 3  4 5 length()=6

 for int i = a.length()-1 i>=n;p i--

    for int i=0  i<a.lenght();i++

*/

}
