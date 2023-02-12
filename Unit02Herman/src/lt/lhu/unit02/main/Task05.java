package lt.lhu.unit02.main;

public class Task05 {

	public static void main(String[] args) {
		System.out.println("Решаем задачу 5");

		double a = 4;
		double b = 6;
		double c = 8;

		double result;

		double temp;
		temp = Math.sqrt(Math.pow(b, 2) + 4 * a * c);
		//temp = 0;
		
		if (temp != 0) {
			result = b + temp / 2 * a - Math.pow(a, 3) * c + b;
			//if (temp == 0) {
				//result = b + temp / 2 * a - Math.pow(a, 3) * c + b;
		} else {
			System.out.println("Знаменатель равен нулю.");
			result = Double.NaN;
		}

		System.out.println("relust=" + result);
	}

}
