package structra.assignment.task.impl;

import javax.swing.*;
import java.awt.*;

public class GUI {
    public static void createAndShowGUI() {
        JFrame frame = new JFrame("Task B Gui");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel questionPanel = new JPanel();
        questionPanel.setLayout(new BoxLayout(questionPanel, BoxLayout.Y_AXIS));

        JLabel label = new JLabel("Question 1", SwingConstants.CENTER); // Add questions here later
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        questionPanel.add(label);

        // add multiple choice answers
        String[] options = {"Option 1", "Option 2", "Option 3", "Option 4"};

        // create and add radio buttons
        ButtonGroup group = new ButtonGroup();
        for (String option : options) {
            JRadioButton radioButton = new JRadioButton(option);
            group.add(radioButton);
            questionPanel.add(radioButton);
        }

        // Add the question panel to the frame
        frame.add(questionPanel, BorderLayout.CENTER);

        JButton button = new JButton("Next Question");
        button.addActionListener(e -> {
            label.setText("Next Question"); // Update the label for the next question
            group.clearSelection(); // Clear the selection for the radio buttons
        });
        frame.add(button, BorderLayout.SOUTH);

        // Adjust position of the window
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        int frameWidth = (int) (width / 3);
        int frameHeight = (int) (height / 3);
        frame.setLocation((int) (width - frameWidth) / 2, (int) (height - frameHeight) / 2);
        frame.setSize(frameWidth, frameHeight);

        // Display the window
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(GUI::createAndShowGUI);
    }
}
