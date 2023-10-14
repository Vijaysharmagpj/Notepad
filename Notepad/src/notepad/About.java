/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notepad;

/**
 *
 * @author bittu
 */
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
public class About extends JFrame {
    
    About(){
        setBounds(600,200,700,600);
        setLayout(null);
        
        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("notepad.png/icons/windows.png"));
        Image i2 =i1.getImage().getScaledInstance(400, 80, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(150,40,400,80);
        add(l1);
        
        ImageIcon i4 =new ImageIcon(ClassLoader.getSystemResource("notepad.png/icons/notepad.png"));
        Image i5 =i4.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel l2=new JLabel(i6);
        l2.setBounds(50,180,70,70);
        add(l2);
        
        JLabel l3=new JLabel("<html>Note for vijay<br>Self Project<br>Notepad is a word Processing Program<br>which allows changing of text in a computer file<br></html>");
        l3.setBounds(150,130,500,300);
        l3.setFont(new Font("SAN_SERIF",Font.PLAIN, 18));
        add(l3);
    }
    
    public static void main(String[]args){
        new About().setVisible(true);
    }
}
