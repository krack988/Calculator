import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener{
    double rezult;
    JFrame myFrame=new JFrame("My Calculator");
    JPanel panel1=new JPanel();
    JPanel panel2=new JPanel();
    JTextField text=new JTextField(25);
    JButton button1=new JButton("1");
    JButton button2=new JButton("2");
    JButton button3=new JButton("3");
    JButton button4=new JButton("4");
    JButton button5=new JButton("5");
    JButton button6=new JButton("6");
    JButton button7=new JButton("7");
    JButton button8=new JButton("8");
    JButton button9=new JButton("9");
    JButton button0=new JButton("0");
    JButton buttonEqual=new JButton("=");
    JButton buttonPlus=new JButton("+");
    JButton buttonMinus=new JButton("-");
    JButton buttonMultiply=new JButton("*");
    JButton buttonDivide=new JButton("/");
    JButton buttonPoint=new JButton(".");
    JButton buttonFact=new JButton("!n");
    JButton buttonFibonachi=new JButton("Fib");


    public Calculator(){
        myFrame.setSize(250, 300);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BorderLayout border=new BorderLayout();
        myFrame.setLayout(border);
        myFrame.add("North", text);
        myFrame.add("Center", panel1);
        GridLayout gridNumber=new GridLayout(4,3);
        panel1.setLayout(gridNumber);
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        panel1.add(button4);
        panel1.add(button5);
        panel1.add(button6);
        panel1.add(button7);
        panel1.add(button8);
        panel1.add(button9);
        panel1.add(button0);
        panel1.add(buttonEqual);

        myFrame.add("East", panel2);
        GridLayout gridSigns=new GridLayout(4,2);
        panel2.setLayout(gridSigns);

        panel2.add(buttonPlus);
        panel2.add(buttonMinus);
        panel2.add(buttonMultiply);
        panel2.add(buttonDivide);
        panel2.add(buttonFact);
        panel2.add(buttonFibonachi);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button0.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonMultiply.addActionListener(this);
        buttonDivide.addActionListener(this);
        buttonFact.addActionListener(this);
        buttonFibonachi.addActionListener(this);


        myFrame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent event) {
        String value=text.getText();

        if (event.getActionCommand().equals("1")) {
            text.setText("1"+value);
           value = text.getText();
            text.setText(value);
        }
        if (event.getActionCommand().equals("2")) {
            text.setText("2"+value);
            value=text.getText();
            text.setText(value);
        }
        if (event.getActionCommand().equals("3")){
            text.setText("3"+value);
            value=text.getText();
            text.setText(value);
    }
        if (event.getActionCommand().equals("4")){
            text.setText("4"+value);
            value=text.getText();
            text.setText(value);
}
        if (event.getActionCommand().equals("5")){
            text.setText("5"+value);
            value=text.getText();
            text.setText(value);
                }
        if (event.getActionCommand().equals("6")){
            text.setText("6"+value);
            value=text.getText();
            text.setText(value);
                }
        if (event.getActionCommand().equals("7")){
            text.setText("7"+value);
            value=text.getText();
            text.setText(value);
                }
        if (event.getActionCommand().equals("8")){
            text.setText("8"+value);
            value=text.getText();
            text.setText(value);
                }
        if (event.getActionCommand().equals("9")){
            text.setText("9"+value);
            value=text.getText();
            text.setText(value);
                }
        if (event.getActionCommand().equals("0")){
            text.setText("0"+value);
            value=text.getText();
            text.setText(value);
                }
//        if (event.getActionCommand().equals("+")){
//            value=text.getText();
//            text.setText("");
//        }
        if (event.getActionCommand().equals("=")){
            text.setText(Double.toString(rezult));
        }
        if (event.getActionCommand().equals("!n")){
            value=text.getText();
            rezult=factarial(Double.valueOf(value));
//            text.setText("");
        }
        if (event.getActionCommand().equals("Fib")){
            value=text.getText();
            rezult=fibonachi(Double.valueOf(value));
//            text.setText("");
        }

    }
    public double factarial(double f){
        if (f==1)return 1;
        return factarial(f-1)*f;
    }
    public double fibonachi(double fib){
        if (fib==0)return 1;
        if (fib==1)return 1;
        else
        return fibonachi(fib-1)+fibonachi(fib - 2);
    }
}
