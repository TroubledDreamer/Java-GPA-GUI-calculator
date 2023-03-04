import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import static java.lang.Integer.parseInt;
import static java.lang.String.*;

public class WelcomePage implements ActionListener {
    JFrame fport = new JFrame();
    JFrame frame = new JFrame();
    JTextField cour1 = new JTextField();
    JTextField tes1 = new JTextField();
    JTextField crid1 = new JTextField();

    JTextField cour2 = new JTextField();
    JTextField tes2 = new JTextField();
    JTextField crid2 = new JTextField();

    JTextField cour3 = new JTextField();
    JTextField tes3 = new JTextField();
    JTextField crid3 = new JTextField();

    JTextField cour4 = new JTextField();
    JTextField tes4 = new JTextField();
    JTextField crid4 = new JTextField();

    JTextField cour5 = new JTextField();
    JTextField tes5 = new JTextField();
    JTextField crid5 = new JTextField();

    JTextField cour6 = new JTextField();
    JTextField tes6 = new JTextField();
    JTextField crid6 = new JTextField();

    JLabel gp1 = new JLabel();
    JLabel gp2 = new JLabel();
    JLabel gp3 = new JLabel();
    JLabel gp4 = new JLabel();
    JLabel gp5 = new JLabel();
    JLabel gp6 = new JLabel();
    JLabel honorLeble = new JLabel();


    JLabel tLabel = new JLabel("test");
    JLabel coLabel = new JLabel("Course");
    JLabel cLabel = new JLabel("Credit");
    JButton button = new JButton("COMP1003");
    JButton listbutton = new JButton("list");
    JButton course2button = new JButton("course2");
    JButton course3button = new JButton("course3");
    JButton course4button = new JButton("course4");
    JButton course5button = new JButton("course5");
    JButton course6button = new JButton("course6");
    JLabel welcomeLabel = new JLabel("Hello!");
    JLabel GenderLabel = new JLabel("Gender: Male");
    JLabel AgeLabel = new JLabel("Age : 19");
    JLabel ListLabel = new JLabel("Couses");

    JLabel programm = new JLabel("Programs");
    JLabel point1Label = new JLabel("point1Label");
    JLabel point2Label = new JLabel("point1Label");
    JLabel point3Label = new JLabel("point1Label");
    JLabel point4Label = new JLabel("point1Label");
    JLabel point5Label = new JLabel("point1Label");
    JLabel point6Label = new JLabel("point1Label");
    JLabel totl1Label = new JLabel("pointLabel");
    JLabel totl2Label = new JLabel("pointLabel");
    JLabel totl3Label = new JLabel("pointLabel");
    JLabel totl4Label = new JLabel("pointLabel");
    JLabel totl5Label = new JLabel("pointLabel");
    JLabel totl6Label = new JLabel("pointLabel");
    JLabel Grade1Label = new JLabel("point1Label");
    JLabel Grade2Label = new JLabel("point1Label");
    JLabel Grade3Label = new JLabel("point1Label");
    JLabel Grade4Label = new JLabel("point1Label");
    JLabel Grade5Label = new JLabel("point1Label");
    JLabel Grade6Label = new JLabel("point1Label");

    JLabel GPALabel = new JLabel("GPA");
    JLabel TotalGradePoint = new JLabel("totalGradePoint");
    JLabel errorLabel = new JLabel("point1Label");

    JLabel error2Label = new JLabel("point1Label");
    JLabel error3Label = new JLabel("point1Label");
    JLabel error4Label = new JLabel("point1Label");
    JLabel error5Label = new JLabel("point1Label");
    JLabel error6Label = new JLabel("point1Label");

    JLabel Label = new JLabel("empty");
    JLabel course2Label = new JLabel("empty");
    JLabel course3Label = new JLabel("empty");
    JLabel course4Label = new JLabel("empty");
    JLabel course5Label = new JLabel("empty");
    JLabel course6Label = new JLabel("empty");


    JButton PerLabel = new JButton("in5button");
    JLabel emptyLabel = new JLabel("empty");
    JLabel empty2Label = new JLabel("empty");
    JLabel empty3Label = new JLabel("empty");
    JLabel empty4Label = new JLabel("empty");
    JLabel empty5Label = new JLabel("empty");
    JLabel empty6Label = new JLabel("empty");

