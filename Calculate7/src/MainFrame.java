import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

//VS4E -- DO NOT REMOVE THIS LINE!
public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	//单选按钮
	private JRadioButton jRadioButton0;
	private JRadioButton jRadioButton1;
	private JRadioButton jRadioButton2;
	private JRadioButton jRadioButton3;
	private JRadioButton jRadioButton4;
	private JRadioButton jRadioButton5;
	private JRadioButton jRadioButton6;
	//标签
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel0;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JLabel jLabel7;
	//输入框
	private JTextField jTextField0;
	private JTextField jTextField1;
	private JTextField jTextField2;
	private JTextField jTextField3;	
	public MainFrame() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getJLabel1(), new Constraints(new Leading(15, 10, 10), new Leading(85, 10, 10)));
		add(getJLabel4(), new Constraints(new Leading(15, 12, 12), new Leading(49, 12, 12)));
		add(getJLabel2(), new Constraints(new Leading(15, 12, 12), new Leading(121, 12, 12)));
		add(getJLabel3(), new Constraints(new Leading(15, 12, 12), new Leading(153, 10, 10)));
		add(getJTextField0(), new Constraints(new Leading(57, 163, 10, 10), new Leading(47, 12, 12)));
		add(getJTextField1(), new Constraints(new Leading(57, 100, 12, 12), new Leading(81, 12, 12)));
		add(getJTextField2(), new Constraints(new Leading(57, 100, 12, 12), new Leading(119, 12, 12)));
		add(getJTextField3(), new Constraints(new Leading(57, 162, 12, 12), new Leading(153, 12, 12)));
		add(getJLabel0(), new Constraints(new Leading(19, 12, 12), new Leading(195, 10, 10)));
		add(getJRadioButton0(), new Constraints(new Leading(107, 10, 10), new Leading(191, 12, 12)));
		add(getJRadioButton1(), new Constraints(new Leading(202, 12, 12), new Leading(191, 12, 12)));
		add(getJRadioButton2(), new Constraints(new Leading(288, 10, 10), new Leading(191, 12, 12)));
		add(getJRadioButton5(), new Constraints(new Leading(288, 12, 12), new Leading(223, 12, 12)));
		add(getJRadioButton4(), new Constraints(new Leading(205, 10, 10), new Leading(225, 12, 12)));
		add(getJRadioButton3(), new Constraints(new Leading(109, 10, 10), new Leading(225, 12, 12)));
		add(getJLabel5(), new Constraints(new Leading(19, 12, 12), new Leading(229, 12, 12)));
		add(getJLabel6(), new Constraints(new Leading(19, 12, 12), new Leading(261, 12, 12)));
		add(getJRadioButton6(), new Constraints(new Leading(109, 12, 12), new Leading(259, 12, 12)));
		add(getJLabel7(), new Constraints(new Leading(161, 68, 10, 10), new Leading(9, 10, 10)));
		ButtonGroup b=new ButtonGroup();
		b.add(jRadioButton0);
		b.add(jRadioButton1);
		b.add(jRadioButton2);
		b.add(jRadioButton3);
		b.add(jRadioButton4);
		b.add(jRadioButton5);
		b.add(jRadioButton6);
		setSize(398, 299);
	}

	private JLabel getJLabel7() {
		if (jLabel7 == null) {
			jLabel7 = new JLabel();
			jLabel7.setText("复利计算器");
		}
		return jLabel7;
	}

	private JRadioButton getJRadioButton6() {
		if (jRadioButton6 == null) {
			jRadioButton6 = new JRadioButton();
			jRadioButton6.setText("还款金额");
			jRadioButton6.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					jRadioButton6MouseMouseClicked(event);
				}
			});
		}
		return jRadioButton6;
	}

	private JRadioButton getJRadioButton5() {
		if (jRadioButton5 == null) {
			jRadioButton5 = new JRadioButton();
			jRadioButton5.setText("资产总值");
			jRadioButton5.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					jRadioButton5MouseMouseClicked(event);
				}
			});
		}
		return jRadioButton5;
	}

	private JRadioButton getJRadioButton4() {
		if (jRadioButton4 == null) {
			jRadioButton4 = new JRadioButton();
			jRadioButton4.setText("利率");
			jRadioButton4.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					jRadioButton4MouseMouseClicked(event);
				}
			});
		}
		return jRadioButton4;
	}

	private JRadioButton getJRadioButton3() {
		if (jRadioButton3 == null) {
			jRadioButton3 = new JRadioButton();
			jRadioButton3.setText("期限");
			jRadioButton3.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					jRadioButton3MouseMouseClicked(event);
				}
			});
		}
		return jRadioButton3;
	}

	private JLabel getJLabel6() {
		if (jLabel6 == null) {
			jLabel6 = new JLabel();
			jLabel6.setText("银行贷款：");
		}
		return jLabel6;
	}

	private JLabel getJLabel5() {
		if (jLabel5 == null) {
			jLabel5 = new JLabel();
			jLabel5.setText("股票投资：");
		}
		return jLabel5;
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setText("复利计算器：");
		}
		return jLabel0;
	}

	private JTextField getJTextField3() {
		if (jTextField3 == null) {
			jTextField3 = new JTextField();
			jTextField3.setText("0");
		}
		return jTextField3;
	}

	private JTextField getJTextField2() {
		if (jTextField2 == null) {
			jTextField2 = new JTextField();
			jTextField2.setText("0");
		}
		return jTextField2;
	}

	private JTextField getJTextField1() {
		if (jTextField1 == null) {
			jTextField1 = new JTextField();
			jTextField1.setText("0");
		}
		return jTextField1;
	}

	private JTextField getJTextField0() {
		if (jTextField0 == null) {
			jTextField0 = new JTextField();
			jTextField0.setText("0");
		}
		return jTextField0;
	}

	private JLabel getJLabel4() {
		if (jLabel4 == null) {
			jLabel4 = new JLabel();
			jLabel4.setText("本金：");
		}
		return jLabel4;
	}

	private JLabel getJLabel3() {
		if (jLabel3 == null) {
			jLabel3 = new JLabel();
			jLabel3.setText("终值：");
		}
		return jLabel3;
	}

	private JLabel getJLabel2() {
		if (jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setText("利率：");
		}
		return jLabel2;
	}

	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("期限：");
		}
		return jLabel1;
	}

	private JRadioButton getJRadioButton2() {
		if (jRadioButton2 == null) {
			jRadioButton2 = new JRadioButton();
			jRadioButton2.setText("本金");
			jRadioButton2.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					jRadioButton2MouseMouseClicked(event);
				}
			});
		}
		return jRadioButton2;
	}

	private JRadioButton getJRadioButton1() {
		if (jRadioButton1 == null) {
			jRadioButton1 = new JRadioButton();
			jRadioButton1.setText("单利计算");
			jRadioButton1.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					jRadioButton1MouseMouseClicked(event);
				}
			});
		}
		return jRadioButton1;
	}

	private JRadioButton getJRadioButton0() {
		if (jRadioButton0 == null) {
			jRadioButton0 = new JRadioButton();
			jRadioButton0.setText("复利计算");
			jRadioButton0.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					jRadioButton0MouseMouseClicked(event);
				}
			});
		}
		return jRadioButton0;
	}

	private static void installLnF() {
		try {
			String lnfClassname = PREFERRED_LOOK_AND_FEEL;
			if (lnfClassname == null)
				lnfClassname = UIManager.getCrossPlatformLookAndFeelClassName();
			UIManager.setLookAndFeel(lnfClassname);
		} catch (Exception e) {
			System.err.println("Cannot install " + PREFERRED_LOOK_AND_FEEL + " on this platform:" + e.getMessage());
		}
	}

	public static void main(String[] args) {
		installLnF();
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MainFrame frame = new MainFrame();
				frame.setDefaultCloseOperation(MainFrame.EXIT_ON_CLOSE);
				frame.setTitle("MainFrame");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
		
	}
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";
	
	private void jRadioButton0MouseMouseClicked(MouseEvent event) {//复利计算
		float 本金=(float)Double.parseDouble(getJTextField0().getText());
	    float 期限=(float)Double.parseDouble(getJTextField1().getText());
	    float 利率=(float)Double.parseDouble(getJTextField2().getText());
	 float 终值=(float)(本金*Math.pow(利率+1, 期限));
	JOptionPane.showMessageDialog(jRadioButton0,"复利终值为："+终值,"计算结果",JOptionPane.INFORMATION_MESSAGE);
  }
   private void jRadioButton1MouseMouseClicked(MouseEvent event) {//单利计算
	   float 本金=(float)Double.parseDouble(getJTextField0().getText());
	   float 期限=(float)Double.parseDouble(getJTextField1().getText());
	   float 利率=(float)Double.parseDouble(getJTextField2().getText());
	   float 终值=(float)(本金+本金*期限*利率);
	JOptionPane.showMessageDialog(jRadioButton0,"单利终值为："+终值,"计算结果",JOptionPane.INFORMATION_MESSAGE);
  }

