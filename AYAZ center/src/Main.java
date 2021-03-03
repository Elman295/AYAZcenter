import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.SwingConstants.HORIZONTAL;

public class Main {

    public static void main(String[] args) {



        JFrame mainjframe=new JFrame("AYAZ center");


        JButton cal=new JButton("calculator");
        cal.setBounds(800,100,100,60);
        cal.setBorder(new LineBorder(Color.GREEN));
        //------------------------------------------------------
        //------------------------------------------------------

        cal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null,"Welcome to AYAZ calculater");
                JFrame calframe=new JFrame("calculater");
                JLabel num1=new JLabel("Number1:");
                num1.setBounds(100,100,100,40);
                JTextField num1txt=new JTextField();
                num1txt.setBounds(170,110,100,30);


                JLabel num2=new JLabel("Number2:");
                num2.setBounds(100,170,100,40);
                JTextField num2txt=new JTextField();
                num2txt.setBounds(170,180,100,30);


                JButton pos=new JButton("+");
                pos.setBounds(360,230,50,50);
                JButton neg=new JButton("-");
                neg.setBounds(300,230,50,50);
                JButton mul=new JButton("*");
                mul.setBounds(240,230,50,50);
                JButton tag=new JButton("/");
                tag.setBounds(180,230,50,50);
                JLabel result=new JLabel();
                result.setBounds(100,300,100,100);


