
public class test_P34 {
	public static void main(String[] args)
	{
		
		int num1 = 10;
		int num2 = 5;
		
		System.out.println("num1和num2的各種運算 : ");
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + (num1 / num2));
		System.out.println("num1 % num2 = " + (num1 % num2));
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		b = a++;
		c = ++a;
		
		System.out.println("因為是在指定值之後才遞增，所以 B 的值為 : " + b);
		System.out.println("因為是在遞增之後才指定值，所以 C 的值為 : " + c);

	}
}
