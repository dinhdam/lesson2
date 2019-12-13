public class Array {
    public static void main(String[] args) {
        // khởi tạo
        //int a[] = new int [5];
        // int b[] = {1,3,5,2,6,-1};
        //  int x = 1;
        // số phần tử trong mảng
        //  System.out.println("Số phần tử trong mảng a "+a.length);
        //  System.out.println("Số phần tử trong mảng b "+b.length);
        // duyệt mảng
        // cho mảng bằng 1
        //Arrays.fill(a,1);
        //  System.out.println(b[2]);
        // nhập mảng
//        Scanner scanner=new Scanner(System.in);
//
//        for(int i=0; i<a.length;i++){
//            System.out.println("a["+i+"] = ");
//            a[i]=scanner.nextInt();
//        }
//        // Xuất mảng
//        System.out.println("Mảng a vừa nhập là ");
//        for(int i=0;i<a.length;i++){
//            System.out.print(a[i]+" ");
//        }

        // Ký thuật tìm min max
        // ý tơởng khởi tạo biến max và min sau đó duyệt mảng và cập nhật  laioj mã min
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//        int [] arr = new int[]{2,3,4};
//        for (int i = 0; i <arr.length ; i++) {
//            if(max < arr[i]){
//               max = arr[i];
//            }
//            if(min > arr[i]){
//                min = arr[i];
//            }
//        }
//        System.out.println("max  " +max);
//        System.out.println("min  " +min);

        // kỶ thuật tính tổng
//        int number = 0;
//        for (int i = 0; i <arr.length ; i++) {
//           number+= arr[i];
//        }
//        System.out.println(" " + number);
//
//        int sum=0;
//        for(int i : arr){
//            sum+= i;
//        }
//        System.out.println( " mang = " + sum);

        // vieetc chơơng trình nhập vào mảng a, liệt kê số chẵn, lẻ trong mảng, tính tổng chắc, tổng lẻ, max chẵn, max lẻ
        // a[] = {3,4,5};
//        Scanner scanner = new Scanner(System.in);
//        int sumOdd= 0;
//        int sumEven = 0;
//
//        int maxOdd = Integer.MIN_VALUE;
//        int maxEven = Integer.MIN_VALUE;
//        for (int i = 0; i <a.length ; i++) {
//            System.out.println("nhap vao phan tu trong mang ");
//            a[i] = scanner.nextInt();
//
//        }
//        System.out.print(" so chan ");
//        for (int i = 0; i <a.length ; i++) {
//            if(a[i]%2 ==0 ){
//                System.out.print(a[i]+" ");
//                sumEven+=a[i];
//                if(maxEven < a[i]){
//                    maxEven = a[i];
//                }
//            }
//
//
//        }
//        System.out.println(" max cua cac so chan " + maxEven);
//        System.out.println(" tong cac so chan la " + sumEven);
//        System.out.println();
//        System.out.print(" so le ");
//
//        for (int i = 0; i <a.length ; i++) {
//            if(a[i]%2 !=0 ){
//                System.out.print(" " + a[i]);
//                sumOdd+=a[i];
//                if(maxOdd <a[i]){
//                    maxOdd = a[i];
//                }
//            }
//
//
//
//        }
//        System.out.println(" max cua cac so le  " + maxOdd);
//        System.out.println(" tong cac so le la  : " +sumOdd);

        // cho mảng b ={1,2,3,2,3,4,3,43,23,56,43} cho x =3 kiếm tra xem x có thuộc mảng b k  nếu có thì in ra số lanf xuất hiện
        int b[] = {1, 2, 3, 2, 3, 4, 3, 43, 23, 56, 43};
        int x = 9;
        int show = 0;
        boolean isShow = true;
        for (int i = 0; i < b.length; i++) {
            if (b[i] == x) {
                show += 1;
//                System.out.println(b[i]);
            }else{
                isShow =false;
            }

        }
        if (isShow) {
            System.out.println("so lan xuat hien " + show);
        } else {
            System.out.println("So"+ x + "khong xuat hien");
        }

    }
}
