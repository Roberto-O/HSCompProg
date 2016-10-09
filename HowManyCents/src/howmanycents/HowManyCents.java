package howmanycents;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.event.*;

public class HowManyCents extends JFrame {
    private JTextField amountField = new JTextField(12);
    private Document amountText = amountField.getDocument();
    private JTextArea report = new JTextArea(8, 40);

    public HowManyCents() {

        // Lay out the components in the window.
        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("Amount:"));
        topPanel.add(amountField);
        getContentPane().add(topPanel, BorderLayout.NORTH);
        getContentPane().add(new JScrollPane(report), BorderLayout.CENTER);

        // Set some properties of the frame and its components
        setBackground(Color.LIGHT_GRAY);
        report.setEditable(false);

        // Ensure the text changes in response to button presses.
        amountText.addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                updateReport();
            }
            public void insertUpdate(DocumentEvent e) {
                updateReport();
            }
            public void removeUpdate(DocumentEvent e) {
                updateReport();
            }
        });
    }

    /**
     * Writes the correct amount of coins in the report window.
     */
    void updateReport() {
        try {
            int amount = Integer.parseInt(
                    amountText.getText(0, amountText.getLength()));
            report.setText("To make " + amount + " cents, use\n");
            report.append(amount / 25 + " quarters\n");
            amount %= 25;
            report.append(amount / 10 + " dimes\n");
            amount %= 10;
            report.append(amount / 5 + " nickels\n");
            amount %= 5;
            report.append(amount + " pennies\n");
        } catch (NumberFormatException e) {
            report.setText("Not an integer or out of range");
        } catch (Exception e) {
            report.setText(e.toString());
        }
    }

    /**
     * Runs a changer as an application.
     */
    public static void main(String[] args) {
        JFrame frame = new HowManyCents();
        frame.setTitle("Changer");
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}