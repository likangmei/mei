import java.util.Scanner;

public class calculate4 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner scanner = new Scanner(System.in);
	    System.out.println("���������������㸴���͵�����ֵ�밴1,���㱾���밴2����ƱͶ�ʣ�����ʱ���밴3�����㱨�����밴4�������ʲ���ֵ�밴5" );
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
			years = sum / (money * r);
			System.out.println("ʱ��Ϊ���꣩��" + years);
		}
		if (num == 4) {
			double r;
			System.out.print("�����뱾��");
			double money = scanner.nextDouble();
			System.out.print("���������õ��ʲ���ֵ��");
			double sum = scanner.nextDouble();
			System.out.print("�������Ǯ������");
			int years = scanner.nextInt();
			r=sum/(money*years);
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
			sum=money*r*years;
			System.out.println("��Ͷ�ʱ���ÿ��̶����䣬�����õ����ʲ���ֵΪ��" + sum);
			sum=0;
			for(int i=1;i<=years;i++){
				sum=money*r*1;
				money=sum;				
			}
			System.out.println("����������Ͷ�ʣ������õ����ʲ���ֵΪ��" + sum);
		}
	}
}
