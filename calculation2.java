package calculation2;

import java.util.Scanner;

public class calculation2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		  double N=1,sum;
		  Scanner scanner=new Scanner(System.in);
		  System.out.print("�����뱾��");	 
		  double money = scanner.nextDouble();  
		  System.out.print("�������Ǯ������");
		  int years = scanner.nextInt();		   
		 System.out.print("���������ʣ�");
		  double r = scanner.nextDouble();
		sum=money+money*years*r;
		System.out.println("������ֵΪ��"+sum);
		sum=0;
		 for(int i=1;i<=years;i++){
			   N=(1+r)*N;
		   }
			 sum=N*money;
			 System.out.println("������ֵΪ��"+sum);

	}

}
