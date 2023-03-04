import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.*;

public class CoursePage implements ActionListener {

    JFrame f = new JFrame();
    JButton program1 = new JButton("test");
    JButton program2 = new JButton("Course");
    JButton program3 = new JButton("Credit");
    JButton program4 = new JButton("test");
    JButton program5 = new JButton("Course");
    JButton program6 = new JButton("Credit");
    JButton program7 = new JButton("test");
    JButton program8 = new JButton("Course");
    JButton program9 = new JButton("Credit");
    JButton program10 = new JButton("Credit");

    JLabel disciption1 = new JLabel("test");
    JLabel disciption2 = new JLabel("Course");
    JLabel disciption3 = new JLabel("Credit");
    JLabel disciption4 = new JLabel("test");
    JLabel disciption5 = new JLabel("Course");
    JLabel disciption6 = new JLabel("Credit");
    JLabel disciption7 = new JLabel("test");
    JLabel disciption8 = new JLabel("Course");
    JLabel disciption9 = new JLabel("Credit");
    JLabel disciption10 = new JLabel("Credit");

    CoursePage() {

        String program11 = ("Architectual Design Technology (A.A.S)\n" +
                "This programme has been designing to provide a two year (4 Semesters) full-time Associate Degree in Architectural Design Technology. This course is intended to provide the students with the necessary skills as indicated in the list of objectives below and is applied to buildings not exceeding three stories with a minimum area of 100m2 and should include domestic, industrial, storage and business premises.\n" +
                "ENTRY REQUIREMENTS\n" +
                "\n" +
                "1. Candidate must have Five (5) subjects at CXC General Proficiency or equivalent inculding:\n" +
                "     Mathematics, English Language, Technical Drawing and Physics with Grade I, II, or III.\n" +
                "OR\n" +
                "2. NVQ IN THE RELATED FIELD OR\n" +
                "3. CVQ Level 2 in Architecture Design Technology OR\n" +
                "4 .CVQ Level 2 in Construction Management OR\n" +
                "\n" +
                "AHDT1002 Construction Technology I   AHDT1003 Design Drawing I\n" +
                "AHDT1007 Architectural History I   AHDT1006 Environmental Science I\n" +
                "DRAW1002 Construction Drawing 1   IFTH1002 Information Technology\n" +
                "TVTM1001 Technical Maths TCOM1001   Technical Communication I\n" +
                "AHDT1001 Site Surveying I AHDT1004   Building Services\n" +
                "AHDT1022 Construction Technology II   AHDT1023 Design & Drawing IIAHDT1026 Environmental Science II DRAW1003   Construction Drawing II\n" +
                "COMP1011 Computer Aided Drawing   TVTM1002 Technical Maths\n" +
                "AHDT2001 Resource Management I    AHDT2031 Design Studio III\n" +
                "AHDT2033 Measurement & Estimating    AHDT2002 Site Surveying II\n" +
                "\n" +
                "AHDT3008 Construction Mathematics III (Mechanics)   COMP2012 Computer Aided Drawing II\n" +
                "ELEC1007 Residential Industrial Wiring   AHDT1010 Structural Mechanics\n" +
                "AHDT2000 Heating, Ventilation and Air-Conditioning System  AHDT2032 Design & Drawing IV\n" +
                "AHDT2021 Resource Management II   AHDT2009 Internship Job Attachment\n" +
                "AHDT4008 Construction Mathematics   ELEC1008 RCI- Renewable Energy\n" +
                "MGMT2006 Entrepreneurship\n");

        String program22 = ("TVEMS INFORMATION TECHNOLOGY (A.A.S)\n" +
                "This curriculum provides a broad perspective on how to use and apply the knowledge and tools of Information Technology, Computer Science and/or Information Systems, to the self and society. Students in this two year entry level degree programme will be encouraged to grapple with the complexities, as well as the advantages and disadvantages, of these fields in their everyday life and workplaces. Majors are premised on the notion that ICT understandings are best developed within the context of an application. Prominent features of the courses that have been included are practical labs and projects that emphasize replication of real-life situations and require the use of a variety of resources for learning.\n" +
                "\n" +
                "Entry Requirements\n" +
                "For admission to the Information Technology program, Candidate MUST has Four (4) subjects at CXC General Proficiency including Mathematics, English, Information Technology and a science subject.\n" +
                "\n" +
                "IFTH1010 Introduction to Modern Computing Concepts IFTH1008 Introduction to Computer Science\n" +
                "IMAT2001 Discrete Mathematics   SPAN1001 Spanish\n" +
                "ENGL1041 Language and Communication Studies   IFTH1006 Fundamentals of Programming\n" +
                "SAFE1000 Occupational Health and Safety\tIFTH1001 Computer Science I:Object Oriented Programming\n" +
                "MGMT2007 Organisational Behaviour   IFTH1000 Fundamentals of Computer Hardware and Software\n" +
                "CBST1001 Caribbean Issues and Perspectives  MGMT1004 Critical Thinking\n" +
                "IFTH1009 Systems Analysis and Design   COMP2001 Computer Science II: Software Engineering\n" +
                "IFTH1003 Introduction Management Information System   IFTH2003 Fundamentals of Networks\n" +
                "IFTH2004 Basic Computer System Assembly   SOCI1001 Sociology\n" +
                "COMP2003 Introduction to Structured Programming  IFTH2005 Introduction to Web Page Design\n" +
                "IFTH2006 Data Security Concepts   IFTH2009 Electronic (E-) Business Technologies\n" +
                "IFTH2008 Fundamentals of Telecommunication System  IFTH2001 Internship and Project (Capstone Project)\n");

        String program33 = ("TVEMS ELECTRICAL & ELECTRONICS\n" +
                "The Electrical and Electronic Technology Technician (EET) programme is a two-year full-time Technician Program designed to advance the prepare individuals for a career in the electrical and/or electronics industry. The purpose of the programme is to develop the level of knowledge required by Technicians, over a wide range of applications. The programme also provides a progressive pattern of specialism in electrical and electronics principles and technology.\n" +
                "\n" +
                "ENTRY REQUIREMENTS\n" +
                "\n" +
                "Candidates must have four(4) CSEC subjects or equivalent inculding: Mathematics, English Language with Grade I, II, or III.      OR\n" +
                " NVQ in the related field** OR\n" +
                "Any Other Four (4) CSEC subjects (Grade I, II, or III) or the equivalence OR\n" +
                "CVQ Level 2 in the related field** OR\n" +
                "CFBC Diploma in Electrical and Electronics Technology OR\n" +
                "Special consideration will be given to mature students (over 25) under the College Mature Student Clause.  These candidates will be required to complete a professional development portfolio, which will serve as documented evidence of their prior knowledge experiences.\n" +
                "\n" +
                "\n" +
                "TCOM1001 Technical Communication 1   TVTM1001 Technical Mathematics I\n" +
                "ELEC1001 Electrical Principles I   SAFE1000 Occupational Health and Safety I\n" +
                "ELEC1005 Electronics Principles I   IFTH1002 Information Technology\n" +
                "ELEC1008 RCI-Renewable Energy\tELEC1009 Analog Electronics\n" +
                "ELEC1008 RCI- Renewable Energy   ELEC1004 Electrical Principles II\n" +
                "DRAW1001 Engineering Drawing   TVTM1002 Technical Mathematics II\n" +
                "IFTH1002 Information Technology   ELEC2003 Electrical Principles III\n" +
                "CBST1001 Caribbean Issues & Perspectives   EESC2001 Engineering Science\n" +
                "ELEC2008 Digital Electronics   ELEC2009 Electrical Power Systems I \t\n" +
                "EESC2003 Mechanics of Materials  ELEC2004 Electrical Principles IV\n" +
                "ELEC2006 Electronics Principle 4   SPAN1001 Spanish\n" +
                "MGMT2006 Entrepreneurship  INTP2001 Internship\n" +
                "ELEC2010 Electrical Power Systems II \n");

        String program44 = ("TVEMS MOTOR VEHICLE ENGINEERING\n" +
                "\n" +
                "The Automotive Engineering Technology programme explores various automotive systems. It introduces students to the fundamentals of automotive testing, servicing and repairs. The programme features instruction in mechanical workshop technology, auto electrical and electronic systems, auto body repairs, internal combustions engines, fuel and emission systems, auto air-conditioning, advanced diagnostics and performance.\n" +
                "\n" +
                "Entry Requirements\n" +
                "\n" +
                "Candidates must have four(4) CSEC subjects or equivalent inculding: Mathematics, English Language (Grade I, II, or III). \n" +
                "\n" +
                "Any Other Four (4) CSEC subjects (Grade I, II, or III) or the equivalence OR\n" +
                "NVQ in the related field** OR\n" +
                "CVQ Level 2 in the related field** OR\n" +
                "An AVEC Certificate of Competence in the related field OR\n" +
                "CFBC Diploma in Automotive Engineering Technology  OR\n" +
                "Special consideration will be given to mature students (over 25) under the College Mature Student Clause. These candidates will be required to complete a professional development portfolio, which will serve as documented evidence of their prior knowledge experiences.\n" +
                "\n" +
                "AUTO1001 Internal Combustion Engines   AUTO1005 Auto Electrical & Electronic Systems 1\n" +
                "MECH1001 Mechanical WorkShop Technology\n" +
                "SAFE1000 Occupational Health and Safety   TCOM1001 Technical Communications\n" +
                "TVTM1001 Technical Maths\tAUTO1003 Fuel and Emission Systems\n" +
                "EESC2001 Engineering Science   AUTO1004 Auto Chassis Systems 1\n" +
                "AUTO1015 Auto Electrical & Electronic Systems II   TVTM1002 Technical Maths\n" +
                "WELD1001 Maintenance Welding 1  MECH2001 Mechanical Technology\n" +
                "TECH2001 Motor Vehicle Technology  TECH2003 Workshop Practice\n" +
                "AUTO2005 Auto Electrical & Electronic Systems 3   DRAW2002 Engineering Drawing & Design\n" +
                "MGMT2006 Entrepreneurship  SPAN1001 Spanish\n" +
                "SFAT1001 Structured Field Assignment  TECH2004 Workshop Practice\n" +
                "AUTO2009 Auto Air-Conditioning  AUTO2008 Advanced Diagnostics & Performance\n" +
                "AUTO2016 Auto Chassis System 3\n");


        String program55 = ("TVEMS OFFICE ADMINISTRATION\n" +
                "The main aim of this program is to provide a level of training consistent with the changing demands of today’s work environment and the high standard of performance required by employers of their administrative support staff at the middle and senior management levels. Therefore, much of the emphasis of this programme is on the management and organizational practices, computerized applications, business ethics and communications and the administration of office systems and procedures.\n" +
                "\n" +
                "Admission Requirements\n" +
                "\n" +
                " Four (4) passes at CSEC General Proficiency Level with Grade 1, 2, or 3 including English.\n" +
                "Any qualification considered by the College to be equivalent to the abovementioned.\n" +
                "\n" +
                "\n" +
                "ACCT1001 Principle of Accounting  SPAN1001 Spanish I\n" +
                "MGMT1000 Business Law  TEXT1001 Text Processing I\n" +
                "COMP1004 Computer Concepts\n" +
                "ENG1041 English & Communication I\tACCT2001 Financial Account I\n" +
                "MGMT1001 Principle of Management  ECON1001 Micro-Economics\n" +
                "PMAT1001 Practical Maths   SPAN1002 Spanish II\n" +
                "MGMT1003 Business Communication OADM2001 Office Administration and Management I\n" +
                "OADM2002 Caribbean Politics and Society   MGMT2007 Organizational Behavior\n" +
                "ECON1002 Macro-Economics   COMP2006 Micro- Computer Application 1\n" +
                "ACCT2007 Financial Accounting II\t MGMT2004 Human Resource Management\n" +
                "OADM2003 Ethic and Citizenship   OADM2004 Office Administration and Management II\n" +
                "MGMT2005 Fundamental of Marketing   COMP2007 Micro-Computer Application 2\n" +
                "OADM2006 Seminar Presentation   INTP2002 OADM Internship\n");

        String program66 = ("The Refrigeration and Air Conditioning (RAC) programme is a two-year full-time Technician Programme designed to advance the preparation of individuals for careers in the refrigeration and air conditioning field. The purpose of the programme is to develop the level of knowledge required Technicians, over a wide range of applications. The programme also provides a progressive pattern of specialism in RAC principles and technology\n" +
                "\n" +
                "ENTRY REQUIREMENTS\n" +
                "\n" +
                "Candidates must have four(4) CSEC subjects or equivalent including: Mathematics, English Language with Grade I, II, or III.\n" +
                " NVQ in the related field** OR\n" +
                "CFBC Diploma in Refrigeration and Air Conditioning Technology OR\n" +
                "Special consideration will be given to mature students (over 25) under the College Mature Student Clause.  These candidates will be required to complete a professional development portfolio, which will serve as documented evidence of their prior knowledge experience(s).\n" +
                "\n" +
                "RFAC1001 Introduction to Refrigeration   RFAC1005 Electricity for RAC 1\n" +
                "RFAC1002 Trade Tools & Testing Instruments  TCOM1001 Technical Communication I\n" +
                "TVTM1001 Technical Mathematics 1 (College Algebra)  SAFE1000 Occupational Health & Safety I\n" +
                " RFAC1007 Refrigeration Components  RFAC1008 Electricity for RAC II\n" +
                "EESC2001 Engineering Science  RFAC1004 Refrigerant Management\n" +
                "WELD1001 Maintenance Welding I  IFTH1002 Information Technology\n" +
                "TVTM1002 Technical Maths II  RFAC2000 Electricity for RAC III\n" +
                "RFAC2013 Residential Refrigeration & Air Conditioning 1  RFAC2014 Commercial Refrigeration & Air Conditioning 1\n" +
                "CBST1001 Caribbean Issues & Perspective RFAC2103 Residential Refrigeration & Air Conditioning 2\n" +
                "RFAC2104 Commercial Refrigeration & Air Conditioning 2 RFAC2007 Electricity for RAC IV\n" +
                "SPAN1001 Spanish MGMT2006 Entrepreneurship\n" +
                "RFAC2101 Customer Relations\n");
        String program77 = ("Agro-Technology: practical knowledge\n" +
                " of building design, irrigation systems, hydroponics, pest\n" +
                " management,agro-processing, engines, tools, and all other technology and infrastructure necessary to operate\n" +
                " agricultural enterprises efficiently.\n" +
                "\n" +
                "Entry Requirements \n" +
                " \n" +
                "Candidates must have four(4) CSEC subjects or equivalent including English Language and Agriculture Science (Grade I, II, or III).      OR\n" +
                "Any Other Four (4) CSEC subjects (Grade I, II, or III) or the equivalence OR\n" +
                "NVQ in the related field** OR\n" +
                "CVQ Level 2 in the related field OR\n" +
                "Special consideration will be given to mature students (over 25) under the College Mature Student Clause. \n" +
                " These candidates will be required to complete a professional development portfolio, which will serve as documented \n" +
                "evidence of their prior knowledge experience(s).\n" +
                "\n" +
                "\n" +
                "General Education\n" +
                "AGSS1114 Ecological Principles  CBST1001 Caribbean Issues and Perspectives\n" +
                "TCOM1001 Technical Communication I AGSS1111 Intro to Crop Agriculture Agri-Business\n" +
                "ACCT1001 Principle of Accounts  AHDT1003 Design and Drawing\n" +
                "AGSS1124 Renewable Energy   IFTH1002 Information Technology\n" +
                "SOCI1001 Sociology  AGSS1020 Environmental Science\n" +
                "TCOM2001 Technical Communication II   SAFE1000 Occupational Health & Safety\n" +
                "AGSS1112 Intro to Livestock Agriculture   MGMT1001 Principles of Management\n" +
                "MECH1001 Mechanical Technology   AGSS1113 Traditional Agricultural Systems\n" +
                "HMAT1001 Introduction to Statistics  SPAN1001 Spanish\n" +
                "MGMT1000 Business Law   MGMT2007 Organizational Behaviour\n" +
                "COMM1001 Gathering and Processing Information  COMP1011 Computer Aided Drawing\n" +
                "AGST2121 Irrigation Systems  AGSS2020 Measurement and Estimating\n" +
                "COMM1001 Gathering and Processing Information   AGSS2111 Horticulture\n" +
                "AGSS2122 Plant Genetics & Plant Nutrition  COMM1001 Gathering and Processing Information\n" +
                "AGSR2213 Capstone I (Internship)   ACCT2001 Financial Accounting I\n" +
                "MGMT2006 Entrepreneurship  CON1001 Elements of Microeconomics\n" +
                "MGMT1003 Business Communication   MGMT2004 Human Resource Management\n" +
                "AGSB2210 Agriculture Business Enterprise  AGST2212 Agro-Mechanical Technology\n" +
                "ELCI1000 Electrical Installation   RFAC1001 Fundamentals of Refrigeration\n" +
                "AGST2110 Agro-Processing GSS2213 Non-Traditional Agricultural Systems\n" +
                "AGSS2224 Animal Husbandry    AGSS2225 Plant Physiology & Hydroponic Formulas\n" +
                "AGSS2241 Integrated Pest Management   AGSS2250 Environmental Pollution\n" +
                "CULN1105 Food Science and Nutrition  \n" +
                "Capstone Project\n" +
                "AGSR2224 Capstone II (Project)\n");
        String program88 = ("This programme has been designed to provide a two year 4 Semesters full-time Diploma in Timber\n" +
                " Vocation-Carpentry.  This course is intended to provide the students with the necessary skills and information \n" +
                "to cope with the ever-increasing changes in the techniques in timber construction as indicated in the list of objectives.\n" +
                "  In order to become eligible for graduation, a student must have been present for at least 80% of each course and \n" +
                "have successfully completed all class-related work and course assignments/projects/examinations.\n" +
                "\n" +
                "ENTRY REQUIREMENTS\n" +
                "\n" +
                "Students seeking acceptance to the Timber Vocation Course should possess a minimum of four CSEC subject\n " +
                "Grade I, II or III  or the equivalence      OR\n" +
                "CCSLC Certificate OR\n" +
                "An AVEC Certificate of Competence in the related field OR\n" +
                "NVQ Certificate in the related field OR\n" +
                "CVQ Level 2 in the related field OR\n" +
                "City & Guilds Level 2 in the related field OR\n" +
                "ONE (1) or TWO (2) years of working experience in the related field \n" +
                "\n" +
                "TVTM1001 Technical Mathematics I  TCOM1001 Technical Communication I\n" +
                "CARP1000 Workshop Practice 1  CARP1001 Building Science I\n" +
                "CARP1002 Construction Technology I   CARP1003 Basic Construction Skills I\n" +
                "DRAW1002 Construction Drawing I   DRAW1003 Construction Drawing II\n" +
                "CARP1006 Construction Technology II CARP1002   CARP1004 Building Science IICARP1001\n" +
                "CARP1007 Workshop Practice 2   CARP1008 Basic Construction Skills II CARP1003\n" +
                "IFTH100 Information Technology   TCOM2001 Technical Communication II TCOM1001\n" +
                "TVTM1002 Technical Mathematics II TVTM1001\n");
        String program99 = ("This global training can best be realized through a dedicated partnership between specialized \n" +
                "educational institutions and the tourism sector. A partnership such as this should effectively garner \n" +
                "the requisites of the industry, thereby making it possible to provide students with the essentials to \n" +
                "contribute to a prosperous Tourism/Hospitality Industry.\n" +
                "\n" +
                "Entry Requirements\n" +
                "\n" +
                "\n" +
                "• A minimum of four(4) subjects CXC/CSEC General, grades 1 – 3 or equivalent, inculding English Language.\n" +
                "\n" +
                "Study Mode: Part-Time\n" +
                "\n" +
                "Duration: 3 Years\n" +
                "\n" +
                "AWARDS\n" +
                "CFBC Associate Degree in Culinary Arts.\n" +
                "\n" +
                "CULN1102 Food Preparation I  CULN1102 Baking Technology I\n" +
                "ENGL1041 English Communication I  FREN1003 French I\n" +
                "HHFT1013 Intro Tourism/Hospitality  SAFE1002 Sanitation Safety and Hygiene\n" +
                "IFTH1002 Information Technology\tACCT1001 Principle of Accounting\n" +
                "CULN1104 Food Preparation II  CULN1105 Food Science and Nutrition\n" +
                "ENGL1042 English Communication II CST1010 Caribbean Studies\n" +
                "HMAT2001 Maths and Statistics  HHFT2008 Food and Beverage Cost Control\n" +
                "CULN2205 Food Preparation III  CULN2204 Quantity Food Production and Services\n" +
                "CULN2202 Baking Technology II\tCULN2201 Wines and Spirits\n" +
                "CULN2206 International Cuisine   CULN2207 Food Arts Presentation\n" +
                "HHFT1011 Food and Beverage I   HHFT2004 Quality Customer Care\n" +
                "HHFT2009 Internship\n");

        String program1010 = ("The Tourism/Hospitality Industry must be staffed at all levels by individuals who are well\n " +
                "equipped with the knowledge, skills and appropriate attitudes to satisfy the demands of this dynamic industry.\n" +
                "This global training can best be realized through a dedicated partnership between the specialized educational\n" +
                " institutions and the tourism sector.A partnership such as this should effectively garner the requisites \n" +
                "of the industry, thereby making it possible to provide students with the essentials to contribute to a \n" +
                "prosperous Tourism/Hospitality Industry.\n" +
                "\n" +
                "Entry Requirements\n" +
                "\n" +
                "Students seeking acceptance to the Hospitality Studies Associate Degree in Applied Science should have a \n" +
                "minimum of 4 GCE O Level Grades A, B or C; or four CXC General Level Grade I, II or III subjects including English.\n" +
                " \n" +
                "\n" +
                "Duration of Study: 2 years full-time study.\n" +
                "\n" +
                "HHFT1011 Food Beverage 1   ENGL1041 English Communication I\n" +
                "ACCM1001 Accommodation 1    HHFT1013 Intro Tourism/Hospitality\n" +
                "HHFT1010 Introduction to Management   IFTH1002 Information Technology\n" +
                "SAFE1002 Sanitation Safety and Hygiene\tACCT1001 Principle of Accounting\n" +
                "MGMT1002 Market 1   ECON1001 Micro-Economics\n" +
                "ENGL1042 English Communication II   SPAN1001 Spanish I\n" +
                "HCST1010 Caribbean Studies   HMAT2001 Maths and Statistics\n" +
                "MGMT2001 Hospitality Marketing   HHFT2001 Bar Operation\n" +
                "ACCT2002 Hospitality Accounting    HHFT2008 Food Beverage Cost Control\n" +
                "Electives\n" +
                "HHFT2005 Leisure and Recreation Management   HHFT2007 Heritage Tourism\tHLAW2001 Hospitality Law\n" +
                "MGMT2002 Events and Conference Management    HHFT2006 Accommodation 2\n" +
                "CULN1102 Food Preparation I   HHFT2004 Quality Customer Care\n" +
                "HHFT2009 Internship  MGMT2006 Entrepreneurship\n");

        program1.setBounds(50, 50, 315, 40);
        program1.addActionListener(this);
        program1.setText("Architectual Design Technology (A.A.S)");
        program1.setBackground(Color.lightGray);

        program2.setBounds(50, 100, 315, 40);
        program2.addActionListener(this);
        program2.setText("TVEMS INFORMATION TECHNOLOGY (A.A.S)");
        program2.setBackground(Color.lightGray);


        program3.setBounds(50, 150, 315, 40);
        program3.addActionListener(this);
        program3.setText("TVEMS ELECTRICAL & ELECTRONICS");
        program3.setBackground(Color.lightGray);


        program4.setBounds(50, 200, 315, 40);
        program4.addActionListener(this);
        program4.setText("TVEMS MOTOR VEHICLE ENGINEERING");
        program4.setBackground(Color.lightGray);


        program5.setBounds(50, 250, 315, 40);
        program5.addActionListener(this);
        program5.setText("TVEMS OFFICE ADMINISTRATION");
        program5.setBackground(Color.lightGray);

        program6.setBounds(50, 300, 315, 40);
        program6.addActionListener(this);
        program6.setText("TVEMS REFRIGERATION AND AIR CONDITIONING");
        program6.setBackground(Color.lightGray);


        program7.setBounds(50, 350, 315, 40);
        program7.addActionListener(this);
        program7.setText("TVEMS AGRICULTURAL STUDIES (A.A.S)");
        program7.setBackground(Color.lightGray);
        
        program8.setBounds(50, 400, 315, 40);
        program8.addActionListener(this);
        program8.setText("TVEMS TIMBER VOCATION");
        program8.setBackground(Color.lightGray);

      
        program9.setBounds(50, 450, 315, 40);
        program9.addActionListener(this);
        program9.setText("TVEMS CULINARY ARTS (A.A.S)");
        program9.setBackground(Color.lightGray);

        
       
        program10.setBounds(50, 500, 315, 40);
        program10.addActionListener(this);
        program10.setText("TVEMS HOSPITALITY STUDIES (A.A.S)");
        program10.setBackground(Color.lightGray);
        
       
        disciption1.setBounds(400, 15, 800, 500);
        disciption1.setText("<html>" + program11 + "</html>");
        disciption1.setBackground(Color.lightGray);
        disciption1.setVisible(false);

        
        disciption2.setBounds(400, 15, 800, 500);
        disciption2.setText("<html>" + program22+ "</html>");
        disciption2.setBackground(Color.lightGray);
        disciption2.setVisible(false);


       
        disciption3.setBounds(400, 15, 800, 500);
        disciption3.setText("<html>" + program33+ "</html>");
        disciption3.setBackground(Color.lightGray);
        disciption3.setVisible(false);


        
        disciption4.setBounds(400, 15, 800, 500);
        disciption4.setText("<html>" + program44+ "</html>");
        disciption4.setBackground(Color.lightGray);
        disciption4.setVisible(false);

        
        disciption5.setBounds(400, 15, 800, 500);
        disciption5.setText("<html>" + program55+ "</html>");
        disciption5.setBackground(Color.lightGray);
        disciption5.setVisible(false);

        
        disciption6.setBounds(400, 15, 800, 500);
        disciption6.setText("<html>" + program66+ "</html>");
        disciption6.setBackground(Color.lightGray);
        disciption6.setVisible(false);

        
        disciption7.setBounds(400, 15, 800, 500);
        disciption7.setText("<html>" + program77+ "</html>");
        disciption7.setBackground(Color.lightGray);
        disciption7.setVisible(false);

        
        disciption8.setBounds(400, 15, 800, 500);
        disciption8.setText("<html>" + program88+ "</html>");
        disciption8.setBackground(Color.lightGray);
        disciption8.setVisible(false);

       
        disciption9.setBounds(400, 15, 800, 500);
        disciption9.setText("<html>" + program99+ "</html>");
        disciption9.setBackground(Color.lightGray);
        disciption9.setVisible(false);

       
        disciption10.setBounds(400, 15, 800, 500);
        disciption10.setText("<html>" + program1010+ "</html>");
        disciption10.setBackground(Color.lightGray);
        disciption10.setVisible(false);



        f.add(disciption1);
        f.add(disciption2);
        f.add(disciption3);
        f.add(disciption4);
        f.add(disciption5);
        f.add(disciption6);
        f.add(disciption7);
        f.add(disciption8);
        f.add(disciption9);
        f.add(disciption10);
        
        f.add(program1);
        f.add(program2);
        f.add(program3);
        f.add(program4);
        f.add(program5);
        f.add(program6);
        f.add(program7);
        f.add(program8);
        f.add(program9);
        f.add(program10);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(2000, 800);
        f.setLayout(null);
        f.setVisible(true);

    }





    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == program1) {
            disciption1.setVisible(true);
            disciption2.setVisible(false);
            disciption3.setVisible(false);
            disciption4.setVisible(false);
            disciption5.setVisible(false);
            disciption6.setVisible(false);
            disciption7.setVisible(false);
            disciption8.setVisible(false);
            disciption9.setVisible(false);
            disciption10.setVisible(false);
        }

        if (e.getSource() == program2) {
            disciption1.setVisible(false);
            disciption2.setVisible(true);
            disciption3.setVisible(false);
            disciption4.setVisible(false);
            disciption5.setVisible(false);
            disciption6.setVisible(false);
            disciption7.setVisible(false);
            disciption8.setVisible(false);
            disciption9.setVisible(false);
            disciption10.setVisible(false);
        }

        if (e.getSource() == program3) {
            disciption1.setVisible(false);
            disciption2.setVisible(false);
            disciption3.setVisible(true);
            disciption4.setVisible(false);
            disciption5.setVisible(false);
            disciption6.setVisible(false);
            disciption7.setVisible(false);
            disciption8.setVisible(false);
            disciption9.setVisible(false);
            disciption10.setVisible(false);
        }

        if (e.getSource() == program4) {
            disciption1.setVisible(false);
            disciption2.setVisible(false);
            disciption3.setVisible(false);
            disciption4.setVisible(true);
            disciption5.setVisible(false);
            disciption6.setVisible(false);
            disciption7.setVisible(false);
            disciption8.setVisible(false);
            disciption9.setVisible(false);
            disciption10.setVisible(false);
        }

        if (e.getSource() == program5) {
            disciption1.setVisible(false);
            disciption2.setVisible(false);
            disciption3.setVisible(false);
            disciption4.setVisible(false);
            disciption5.setVisible(true);
            disciption6.setVisible(false);
            disciption7.setVisible(false);
            disciption8.setVisible(false);
            disciption9.setVisible(false);
            disciption10.setVisible(false);
        }

        if (e.getSource() == program6) {
            disciption1.setVisible(false);
            disciption2.setVisible(false);
            disciption3.setVisible(false);
            disciption4.setVisible(false);
            disciption5.setVisible(false);
            disciption6.setVisible(true);
            disciption7.setVisible(false);
            disciption8.setVisible(false);
            disciption9.setVisible(false);
            disciption10.setVisible(false);
        }

        if (e.getSource() == program7) {
            disciption1.setVisible(false);
            disciption2.setVisible(false);
            disciption3.setVisible(false);
            disciption4.setVisible(false);
            disciption5.setVisible(false);
            disciption6.setVisible(false);
            disciption7.setVisible(true);
            disciption8.setVisible(false);
            disciption9.setVisible(false);
            disciption10.setVisible(false);
        }

        if (e.getSource() == program8) {
            disciption1.setVisible(false);
            disciption2.setVisible(false);
            disciption3.setVisible(false);
            disciption4.setVisible(false);
            disciption5.setVisible(false);
            disciption6.setVisible(false);
            disciption7.setVisible(false);
            disciption8.setVisible(true);
            disciption9.setVisible(false);
            disciption10.setVisible(false);
        }

        if (e.getSource() == program9) {
            disciption1.setVisible(false);
            disciption2.setVisible(false);
            disciption3.setVisible(false);
            disciption4.setVisible(false);
            disciption5.setVisible(false);
            disciption6.setVisible(false);
            disciption7.setVisible(false);
            disciption8.setVisible(false);
            disciption9.setVisible(true);
            disciption10.setVisible(false);
        }

        if (e.getSource() == program10) {
            disciption1.setVisible(false);
            disciption2.setVisible(false);
            disciption3.setVisible(false);
            disciption4.setVisible(false);
            disciption5.setVisible(false);
            disciption6.setVisible(false);
            disciption7.setVisible(false);
            disciption8.setVisible(false);
            disciption9.setVisible(false);
            disciption10.setVisible(true);
        }

    }
}
