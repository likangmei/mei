
public class Calculate {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		  double money = 1000;  //本金 
		  int years = 5;    //存钱年数 
		  double sum = 0;  //存款总额 
		  double r = 0.05;   //利率 
		  double N=1;
		  for(int i=1;i<=years;i++){
			   N=(1+r)*N;
		  }
			 sum=N*money;
			 System.out.println("复利终值为："+sum);	 
	}

}
