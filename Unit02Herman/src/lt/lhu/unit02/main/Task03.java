package lt.lhu.unit02.main;

public class Task03 {

	public static void main(String[] args) {
		System.out.println("Решаем задачу 3");
		double a = 5;
		double b = 8;
		double c = 3;

		double result;

		double temp;
		temp = Math.pow(a, 2);

		double temp1;
		temp1 = Math.sqrt(b * b - c * c);
		
		result = temp - temp1;
		
		//System.out.println("result =" + result);
		result = temp - temp1 + Math.log((Math.pow(b, 2)) + 1);
		System.out.println("result =" + result);
	}

}
