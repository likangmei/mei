import java.util.Scanner;

public class calculate4 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
	    System.out.println("复利计算器：计算复利和单利终值请按1,计算本金请按2；股票投资：计算时间请按3，计算报酬率请按4，计算资产总值请按5" );
		int num=scanner.nextInt();
		if (num == 1) {
			double N = 1, sum;
			System.out.print("请输入本金：");
			double money = scanner.nextDouble();
			System.out.print("请输入存钱年数：");
			int years = scanner.nextInt();
			System.out.print("请输入利率：");
			double r = scanner.nextDouble();
			sum = money + money * years * r;
			System.out.println("单利终值为：" + sum);
			sum = 0;
			for (int i = 1; i <= years; i++) {
				N = (1 + r) * N;
			}
			sum = N * money;
			System.out.println("复利终值为：" + sum);

		}
		if (num == 2) {
			double N = 1, money;
			System.out.print("请输入复利终值：");
			double sum = scanner.nextDouble();
			System.out.print("请输入存钱年数：");
			int years = scanner.nextInt();
			System.out.print("请输入利率：");
			double r = scanner.nextDouble();
			for (int i = 1; i <= years; i++) {
				N = (1 + r) * N;
			}
			money = sum / N;
			System.out.println("应投入的本金为：" + money);
		}
		if (num == 3) {
			double years;
			System.out.print("请输入本金：");
			double money = scanner.nextDouble();
			System.out.print("请输入最后得到资产总值：");
			double sum = scanner.nextDouble();
			System.out.print("请输入利率：");
			double r = scanner.nextDouble();		
			years = sum / (money * r);
			System.out.println("时间为（年）：" + years);
		}
		if (num == 4) {
			double r;
			System.out.print("请输入本金：");
			double money = scanner.nextDouble();
			System.out.print("请输入最后得到资产总值：");
			double sum = scanner.nextDouble();
			System.out.print("请输入存钱年数：");
			int years = scanner.nextInt();
			r=sum/(money*years);
			System.out.println("利率为：" + r);
		}
		if (num == 5){
			double sum;
			System.out.print("请输入本金：");
			double money = scanner.nextDouble();
			System.out.print("请输入利率：");
			double r = scanner.nextDouble();
			System.out.print("请输入存钱年数：");
			int years = scanner.nextInt();
			sum=money*r*years;
			System.out.println("若投资本金每年固定不变，则最后得到的资产总值为：" + sum);
			sum=0;
			for(int i=1;i<=years;i++){
				sum=money*r*1;
				money=sum;				
			}
			System.out.println("若连本带利投资，则最后得到的资产总值为：" + sum);
		}
	}
}
