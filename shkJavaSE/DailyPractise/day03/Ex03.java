/*
3.	定义三个int型变量并赋值，使用三元运算符或者if-else获取这三个数中的较大数的实现
*/

// public class Ex03 {
// 	public static void main(String[] args){
// 		int a = 3, b = 5, c = 2;
// 		int res =  (a > b) ? (a > c ? a : c) : (b > c ? b : c);
// 		System.out.println("a b c 三者中的最大值 = " + res);
// 	}
// }

/*
4.	编写程序，声明2个double型变量并赋值。
	判断第一个数大于10.0，且第2个数小于20.0，打印两数之和。否则，打印两数的乘积。
*/

public class Ex03 {
	public static void main(String[] args){
		double a = 13.34;
		double b = 3.1415926;
		if(a > 10.0 && b < 20.0){
			System.out.println("a + b = " + (a + b));
		}else{
			System.out.println("a * b = " + (a * b));
		}
	}
}