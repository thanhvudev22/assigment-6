
package assigment.pkg6;

import java.util.Arrays;
import java.util.Scanner;


public class Btap4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];

        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Mang sau khi sap xep theo thu tu tang dan: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        // TODO code application logic here
    }
    
}
}
