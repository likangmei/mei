import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Text {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {//�⸴�����㹫ʽ
		float ����=1000000;
		double ����=0.03;
		float ����=30;
		float ��ֵ;
		��ֵ=(float)(����*Math.pow(����+1, ����));
		Assert.assertEquals(2427262,��ֵ,1.0);	
	}
	@Test
    public void testInput0(){//�Ϸ�����
		MainFrame a = new MainFrame();
		boolean result = a.Input(1000000, 30, 0.03,2000000);
		Assert.assertEquals(true,result);		
	}
	@Test
    public void testInput1(){//�Ƿ����룬�����Ǹ���
		MainFrame a = new MainFrame();
		boolean result = a.Input(-1000000, 30, 0.03,2000000);
		Assert.assertEquals(false,result);	
	}
	@Test
    public void testInput2(){//�Ƿ����룬��Ǯ�����Ǹ���
		MainFrame a = new MainFrame();
		boolean result = a.Input(1000000, -30, 0.03,2000000);
		Assert.assertEquals(false,result);	
	}
	@Test
    public void testInput3(){//�Ƿ����룬�����Ǹ���
		MainFrame a = new MainFrame();
		boolean result = a.Input(1000000, 30, -0.03,2000000);
		Assert.assertEquals(false,result);	
	}
	@Test
    public void testInput4(){//�Ƿ����룬���ʴ���һ
		MainFrame a = new MainFrame();
		boolean result = a.Input(1000000, 30, 3,2000000);
		Assert.assertEquals(false,result);	
	}
	@Test
    public void testInput5(){//�Ƿ����룬��ֵ�Ǹ���
		MainFrame a = new MainFrame();
		boolean result = a.Input(1000000, 30, 0.03,-2000000);
		Assert.assertEquals(false,result);	
	}
}
