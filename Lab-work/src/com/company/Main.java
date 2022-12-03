package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {

    static JFrame f;
    static JRadioButton rdo1,rdo2,rdo3,rdo4;
    static ButtonGroup buttonGroup;
    static JLabel lbl;
    static JTextField txtField1;
    static JButton b;
    static JTextArea txtArea;




    public static void main(String[] args) {

        Excel excel = new Excel();

        f = new JFrame("EXCEL");

        rdo1 = new JRadioButton("Autosum", true);
        rdo2 = new JRadioButton("Average");
        rdo3 = new JRadioButton("Max");
        rdo4 = new JRadioButton("Min");
        rdo1.setBounds(50,90,100,30);
        rdo2.setBounds(50,120,100,30);
        rdo3.setBounds(50,150,100,30);
        rdo4.setBounds(50,180,100,30);
        buttonGroup = new ButtonGroup();
        buttonGroup.add(rdo1);buttonGroup.add(rdo2);buttonGroup.add(rdo3);buttonGroup.add(rdo4);

        lbl = new JLabel("Enter your sequence of numbers :");
        lbl.setBounds(50,20,200,20);

        txtField1 = new JTextField(40);
        txtField1.setBounds(50,40,400,30);

        b = new JButton("Submit");
        b.setBounds(50,220,100,40);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double[] Numbers = excel.ConvertToDouble(txtField1.getText());
                if (rdo1.isSelected()){txtArea.setText(excel.Autosom(Numbers));}
                if (rdo2.isSelected()){txtArea.setText(String.valueOf(excel.Average(Numbers)));}
                if (rdo3.isSelected()){txtArea.setText(String.valueOf(excel.Max(Numbers)));}
                if (rdo4.isSelected()){txtArea.setText(String.valueOf(excel.Min(Numbers)));}
            }

        });

        txtArea = new JTextArea("", 5, 30);
        txtArea.setBounds(50,280,300,150);

        f.add(txtField1);
        f.add(lbl);
        f.add(rdo1);f.add(rdo2);f.add(rdo3);f.add(rdo4);
        f.add(b);
        f.add(txtArea);

        f.setSize(800, 500);
        f.setBackground(Color.gray);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }





    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
