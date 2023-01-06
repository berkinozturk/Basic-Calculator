import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator {
    private JButton a1Button;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a2Button;
    private JButton a5Button;
    private JButton a8Button;
    private JButton a6Button;
    private JButton a9Button;
    private JButton a3Button;
    private JButton button1;
    private JButton xButton1;
    private JButton xButton;
    private JButton button3;
    private JTextField textField1;
    private JRadioButton onRadioButton;
    private JRadioButton offRadioButton;
    private JButton a0Button;
    private JButton button5;
    private JButton button6;
    private JButton cButton;
    private JPanel calculatorPanel;
    private double num, ans;
    private int calculation;


    public void arithmetic_operations(){
        switch (calculation) {
            case 1:
                ans =num + Double.parseDouble(textField1.getText());
                textField1.setText(Double.toHexString(ans));
                break;
            case 2:
                ans =num - Double.parseDouble(textField1.getText());
                textField1.setText(Double.toHexString(ans));
                break;
            case 3:
                ans =num * Double.parseDouble(textField1.getText());
                textField1.setText(Double.toHexString(ans));
                break;
            case 4:
                ans =num / Double.parseDouble(textField1.getText());
                textField1.setText(Double.toHexString(ans));
                break;
        }

    }

    public void disable(){
        textField1.setEnabled(false);
        a0Button.setEnabled(false);
        a1Button.setEnabled(false);
        a2Button.setEnabled(false);
        a3Button.setEnabled(false);
        a4Button.setEnabled(false);
        a5Button.setEnabled(false);
        a6Button.setEnabled(false);
        a7Button.setEnabled(false);
        a8Button.setEnabled(false);
        a9Button.setEnabled(false);
        button1.setEnabled(false);
        button3.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        onRadioButton.setEnabled(true);
        offRadioButton.setEnabled(false);


    }

    public void enable(){
        onRadioButton.setEnabled(false);
        offRadioButton.setEnabled(true);

        textField1.setEnabled(true);
        a0Button.setEnabled(true);
        a1Button.setEnabled(true);
        a2Button.setEnabled(true);
        a3Button.setEnabled(true);
        a4Button.setEnabled(true);
        a5Button.setEnabled(true);
        a6Button.setEnabled(true);
        a7Button.setEnabled(true);
        a8Button.setEnabled(true);
        a9Button.setEnabled(true);
        button1.setEnabled(true);
        button3.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
    }
    public calculator() {


    a1Button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField1.setText(textField1.getText() + "1");
        }
    });

    a2Button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField1.setText(textField1.getText() + "2");
        }
    });
    a3Button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField1.setText(textField1.getText() + "3");
        }
    });
    a4Button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField1.setText(textField1.getText() + "4");
        }
    });
    a5Button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField1.setText(textField1.getText() + "5");
        }
    });
    a6Button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField1.setText(textField1.getText() + "6");
        }
    });
    a7Button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField1.setText(textField1.getText() + "7");
        }
    });
    a8Button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField1.setText(textField1.getText() + "8");
        }
    });
    a9Button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField1.setText(textField1.getText() + "9");
        }
    });
    button3.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            num = Double.parseDouble(textField1.getText());
            calculation=1;


        }
    });
    button1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            num = Double.parseDouble(textField1.getText());
            calculation=2;
        }
    });
    xButton1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            num = Double.parseDouble(textField1.getText());
            calculation=3;
        }
    });
    xButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            num = Double.parseDouble(textField1.getText());
            calculation=4;
        }
    });
    a0Button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField1.setText(textField1.getText() + "0");
        }
    });
    button5.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField1.setText(textField1.getText() + ".");
        }
    });
    button6.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            arithmetic_operations();


        }
    });
        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
            }
        });
        offRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                disable();

            }
        });
        onRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enable();
            }
        });
    }

    public JPanel getCalculatorPanel() {
        return calculatorPanel;
    }
}