    JButton Reportbutton = new JButton("report");
    JButton APGButton = new JButton("34");
    WelcomePage(String userID, int i) {

        welcomeLabel.setBounds(30, 10, 200, 35);
        welcomeLabel.setFont(new Font(null, Font.PLAIN, 15));
        welcomeLabel.setText("Name: " + userID);

        GenderLabel.setBounds(30, 30, 200, 35);
        GenderLabel.setFont(new Font(null, Font.PLAIN, 15));
        GenderLabel.setText("Gender: Male");


        AgeLabel.setBounds(30, 50, 200, 35);
        AgeLabel.setFont(new Font(null, Font.PLAIN, 15));
        AgeLabel.setText("Age: 19");

        programm.setBounds(30, 70, 200, 35);
        programm.setFont(new Font(null, Font.PLAIN, 15));
        programm.setText("programs");



        ListLabel.setBounds(70, 150, 200, 35);
        ListLabel.setFont(new Font(null, Font.PLAIN, 25));
        ListLabel.setText("Coures");



        listbutton.setBounds(500, 650, 140, 40);
        listbutton.addActionListener(this);
        listbutton.setText("List of all courses");

        listbutton.setBackground(Color.lightGray);

        Reportbutton.setBounds(500, 700, 140, 40);
        Reportbutton.addActionListener(this);
        Reportbutton.setText("Report");
        Reportbutton.setBackground(Color.lightGray);


        button.setBounds(50, 200, 140, 40);
        button.setBackground(Color.lightGray);
        button.setFocusable(false);
        button.addActionListener(this);


        course2button.setBounds(50, 275, 140, 40);
        course2button.addActionListener(this);
        course2button.setBackground(Color.lightGray);


        course3button.setBounds(50, 350, 140, 40);
        course3button.addActionListener(this);
        course3button.setBackground(Color.lightGray);


        course4button.setBounds(50, 425, 140, 40);
        course4button.addActionListener(this);
        course4button.setBackground(Color.lightGray);


        course5button.setBounds(50, 500, 140, 40);
        course5button.addActionListener(this);
        course5button.setBackground(Color.lightGray);


        course6button.setBounds(50, 575, 140, 40);
        course6button.addActionListener(this);
        course6button.setBackground(Color.lightGray);

        APGButton.setBounds(50, 650, 140, 40);
        APGButton.addActionListener(this);
        APGButton.setText("GPA");
        APGButton.setBackground(Color.lightGray);

        honorLeble.setBounds(315, 647, 140, 40);
        honorLeble.setFont(new Font(null, Font.PLAIN, 12));
        honorLeble.setText("");
        honorLeble.setBackground(Color.lightGray);
        honorLeble.setVisible(true);





        frame.add(programm);
        frame.add(GPALabel);
        frame.add(APGButton);
        frame.add(errorLabel);
        frame.add(error2Label);
        frame.add(error3Label);
        frame.add(error4Label);
        frame.add(error5Label);
        frame.add(error6Label);
        frame.add(cour1);
        frame.add(tes1);
        frame.add(crid1);

        frame.add(cour2);
        frame.add(tes2);
        frame.add(crid2);

        frame.add(cour3);
        frame.add(tes3);
        frame.add(crid3);

        frame.add(cour4);
        frame.add(tes4);
        frame.add(crid4);

        frame.add(cour5);
        frame.add(tes5);
        frame.add(crid5);

        frame.add(cour6);
        frame.add(tes6);
        frame.add(crid6);

        frame.add(honorLeble);
        frame.add(Reportbutton);
        frame.add(tLabel);
        frame.add(coLabel);
        frame.add(cLabel);
        frame.add(emptyLabel);
        frame.add(empty2Label);
        frame.add(empty3Label);
        frame.add(empty4Label);
        frame.add(empty5Label);
        frame.add(empty6Label);
        frame.add(Grade1Label);
        frame.add(welcomeLabel);
        frame.add(GenderLabel);
        frame.add(AgeLabel);
        frame.add(ListLabel);
        frame.add(button);
        frame.add(course2button);
        frame.add(course3button);
        frame.add(course4button);
        frame.add(course5button);
        frame.add(course6button);
        frame.add(point1Label);
        frame.add(listbutton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setLayout(null);
        frame.setVisible(true);
        //frame.pack();
        emptyLabel.setBounds(200, 215, 200, 20);
        emptyLabel.setFont(new Font(null, Font.PLAIN, 10));
        emptyLabel.setText("Your marks are missing");
        emptyLabel.setVisible(true);


        empty2Label.setBounds(200, 285, 200, 20);
        empty2Label.setFont(new Font(null, Font.PLAIN, 10));
        empty2Label.setText("Your marks are missing");
        empty2Label.setVisible(true);

        empty3Label.setBounds(200, 360, 200, 20);
        empty3Label.setFont(new Font(null, Font.PLAIN, 10));
        empty3Label.setText("Your marks are missing");

        empty3Label.setVisible(true);


        empty4Label.setBounds(200, 435, 200, 20);
        empty4Label.setFont(new Font(null, Font.PLAIN, 10));
        empty4Label.setText("Your marks are missing");

        empty4Label.setVisible(true);


        empty5Label.setBounds(200, 510, 200, 20);
        empty5Label.setFont(new Font(null, Font.PLAIN, 10));
        empty5Label.setText("Your marks are missing");

        empty5Label.setVisible(true);


        empty6Label.setBounds(200, 585, 200, 20);
        empty6Label.setFont(new Font(null, Font.PLAIN, 10));
        empty6Label.setText("Your marks are missing");

        empty6Label.setVisible(true);

        errorLabel.setBounds(600, 15, 200, 35);
        errorLabel.setFont(new Font(null, Font.PLAIN, 25));
        errorLabel.setText("ERROR");
        errorLabel.setForeground(Color.red);
        errorLabel.setVisible(false);

        errorLabel.setBounds(600, 15, 200, 35);
        errorLabel.setFont(new Font(null, Font.PLAIN, 25));
        errorLabel.setText("ERROR");
        errorLabel.setForeground(Color.red);
        errorLabel.setVisible(false);

        error2Label.setBounds(600, 15, 200, 35);
        error2Label.setFont(new Font(null, Font.PLAIN, 25));
        error2Label.setText("ERROR");
        error2Label.setForeground(Color.red);
        error2Label.setVisible(false);

        error3Label.setBounds(600, 15, 200, 35);
        error3Label.setFont(new Font(null, Font.PLAIN, 25));
        error3Label.setText("ERROR");
        error3Label.setForeground(Color.red);
        error3Label.setVisible(false);

        error4Label.setBounds(600, 15, 200, 35);
        error4Label.setFont(new Font(null, Font.PLAIN, 25));
        error4Label.setText("ERROR");
        error4Label.setForeground(Color.red);
        error4Label.setVisible(false);

        error5Label.setBounds(600, 15, 200, 35);
        error5Label.setFont(new Font(null, Font.PLAIN, 25));
        error5Label.setText("ERROR");
        error5Label.setForeground(Color.red);
        error5Label.setVisible(false);

        error6Label.setBounds(600, 15, 200, 35);
        error6Label.setFont(new Font(null, Font.PLAIN, 25));
        error6Label.setText("ERROR");
        error6Label.setForeground(Color.red);
        error6Label.setVisible(false);

        GPALabel.setBounds(200, 650, 200, 35);
        GPALabel.setFont(new Font(null, Font.PLAIN, 15));
        GPALabel.setText("GPA: Missing");
        GPALabel.setVisible(true);

        TotalGradePoint.setBounds(20, 650, 200, 35);
        TotalGradePoint.setFont(new Font(null, Font.PLAIN, 15));
        TotalGradePoint.setText("GPA: Missing");
        TotalGradePoint.setVisible(true);

        //calculations

        tLabel.setBounds(500, 150, 200, 35);
        tLabel.setFont(new Font(null, Font.PLAIN, 15));
        tLabel.setText("Final");
        tLabel.setVisible(true);

        coLabel.setBounds(575, 150, 200, 35);
        coLabel.setFont(new Font(null, Font.PLAIN, 15));
        coLabel.setText("Course");
        coLabel.setVisible(true);

        cLabel.setBounds(425, 150, 200, 35);
        cLabel.setFont(new Font(null, Font.PLAIN, 15));
        cLabel.setText("Credit");
        cLabel.setVisible(true);

//in
        cour1.setBounds(575, 210, 50, 30);
        cour1.addActionListener(this);

        tes1.setBounds(500, 210, 50, 30);
        tes1.addActionListener(this);

        crid1.setBounds(425, 210, 50, 30);
        crid1.addActionListener(this);
//in2

        cour2.setBounds(575, 285, 50, 30);
        cour2.addActionListener(this);

        tes2.setBounds(500, 285, 50, 30);
        tes2.addActionListener(this);

        crid2.setBounds(425, 285, 50, 30);
        crid2.addActionListener(this);

        //in3

        cour3.setBounds(575, 360, 50, 30);
        cour3.addActionListener(this);

        tes3.setBounds(500, 360, 50, 30);
        tes3.addActionListener(this);

        crid3.setBounds(425, 360, 50, 30);
        crid3.addActionListener(this);

        //in4

        cour4.setBounds(575, 435, 50, 30);
        cour4.addActionListener(this);

        tes4.setBounds(500, 435, 50, 30);
        tes4.addActionListener(this);

        crid4.setBounds(425, 435, 50, 30);
        crid4.addActionListener(this);

        //in5

        cour5.setBounds(575, 510, 50, 30);
        cour5.addActionListener(this);

        tes5.setBounds(500, 510, 50, 30);
        tes5.addActionListener(this);

        crid5.setBounds(425, 510, 50, 30);
        crid5.addActionListener(this);

        //in6

        cour6.setBounds(575, 584, 50, 30);
        cour6.addActionListener(this);

        tes6.setBounds(500, 585, 50, 30);
        tes6.addActionListener(this);

        crid6.setBounds(425, 585, 50, 30);
        crid6.addActionListener(this);
//database
        if(userID.equals("carl long") ){

            button.setText("CBST1001");
            course2button.setText("IFTH1000");
            course3button.setText("IFTH1009");
            course4button.setText("MGMT1004");
            course5button.setText("MGMT2007");
            course6button.setText("COMP1003");
            AgeLabel.setText("Age:18");
            programm.setText("information technology");
            GenderLabel.setText("Gender: Male");
        }

//data2
        else if(userID.equals("pell ming")){

            button.setText("MGMT2001");
            course2button.setText("HHFT2001");
            course3button.setText("ACCT2001");
            course4button.setText("HHFT2008");
            course5button.setText("HHFT2005");
            course6button.setText("HHFT2007");
            programm.setText("Hospitality Studies");
            AgeLabel.setText("Age:19");
            GenderLabel.setText("Gender: Female");
        }
//data3
        else if(userID.equals("cell phone")){

            button.setText("COMP2001");
            course2button.setText("IFTH1003");
            course3button.setText("IFTH2003");
            course4button.setText("IFTH2004");
            course5button.setText("SOCI1001");
            course6button.setText("COMP2003");
            programm.setText("Agricultural Studies");
            AgeLabel.setText("Age:19");
            GenderLabel.setText("Gender: Male");
        }
//data4
        else if(userID.equals("Red brown")){

            button.setText("ELEC2003");
            course2button.setText("CBST1001");
            course3button.setText("EESC2001");
            course4button.setText("ELEC2008");
            course5button.setText("MGMT2007");
            course6button.setText("ELEC2009");
            programm.setText("Electrical & Electronics");
            AgeLabel.setText("Age:17");
        GenderLabel.setText("Gender: Male");}
//data5
        else if(userID.equals("Ice lian")){

            button.setText("AUTO1001");
            course2button.setText("AUTO1005");
            course3button.setText("MECH1001");
            course4button.setText("SAFE1000");
            course5button.setText("TCOM1001");
            course6button.setText("TVTM1001");
            programm.setText("Motor Vehicle Engineering");
            AgeLabel.setText("Age:20");
        GenderLabel.setText("Gender: Male");}
//data6
        else if(userID.equals("Polo cream")){

            button.setText("ACCT1001");
            course2button.setText("SPAN1001");
            course3button.setText("MGMT1000");
            course4button.setText("TEXT1001");
            course5button.setText("COMP1004");
            course6button.setText("ENG1041");
            programm.setText("Office Administration");
            AgeLabel.setText("Age:19");
            GenderLabel.setText("Gender: Female");}
//data7
        else if(userID.equals("Cake lake") ){

            button.setText("RFAC1001");
            course2button.setText("RFAC1005");
            course3button.setText("RFAC1002");
            course4button.setText("TCOM1001");
            course5button.setText("TVTM1001");
            course6button.setText("SAFE1000");
            programm.setText("Air Conditioning and Refrigeration");
            AgeLabel.setText("Age:19");
            GenderLabel.setText("Gender: Male");}
//data8
        else if(userID.equals("Rock lee") ){

            button.setText("ACCT1001");
            course2button.setText("CULN1104");
            course3button.setText("CULN1105");
            course4button.setText("ENGL1042");
            course5button.setText("HCST1010");
            course6button.setText("HMAT2001");
            programm.setText("architecture Studies");
            AgeLabel.setText("Age:18");
            GenderLabel.setText("Gender: Male");}
//data9
        else if(userID.equals("Naruto paul")){

            button.setText("MGMT2001");
            course2button.setText("HHFT2001");
            course3button.setText("ACCT2002");
            course4button.setText("HHFT2008");
            course5button.setText("HHFT2005");
            course6button.setText("HHFT2007");
            programm.setText("Culinary Arts");
            AgeLabel.setText("Age:19");
            GenderLabel.setText("Gender: Male");}
//data10
        else if(userID.equals("Blake tom") ){

            button.setText("TVTM1001");
            course2button.setText("TCOM1001");
            course3button.setText("CARP1000");
            course4button.setText("CARP1001");
            course5button.setText("CARP1002");
            course6button.setText("CARP1003");
            programm.setText("TIMBER CONSTRUCTION");
            AgeLabel.setText("Age:17");
            GenderLabel.setText("Gender: Female");}
        else{}
    }

    public WelcomePage() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //input
        if (e.getSource() == cour1) {
            cour1.getText();
            int cour11 = parseInt(cour1.getText());
            System.out.println("holloco" + cour11);
        }

        if (e.getSource() == tes1) {
            tes1.getText();
            int tes11 = parseInt(tes1.getText());
            System.out.println("hollot" + tes11);
        }


        if (e.getSource() == crid1) {
            crid1.getText();
            int crid11 = parseInt(crid1.getText());
            System.out.println("hollo" + crid11);
        }

        double total;
        int tes11 = parseInt(tes1.getText());
        int cour11 = parseInt(cour1.getText());
        total = cour11 + tes11;
        System.out.println("total " + total);

        //input2

        if (e.getSource() == cour2) {
            cour2.getText();
            int cour22 = parseInt(cour2.getText());
            System.out.println("hollo2" + cour22);
        }

        if (e.getSource() == tes2) {
            tes2.getText();
            int tes22 = parseInt(tes2.getText());
            System.out.println("hollo2" + tes22);
        }


        if (e.getSource() == crid2) {
            crid2.getText();
            int crid22 = parseInt(crid2.getText());
            System.out.println("hollo2" + crid22);
        }

        double total2;
        int tes22 = parseInt(tes2.getText());
        int cour22 = parseInt(cour2.getText());
        total2 = cour22 + tes22;
        System.out.println("total " + total2);
//input3

        if (e.getSource() == cour3) {
            cour3.getText();
            int cour33 = parseInt(cour3.getText());
            System.out.println("hollo3" + cour33);
        }

        if (e.getSource() == tes3) {
            tes3.getText();
            int tes33 = parseInt(tes3.getText());
            System.out.println("hollo3" + tes33);
        }


        if (e.getSource() == crid3) {
            crid3.getText();
            int crid33 = parseInt(crid3.getText());
            System.out.println("hollo3" + crid33);
        }

        double total3;
        int tes33 = parseInt(tes3.getText());
        int cour33 = parseInt(cour3.getText());
        total3 = cour33 + tes33;
        System.out.println("total3 " + total3);


        //input4

        if (e.getSource() == cour4) {
            cour4.getText();
            int cour44 = parseInt(cour4.getText());
            System.out.println("hollo4" + cour44);
        }

        if (e.getSource() == tes4) {
            tes4.getText();
            int tes44 = parseInt(tes4.getText());
            System.out.println("hollo4" + tes44);
        }


        if (e.getSource() == crid4) {
            crid4.getText();
            int crid44 = parseInt(crid4.getText());
            System.out.println("hollo4" + crid44);
        }

        double total4;
        int tes44 = parseInt(tes4.getText());
        int cour44 = parseInt(cour4.getText());
        total4 = cour44 + tes44;
        System.out.println("total4 " + total4);
//input5

        if (e.getSource() == cour5) {
            cour5.getText();
            int cour55 = parseInt(cour5.getText());
            System.out.println("hollo5" + cour55);
        }

        if (e.getSource() == tes5) {
            tes5.getText();
            int tes55 = parseInt(tes5.getText());
            System.out.println("hollo5" + tes55);
        }


        if (e.getSource() == crid5) {
            crid5.getText();
            int crid55 = parseInt(crid5.getText());
            System.out.println("hollo55" + crid55);
        }

        double total5;
        int tes55 = parseInt(tes5.getText());
        int cour55 = parseInt(cour5.getText());
        total5 = cour55 + tes55;
        System.out.println("total5 " + total5);
//input6

        if (e.getSource() == cour6) {
            cour6.getText();
            int cour66 = parseInt(cour6.getText());
            System.out.println("hollo6" + cour66);
        }

        if (e.getSource() == tes6) {
            tes6.getText();
            int tes66 = parseInt(tes6.getText());
            System.out.println("hollo6" + tes66);
        }


        if (e.getSource() == crid6) {
            crid6.getText();
            int crid66 = parseInt(crid6.getText());
            System.out.println("hollo6" + crid66);
        }

        double total6;
        int tes66 = parseInt(tes6.getText());
        int cour66 = parseInt(cour6.getText());
        total6 = cour66 + tes66;
        System.out.println("total6 " + total6);

        if (e.getSource() == listbutton) {

            
            CoursePage coursePage = new CoursePage();
            System.out.println("plan");




        }
//ifstate1

        if (e.getSource() == button){  if( cour11 > 0 && cour11 <= 60 && tes11 > 0 && tes11 <= 40) {

            emptyLabel.setVisible(false);
            errorLabel.setVisible(false);

            double GradePoint = 0;
            String letter = null;
            if (total >= 95 && total <= 100) {

                GradePoint = 4.00;
                letter = "A+";
            } else if (total >= 85 && total <= 94) {
                GradePoint = 3.75;
                letter = "A";
            } else if (total >= 80 && total <= 84) {
                GradePoint = 3.67;
                letter = "A-";
            } else if (total >= 75 && total <= 79) {
                GradePoint = 3.33;
                letter = "B+";
            } else if (total >= 70 && total <= 74) {
                GradePoint = 3.00;
                letter = "B";
            } else if (total >= 65 && total <= 69) {
                GradePoint = 2.75;
                letter = "B-";
            } else if (total >= 60 && total <= 64) {
                GradePoint = 2.67;
                letter = "C+";
            } else if (total >= 55 && total <= 59) {
                GradePoint = 2.33;
                letter = "C";
            } else if (total >= 50 && total <= 54) {
                GradePoint = 2.00;
                letter = "C-";
            } else if (total >= 45 && total <= 49) {
                GradePoint = 1.67;
                letter = "D+";
            } else if (total >= 40 && total <= 44) {
                GradePoint = 1.33;
                letter = "D";
            } else if (total >= 0 && total <= 39) {
                GradePoint = 0.00;
                letter = "F";
            } else {

                System.out.println("error");
            }

            Grade1Label.setBounds(200, 200, 200, 35);
            Grade1Label.setFont(new Font(null, Font.PLAIN, 10));
            Grade1Label.setText("Grade: " + letter);
            Grade1Label.setVisible(true);
            frame.add(Grade1Label);


            point1Label.setBounds(250, 200, 200, 35);
            point1Label.setFont(new Font(null, Font.PLAIN, 10));
            point1Label.setText("Grade Point: " + GradePoint);
            point1Label.setVisible(true);



            gp1.setText(valueOf(GradePoint));


            totl1Label.setBounds(340, 200, 200, 35);
            totl1Label.setFont(new Font(null, Font.PLAIN, 10));
            totl1Label.setText(total + "%");
            totl1Label.setVisible(true);
            frame.add(totl1Label);


            System.out.println("your bs " + GradePoint);


        } else {

            errorLabel.setVisible(true);

        }}

        //ifstate2

        //ifstate1

        if (e.getSource() == course2button){  if( cour22 > 0 && cour22 <= 60 && tes22 > 0 && tes22 <= 40) {

            empty2Label.setVisible(false);
            error2Label.setVisible(false);

            double GradePoint2 = 0;
            String letter2 = null;
            if (total2 >= 95 && total2 <= 100) {

                GradePoint2 = 4.00;
                letter2 = "A+";
            } else if (total2 >= 85 && total2 <= 94) {
                GradePoint2 = 3.75;
                letter2 = "A";
            } else if (total2 >= 80 && total2 <= 84) {
                GradePoint2 = 3.67;
                letter2 = "A-";
            } else if (total2 >= 75 && total2 <= 79) {
                GradePoint2 = 3.33;
                letter2 = "B+";
            } else if (total2 >= 70 && total2 <= 74) {
                GradePoint2 = 3.00;
                letter2 = "B";
            } else if (total2 >= 65 && total2 <= 69) {
                GradePoint2 = 2.75;
                letter2 = "B-";
            } else if (total2 >= 60 && total2 <= 64) {
                GradePoint2 = 2.67;
                letter2 = "C+";
            } else if (total2 >= 55 && total2 <= 59) {
                GradePoint2 = 2.33;
                letter2 = "C";
            } else if (total2 >= 50 && total2 <= 54) {
                GradePoint2 = 2.00;
                letter2 = "C-";
            } else if (total2 >= 45 && total2 <= 49) {
                GradePoint2 = 1.67;
                letter2 = "D+";
            } else if (total2 >= 40 && total2 <= 44) {
                GradePoint2 = 1.33;
                letter2 = "D";
            } else if (total2 >= 0 && total2 <= 39) {
                GradePoint2 = 0.00;
                letter2 = "F";
            } else {

                System.out.println("error");
            }

            Grade2Label.setBounds(200, 275, 200, 35);
            Grade2Label.setFont(new Font(null, Font.PLAIN, 10));
            Grade2Label.setText("Grade: " + letter2);
            Grade2Label.setVisible(true);
            frame.add(Grade2Label);


            point2Label.setBounds(250, 275, 200, 35);
            point2Label.setFont(new Font(null, Font.PLAIN, 10));
            point2Label.setText("Grade Point: " + GradePoint2);
            point2Label.setVisible(true);
            frame.add(point2Label);

            totl2Label.setBounds(340, 275, 200, 35);
            totl2Label.setFont(new Font(null, Font.PLAIN, 10));
            totl2Label.setText(total2 + "%");
            totl2Label.setVisible(true);
            frame.add(totl2Label);

            gp2.setText(valueOf(GradePoint2));


            System.out.println("your bs " + GradePoint2);


        } else {

            error2Label.setVisible(true);
        }
        }

        //ifstate3

        //ifstate1

        if (e.getSource() == course3button){  if( cour33 > 0 && cour33 <= 60 && tes33 > 0 && tes33 <= 40) {

            empty3Label.setVisible(false);
            error3Label.setVisible(false);

            double GradePoint3 = 0;
            String letter3 = null;
            if (total3 >= 95 && total3 <= 100) {

                GradePoint3 = 4.00;
                letter3 = "A+";
            } else if (total3 >= 85 && total3 <= 94) {
                GradePoint3 = 3.75;
                letter3 = "A";
            } else if (total3 >= 80 && total3 <= 84) {
                GradePoint3 = 3.67;
                letter3 = "A-";
            } else if (total3 >= 75 && total3 <= 79) {
                GradePoint3 = 3.33;
                letter3 = "B+";
            } else if (total3 >= 70 && total3 <= 74) {
                GradePoint3 = 3.00;
                letter3 = "B";
            } else if (total3 >= 65 && total3 <= 69) {
                GradePoint3 = 2.75;
                letter3 = "B-";
            } else if (total3 >= 60 && total3 <= 64) {
                GradePoint3 = 2.67;
                letter3 = "C+";
            } else if (total3 >= 55 && total3 <= 59) {
                GradePoint3 = 2.33;
                letter3 = "C";
            } else if (total3 >= 50 && total3 <= 54) {
                GradePoint3 = 2.00;
                letter3 = "C-";
            } else if (total3 >= 45 && total3 <= 49) {
                GradePoint3 = 1.67;
                letter3 = "D+";
            } else if (total3 >= 40 && total3 <= 44) {
                GradePoint3 = 1.33;
                letter3 = "D";
            } else if (total3 >= 0 && total3 <= 39) {
                GradePoint3 = 0.00;
                letter3 = "F";
            } else {

                System.out.println("error");
            }

            Grade3Label.setBounds(200, 350, 200, 35);
            Grade3Label.setFont(new Font(null, Font.PLAIN, 10));
            Grade3Label.setText("Grade: " + letter3);
            Grade3Label.setVisible(true);
            frame.add(Grade3Label);


            point3Label.setBounds(250, 350, 200, 35);
            point3Label.setFont(new Font(null, Font.PLAIN, 10));
            point3Label.setText("Grade Point: " + GradePoint3);
            point3Label.setVisible(true);
            frame.add(point3Label);

            totl3Label.setBounds(340, 350, 200, 35);
            totl3Label.setFont(new Font(null, Font.PLAIN, 10));
            totl3Label.setText(total3 + "%");
            totl3Label.setVisible(true);
            frame.add(totl3Label);

            gp3.setText(valueOf(GradePoint3));


            System.out.println("your bs " + GradePoint3);


        } else {

            error3Label.setVisible(true);

        }}

        //ifstate4


        if (e.getSource() == course4button){  if( cour44 > 0 && cour44 <= 60 && tes44 > 0 && tes44 <= 40) {
            error4Label.setVisible(false);
            empty4Label.setVisible(false);


            double GradePoint4 = 0;
            String letter4 = null;
            if (total4 >= 95 && total4 <= 100) {

                GradePoint4 = 4.00;
                letter4 = "A+";
            } else if (total4 >= 85 && total4 <= 94) {
                GradePoint4 = 3.75;
                letter4 = "A";
            } else if (total4 >= 80 && total4 <= 84) {
                GradePoint4 = 3.67;
                letter4 = "A-";
            } else if (total4 >= 75 && total4 <= 79) {
                GradePoint4 = 3.33;
                letter4 = "B+";
            } else if (total4 >= 70 && total4 <= 74) {
                GradePoint4 = 3.00;
                letter4 = "B";
            } else if (total4 >= 65 && total4 <= 69) {
                GradePoint4 = 2.75;
                letter4 = "B-";
            } else if (total4 >= 60 && total4 <= 64) {
                GradePoint4 = 2.67;
                letter4 = "C+";
            } else if (total4 >= 55 && total4 <= 59) {
                GradePoint4 = 2.33;
                letter4 = "C";
            } else if (total4 >= 50 && total4 <= 54) {
                GradePoint4 = 2.00;
                letter4 = "C-";
            } else if (total4 >= 45 && total4 <= 49) {
                GradePoint4 = 1.67;
                letter4 = "D+";
            } else if (total4 >= 40 && total4 <= 44) {
                GradePoint4 = 1.33;
                letter4 = "D";
            } else if (total4 >= 0 && total4 <= 39) {
                GradePoint4 = 0.00;
                letter4 = "F";
            } else {

                System.out.println("error");
            }

            Grade4Label.setBounds(200, 425, 200, 35);
            Grade4Label.setFont(new Font(null, Font.PLAIN, 10));
            Grade4Label.setText("Grade: " + letter4);
            Grade4Label.setVisible(true);
            frame.add(Grade4Label);


            point4Label.setBounds(250, 425, 200, 35);
            point4Label.setFont(new Font(null, Font.PLAIN, 10));
            point4Label.setText("Grade Point: " + GradePoint4);
            point4Label.setVisible(true);
            frame.add(point4Label);

            totl4Label.setBounds(340, 425, 200, 35);
            totl4Label.setFont(new Font(null, Font.PLAIN, 10));
            totl4Label.setText(total4 + "%");
            totl4Label.setVisible(true);
            frame.add(totl4Label);


            gp3.setText(valueOf(GradePoint4));


            System.out.println("your bs " + GradePoint4);


        } else {

            error4Label.setVisible(true);

        }}

        //ifstate5

        //ifstate1

        if (e.getSource() == course5button){  if( cour55 > 0 && cour55 <= 60 && tes55 > 0 && tes55 <= 40) {

            empty5Label.setVisible(false);
            error5Label.setVisible(false);

            double GradePoint5 = 0;
            String letter5 = null;
            if (total5 >= 95 && total5 <= 100) {

                GradePoint5 = 4.00;
                letter5 = "A+";
            } else if (total5 >= 85 && total <= 94) {
                GradePoint5 = 3.75;
                letter5 = "A";
            } else if (total5 >= 80 && total <= 84) {
                GradePoint5 = 3.67;
                letter5 = "A-";
            } else if (total5 >= 75 && total <= 79) {
                GradePoint5 = 3.33;
                letter5 = "B+";
            } else if (total5 >= 70 && total <= 74) {
                GradePoint5 = 3.00;
                letter5 = "B";
            } else if (total5 >= 65 && total <= 69) {
                GradePoint5 = 2.75;
                letter5 = "B-";
            } else if (total5 >= 60 && total5 <= 64) {
                GradePoint5 = 2.67;
                letter5 = "C+";
            } else if (total5 >= 55 && total5 <= 59) {
                GradePoint5 = 2.33;
                letter5 = "C";
            } else if (total5 >= 50 && total5 <= 54) {
                GradePoint5 = 2.00;
                letter5 = "C-";
            } else if (total5 >= 45 && total5 <= 49) {
                GradePoint5 = 1.67;
                letter5 = "D+";
            } else if (total5 >= 40 && total5 <= 44) {
                GradePoint5 = 1.33;
                letter5 = "D";
            } else if (total5 >= 0 && total5 <= 39) {
                GradePoint5 = 0.00;
                letter5 = "F";
            } else {

                System.out.println("error");
            }

            Grade5Label.setBounds(200, 500, 200, 35);
            Grade5Label.setFont(new Font(null, Font.PLAIN, 10));
            Grade5Label.setText("Grade: " + letter5);
            Grade5Label.setVisible(true);
            frame.add(Grade5Label);


            point5Label.setBounds(250, 500, 200, 35);
            point5Label.setFont(new Font(null, Font.PLAIN, 10));
            point5Label.setText("Grade Point: " + GradePoint5);
            point5Label.setVisible(true);
            frame.add(point5Label);

            totl5Label.setBounds(340, 500, 200, 35);
            totl5Label.setFont(new Font(null, Font.PLAIN, 10));
            totl5Label.setText(total5 + "%");
            totl5Label.setVisible(true);
            frame.add(totl5Label);


            gp5.setText(valueOf(GradePoint5));


            System.out.println("your bs " + GradePoint5);


        } else {

            error5Label.setVisible(true);

        }}

        //ifstate6

        //ifstate1

        if (e.getSource() == course6button){  if( cour66 > 0 && cour66 <= 60 && tes66 > 0 && tes66 <= 40) {

            empty6Label.setVisible(false);
            error6Label.setVisible(false);

            double GradePoint6 = 0;
            String letter6 = null;
            if (total6 >= 95 && total6 <= 100) {

                GradePoint6 = 4.00;
                letter6 = "A+";
            } else if (total6 >= 85 && total6 <= 94) {
                GradePoint6 = 3.75;
                letter6 = "A";
            } else if (total6 >= 80 && total6 <= 84) {
                GradePoint6 = 3.67;
                letter6 = "A-";
            } else if (total6 >= 75 && total6 <= 79) {
                GradePoint6 = 3.33;
                letter6 = "B+";
            } else if (total6 >= 70 && total6 <= 74) {
                GradePoint6 = 3.00;
                letter6 = "B";
            } else if (total6 >= 65 && total6 <= 69) {
                GradePoint6 = 2.75;
                letter6 = "B-";
            } else if (total6 >= 60 && total6 <= 64) {
                GradePoint6 = 2.67;
                letter6 = "C+";
            } else if (total6 >= 55 && total6 <= 59) {
                GradePoint6 = 2.33;
                letter6 = "C";
            } else if (total6 >= 50 && total6 <= 54) {
                GradePoint6 = 2.00;
                letter6 = "C-";
            } else if (total6 >= 45 && total6 <= 49) {
                GradePoint6 = 1.67;
                letter6 = "D+";
            } else if (total6 >= 40 && total6 <= 44) {
                GradePoint6 = 1.33;
                letter6 = "D";
            } else if (total6 >= 0 && total6 <= 39) {
                GradePoint6 = 0.00;
                letter6 = "F";
            } else {

                System.out.println("error");
            }

            Grade6Label.setBounds(200, 575, 200, 35);
            Grade6Label.setFont(new Font(null, Font.PLAIN, 10));
            Grade6Label.setText("Grade: " + letter6);
            Grade6Label.setVisible(true);
            frame.add(Grade6Label);


            point6Label.setBounds(250, 575, 200, 35);
            point6Label.setFont(new Font(null, Font.PLAIN, 10));
            point6Label.setText("Grade Point: " + GradePoint6);
            point6Label.setVisible(true);
            frame.add(point6Label);

            totl6Label.setBounds(340, 575, 200, 35);
            totl6Label.setFont(new Font(null, Font.PLAIN, 10));
            totl6Label.setText(total6 + "%");
            totl6Label.setVisible(true);
            frame.add(totl6Label);

            gp6.setText(valueOf(GradePoint6));


            System.out.println("your bs " + GradePoint6);


        } else {

            error6Label.setVisible(true);

        }}
        error6Label.setVisible(false);


        String crid111 = crid6.getText();
        double crid112 = Double.parseDouble(crid111);
        String crid221 = crid6.getText();
        double crid222 = Double.parseDouble(crid221);
        String crid331 = crid6.getText();
        double crid332 = Double.parseDouble(crid331);
        String crid441 = crid6.getText();
        double crid442 = Double.parseDouble(crid441);
        String crid551 = crid6.getText();
        double crid552 = Double.parseDouble(crid551);
        String crid661 = crid6.getText();
        double crid662 = Double.parseDouble(crid661);

        String GradePoint11 = gp1.getText();
        String GradePoint22 = gp1.getText();
        String GradePoint33 = gp1.getText();
        String GradePoint44 = gp1.getText();
        String GradePoint55 = gp1.getText();
        String GradePoint66 = gp1.getText();

        double GradePoint112 = Double.parseDouble(GradePoint11);
        double GradePoint222 = Double.parseDouble(GradePoint22);
        double GradePoint332 = Double.parseDouble(GradePoint33);
        double GradePoint442 = Double.parseDouble(GradePoint44);
        double GradePoint552 = Double.parseDouble(GradePoint55);
        double GradePoint662 = Double.parseDouble(GradePoint66);

        double gradecedit1 = GradePoint112 * crid112;
        double gradecedit2 = GradePoint222 * crid222;
        double gradecedit3 = GradePoint332 * crid332;
        double gradecedit4 = GradePoint442 * crid442;
        double gradecedit5 = GradePoint552 * crid552;
        double gradecedit6 = GradePoint662 * crid662;

        double totalGradePoint = GradePoint112 + GradePoint222 + GradePoint332+ GradePoint442 + GradePoint552 + GradePoint662;
        double totalCredit = crid112 + crid222 + crid332 + crid442 + crid552 + crid662;
        double totalgradecedit = gradecedit1 + gradecedit2 + gradecedit3 + gradecedit4 + gradecedit5 + gradecedit6;

        double gpA = totalgradecedit / totalCredit;
        double gpa = Math.round(gpA * 100.0) / 100.0;
        TotalGradePoint.setText("Total Grade Point: succes" + totalGradePoint);

        if(e.getSource() == APGButton) {





            GPALabel.setText("GPA:" + gpa);
            GPALabel.setVisible(true);




            System.out.println("your" + gpa);

            if(gpa >= 3.5 && gpa <= 3.6){
                honorLeble.setText("Honor: Cum laude");
            }
            else if(gpa >= 3.7 && gpa <= 3.8){
                honorLeble.setText("Honor: Magna cum laude");
            }
            else if(gpa >= 3.9 && gpa <= 4.0){
                honorLeble.setText("Honor: Summa cum laude");
            }
            else{honorLeble.setText("Honor:unqualified");}

        }
        else { }



        if(e.getSource() == Reportbutton){




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


            fport.add(emptyLabel);
            fport.add(empty2Label);
            fport.add(empty3Label);
            fport.add(empty4Label);
            fport.add(empty5Label);
            fport.add(empty6Label);

            fport.add(TotalGradePoint);
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
            fport.setSize(900, 800);
            fport.setLayout(null);
            fport.setVisible(true);
        }
        else
            {}










;




    }
}
