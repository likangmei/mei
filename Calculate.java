
public class Calculate {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		  double money = 1000;  //���� 
		  int years = 5;    //��Ǯ���� 
		  double sum = 0;  //����ܶ� 
		  double r = 0.05;   //���� 
		  double N=1;
		  for(int i=1;i<=years;i++){
			   N=(1+r)*N;
		  }
			 sum=N*money;
			 System.out.println("������ֵΪ��"+sum);	 
	}

}
