import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.*;

public class report extends WelcomePage implements ActionListener {


   JLabel rport = new JLabel("empty");
   JLabel Label = new JLabel("empty");
   JLabel course2Label = new JLabel("empty");
   JLabel course3Label = new JLabel("empty");
   JLabel course4Label = new JLabel("empty");
   JLabel course5Label = new JLabel("empty");
   JLabel course6Label = new JLabel("empty");


   report(){

      fport.add(welcomeLabel);
      fport.add(GenderLabel);
      fport.add(AgeLabel);
      fport.add(programm);
      System.out.println("REPORT");
      Label.setBounds(50, 200, 140, 40);
      Label.setBackground(Color.lightGray);
      Label.setText(button.getText());

      course2Label.setBounds(50, 275, 140, 40);
      course2Label.setBackground(Color.lightGray);
      course2Label.setText(course2button.getText());

      course3Label.setBounds(50, 350, 140, 40);
      course3Label.setBackground(Color.lightGray);
      course3Label.setText(course3button.getText());

      course4Label.setBounds(50, 425, 140, 40);
      course4Label.setBackground(Color.lightGray);
      course4Label.setText(course4button.getText());

      course5Label.setBounds(50, 500, 140, 40);
      course5Label.setBackground(Color.lightGray);
      course5Label.setText(course5button.getText());

      course6Label.setBounds(50, 575, 140, 40);
      course6Label.setBackground(Color.lightGray);
      course6Label.setText(course6button.getText());

      welcomeLabel.setBounds(30, 10, 200, 35);
      welcomeLabel.setFont(new Font(null, Font.PLAIN, 15));
      welcomeLabel.setText("Name: " );


      fport.add(welcomeLabel);
      fport.add(GenderLabel);
      fport.add(AgeLabel);
      fport.add(programm);
      fport.add(Label);

      fport.add(course2Label);
      fport.add(course3Label);
      fport.add(course4Label);
      fport.add(course5Label);
      fport.add(course6Label);

      fport.add(Grade1Label);
      fport.add(Grade2Label);
      fport.add(Grade3Label);
      fport.add(Grade4Label);
      fport.add(Grade5Label);
      fport.add(Grade6Label);

      fport.add(Grade1Label);
      fport.add(Grade2Label);
      fport.add(Grade3Label);
      fport.add(Grade4Label);
      fport.add(Grade5Label);
      fport.add(Grade6Label);

      fport.add(point1Label);
      fport.add(point2Label);
      fport.add(point3Label);
      fport.add(point4Label);
      fport.add(point5Label);
      fport.add(point6Label);

      fport.add(honorLeble);
      fport.add(GPALabel);
      fport.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
      fport.setSize(2000, 800);
      fport.setLayout(null);
      fport.setVisible(true);




   }


}
