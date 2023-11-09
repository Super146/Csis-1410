package guiIntro;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

import javax.swing.JButton;

public class LabGuiIntro extends JFrame {

    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LabGuiIntro frame = new LabGuiIntro();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public LabGuiIntro() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        // Create the blue title label and add it to the NORTH position
        JLabel lblTitle = newLblTitle("Title");
        contentPane.add(lblTitle, BorderLayout.NORTH);

        // Create a simple button on the left
        JButton westButton = newWestButton("WEST");
        contentPane.add(westButton, BorderLayout.WEST);

        // Create a textPanel with the label and text field at the bottom
        JPanel textPanel = lblName("Name:");
        contentPane.add(textPanel, BorderLayout.SOUTH);

        // Create the red label in the remaining area
        JLabel redLabel = lblHi("Hi");
        contentPane.add(redLabel, BorderLayout.CENTER);
    }

    private JLabel newLblTitle(String text) {
        JLabel lblTitle = new JLabel(text);
        lblTitle.setOpaque(true);
        lblTitle.setForeground(Color.GREEN);
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitle.setBackground(Color.BLUE);
        lblTitle.setFont(new Font("Tahoma", Font.BOLD, 33));
        lblTitle.setBorder(new EmptyBorder(20, 0, 20, 0)); // Padding top and bottom
        return lblTitle;
    }

    private JButton newWestButton(String text) {
        JButton westButton = new JButton(text);
        return westButton;
    }

    private JPanel lblName(String labelText) {
        JPanel textPanel = new JPanel();
        textPanel.setBackground(Color.GRAY);
        textPanel.setLayout(new BorderLayout());
        textPanel.setBorder(new EmptyBorder(20, 0, 20, 0)); // Padding top and bottom

        JLabel lblName = new JLabel(labelText);
        lblName.setFont(new Font("Arial", Font.PLAIN, 16));
        textPanel.add(lblName, BorderLayout.WEST);

        JTextField nameTextField = new JTextField(16);
        nameTextField.setHorizontalAlignment(SwingConstants.LEFT);
        nameTextField.setFont(new Font("Arial", Font.PLAIN, 16));
        textPanel.add(nameTextField, BorderLayout.CENTER);
        lblName.setBorder(new EmptyBorder(0, 10, 0, 0));
     // lblName.add(lblName, BorderLayout.WEST);
        return textPanel;
    }

    private JLabel lblHi (String text) {
        JLabel lblHi = new JLabel(text);
        lblHi.setOpaque(true);
        lblHi.setForeground(Color.ORANGE);
        lblHi.setHorizontalAlignment(SwingConstants.CENTER);
        lblHi.setVerticalAlignment(SwingConstants.CENTER);
        lblHi.setBackground(Color.RED);
        lblHi.setFont(new Font("Arial", Font.PLAIN, 77));
        lblHi.setBorder(new EmptyBorder(50, 50, 50, 50)); // Padding
        return lblHi;
    }
}
