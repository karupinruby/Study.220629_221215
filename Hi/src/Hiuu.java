
public class Hiuu {

	public static void main(String[] args) {
int x = 64;   // -64;
int n = 2;        
System.out.println("x >> n = " + (x >> n)); // 나눗셈, (x / 2^n)
System.out.println("x << n = " + (x << n)); // 곱셈,  (x * 2^n)
System.out.println("x >>> n = " + (x >>> n));

System.out.println("x >> 34 = " + (x >> 34));    // x / 2^(n % 32)
System.out.println("x << 34 = " + (x << 34));
System.out.println("x >>> 34 = " + (x >>> 34));
	}
	
	
}