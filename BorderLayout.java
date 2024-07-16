package practice1;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class BorderLayout {

	public static void main(String[] args) {
		Frame frame = new Frame("BorderLayout");
		frame.setLayout(new java.awt.BorderLayout());

		Button btn = new Button("North");
		frame.add(btn, java.awt.BorderLayout.NORTH);

		Button btn1 = new Button("South");
		frame.add(btn1, java.awt.BorderLayout.SOUTH);

		Button btn2 = new Button("WEST");
		frame.add(btn2, java.awt.BorderLayout.WEST);

		Button btn3 = new Button("CENTER");
		frame.add(btn3, java.awt.BorderLayout.CENTER);

		Button btn4 = new Button("EAST");
		frame.add(btn4, java.awt.BorderLayout.EAST);

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
				frame.dispose();// frame ko window lai close garnaa ko lagi tyo cross aathauda close huna paryo

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
