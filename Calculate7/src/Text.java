import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Text {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {//测复利计算公式
		float 本金=1000000;
		double 利率=0.03;
		float 期限=30;
		float 终值;
		终值=(float)(本金*Math.pow(利率+1, 期限));
		Assert.assertEquals(2427262,终值,1.0);	
	}
	@Test
    public void testInput0(){//合法输入
		MainFrame a = new MainFrame();
		boolean result = a.Input(1000000, 30, 0.03,2000000);
		Assert.assertEquals(true,result);		
	}
	@Test
    public void testInput1(){//非法输入，本金是负数
		MainFrame a = new MainFrame();
		boolean result = a.Input(-1000000, 30, 0.03,2000000);
		Assert.assertEquals(false,result);	
	}
	@Test
    public void testInput2(){//非法输入，存钱年数是负数
		MainFrame a = new MainFrame();
		boolean result = a.Input(1000000, -30, 0.03,2000000);
		Assert.assertEquals(false,result);	
	}
	@Test
    public void testInput3(){//非法输入，利率是负数
		MainFrame a = new MainFrame();
		boolean result = a.Input(1000000, 30, -0.03,2000000);
		Assert.assertEquals(false,result);	
	}
	@Test
    public void testInput4(){//非法输入，利率大于一
		MainFrame a = new MainFrame();
		boolean result = a.Input(1000000, 30, 3,2000000);
		Assert.assertEquals(false,result);	
	}
	@Test
    public void testInput5(){//非法输入，终值是负数
		MainFrame a = new MainFrame();
		boolean result = a.Input(1000000, 30, 0.03,-2000000);
		Assert.assertEquals(false,result);	
	}
}
