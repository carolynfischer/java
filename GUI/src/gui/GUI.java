package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author carry
 */
public class GUI extends JFrame implements ActionListener {
    JPanel mainPanel;
    JLabel lblfNum;
    JLabel lblsNum;
    JLabel lblResult;
    JButton btnAdd;
    JButton btnSubtract;
    JButton btnMultiply;
    JButton btnDivide;
    JTextField txt_fNum;
    JTextField txt_sNum;
    
    public GUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 300);
        setTitle("Basic calculator");
        setVisible(true);
        Initialize();
    }
    
    public void Initialize() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(10, 1));
        
        lblfNum = new JLabel("First Number", JLabel.CENTER);
        lblsNum = new JLabel("Second number", JLabel.CENTER);
        lblResult = new JLabel("---", JLabel.CENTER);
        
        txt_fNum = new JTextField();
        txt_sNum = new JTextField();
        
        btnAdd = new JButton("Add");
        btnSubtract = new JButton("Subtract");
        btnMultiply = new JButton("Multiply");
        btnDivide = new JButton("Divide");
        
        setListeners();
        
        mainPanel.add(lblfNum);
        mainPanel.add(txt_fNum);
        mainPanel.add(lblsNum);
        mainPanel.add(txt_sNum);
        mainPanel.add(btnAdd);
        mainPanel.add(btnSubtract);
        mainPanel.add(btnMultiply);
        mainPanel.add(btnDivide);
        mainPanel.add(lblResult);
        
        add(mainPanel);
        revalidate();
    }
    
    private void setListeners() {
        btnAdd.addActionListener(this);
        btnSubtract.addActionListener(this);
        btnMultiply.addActionListener(this);
        btnDivide.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String btnName = e.getActionCommand();
        
        try {
            int fNum = Integer.parseInt(txt_fNum.getText().trim());
            int sNum = Integer.parseInt(txt_sNum.getText().trim());
     
            if (btnName.equals("Add")) {
                int result = fNum + sNum;
                System.out.println("result " + result);
                lblResult.setText(result + "");
            } else if (btnName.equals("Subtract")) {
                int result = fNum - sNum;
                lblResult.setText(result + "");
            } else if (btnName.equals("Multiply")) {
                int result = fNum * sNum;
                lblResult.setText(result + "");
            } else if (btnName.equals("Divide")) {
                if (sNum != 0) {
                    int result = fNum / sNum;
                    lblResult.setText(result + "");
                } else {
                    throw Exception("Cannot divide by zero!");
                }
            }
        } catch (Exception exc) {
                lblResult.setText("Invalid input!");
        }
    }
    
    public static void main(String[] args) {
        
    }

    private Exception Exception(String cannot_divide_by_zero) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
