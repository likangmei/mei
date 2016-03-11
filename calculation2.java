package calculation2;

import java.util.Scanner;

public class calculation2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		  double N=1,sum;
		  Scanner scanner=new Scanner(System.in);
		  System.out.print("请输入本金：");	 
		  double money = scanner.nextDouble();  
		  System.out.print("请输入存钱年数：");
		  int years = scanner.nextInt();		   
		 System.out.print("请输入利率：");
		  double r = scanner.nextDouble();
		sum=money+money*years*r;
		System.out.println("单利终值为："+sum);
		sum=0;
		 for(int i=1;i<=years;i++){
			   N=(1+r)*N;
		   }
			 sum=N*money;
			 System.out.println("复利终值为："+sum);

	}

}
