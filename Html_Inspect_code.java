package swingByNonTelusko.advanceComponents;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Html_Inspect_code extends JFrame{
	
	JEditorPane pane;
	public Html_Inspect_code() {
		
		pane = new JEditorPane();
		pane.setContentType("text/plain");
		add(pane, BorderLayout.CENTER);
		setTitle("HTML EDITOR");
		
		JButton jButton = new JButton();
		jButton.setText("Show html view");
		add(jButton, BorderLayout.PAGE_END);
		
		JPanel  jPanel = new JPanel();
		jPanel.setBackground(Color.RED);
		jPanel.add(new JLabel("Write Your HTML code here"));
		jPanel.setSize(MAXIMIZED_HORIZ, 15);
		add(jPanel, BorderLayout.PAGE_START);
		
		add(jPanel, BorderLayout.PAGE_START);
		
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				display();
				
			}

		});
		
		setBounds(200, 100, 800, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	private void display() {
		
		JFrame jFrame = new JFrame();
		jFrame.setBounds(200, 200, 800, 500);
		jFrame.setVisible(true);
		setTitle("BROWSER VIEW");
//		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel  jPanel = new JPanel();
		jPanel.setBackground(Color.RED);
		jPanel.add(new JLabel("The Browser View of your HTML code"));
		jPanel.setSize(MAXIMIZED_HORIZ, 15);
		jFrame.add(jPanel, BorderLayout.PAGE_START);
		
		JEditorPane j = new JEditorPane();
		j.setContentType("text/html");
		j.setText(pane.getText());
		jFrame.add(j, BorderLayout.CENTER);
		JButton jButton = new JButton("Correct Html");
		jFrame.add(jButton, BorderLayout.PAGE_END);
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				pane.setText(j.getText());
				
			}
		});
		
	}

	public static void main(String[] args) {
		
		new Html_Inspect_code();

	}

}
