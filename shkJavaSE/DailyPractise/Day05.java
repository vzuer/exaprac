import java.util.Scanner;
public class Day05{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入第一个正整数：");
        int a = scan.nextInt();
        System.out.println("请输入第二个正整数：");
        int b = scan.nextInt();
        // iteration method: to get the gcd of a and b
        int min = (a > b) ? b : a;
        for(int i=min; i>0; --i){
            if(a%i == 0 && b%i == 0){
                System.out.println("这两个数的最大公约数是：" + i);
                break;
            }
        }
        // get the lcm of a and b
        int max = (a > b) ? a : b;
        for(int i=max; i<=a*b; ++i){
            if(i%a==0 && i%b==0){
                System.out.println("这两个数的最小公倍数是：" + i);
                break;
            }
        }
    }
}
