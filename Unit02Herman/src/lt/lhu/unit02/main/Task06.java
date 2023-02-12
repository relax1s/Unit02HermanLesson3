package lt.lhu.unit02.main;

public class Task06 {

	public static void main(String[] args) {
		System.out.println("Решаем задачу 6");

		double a = 1;
		double b = 1;
		double c = 2;
		double d = 2;

		double result;

		double temp;
		temp = a * b - c / c * d;
		
		if(temp !=0) {
			result= a/c*b/d-temp;
		} else {
			System.out.println("Знаменитель равен нулю.");
			result= Double.NaN;
			
		}
		System.out.println("result=" + result);
		
		}

	}
