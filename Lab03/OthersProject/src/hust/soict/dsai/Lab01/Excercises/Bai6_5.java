import java.util.Scanner;

public class Bai6_5 {
    // hàm tính tổng
    public static int sum(int a[]) {
        int tong = 0;
        for (int x : a) {
            tong += x;
        }
        return tong;
    }

    // hàm tính giá trị trung bình
    public static double avgArr(int a[]) {
        int sum = sum(a);
        double avg = (double) sum / a.length; // Chia trực tiếp sum cho a.length
        return avg;
    }

    // hàm sắp xếp nhanh
    public static void merge(int a[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int x[] = new int[n1];
        int y[] = new int[n2];
        for (int j = 0; j < n1; j++) {
            x[j] = a[l + j];
        }
        for (int j = 0; j < n2; j++) {
            y[j] = a[m + 1 + j];
        }
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (x[i] <= y[j]) {
                a[k++] = x[i++];
            } else {
                a[k++] = y[j++];
            }
        }
        while (i < n1) {
            a[k++] = x[i++];
        }
        while (j < n2) {
            a[k++] = y[j++];
        }
    }

    // Hàm sắp xếp merge sort
    public static void mergeSort(int a[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(a, l, m);
            mergeSort(a, m + 1, r);
            merge(a, l, m, r);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        mergeSort(a, 0, n - 1);

        System.out.print("Mảng được sắp xếp tăng dần: ");
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();

        System.out.println("Tổng giá trị của mảng là: " + sum(a));
        System.out.println("Giá trị trung bình của mảng là: " + avgArr(a));

        sc.close();
    }
}