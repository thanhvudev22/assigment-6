
package assigment.pkg6;

import java.util.Scanner;


public class Btap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];

        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Nhap so nguyen can dem: ");
        int target = scanner.nextInt();
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                count++;
            }
        }

        System.out.println("So lan xuat hien cua " + target + " trong mang: " + count);
        // TODO code application logic here
    }
    
}
