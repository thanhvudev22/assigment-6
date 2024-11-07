
package assigment.pkg6;

import java.util.Scanner;


public class Btap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];

        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        
        double average = (double) sum / n;

        System.out.println("Tong cac phan tu trong mang: " + sum);
        System.out.println("Gia tri trung binh cua cac phan tu trong mang: " + average);
        // TODO code application logic here
}
}
