package com.company;

import java.awt.*;
import java.awt.event.*;

class Calculator extends Frame implements ActionListener{

    Frame f;
    Panel p;
    TextField t;
    GridLayout g;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,add,sub,mul,div,beq,bclose;
    Label l1,l2;

    Calculator(){

        f=new Frame("Calculator");
        f.setLayout(new FlowLayout());
        p=new Panel();
        t=new TextField(19);
        g=new GridLayout(4,4);

        b0=new Button("0");
        b1=new Button("1");
        b2=new Button("2");
        b3=new Button("3");
        b4=new Button("4");
        b5=new Button("5");
        b6=new Button("6");
        b7=new Button("7");
        b8=new Button("8");
        b9=new Button("9");
        add=new Button("+");
        sub=new Button("-");
        mul=new Button("*");
        div=new Button("/");
        beq=new Button("=");
        bclose=new Button("CLR");

        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        beq.addActionListener(this);
        bclose.addActionListener(this);

        f.add(t);
        p.setLayout(g);

        p.add(b0);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(add);
        p.add(sub);
        p.add(mul);
        p.add(div);
        p.add(beq);
        p.add(bclose);

        f.add(p);
        f.setSize(250,220);
        f.setVisible(true);
        f.setBackground(Color.PINK);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    int n,c;
    String s,s1,s2,a,b;
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b0){
            s1=t.getText();
            s2="0";
            s=s1+s2;
            t.setText(s);
        }
        if (e.getSource()==b1){
            s1=t.getText();
            s2="1";
            s=s1+s2;
            t.setText(s);
        }
        if (e.getSource()==b2){
            s1=t.getText();
            s2="2";
            s=s1+s2;
            t.setText(s);
        }
        if (e.getSource()==b3){
            s1=t.getText();
            s2="3";
            s=s1+s2;
            t.setText(s);
        }
        if (e.getSource()==b4){
            s1=t.getText();
            s2="4";
            s=s1+s2;
            t.setText(s);
        }
        if (e.getSource()==b5){
            s1=t.getText();
            s2="5";
            s=s1+s2;
            t.setText(s);
        }
        if (e.getSource()==b6){
            s1=t.getText();
            s2="6";
            s=s1+s2;
            t.setText(s);
        }
        if (e.getSource()==b7){
            s1=t.getText();
            s2="7";
            s=s1+s2;
            t.setText(s);
        }
        if (e.getSource()==b8){
            s1=t.getText();
            s2="8";
            s=s1+s2;
            t.setText(s);
        }
        if (e.getSource()==b9){
            s1=t.getText();
            s2="9";
            s=s1+s2;
            t.setText(s);
        }
        if (e.getSource()==add){
            a=t.getText();
            t.setText("");
            c=1;
        }
        if (e.getSource()==sub){
            a=t.getText();
            t.setText("");
            c=2;
        }
        if (e.getSource()==mul){
            a=t.getText();
            t.setText("");
            c=3;
        }
        if (e.getSource()==div){
            a=t.getText();
            t.setText("");
            c=4;
        }
        if (e.getSource()==beq){
            b=t.getText();
            if(c==1){
                n=Integer.parseInt(a)+Integer.parseInt(b);
                t.setText(String.valueOf(n));
            }
            if(c==2){
                n=Integer.parseInt(a)-Integer.parseInt(b);
                t.setText(String.valueOf(n));
            }
            if(c==3){
                n=Integer.parseInt(a)*Integer.parseInt(b);
                t.setText(String.valueOf(n));
            }
            if(c==4){
                n=Integer.parseInt(a)/Integer.parseInt(b);
                t.setText(String.valueOf(n));
            }
        }

        if (e.getSource()==bclose){
            t.setText("");
        }

    }
}

public class SimpleCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    }
}

