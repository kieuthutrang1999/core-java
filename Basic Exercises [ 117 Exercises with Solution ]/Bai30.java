import java.util.Scanner;

public class Bai30 {
	public static int hex_to_decimal(String s) {
		String digits = "0123456789ABCDEF";
		s = s.toUpperCase();
		int val = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int d = digits.indexOf(c);
			val = 16 * val + d;
		}
		return val;
	}

	public static void main(String args[]) {
		String hexdec_num;
		int dec_num, i = 1, j;
		int octal_num[] = new int[100];
		Scanner in = new Scanner(System.in);

		System.out.print("Nhap 1 so thap luc phan: ");
		hexdec_num = in.nextLine();
		dec_num = hex_to_decimal(hexdec_num);

		while (dec_num != 0) {
			octal_num[i++] = dec_num % 8;
			dec_num = dec_num / 8;
		}

		System.out.print("So tuong duong cua so bat phan: ");
		for (j = i - 1; j > 0; j--) {
			System.out.print(octal_num[j]);
		}
		System.out.print("\n");
	}
}