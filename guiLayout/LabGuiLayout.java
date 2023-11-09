package guiLayout;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabGuiLayout extends JFrame {
    private JPanel contentPane;
    private JPanel mainPanel;
    private JButton[] tileButtons;
    private int blueTileIndex = 1; // Initialize to the second tile

    public LabGuiLayout() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 400); // Adjusted window size

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        // Create and add the title
        JLabel titleLabel = createTitleLabel();
        contentPane.add(titleLabel, BorderLayout.NORTH);

        // Create and add the control panel
        JPanel controlPanel = createControlPanel();
        contentPane.add(controlPanel, BorderLayout.WEST);

        // Create and add the main panel
        mainPanel = createMainPanel();
        contentPane.add(mainPanel, BorderLayout.CENTER);

        // Initialize the blue tile index
        blueTileIndex = 1;

        // Create and add the arrow buttons
        JButton leftButton = createArrowButton("<==", true);
        JButton rightButton = createArrowButton("==>", false);
        controlPanel.add(leftButton);
        controlPanel.add(rightButton);
    }

    private JLabel createTitleLabel() {
        JLabel titleLabel = new JLabel("Demo Layout");
        titleLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        return titleLabel;
    }

    private JPanel createControlPanel() {
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(2, 1, 0, 10)); // 2 rows, 1 column, vertical gap of 10
        return controlPanel;
    }

    private JPanel createMainPanel() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(1, 4, 10, 0)); // 1 row, 4 columns, horizontal gap of 10
        tileButtons = new JButton[4];

        for (int i = 0; i < 4; i++) {
            tileButtons[i] = createTileButton(i + 1);
            mainPanel.add(tileButtons[i]);
        }

        return mainPanel;
    }

    private JButton createTileButton(int number) {
        JButton tileButton = new JButton(Integer.toString(number));
        tileButton.setFont(new Font("Tahoma", Font.PLAIN, 24));

        if (number == 2) {
            tileButton.setBackground(Color.BLUE);
        } else {
            tileButton.setBackground(Color.YELLOW);
        }

        return tileButton;
    }

    private JButton createArrowButton(String text, boolean left) {
        JButton arrowButton = new JButton(text);

        // Create an action listener to handle arrow button clicks
        arrowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (left) {
                    moveBlueTileLeft();
                } else {
                    moveBlueTileRight();
                }
            }
        });

        return arrowButton;
    }

    private void moveBlueTileLeft() {
        // Set the background of the current tile to yellow
        tileButtons[blueTileIndex].setBackground(Color.YELLOW);
        
        // Update the blue tile index
        blueTileIndex = (blueTileIndex == 0) ? 3 : blueTileIndex - 1;

        // Set the background of the new blue tile to blue
        tileButtons[blueTileIndex].setBackground(Color.BLUE);

        validate();
        repaint();
    }

    private void moveBlueTileRight() {
        // Set the background of the current tile to yellow
        tileButtons[blueTileIndex].setBackground(Color.YELLOW);
        
        // Update the blue tile index
        blueTileIndex = (blueTileIndex == 3) ? 0 : blueTileIndex + 1;

        // Set the background of the new blue tile to blue
        tileButtons[blueTileIndex].setBackground(Color.BLUE);

        validate();
        repaint();
    }


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LabGuiLayout frame = new LabGuiLayout();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
