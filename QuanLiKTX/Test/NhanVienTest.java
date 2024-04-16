package Test;

import javax.swing.UIManager;
import View.DangNhapViews;

public class NhanVienTest {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new DangNhapViews();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
