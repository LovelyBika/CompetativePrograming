
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JavaSwing implements ActionListener {
   private static JTextField inputBox;

   private static void createWindow() {
      JFrame frame = new JFrame("Calculator");
      CrateUI(frame);

      frame.setSize(350, 500);
      frame.setLayout(null);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

   private static void CrateUI(JFrame frame) {
      inputBox = new JTextField();
      inputBox.setBounds(10, 40, 300, 140);

      inputBox.setEditable(false);
      frame.add(inputBox);

      JButton b0 = new JButton("0");
      JButton b1 = new JButton("1");
      JButton b2 = new JButton("2");
      JButton b3 = new JButton("3");
      JButton b4 = new JButton("4");
      JButton b5 = new JButton("5");
      JButton b6 = new JButton("6");
      JButton b7 = new JButton("7");
      JButton b8 = new JButton("8");
      JButton b9 = new JButton("9");

      JButton be = new JButton("=");
      JButton bp = new JButton("+");
      JButton bm = new JButton("-");
      JButton bmul = new JButton("x");
      JButton bd = new JButton("/");
      JButton bdot = new JButton(".");
      JButton b00 = new JButton("00");
      JButton bclear = new JButton("C");
      JButton bpercentage = new JButton("%");
      JButton bback = new JButton("back");

      JavaSwing click = new JavaSwing();

      bclear.setBounds(0, 210, 85, 50);
      bclear.addActionListener(click);

      bpercentage.setBounds(85, 210, 85, 50);
      bpercentage.addActionListener(click);

      bback.setBounds(170, 210, 85, 50);

      bback.addActionListener(click);
      b00.setBounds(0, 410, 85, 50);

      b00.addActionListener(click);
      b0.setBounds(85, 410, 85, 50);
      b0.addActionListener(click);

      bdot.setBounds(170, 410, 85, 50);
      bdot.addActionListener(click);

      b1.setBounds(0, 360, 85, 50);
      b1.addActionListener(click);

      b2.setBounds(85, 360, 85, 50);
      b2.addActionListener(click);

      b3.setBounds(170, 360, 85, 50);
      b3.addActionListener(click);

      b4.setBounds(0, 310, 85, 50);
      b4.addActionListener(click);

      b5.setBounds(85, 310, 85, 50);
      b5.addActionListener(click);

      b6.setBounds(170, 310, 85, 50);
      b6.addActionListener(click);

      b7.setBounds(0, 260, 85, 50);
      b7.addActionListener(click);

      b8.setBounds(85, 260, 85, 50);
      b8.addActionListener(click);
      b9.setBounds(170, 260, 85, 50);
      b9.addActionListener(click);

      be.setBounds(255, 410, 85, 50);
      be.addActionListener(click);

      bp.setBounds(255, 360, 85, 50);

      bp.addActionListener(click);
      bm.setBounds(255, 310, 85, 50);
      bm.addActionListener(click);

      bmul.setBounds(255, 260, 85, 50);
      bmul.addActionListener(click);

      bd.setBounds(255, 210, 85, 50);
      bd.addActionListener(click);

      frame.add(b0);
      frame.add(b1);
      frame.add(b2);
      frame.add(b3);
      frame.add(b4);
      frame.add(b5);
      frame.add(b6);
      frame.add(b7);
      frame.add(b8);
      frame.add(b9);
      frame.add(be);
      frame.add(bp);
      frame.add(bm);
      frame.add(bmul);
      frame.add(bd);
      frame.add(bdot);
      frame.add(b00);
      frame.add(bclear);
      frame.add(bback);
      frame.add(bpercentage);

   }

   public JavaSwing() {
   }

   public static void main(String[] args) {

      createWindow();

   }

   @Override
   public void actionPerformed(ActionEvent e) {
      // TODO Auto-generated method stub
      String command = e.getActionCommand();
      if (command.charAt(0) == 'C') {
         inputBox.setText("");
      } else if (command.charAt(0) == '=') {
         inputBox.setText(evaluate(inputBox.getText()));
      } else {
         inputBox.setText(inputBox.getText() + command);
      }
   }

   public static String evaluate(String expression) {
      char[] arr = expression.toCharArray();
      String operand1 = "";
      String operand2 = "";
      String operator = "";
      double result = 0;

      for (int i = 0; i < arr.length; i++) {
         if (arr[i] >= '0' && arr[i] <= '9' || arr[i] == '.') {
            if (operator.isEmpty()) {
               operand1 += arr[i];
            } else {
               operand2 += arr[i];
            }
         }

         if (arr[i] == '+' || arr[i] == '-' || arr[i] == '/' || arr[i] == '*') {
            operator += arr[i];
         }
      }
      switch (operator) {
         case "+":
            result = (Double.parseDouble(operand1) + Double.parseDouble(operand2));
            break;
         case "-":
            result = (Double.parseDouble(operand1) - Double.parseDouble(operand2));
            break;
         case "*":
            result = (Double.parseDouble(operand1) * Double.parseDouble(operand2));
            break;
         case "/":
            result = (Double.parseDouble(operand1) / Double.parseDouble(operand2));
            break;
         default:

            break;

      }
      return operand1 + operator + operand2 + "=" + result;

      // if (operator.equals("+"))
      // result = (Double.parseDouble(operand1) + Double.parseDouble(operand2));
      // else if (operator.equals("-"))
      // result = (Double.parseDouble(operand1) - Double.parseDouble(operand2));
      // else if (operator.equals("/"))
      // result = (Double.parseDouble(operand1) / Double.parseDouble(operand2));
      // else
      // result = (Double.parseDouble(operand1) * Double.parseDouble(operand2));
      // return operand1 + operator + operand2 + "=" + result;
   }
}
