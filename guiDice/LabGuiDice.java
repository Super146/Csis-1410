package guiDice;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;


public class LabGuiDice extends JFrame {
    private static final long serialVersionUID = 1L;
   
    private JLabel dieImageLabel;
    private int lastRolledDie = -1; // To keep track of the last rolled die

    private static final String[] DICE_IMAGES = {
        "/Resource/die-1.png", "/Resource/die-2.png", "/Resource/die-3.png",
        "/Resource/die-4.png", "/Resource/die-5.png", "/Resource/die-6.png"
    };

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LabGuiDice frame = new LabGuiDice();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public LabGuiDice() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        // Initialize dieImageLabel 
        dieImageLabel = new JLabel();
        dieImageLabel.setFont(new Font("Tahoma", Font.PLAIN, 6));
        dieImageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        dieImageLabel.setIcon(new ImageIcon(LabGuiDice.class.getResource("/Resource/die-1.png")));

       
        // Create "Roll 'Em" button
        JButton btnRollEm = new JButton("Roll 'Em");
        btnRollEm.setBorderPainted(false);
        btnRollEm.setForeground(new Color(255, 0, 255));
        btnRollEm.setFont(new Font("Arial", Font.ITALIC, 20));
        btnRollEm.setBackground(Color.BLACK);
        btnRollEm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateDieImage();
            }
        });

        // Add components to contentPane
        contentPane.add(dieImageLabel, BorderLayout.CENTER);
        contentPane.add(btnRollEm, BorderLayout.SOUTH);
        updateDieImage();
    }

    private void updateDieImage() {
        int rolledDie;
        do {
            rolledDie = new Random().nextInt(6); // Generate a random die roll
        } while (rolledDie == lastRolledDie); // Ensure it's not the same as the last roll

        lastRolledDie = rolledDie; // Update the last rolled die

        String dieImageFileName = DICE_IMAGES[rolledDie];
        ImageIcon dieImage = new ImageIcon(LabGuiDice.class.getResource(dieImageFileName));
        dieImageLabel.setIcon(dieImage);
    }
}
