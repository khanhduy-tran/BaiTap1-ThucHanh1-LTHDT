import java.util.Scanner;

public class PTBac2 {
	public static int a = 0;
	public static int b = 0;
	public static int c = 0;
	public static Scanner scanner;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		System.out.println("Nhap he so bac 2, a = ");
		a = scanner.nextInt();
		System.out.println("Nhap he so bac 1, b = ");
		b = scanner.nextInt();
		System.out.println("Nhap hang so tu do, c = ");
		c = scanner.nextInt();
		giaiPTBac2(a,b,c);
	}
	private static void giaiPTBac2(int a, int b , int c) {
		// TODO Auto-generated method stub
		   if (a == 0) {
	            if (b == 0) {
	                System.out.println("Phương trình vô nghiệm!");
	            } else {
	                System.out.println("Phương trình có một nghiệm: "
	                        + "x = " + (-c / b));
	            }
	            return;
	        }
	        // tính delta
	        float delta = b*b - 4*a*c;
	        float x1;
	        float x2;
	        // tính nghiệm
	        if (delta > 0) {
	            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
	            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
	            System.out.println("Phương trình có 2 nghiệm là: "
	                    + "x1 = " + x1 + " và x2 = " + x2);
	        } else if (delta == 0) {
	            x1 = (-b / (2 * a));
	            System.out.println("Phương trình có nghiệm kép: "
	                    + "x1 = x2 = " + x1);
	        } else {
	            System.out.println("Phương trình vô nghiệm!");
	        }
	}

}
