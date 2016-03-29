import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCalculate5 {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test0() {//测单利终值
		double money=1000000.0;
		int years=30;
		double r=0.03;
		double sum;
		sum = money + money * years * r;
		 Assert.assertEquals(1900000,sum, 1.0);
	}
	@Test
	public void test1(){//测复利终值
		double money=1000000.0;
		int years=30;
		double r=0.03;
		double N=1;
		double sum;
		for (int i = 1; i <= years; i++) {
            N = (1 + r) * N;
        }
        sum = N * money;
        Assert.assertEquals(2427262,sum, 1.0);
	}
	@Test
    public void test2(){//测本金
    	 double N = 1, money;
    	 double sum=3000000;
    	 int years=30;
    	 double r=0.03;
    	 for (int i = 1; i <= years; i++) {
             N = (1 + r) * N;
         }
         money = sum / N;
         Assert.assertEquals(1235960,money, 1.0);
	}
	@Test
    public void testInput0(){//合法输入
		Calculate5 a = new Calculate5();
		boolean result = a.Input(1000000, 30, 0.03);
		Assert.assertEquals(true,result);		
	}
	@Test
    public void testInput1(){//非法输入，本金是负数
		Calculate5 a = new Calculate5();
		boolean result = a.Input(-1000000, 30, 0.03);
		Assert.assertEquals(false,result);	
	}
	@Test
    public void testInput2(){//非法输入，存钱年数是负数
		Calculate5 a = new Calculate5();
		boolean result = a.Input(1000000, -30, 0.03);
		Assert.assertEquals(false,result);	
	}
	@Test
    public void testInput3(){//非法输入，利率是负数
		Calculate5 a = new Calculate5();
		boolean result = a.Input(1000000, 30, -0.03);
		Assert.assertEquals(false,result);	
	}
	@Test
    public void testInput4(){//非法输入，利率大于一
		Calculate5 a = new Calculate5();
		boolean result = a.Input(1000000, 30, 3);
		Assert.assertEquals(false,result);	
	}
}
