import java.util.Scanner;

public class Calculate5 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner scanner = new Scanner(System.in);
        System.out.println("���������������㸴���͵�����ֵ�밴1,���㱾���밴2����ƱͶ�ʣ�����ʱ���밴3�����㱨�����밴4�������ʲ���ֵ�밴5;"
         + "���д�������µȶ�����밴6" );
        int num=scanner.nextInt(); 	        	
        if (num == 1) {
            double N = 1, sum;
            System.out.print("�����뱾��");
            double money = scanner.nextDouble();
            System.out.print("�������Ǯ������");
            int years = scanner.nextInt();
            System.out.print("���������ʣ�");
            double r = scanner.nextDouble();
            sum = money + money * years * r;
            System.out.println("������ֵΪ��" + sum);
            sum = 0;
            for (int i = 1; i <= years; i++) {
                N = (1 + r) * N;
            }
            sum = N * money;
            System.out.println("������ֵΪ��" + sum);

        }
        if (num == 2) {
            double N = 1, money;
            System.out.print("�����븴����ֵ��");
            double sum = scanner.nextDouble();
            System.out.print("�������Ǯ������");
            int years = scanner.nextInt();
            System.out.print("���������ʣ�");
            double r = scanner.nextDouble();
            for (int i = 1; i <= years; i++) {
                N = (1 + r) * N;
            }
            money = sum / N;
            System.out.println("ӦͶ��ı���Ϊ��" + money);
        }
        if (num == 3) {
            double years;
            System.out.print("�����뱾��");
            double money = scanner.nextDouble();
            System.out.print("���������õ��ʲ���ֵ��");
            double sum = scanner.nextDouble();
            System.out.print("���������ʣ�");
            double r = scanner.nextDouble();        
           years=((Math.log(sum)/Math.log(1+r))-(Math.log(money)/Math.log(1+r)));
            System.out.println("ʱ��Ϊ���꣩��" + years);
        }
        if (num == 4) {
            double r,N;
            System.out.print("�����뱾��");
            double money = scanner.nextDouble();
            System.out.print("���������õ��ʲ���ֵ��");
            double sum = scanner.nextDouble();
            System.out.print("�������Ǯ������");
            int years = scanner.nextInt();
            N=Math.pow(sum/money, 1d/years);//1d�ǿ����ţ�û��1d���Ƕ��ٴη�
            r=N-1;
            System.out.println("����Ϊ��" + r);
        }
        if (num == 5){
            double sum;
            System.out.print("�����뱾��");
            double money = scanner.nextDouble();
            System.out.print("���������ʣ�");
            double r = scanner.nextDouble();
            System.out.print("�������Ǯ������");
            int years = scanner.nextInt();
            sum=years*12*(money*(r/12)+money);
            System.out.println("��Ͷ�ʱ���ÿ�¹̶����䣬�����õ����ʲ���ֵΪ��" + sum);
            sum=0;
            sum=money*(Math.pow(1+r,years)-1)/r;
            System.out.println("����������Ͷ�ʣ������õ����ʲ���ֵΪ��" + sum);
        }
       if(num==6){
    	   double sum,k;
    	   int month;
    	   System.out.print("�����뱾��");
           double money = scanner.nextDouble();
           System.out.print("�����������ʣ�");
           double r = scanner.nextDouble();
           System.out.print("���������������");
           int years = scanner.nextInt();
           k=r/12;//kΪ������
           month=years*12;//monthΪ��������
           sum=money*k*Math.pow(1+k, month)/(Math.pow(1+k,month)-1);
           System.out.println("ÿ�µȶ����Ϊ��"+sum);
       }
       if(num<1||num>6){
    	   System.out.println("������������������");
        }
	}

	public boolean Input(double money, int years, double r) {
		// TODO �Զ����ɵķ������
		if(money<=0)
		{
			System.out.print("������>0�ı���\n");
			 return false;
		}
		else if(years<=0)
		{
			System.out.print("������>0�Ĵ�Ǯ����\n");
			 return false;
		}
		else if(r<=0)
		{
			System.out.print("������>0������\n");
			 return false;
		}
		else if(r>1)
		{
			System.out.print("������<1������");
			 return false;
		}
		else
			return true;
	}
}