private void jRadioButton2MouseMouseClicked(MouseEvent event) {//本金
	    float 期限=(float)Double.parseDouble(getJTextField1().getText());
	    float 利率=(float)Double.parseDouble(getJTextField2().getText());
	    float 终值=(float)Double.parseDouble(getJTextField3().getText());	  
	float 本金=(float)(终值/Math.pow(利率+1, 期限));
	JOptionPane.showMessageDialog(jRadioButton0,"本金为："+本金,"计算结果",JOptionPane.INFORMATION_MESSAGE);
}

private void jRadioButton3MouseMouseClicked(MouseEvent event) {//期限
	    float 本金=(float)Double.parseDouble(getJTextField0().getText());
	    float 利率=(float)Double.parseDouble(getJTextField2().getText());
	    float 终值=(float)Double.parseDouble(getJTextField3().getText());	  
	float 期限=(float)((Math.log(终值)/Math.log(1+利率))-(Math.log(本金)/Math.log(1+利率)));
	JOptionPane.showMessageDialog(jRadioButton0,"期限为："+期限,"计算结果",JOptionPane.INFORMATION_MESSAGE);
}

private void jRadioButton4MouseMouseClicked(MouseEvent event) {//利率
	    float 本金=(float)Double.parseDouble(getJTextField0().getText());
	    float 期限=(float)Double.parseDouble(getJTextField1().getText());
	    float 终值=(float)Double.parseDouble(getJTextField3().getText());	  
	float 利率=(float)(Math.pow(终值/本金,1d/期限 )-1);
	JOptionPane.showMessageDialog(jRadioButton0,"利率为："+利率,"计算结果",JOptionPane.INFORMATION_MESSAGE);
}

