package com.geekbrains.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyWindow extends JFrame {

    JTextArea textArea = new JTextArea();
    JTextField textField = new JTextField();

    public MyWindow() {
        setBounds(600, 200, 400, 400);
        setTitle("My Chat");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);

        JButton button = new JButton("SEND");
        button.setPreferredSize(new Dimension(70, 60));
        button.setBackground(Color.pink);
        add(button, BorderLayout.LINE_END);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                send();
            }
        });
        JScrollPane scroll = new JScrollPane(textArea);
        add(scroll, BorderLayout.PAGE_START);
        textArea.setPreferredSize(new Dimension(400, 300));
        textArea.setBackground(Color.LIGHT_GRAY);
        textArea.setEditable(false);
        add(textField, BorderLayout.CENTER);
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                send();
            }
        });
        setVisible(true);
    }

    public void send() {
        textArea.setText(textArea.getText() + textField.getText() + "\n");
        textField.setText("");
    }
}
