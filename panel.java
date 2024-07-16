package practice1;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.BoxLayout;

public class panel {
	public static void main(String args[]) {
		Frame frame = new Frame();

		frame.setLayout(new BorderLayout());

		Panel pLeft = new Panel();
		pLeft.setBackground(Color.RED);
		frame.add(pLeft, BorderLayout.WEST);

		pLeft.setLayout(new BoxLayout(pLeft, BoxLayout.Y_AXIS));

		Button btnLeft = new Button("Click");
		pLeft.add(btnLeft);
		btnLeft.setPreferredSize(new Dimension(250, 30));
		Panel pRight = new Panel();

		pLeft.setBackground(Color.GREEN);
		frame.add(pRight, BorderLayout.SOUTH);

		Label lblRight = new Label("Click");
		lblRight.setPreferredSize(new Dimension(250, 30));
		pRight.setLayout(new BoxLayout(pRight, BoxLayout.Y_AXIS));

		pRight.add(btnLeft);

		frame.setSize(500, 500);
		frame.setVisible(true);

		frame.addWindowListener(new WindowListener() {

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
			}

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}
		});
	}

}