                pos.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String num1=num1txt.getText();
                        String num2=num2txt.getText();
                        double number1=Double.parseDouble(num1);
                        double number2=Double.parseDouble(num2);
                        double res=number1+number2;
                        String resu=String.valueOf(res);
                        result.setText(resu);

                    }
                });

                neg.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String num1=num1txt.getText();
                        String num2=num2txt.getText();
                        double number1=Double.parseDouble(num1);
                        double number2=Double.parseDouble(num2);
                        double res=number1-number2;
                        String resu=String.valueOf(res);
                        result.setText(resu);

                    }
                });


                mul.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String num1=num1txt.getText();
                        String num2=num2txt.getText();
                        double number1=Double.parseDouble(num1);
                        double number2=Double.parseDouble(num2);
                        double res=number1*number2;
                        String resu=String.valueOf(res);
                        result.setText(resu);

                    }
                });

                tag.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String num1=num1txt.getText();
                        String num2=num2txt.getText();
                        double number1=Double.parseDouble(num1);
                        double number2=Double.parseDouble(num2);
                        double res=number1/number2;
                        String resu=String.valueOf(res);
                        result.setText(resu);

                    }
                });


                calframe.add(pos);
                calframe.add(neg);
                calframe.add(mul);
                calframe.add(tag);
                calframe.add(num1);
                calframe.add(num2);
                calframe.add(num1txt);
                calframe.add(num2txt);
                calframe.add(result);
                calframe.setSize(500,500);
                calframe.setLayout(null);
                calframe.setVisible(true);
            }
        });


        //---------------------------------------------------------
        //----------------------------------------------------------




        JButton leap=new JButton("leap year");
        leap.setBounds(600,100,100,60);
        leap.setBorder(new LineBorder(Color.GREEN));

        //---------------------------------------------------------
        //---------------------------------------------------------

        leap.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Welcome to Leapyear");
                JFrame leapframe=new JFrame("Leap year");
                JLabel leaplabel=new JLabel("Enter year:");
                leaplabel.setBounds(40,100,80,40);
                JTextField leaptxt=new JTextField();
                leaptxt.setBounds(120,110,90,30);

                JLabel leaplable=new JLabel("result");
                leaplable.setBounds(80,360,190,40);

                JButton action=new JButton("Action");
                action.setBounds(100,200,100,30);

                action.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String leap2=leaptxt.getText();
                        double lnr1=Double.parseDouble(leap2);
                        if (lnr1%400==0){
                            leaplable.setText("it is leapyear");

                        }
                        else {
                            leaplable.setText("it isnt leapyear");


                        }
                    }
                });
















                leapframe.add(leaplable);

                leapframe.add(leaplabel);
                leapframe.add(action);
                leapframe.add(leaptxt);

                leapframe.setSize(500,500);
                leapframe.setLayout(null);

                leapframe.setVisible(true);

            }
        });







        //----------------------------------------------------------
        //----------------------------------------------------------




        JButton bmi=new JButton("BMI");
        bmi.setBounds(400,100,100,60);
        bmi.setBorder(new LineBorder(Color.GREEN));
        bmi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame bmiframe=new JFrame("BMI");
                JLabel lab=new JLabel("weight:");
                lab.setBounds(80,60,70,40);

                JTextField t1=new JTextField();
                t1.setBounds(130,60,70,40);
                JLabel lab2=new JLabel("height:");
                lab2.setBounds(80,110,70,40);
                JTextField t2=new JTextField();
                t2.setBounds(130,110,70,40);
                JButton action=new JButton("Active");
                action.setBounds(300,300,160,30);
                JLabel res=new JLabel("result");
                res.setBounds(100,300,160,30);
                action.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String weight=t1.getText();
                        String height=t2.getText();

                        double weightn=Double.parseDouble(weight);

                        double height2=Double.parseDouble(height);
                        double formula=weightn/(Math.pow(height2,2));

                        res.setText("your bmi is "+formula);
                    }
                });






                bmiframe.add(lab);
                bmiframe.add(lab2);
                bmiframe.add(t1);
                bmiframe.add(t2);
                bmiframe.add(action);
                bmiframe.add(res);

                bmiframe.setSize(500,500);
                bmiframe.setLayout(null);
                bmiframe.setVisible(true);

            }
        });





        JButton draw=new JButton("Draw");
        draw.setBounds(200,100,100,60);
        draw.setBorder(new LineBorder(Color.GREEN));
        draw.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame=new JFrame("Draw");
                JButton line=new JButton("Line");
                line.setBounds(80,80,60,60);
                line.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JFrame l=new JFrame("drawline");

                        JLabel x1=new JLabel("x1=");
                        x1.setBounds(80,80,100,30);
                        JTextField t1=new JTextField();
                        t1.setBounds(140,80,100,30);
                        JLabel y1=new JLabel("y1=");
                        y1.setBounds(80,130,100,30);
                        JTextField t2=new JTextField();
                        t2.setBounds(140,120,100,30);
                        JLabel x2=new JLabel("x2=");
                        x2.setBounds(80,160,100,30);
                        JTextField t3=new JTextField();
                        t3.setBounds(140,160,100,30);
                        JLabel y2=new JLabel("y2=");
                        y2.setBounds(80,190,100,30);
                        JTextField t4=new JTextField();
                        t4.setBounds(140,200,100,30);
                        JButton action=new JButton("Active");
                        action.setBounds(280,300,100,40);
                        action.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                String te1=t1.getText();
                                String te2=t2.getText();
                                String te3=t3.getText();
                                String te4=t4.getText();
                                double ten1=Double.parseDouble(te1);
                                double ten2=Double.parseDouble(te2);
                                double ten3=Double.parseDouble(te3);
                                double ten4=Double.parseDouble(te4);
                                StdDraw.line(ten1,ten2,ten3,ten4);


                            }
                        });



                        l.add(x1);
                        l.add(x2);
                        l.add(y1);
                        l.add(y2);
                        l.add(t1);
                        l.add(t2);
                        l.add(t3);
                        l.add(t4);
                        l.add(action);
                        l.setSize(400,400);
                        l.setLayout(null);
                        l.setVisible(true);
                    }
                });









                frame.add(line);

                frame.setSize(400,400);
                frame.setLayout(null);
                frame.setVisible(true);
            }
        });

































        //---------------------------------------------------------
        mainjframe.add(draw);
        mainjframe.add(bmi);
        mainjframe.add(leap);
        mainjframe.add(cal);
        mainjframe.setSize(1000,600);
        mainjframe.setLayout(null);
        mainjframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainjframe.setVisible(true);














    }
}
