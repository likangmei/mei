package investment;

import java.util.Scanner;

public class investment {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner scanner = new Scanner(System.in); 
		double sum,a ,b ,c;
        System.out.print("�����뱾��");
	    double money = scanner.nextDouble();
	    System.out.print("���������ʣ�");
        double r = scanner.nextDouble();
        System.out.print("�������Ǯ������");
        int years = scanner.nextInt();        
        System.out.println("��ƱͶ�ʣ�");
        a=money*0.25; //��25%�ı�����ÿ�¹̶���ƱͶ��
        sum=years*12*(a*(r/12)+a);
        System.out.println("����25%�ı���Ͷ�ʹ�Ʊ������ÿ�¹̶����䣬�����õ����ʲ���ֵΪ��" + sum);
        b=money*0.35;//��35%�ı���������������ƱͶ��
        sum=0;
        sum=b*(Math.pow(1+r,years)-1)/r;
        System.out.println("����35%�ı�����������Ͷ�ʹ�Ʊ�������õ����ʲ���ֵΪ��" + sum);
        c=money*0.4;//��40%�ı�����ծȯͶ��       
        sum=0;
        System.out.println("ծȯͶ�ʣ�");
        sum=c*r*years;
        System.out.println("����40%�ı�����ծȯͶ�ʣ������õ����ʲ���ֵΪ��"+sum);       
	}
}
