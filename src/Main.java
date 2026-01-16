import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

//1-zd
//        int max = arr[0];
//        int min = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//        }
//
//        System.out.println(min);
//    }
//
//

//2-zd
//        int sum = 0;
////
////        for (int i = 0; i < arr.length; i++) {
////            sum += arr[i];
////        }
////
////        int orta = sum / arr.length;
////        System.out.println(orta);
////    }

//
//        int[] son = {1, 2, 3, 4, 5, 7};
//
//        for (int i = 0; i < son.length; i++) {
//            if (son[i] % 2 == 0) {
//                System.out.println(son[i]);
//            }
//        }
//
//3-zd
//        int[] so = {1, 2, 3, 4, 5, 7};
//
//        for (int x : so) {
//            if (x % 2 != 0) {
//                System.out.println(x);
//            }
//        }
//4-zd
//        int[] son = {1, 2, 3, 4, 5};
//
//        for (int i = son.length - 1; i >= 0; i--) {
//            System.out.println(son[i]);
//        }


//5-zd
        int[] a = {1, 2, 3, 4, 5};
        int k = 2;

        int n = a.length;
        k = k % n; // если k больше длины массива

        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            b[(i + k) % n] = a[i];
        }

        for (int x : b) {
            System.out.print(x + " ");
        }
    }
}