
import javax.swing.JFrame;

public class MainApp extends JFrame {
	private static final long serialVersionUID = 1L;

	MainApp() {
		
		this.getContentPane().setLayout(null);
		this.setTitle("Find Customer");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(640, 650);
		this.setLocation(100, 100);
		this.setResizable(false);
		
		this.getContentPane().add(new Credits());
		this.getContentPane().add(new StopSearching());
		this.getContentPane().add(new SearchString());
		this.getContentPane().add(new MessagePane());
		
		new throwMessage<String>("���A�s�P�ʂł̌ڋq��T���܂��B\n�s���w�肷��ۂɂ͌������ʂ̐��x���グ�邽�߁A���̎w������Ă��������B\n" + 
				"��������O�Ɉ�xGoogle Map�Ŗ]�ނ悤�Ȍ��ʂ��Ԃ��Ă��邱�Ƃ��m�F���Ă���A�����J�n���邱�Ƃ������������܂��B");
		
	
		this.setVisible(true);
	}
	
	public static void main(String argv[]){
		new MainApp();
	}
}
