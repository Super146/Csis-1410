package counter;
/*
 * SU Man
 * Csis 1410
 */
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import java.util.Random;

public class Counter extends JFrame {
	
	/*
	 * create the variable need for color and indeed to finish a project.
	 */
    private Color[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE, Color.MAGENTA};
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private int count;
    private final Random rand = new Random();
    private int currentColor;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Counter frame = new Counter();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Counter() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 200);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));
        count = 0;

        JButton btnClickMe = createClickMeButton(); // Updated method name
        contentPane.add(btnClickMe, BorderLayout.CENTER);

        JLabel lblRedCounter = createRedCounterLabel(); // Updated method name
        contentPane.add(lblRedCounter, BorderLayout.WEST);

        JLabel lblSu = createSuLabel(); // Updated method name
        contentPane.add(lblSu, BorderLayout.SOUTH);

        currentColor = rand.nextInt(5);
        btnClickMe.setBackground(colors[currentColor]);
    }
    
    
    /*
     * create the SuLabe GUi
     */
    private JLabel createSuLabel() {
        JLabel lblSu = new JLabel("Su GUI");
        lblSu.setFont(new Font("Arial", Font.PLAIN, 14));
        lblSu.setOpaque(true);
        lblSu.setBackground(Color.LIGHT_GRAY);
        lblSu.setBorder(new EmptyBorder(10, 0, 10, 0));
        lblSu.setHorizontalAlignment(SwingConstants.CENTER);
        return lblSu;
    }
    	
    /*
     * create RedCounterLabel
     */
    private JLabel createRedCounterLabel() {
    	JLabel lblRedCounter = new JLabel("Red Counter: " + String.format("%02d", count));
        lblRedCounter.setHorizontalAlignment(SwingConstants.CENTER);
        lblRedCounter.setOpaque(true);
        lblRedCounter.setBackground(Color.GRAY);
        lblRedCounter.setFont(new Font("Arial", Font.ITALIC, 25));
        lblRedCounter.setPreferredSize(new Dimension(235, 14));
        return lblRedCounter;
    }
    	
    
    	/*
    	 * create the clickMeButton and actionListerner to handle click me.
    	 */
    private JButton createClickMeButton() {
        JButton btnClickMe = new JButton("Click Me");
        btnClickMe.setBackground(colors[currentColor]);
        btnClickMe.setBorderPainted(false);
        btnClickMe.setFont(new Font("Arial", Font.PLAIN, 40));
        btnClickMe.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int newColor;
                do {
                    newColor = rand.nextInt(5);
                } while (newColor == currentColor);

                currentColor = newColor;
                btnClickMe.setBackground(colors[currentColor]);

                if (colors[currentColor] == Color.RED) {
                    count++;
                   
                }
                updateRedCounterLabel();
            }
        });
        return btnClickMe;
    }
    
    /*
     * update the redCounter label with the current count 
     * and refreshes display
     */

    private void updateRedCounterLabel() {
        JLabel lblRedCounter = createRedCounterLabel();
        contentPane.add(lblRedCounter, BorderLayout.WEST);
        contentPane.revalidate();
    }
}
