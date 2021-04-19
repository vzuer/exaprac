/*
3.	定义三个int型变量并赋值，使用三元运算符或者if-else获取这三个数中的较大数的实现
*/

public class Ex03 {
	public static void main(String[] args){
		int a = 3, b = 5, c = 2;
		int res =  (a > b) ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println("a b c 三者中的最大值 = " + res);
	}
}