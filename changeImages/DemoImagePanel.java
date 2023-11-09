package changeImages;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class DemoImagePanel extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ImagePanel imagesPanel;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoImagePanel frame = new DemoImagePanel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DemoImagePanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
	
		
		
		imagesPanel = new ImagePanel();
		contentPane.add(imagesPanel, BorderLayout.CENTER);
		imagesPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel controlPanel = createControlPanel();
		imagesPanel.add(controlPanel, BorderLayout.SOUTH);
	}

	private JPanel createControlPanel() {
		JPanel controlPanel = new JPanel();
		
		JRadioButton rdbtnChangeColor = new JRadioButton("change color");
		buttonGroup.add(rdbtnChangeColor);
		rdbtnChangeColor.setSelected(true);
		controlPanel.add(rdbtnChangeColor);
		
		JRadioButton rdbtnMove = new JRadioButton("move");
		buttonGroup.add(rdbtnMove);
		controlPanel.add(rdbtnMove);
		
		JButton btnGo = new JButton("GO");
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (rdbtnChangeColor.isSelected())
				    imagesPanel.changeColor();
				
				if(rdbtnMove.isSelected())
				imagesPanel.move();
			}
		});
		controlPanel.add(btnGo);
		return controlPanel;
	}

}
