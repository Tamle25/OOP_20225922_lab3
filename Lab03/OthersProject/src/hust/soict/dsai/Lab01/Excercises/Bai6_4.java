import java.util.Scanner;
public class Bai6_4 {  
    // hàm kiểm tra năm nhuận
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    // hàm kiểm tra ngày trong tháng
    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return 0; 
        }
        if (month == 2) {
            return (isLeapYear(year)) ? 29 : 28;
        }
        return (month == 4 || month == 6 || month == 9 || month == 11) ? 30 : 31;
    }
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Nhập năm: ");
            int year = input.nextInt();
    
            System.out.print("Nhập tháng: ");
            int month = input.nextInt();
    
            int daysInMonth = getDaysInMonth(month, year);
            System.out.println("Tháng " + month + " năm " + year + " có " + daysInMonth + " ngày.");    
            input.close();
        }
    
}