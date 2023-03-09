import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int h = fs.nextInt(), x = fs.nextInt(), y = fs.nextInt();
			if (x >= h || y >= h) {
				System.out.println(1);
				continue;
			}
			int ans = 0;
			if (y > x) {
				h -= y;
				ans++;
			}
			ans += (h / x);
			if (h % x != 0) {
				ans++;
			}
			System.out.println(ans);
		}
		fs.close();
	}
}
