package lt.lhu.unit02.main;

public class Task07 {

	public static void main(String[] args) {
		System.out.println("Решаем задачу 7");
		int a;
		int b;
		int c;
		
		a = 8;
		b = 7;
		c = -3;
		
		if (a > 0) {
			System.out.println(Math.pow(a, 2));
		} else if (0 > a) {
			System.out.println(Math.pow(a, 4));
		}
		
		if (b > 0) {
			System.out.println(Math.pow(b, 2));
		} else if (0 > b) {
			System.out.println(Math.pow(b, 4));
		}
		
		if (c > 0) {
			System.out.println(Math.pow(c, 2));
		} else if (0 > c) {
			System.out.println(Math.pow(c, 4));
		}
	
	}
}