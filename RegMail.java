package Java10Projects;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.util.*;
import java.io.*;
import javax.swing.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
class Regestration1 {
    String name;
    String mail;
static Font font,font1;
    void value() {
        font= new Font("serif",Font.BOLD,15);
        JFrame fram = new JFrame("Login Form");
        fram.setFont(font);
        fram.setSize(500, 400);
        fram.getContentPane().setBackground(Color.lightGray);
        JLabel lable = new JLabel("<html><font color='5F236B'>Login Form</font></html>");
        lable.setBounds(160, 20, 300, 40);
        lable.setFont(new Font("Arial", Font.PLAIN, 30));
       font1 = new Font("arail",Font.PLAIN,15);
        JLabel lable1 = new JLabel("Name");
        lable1.setFont(font1);
        lable1.setBounds(50, 90, 80, 30);
        lable1.setFont(new Font("Arial", Font.PLAIN, 15));
        JTextField tf = new JTextField("");
        tf.setBounds(120, 90, 140, 30);
        JLabel lable2 = new JLabel("Email");
        lable2.setFont(font1);
        lable2.setBounds(50, 140, 80, 20);
        lable2.setFont(new Font("Arial", Font.PLAIN, 15));
        JTextField tf1 = new JTextField("");
        tf1.setBounds(120, 140, 140, 30);
        JButton bt = new JButton("Login");
        bt.setFont(font);
        bt.setBounds(150, 200, 170, 40);
        //bt.setBackground(Color.green);
        JLabel jl = new JLabel(" ");
        jl.setFont(font);
        jl.setBounds(50, 240, 400, 30);
        JLabel jl1 = new JLabel(" ");
        jl1.setBounds(50, 270, 400, 30);
        jl1.setFont(font);
        fram.add(lable);
        fram.add(lable1);
        fram.add(tf);
        fram.add(lable2);
        fram.add(tf1);
        fram.add(bt);
        fram.add(jl);
        fram.add(jl1);
        fram.setLayout(null);
        fram.setVisible(true);
        int m = 0;
  

        bt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                name = tf.getText();
                mail = tf1.getText();
                if ((name.length() >= 5 && !name.contains(" ")) && (mail.length() >= 8 && mail.contains("@") && mail.contains(".com"))) {
                    jl.setText("<html><font color='green'>your name is: " + name + "</font></html>");
                    jl1.setText("<html><font color='green'>your mail add is: " + mail + "</font></html>");
                    tf.setText(" ");
                    tf1.setText(" ");
                }
                          
                else {
                    jl.setText("<html><font color='#AA1923'>invalid input</font></html>");

                }
            }
        });


    }//value method end;
}//regestration end;
public class RegMailGui {
    public static void main(String[] args) {
        Regestration1 rg = new Regestration1();
        rg.value();

    }//main end;

}//public class end;
