package calculation2;

import java.util.Scanner;

public class calculation3 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		 double N=1,money;
		  Scanner scanner=new Scanner(System.in);
		  System.out.print("�����븴����ֵ��");	 
		  double sum = scanner.nextDouble();  
		  System.out.print("�������Ǯ������");
		  int years = scanner.nextInt();		   
		 System.out.print("���������ʣ�");
		  double r = scanner.nextDouble();
		  for(int i=1;i<=years;i++){
			   N=(1+r)*N;
		   }
			 money=sum/N;
			 System.out.println("ӦͶ��ı���Ϊ��"+money);
	}

}
