import java.util.Scanner;

public class Calculate5 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
        System.out.println("复利计算器：计算复利和单利终值请按1,计算本金请按2；股票投资：计算时间请按3，计算报酬率请按4，计算资产总值请按5;"
         + "银行贷款：计算月等额还款金额请按6" );
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
           years=((Math.log(sum)/Math.log(1+r))-(Math.log(money)/Math.log(1+r)));
            System.out.println("时间为（年）：" + years);
        }
        if (num == 4) {
            double r,N;
            System.out.print("请输入本金：");
            double money = scanner.nextDouble();
            System.out.print("请输入最后得到资产总值：");
            double sum = scanner.nextDouble();
            System.out.print("请输入存钱年数：");
            int years = scanner.nextInt();
            N=Math.pow(sum/money, 1d/years);//1d是开根号，没有1d就是多少次方
            r=N-1;
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
            sum=years*12*(money*(r/12)+money);
            System.out.println("若投资本金每月固定不变，则最后得到的资产总值为：" + sum);
            sum=0;
            sum=money*(Math.pow(1+r,years)-1)/r;
            System.out.println("若连本带利投资，则最后得到的资产总值为：" + sum);
        }
       if(num==6){
    	   double sum,k;
    	   int month;
    	   System.out.print("请输入本金：");
           double money = scanner.nextDouble();
           System.out.print("请输入年利率：");
           double r = scanner.nextDouble();
           System.out.print("请输入贷款年数：");
           int years = scanner.nextInt();
           k=r/12;//k为月利率
           month=years*12;//month为贷款月数
           sum=money*k*Math.pow(1+k, month)/(Math.pow(1+k,month)-1);
           System.out.println("每月等额还款金额为："+sum);
       }
       if(num<1||num>6){
    	   System.out.println("输入有误，请重新输入");
        }
	}

	public boolean Input(double money, int years, double r) {
		// TODO 自动生成的方法存根
		if(money<=0)
		{
			System.out.print("请输入>0的本金\n");
			 return false;
		}
		else if(years<=0)
		{
			System.out.print("请输入>0的存钱年数\n");
			 return false;
		}
		else if(r<=0)
		{
			System.out.print("请输入>0的利率\n");
			 return false;
		}
		else if(r>1)
		{
			System.out.print("请输入<1的利率");
			 return false;
		}
		else
			return true;
	}
}
