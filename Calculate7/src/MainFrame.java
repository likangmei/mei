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
	//��ѡ��ť
	private JRadioButton jRadioButton0;
	private JRadioButton jRadioButton1;
	private JRadioButton jRadioButton2;
	private JRadioButton jRadioButton3;
	private JRadioButton jRadioButton4;
	private JRadioButton jRadioButton5;
	private JRadioButton jRadioButton6;
	//��ǩ
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel0;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JLabel jLabel7;
	//�����
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
			jLabel7.setText("����������");
		}
		return jLabel7;
	}

	private JRadioButton getJRadioButton6() {
		if (jRadioButton6 == null) {
			jRadioButton6 = new JRadioButton();
			jRadioButton6.setText("������");
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
			jRadioButton5.setText("�ʲ���ֵ");
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
			jRadioButton4.setText("����");
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
			jRadioButton3.setText("����");
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
			jLabel6.setText("���д��");
		}
		return jLabel6;
	}

	private JLabel getJLabel5() {
		if (jLabel5 == null) {
			jLabel5 = new JLabel();
			jLabel5.setText("��ƱͶ�ʣ�");
		}
		return jLabel5;
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setText("������������");
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
			jLabel4.setText("����");
		}
		return jLabel4;
	}

	private JLabel getJLabel3() {
		if (jLabel3 == null) {
			jLabel3 = new JLabel();
			jLabel3.setText("��ֵ��");
		}
		return jLabel3;
	}

	private JLabel getJLabel2() {
		if (jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setText("���ʣ�");
		}
		return jLabel2;
	}

	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("���ޣ�");
		}
		return jLabel1;
	}

	private JRadioButton getJRadioButton2() {
		if (jRadioButton2 == null) {
			jRadioButton2 = new JRadioButton();
			jRadioButton2.setText("����");
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
			jRadioButton1.setText("��������");
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
			jRadioButton0.setText("��������");
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
	
	private void jRadioButton0MouseMouseClicked(MouseEvent event) {//��������
		float ����=(float)Double.parseDouble(getJTextField0().getText());
	    float ����=(float)Double.parseDouble(getJTextField1().getText());
	    float ����=(float)Double.parseDouble(getJTextField2().getText());
	 float ��ֵ=(float)(����*Math.pow(����+1, ����));
	JOptionPane.showMessageDialog(jRadioButton0,"������ֵΪ��"+��ֵ,"������",JOptionPane.INFORMATION_MESSAGE);
  }
   private void jRadioButton1MouseMouseClicked(MouseEvent event) {//��������
	   float ����=(float)Double.parseDouble(getJTextField0().getText());
	   float ����=(float)Double.parseDouble(getJTextField1().getText());
	   float ����=(float)Double.parseDouble(getJTextField2().getText());
	   float ��ֵ=(float)(����+����*����*����);
	JOptionPane.showMessageDialog(jRadioButton0,"������ֵΪ��"+��ֵ,"������",JOptionPane.INFORMATION_MESSAGE);
  }

private void jRadioButton2MouseMouseClicked(MouseEvent event) {//����
	    float ����=(float)Double.parseDouble(getJTextField1().getText());
	    float ����=(float)Double.parseDouble(getJTextField2().getText());
	    float ��ֵ=(float)Double.parseDouble(getJTextField3().getText());	  
	float ����=(float)(��ֵ/Math.pow(����+1, ����));
	JOptionPane.showMessageDialog(jRadioButton0,"����Ϊ��"+����,"������",JOptionPane.INFORMATION_MESSAGE);
}

private void jRadioButton3MouseMouseClicked(MouseEvent event) {//����
	    float ����=(float)Double.parseDouble(getJTextField0().getText());
	    float ����=(float)Double.parseDouble(getJTextField2().getText());
	    float ��ֵ=(float)Double.parseDouble(getJTextField3().getText());	  
	float ����=(float)((Math.log(��ֵ)/Math.log(1+����))-(Math.log(����)/Math.log(1+����)));
	JOptionPane.showMessageDialog(jRadioButton0,"����Ϊ��"+����,"������",JOptionPane.INFORMATION_MESSAGE);
}

private void jRadioButton4MouseMouseClicked(MouseEvent event) {//����
	    float ����=(float)Double.parseDouble(getJTextField0().getText());
	    float ����=(float)Double.parseDouble(getJTextField1().getText());
	    float ��ֵ=(float)Double.parseDouble(getJTextField3().getText());	  
	float ����=(float)(Math.pow(��ֵ/����,1d/���� )-1);
	JOptionPane.showMessageDialog(jRadioButton0,"����Ϊ��"+����,"������",JOptionPane.INFORMATION_MESSAGE);
}

private void jRadioButton5MouseMouseClicked(MouseEvent event) {//�ʲ���ֵ
	    float ����=(float)Double.parseDouble(getJTextField0().getText());
	    float ����=(float)Double.parseDouble(getJTextField1().getText());
	    float ����=(float)Double.parseDouble(getJTextField2().getText());
	float ��ֵ1=(float)(����*12*(����*(����/12)+����));
	float ��ֵ2=(float)(����*(Math.pow(1+����,����)-1)/����);
	JOptionPane.showMessageDialog(jRadioButton0,"��Ͷ�ʱ���ÿ�¹̶����䣬�����õ����ʲ���ֵΪ��\n"+��ֵ1+"����������Ͷ�ʣ������õ����ʲ���ֵΪ��\n"+��ֵ2,"������",JOptionPane.INFORMATION_MESSAGE);
}

private void jRadioButton6MouseMouseClicked(MouseEvent event) {//ÿ�µȶ����
	float ����=(float)Double.parseDouble(getJTextField0().getText());
	float ����=(float)Double.parseDouble(getJTextField1().getText());
	float ����=(float)Double.parseDouble(getJTextField2().getText());	  
	float ������=����/12;
	float ��������=����*12;
     float ��ֵ=(float)(����*������*Math.pow(1+������,��������)/(Math.pow(1+������,��������)-1));	
    JOptionPane.showMessageDialog(jRadioButton0,"ÿ�µȶ����Ϊ��"+��ֵ,"������",JOptionPane.INFORMATION_MESSAGE);
}   
public boolean Input(float ����,float ����,double ����,float ��ֵ) {//�ж��û��������Ƿ���ȷ
	// TODO �Զ����ɵķ������
	if(����<=0)
	{
		System.out.print("������>0�ı���\n");
		 return false;
	}
	else if(����<=0)
	{
		System.out.print("������>0�Ĵ�Ǯ����\n");
		 return false;
	}
	else if(����<=0)
	{
		System.out.print("������>0������\n");
		 return false;
	}
	else if(����>1)
	{
		System.out.print("������<1������\n");
		 return false;
	}
	else if(��ֵ<=0)
	{
		System.out.print("������>0����ֵ");
		 return false;
	}
	else
		return true;
}
}
