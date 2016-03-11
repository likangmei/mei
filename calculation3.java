package calculation2;

import java.util.Scanner;

public class calculation3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		 double N=1,money;
		  Scanner scanner=new Scanner(System.in);
		  System.out.print("请输入复利终值：");	 
		  double sum = scanner.nextDouble();  
		  System.out.print("请输入存钱年数：");
		  int years = scanner.nextInt();		   
		 System.out.print("请输入利率：");
		  double r = scanner.nextDouble();
		  for(int i=1;i<=years;i++){
			   N=(1+r)*N;
		   }
			 money=sum/N;
			 System.out.println("应投入的本金为："+money);
	}

}