private void jRadioButton5MouseMouseClicked(MouseEvent event) {//资产总值
	    float 本金=(float)Double.parseDouble(getJTextField0().getText());
	    float 期限=(float)Double.parseDouble(getJTextField1().getText());
	    float 利率=(float)Double.parseDouble(getJTextField2().getText());
	float 终值1=(float)(期限*12*(本金*(利率/12)+本金));
	float 终值2=(float)(本金*(Math.pow(1+利率,期限)-1)/利率);
	JOptionPane.showMessageDialog(jRadioButton0,"若投资本金每月固定不变，则最后得到的资产总值为：\n"+终值1+"若连本带利投资，则最后得到的资产总值为：\n"+终值2,"计算结果",JOptionPane.INFORMATION_MESSAGE);
}

private void jRadioButton6MouseMouseClicked(MouseEvent event) {//每月等额还款金额
	float 本金=(float)Double.parseDouble(getJTextField0().getText());
	float 期限=(float)Double.parseDouble(getJTextField1().getText());
	float 利率=(float)Double.parseDouble(getJTextField2().getText());	  
	float 月利率=利率/12;
	float 贷款月数=期限*12;
     float 终值=(float)(本金*月利率*Math.pow(1+月利率,贷款月数)/(Math.pow(1+月利率,贷款月数)-1));	
    JOptionPane.showMessageDialog(jRadioButton0,"每月等额还款金额为："+终值,"计算结果",JOptionPane.INFORMATION_MESSAGE);
}   
public boolean Input(float 本金,float 期限,double 利率,float 终值) {//判断用户的输入是否正确
	// TODO 自动生成的方法存根
	if(本金<=0)
	{
		System.out.print("请输入>0的本金\n");
		 return false;
	}
	else if(期限<=0)
	{
		System.out.print("请输入>0的存钱年数\n");
		 return false;
	}
	else if(利率<=0)
	{
		System.out.print("请输入>0的利率\n");
		 return false;
	}
	else if(利率>1)
	{
		System.out.print("请输入<1的利率\n");
		 return false;
	}
	else if(终值<=0)
	{
		System.out.print("请输入>0的终值");
		 return false;
	}
	else
		return true;
}
}
