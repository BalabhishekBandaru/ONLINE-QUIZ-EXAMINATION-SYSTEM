import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
class OES implements ActionListener
{
	private Frame f = new Frame("Online Examination System");
	private Panel p = new Panel();
	private TextField firstName;
	private TextField lastName;
	private TextField phoneNumber;
	private TextField email;
	private TextField username;
	private TextField password;
	private TextField user;
	private TextField pass;
	private TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
	/*
	 * private int marks=0; private int marks1=0; private int marks2=0;
	 */
	

	//private Map<Integer, TextField> answers;

	public OES()
	{
		prepareGUI();
		Registration();
	}
	public void prepareGUI()
	{
		f.setSize(1920,1080);
		f.setLayout(new BorderLayout());
		//using the windowListener for closing or change the window
		//f.setLayout(null);
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent windowEvent)
			{
				System.exit(0);
			}
		});
		p.setLayout(null);
		f.add(p,BorderLayout.CENTER);
	}


	public void Registration()
	{
		p.removeAll();
		//Frame f1=new Frame();
		Label l=new Label(":::: REGISTRATION FORM ::::");
		p.add(l);
		l.setBounds(750,20,170,40);
		//firstname
		Label l1=new Label("FirstName:");
		p.add(l1);
		l1.setBounds(550,100,80,30);
		this.firstName=new TextField();
		p.add(firstName);
		firstName.setBounds(750,100,300,30);
		//lastname
		Label l2=new Label("LastName:");
		p.add(l2);
		l2.setBounds(550,150,80,30);
		this.lastName=new TextField();
		p.add(lastName);
		lastName.setBounds(750,150,300,30);
		//email
		Label l3=new Label("Email:"); 
		p.add(l3);
		l3.setBounds(550,200,80,30);
		this.email =new TextField();
		p.add(email);
		email.setBounds(750,200,300,30);
		//phoneno
		Label l4=new Label("PhoneNo:");
		p.add(l4);
		l4.setBounds(550,250,80,30);
		this.phoneNumber=new TextField();
		p.add(phoneNumber);
		phoneNumber.setBounds(750,250,300,30);
		Label l5=new Label("UserName:");
		p.add(l5);
		//p.setEchoChar('&');
		l5.setBounds(550,300,80,30);
		this.username=new TextField();
		p.add(username);
		//password.setEchoChar('*');
		username.setBounds(750,300,300,30);
		//password
		Label l6=new Label("Password:");
		p.add(l6);
		//p.setEchoChar('&');
		l6.setBounds(550,350,80,30);
		this.password=new TextField();
		p.add(password);
		password.setEchoChar('*');
		password.setBounds(750,350,300,30);
		Button b1=new Button("submit");
		p.add(b1);
		b1.addActionListener(this);
		b1.setBounds(600,450,100,40);
		Button b2 = new Button("Login");
		p.add(b2);
		b2.addActionListener(this);
		b2.setBounds(900,450,100,40);
		//b1.addActionListener(new ActionListener();

		/*f.setSize(1920,1080);
		f.setTitle("Registration");
		f.setLayout(null);
		f.setVisible(true);*/
		f.setVisible(true);
	}
	public void Login()
	{
		p.removeAll();
		//Frame f1=new Frame();
		Label l=new Label(":::: LOGIN FORM ::::");
		p.add(l);
		l.setBounds(750,20,170,40);
		//USERNAME
		Label l1=new Label("USERNAME:");
		p.add(l1);
		l1.setBounds(550,100,80,30);
		this.user=new TextField();
		p.add(user);
		user.setBounds(750,100,300,30);
		//PASSWORD
		Label l2=new Label("PASSWORD:");
		p.add(l2);
		//f.setEchoChar('&');
		l2.setBounds(550,200,80,30);
		this.pass=new TextField();
		p.add(pass);
		pass.setEchoChar('&');
		pass.setBounds(750,200,300,30);
		Button b1 = new Button("REGISTRATION");
		p.add(b1);
		b1.addActionListener(this);
		b1.setBounds(950,300,100,20);
		Button b2 = new Button("LOGIN");
		p.add(b2);
		b2.addActionListener(this);
		b2.setBounds(700,400,200,40);							
		/*f.setSize(1920,1080);
		f.setTitle("Registration");
		f.setLayout(null);*/
		f.setVisible(true);
	}
	public void error()
	{
		p.removeAll();
		Label l1=new Label("Username and Password are Incorrect");
		p.add(l1);
		l1.setBounds(600,100,400,40);
		//f.setVisible(true);
		Button b1= new Button("Menu");
		p.add(b1);
		b1.addActionListener(this);
		b1.setBounds(650,200,100,40);
		f.setVisible(true);
	}
	public void Menu()
	{
		p.removeAll();
		//Frame f= new Frame();
		Label l1=new Label("MENU:");
		p.add(l1);
		l1.setBounds(100,50,80,40);
		Button b1=new Button("EXAMS");
		p.add(b1);
		b1.addActionListener(this);
		b1.setBounds(100,100,80,40);
		Button b2=new Button("RESULTS");
		p.add(b2);
		b2.addActionListener(this);
		b2.setBounds(100,200,80,40);
		Button b3=new Button("Back");
		p.add(b3);
		b3.addActionListener(this);
		b3.setBounds(100,300,80,30);
		/*f.setSize(1920,1080);
		f.setTitle("Registration");
		f.setLayout(null);*/
		f.setVisible(true);
	}

	public void Exams()
	{
		p.removeAll();
		//Frame f = new Frame();
		Label l1=new Label("EXAMS:");
		p.add(l1);
		l1.setBounds(100,50,80,50);
		Label l2=new Label("--->");
		p.add(l2);
		l2.setBounds(50,100,40,50);
		Button b1=new Button("DBMS");
		p.add(b1);
		b1.addActionListener(this);
		b1.setBounds(100,100,80,40);
		Label l3=new Label("--->");
		p.add(l3);
		l3.setBounds(50,200,40,50);
		Button b2=new Button("JAVA");
		p.add(b2);
		b2.addActionListener(this);
		b2.setBounds(100,200,80,40);
		Label l4=new Label("--->");
		p.add(l4);
		l4.setBounds(50,300,40,50);
		Button b3=new Button("OS");
		p.add(b3);
		b3.addActionListener(this);
		b3.setBounds(100,300,80,40);
		Button b4=new Button("PREVIOUS");
		p.add(b4);
		b4.addActionListener(this);
		b4.setBounds(100,400,80,25);
		/*f.setSize(1920,1080);
		f.setTitle("EXAMS");
		f.setLayout(null);*/
		f.setVisible(true);
	}


	private void dbms(Map<Integer, String> map) {

		p.removeAll();
		//Frame f1=new Frame();
		Label l=new Label("DBMS Question Paper");
		p.add(l);
		l.setBounds(700,15,130,30);
		Label l1=new Label(map.get(1));
		p.add(l1);
		l1.setBounds(20,50,500,30);
		/*TextField t1=new TextField();
		p.add(t1);
		t1.setBounds(700,50,250,30);*/
		this.t1 = new TextField();
		p.add(t1);
		t1.setBounds(700,50,250,30);

		Label l2=new Label(map.get(1));
		p.add(l2);
		l2.setBounds(20,100,500,30);
		this.t2=new TextField();
		p.add(t2);
		t2.setBounds(700,100,250,30);
		Label l3=new Label(map.get(3));
		p.add(l3);
		l3.setBounds(20,150,500,30);
		this.t3=new TextField();
		p.add(t3);
		t3.setBounds(700,150,250,30);
		Label l4=new Label(map.get(4));
		p.add(l4);
		l4.setBounds(20,200,500,30);
		this.t4=new TextField();
		p.add(t4);
		t4.setBounds(700,200,250,30);
		Label l5=new Label(map.get(5));
		p.add(l5);
		l5.setBounds(20,250,500,30);
		this.t5=new TextField();
		p.add(t5);
		t5.setBounds(700,250,250,30);
		Label l6=new Label(map.get(6));
		p.add(l6);
		l6.setBounds(20,300,500,30);
		this.t6=new TextField();
		p.add(t6);
		t6.setBounds(700,300,250,30);
		Label l7=new Label(map.get(7));
		p.add(l7);
		l7.setBounds(20,350,500,30);
		this.t7=new TextField();
		p.add(t7);
		t7.setBounds(700,350,250,30);
		Label l8=new Label(map.get(8));
		p.add(l8);
		l8.setBounds(20,400,500,30);
		this.t8=new TextField();
		p.add(t8);
		t8.setBounds(700,400,250,30);
		Label l9=new Label(map.get(9));
		p.add(l9);
		l9.setBounds(20,450,500,30);
		this.t9=new TextField();
		p.add(t9);
		t9.setBounds(700,450,250,30);
		Label l10=new Label(map.get(10));
		p.add(l10);
		l10.setBounds(20,500,650,30);
		this.t10=new TextField();
		p.add(t10);
		t10.setBounds(700,500,250,30);
		/*this.answers.put(4, new TextField());
		p.add(answers.get(4));
		answers.get(4).setBounds(750,100,300,30);*/
		Button b1=new Button("previous");
		p.add(b1);
		b1.addActionListener(this);
		b1.setBounds(50, 600, 100, 40);
		Button b2=new Button("FinishDB");
		p.add(b2);
		b2.addActionListener(this);
		b2.setBounds(300,600,100,40);
		f.setVisible(true);
	}
	private void dbresult(int marks)
	{
		p.removeAll();
		Label l1=new Label("DBMS RESULTS : "+marks+"/10");
        //System.out.println("DBMS RESULTS : "+marks);
		p.add(l1);
		l1.setBounds(750,15,170,40);
		Button b1=new Button("MENU");
		p.add(b1);
		b1.addActionListener(this);
		b1.setBounds(780,100,130,30);
        f.setVisible(true);
	}
	private void java(Map<Integer, String> map) {

		p.removeAll();
		//Frame f1=new Frame();
		Label l=new Label("JAVA Question Paper");
		p.add(l);
		l.setBounds(700,10,130,30);
		Label l1=new Label(map.get(1));
		p.add(l1);
		l1.setBounds(20,50,900,30);
		/*TextField t1=new TextField();
		p.add(t1);
		t1.setBounds(700,50,250,30);*/
		this.t1 = new TextField();
		p.add(t1);
		t1.setBounds(1000,50,250,30);

		Label l2=new Label(map.get(2));
		p.add(l2);
		l2.setBounds(20,100,900,30);
		this.t2=new TextField();
		p.add(t2);
		t2.setBounds(1000,100,250,30);
		Label l3=new Label(map.get(3));
		p.add(l3);
		l3.setBounds(20,150,900,30);
		this.t3=new TextField();
		p.add(t3);
		t3.setBounds(1000,150,250,30);
		Label l4=new Label(map.get(4));
		p.add(l4);
		l4.setBounds(20,200,900,30);
		this.t4=new TextField();
		p.add(t4);
		t4.setBounds(1000,200,250,30);
		Label l5=new Label(map.get(5));
		p.add(l5);
		l5.setBounds(20,250,900,30);
		this.t5=new TextField();
		p.add(t5);
		t5.setBounds(1000,250,250,30);
		Label l6=new Label(map.get(6));
		p.add(l6);
		l6.setBounds(20,300,900,30);
		this.t6=new TextField();
		p.add(t6);
		t6.setBounds(1000,300,250,30);
		Label l7=new Label(map.get(7));
		p.add(l7);
		l7.setBounds(20,350,900,30);
		this.t7=new TextField();
		p.add(t7);
		t7.setBounds(1000,350,250,30);
		Label l8=new Label(map.get(8));
		p.add(l8);
		l8.setBounds(20,400,900,30);
		this.t8=new TextField();
		p.add(t8);
		t8.setBounds(1000,400,250,30);
		Label l9=new Label(map.get(9));
		p.add(l9);
		l9.setBounds(20,450,900,30);
		this.t9=new TextField();
		p.add(t9);
		t9.setBounds(1000,450,250,30);
		Label l10=new Label(map.get(10));
		p.add(l10);
		l10.setBounds(20,500,900,30);
		this.t10=new TextField();
		p.add(t10);
		t10.setBounds(1000,500,250,30);
		/*this.answers.put(4, new TextField());
		p.add(answers.get(4));
		answers.get(4).setBounds(750,100,300,30);*/
		Button b1=new Button("previous");
		p.add(b1);
		b1.addActionListener(this);
		b1.setBounds(50, 600, 100, 40);
		Button b2=new Button("FinishJAVA");
		p.add(b2);
		b2.addActionListener(this);
		b2.setBounds(300,600,100,40);
		f.setVisible(true);
	}
	private void javaresult(int marks)
	{
		p.removeAll();
		Label l1=new Label("JAVA RESULTS : "+marks+"/10");
        //System.out.println("DBMS RESULTS : "+marks);
		p.add(l1);
		l1.setBounds(750,15,170,40);
		Button b1=new Button("MENU");
		p.add(b1);
		b1.addActionListener(this);
		b1.setBounds(780,100,130,30);
        f.setVisible(true);
	}
	private void os(Map<Integer, String> map) {

		p.removeAll();
		//Frame f1=new Frame();
		Label l=new Label("OS Question Paper");
		p.add(l);
		l.setBounds(700,15,130,40);
		Label l1=new Label(map.get(1));
		p.add(l1);
		l1.setBounds(20,50,900,30);
		/*TextField t1=new TextField();
	    p.add(t1);
	    t1.setBounds(700,50,250,30);*/
		this.t1 = new TextField();
		p.add(t1);
		t1.setBounds(1000,50,250,30);

		Label l2=new Label(map.get(2));
		p.add(l2);
		l2.setBounds(20,100,900,30);
		this.t2=new TextField();
		p.add(t2);
		t2.setBounds(1000,100,250,30);
		Label l3=new Label(map.get(3));
		p.add(l3);
		l3.setBounds(20,150,900,30);
		this.t3=new TextField();
		p.add(t3);
		t3.setBounds(1000,150,250,30);
		Label l4=new Label(map.get(4));
		p.add(l4);
		l4.setBounds(20,200,900,30);
		this.t4=new TextField();
		p.add(t4);
		t4.setBounds(1000,200,250,30);
		Label l5=new Label(map.get(5));
		p.add(l5);
		l5.setBounds(20,250,900,30);
		this.t5=new TextField();
		p.add(t5);
		t5.setBounds(1000,250,250,30);
		Label l6=new Label(map.get(6));
		p.add(l6);
		l6.setBounds(20,300,900,30);
		this.t6=new TextField();
		p.add(t6);
		t6.setBounds(1000,300,250,30);
		Label l7=new Label(map.get(7));
		p.add(l7);
		l7.setBounds(20,350,900,30);
		this.t7=new TextField();
		p.add(t7);
		t7.setBounds(1000,350,250,30);
		Label l8=new Label(map.get(8));
		p.add(l8);
		l8.setBounds(20,400,900,30);
		this.t8=new TextField();
		p.add(t8);
		t8.setBounds(1000,400,250,30);
		Label l9=new Label(map.get(9));
		p.add(l9);
		l9.setBounds(20,450,900,30);
		this.t9=new TextField();
		p.add(t9);
		t9.setBounds(1000,450,250,30);
		Label l10=new Label(map.get(10));
		p.add(l10);
		l10.setBounds(20,500,900,30);
		this.t10=new TextField();
		p.add(t10);
		t10.setBounds(1000,500,250,30);
		/*this.answers.put(4, new TextField());
	    p.add(answers.get(4));
	    answers.get(4).setBounds(750,100,300,30);*/
		Button b1=new Button("previous");
		p.add(b1);
		b1.addActionListener(this);
		b1.setBounds(50, 600, 100, 40);
		Button b2=new Button("FinishOS");
		p.add(b2);
		b2.addActionListener(this);
		b2.setBounds(300,600,100,40);
		f.setVisible(true);
	}
	private void osresult(int marks)
	{
		p.removeAll();
		Label l1=new Label("OS RESULTS : "+marks+"/10");
        //System.out.println("DBMS RESULTS : "+marks);
		p.add(l1);
		l1.setBounds(750,15,170,40);
		Button b1=new Button("MENU");
		p.add(b1);
		b1.addActionListener(this);
		b1.setBounds(780,100,130,30);
        f.setVisible(true);
	}



	public void Result()
	{
		p.removeAll();
		//Frame f = new Frame();
		Label l1=new Label("RESULTS:");
		p.add(l1);
		l1.setBounds(100,50,80,50);
		Label l2=new Label("--->");
		p.add(l2);
		l2.setBounds(50,100,40,50);
		Button b1=new Button("DBMS RESULTS");
		p.add(b1);
		b1.addActionListener(this);
		b1.setBounds(100,100,90,40);
		Label l3=new Label("--->");
		p.add(l3);
		l3.setBounds(50,200,40,50);
		Button b2=new Button("JAVA RESULTS");
		p.add(b2);
		b2.addActionListener(this);
		b2.setBounds(100,200,90,40);
		Label l4=new Label("--->");
		p.add(l4);
		l4.setBounds(50,300,40,50);
		Button b3=new Button("OS RESULTS");
		p.add(b3);
		b3.addActionListener(this);
		b3.setBounds(100,300,90,40);
		Button b4=new Button("Menu");
		p.add(b4);
		b4.addActionListener(this);
		b4.setBounds(100,400,80,25);
		/*f.setSize(1920,1080);
		f.setTitle("EXAMS");
		f.setLayout(null);*/
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		String actionCommand = e.getActionCommand();
		if (actionCommand.equals("submit"))
		{
			DataBase(firstName.getText(), lastName.getText(), email.getText(), phoneNumber.getText(),username.getText(),password.getText());
			Login();
		}
		else if(actionCommand.equals("Login"))
		{
			Login();
		}
		else if(actionCommand.equals("REGISTRATION"))
		{
			Registration();
		}
		else if(actionCommand.equals("LOGIN"))
		{
			int code = ValidateCredentials(user.getText(), pass.getText());
			if( code == 0) error();
			else Menu();
		}
		else if (actionCommand.equals("Menu")) {
			Login();
		}
		else if (actionCommand.equals("Back"))
		{
			Login();
		}
		else if (actionCommand.equals("EXAMS"))
		{
			Exams();
		}
		else if (actionCommand.equals("DBMS"))
		{ 
			Map<Integer, String> map= getQuestions();
			dbms(map);
		}
		else if (actionCommand.equals("FinishDB"))
		{
			int marks = dbanswers(t1.getText(),t2.getText(),t3.getText(),t4.getText(),t5.getText(),t6.getText(),t7.getText(),t8.getText(),t9.getText(),t10.getText());
			dbresult(marks);
			
			//System.out.println("Marks "+marks);
		}
		else if(actionCommand.equals("MENU"))
		{
			Menu();
		}
		else if (actionCommand.equals("previous"))
		{
			Exams();
		}
		else if (actionCommand.equals("JAVA"))
		{
			Map<Integer, String> map= getQuestions1();
			java(map);
		}
		else if (actionCommand.equals("FinishJAVA"))
		{
			int marks = janswers(t1.getText(),t2.getText(),t3.getText(),t4.getText(),t5.getText(),t6.getText(),t7.getText(),t8.getText(),t9.getText(),t10.getText());
		    javaresult(marks);
			//System.out.println("Marks "+marks);
		}
		else if(actionCommand.equals("MENU"))
		{
			Menu();
		}
		else if (actionCommand.equals("previous"))
		{
			Exams();
			
		}
		else if (actionCommand.equals("OS"))
		{
			Map<Integer, String> map= getQuestions2();
			os(map);
		}
		else if(actionCommand.equals("FinishOS"))
		{
			int marks = oanswers(t1.getText(),t2.getText(),t3.getText(),t4.getText(),t5.getText(),t6.getText(),t7.getText(),t8.getText(),t9.getText(),t10.getText());
			osresult(marks);
			//System.out.println("Marks "+marks);
		}
		else if(actionCommand.equals("MENU"))
		{
			Menu();
		}
		else if(actionCommand.equals("previous"))
		{
			Exams();
		}
			
		else if(actionCommand.equals("PREVIOUS"))
		{
			Menu();
		}
		else if(actionCommand.equals("RESULTS"))
		{
			Result();
		}
		else if(actionCommand.equals("DBMS RESULTS"))
		{
		}
		else if(actionCommand.equals("JAVA RESULTS"))
		{
		}
		else if(actionCommand.equals("OS RESULTS"))
		{
		}
		else if(actionCommand.equals("Menu"))
		{
			Menu();
		}

	}
	private int oanswers(String t1, String t2, String t3, String t4, String t5, String t6, String t7, String t8, String t9, String t10) 
	{
		int marks =0;
		try {
			String[] arr = new String[] {t1, t2, t3, t4, t5, t6, t7, t8, t9 ,t10};
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/oes";
			Connection con = DriverManager.getConnection(url, "root", "576498");
			String sql = "select * from os";
			PreparedStatement p1= con.prepareStatement(sql);
			ResultSet resultSet = p1.executeQuery();

			int i = 0;
			// Process the ResultSet
			while (resultSet.next()) {
				// Retrieve data from the current row
				if( arr[i].equalsIgnoreCase(resultSet.getString("oanswer"))){
					marks = marks + 1;
				}
				i++;
			}


		}catch(SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		return marks;
		
		
	}
	private int janswers(String t1, String t2, String t3, String t4, String t5, String t6,String t7, String t8, String t9, String t10) {
		int marks=0;
		try {
			String[] arr = new String[] {t1, t2, t3, t4, t5, t6, t7, t8, t9 ,t10};
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/oes";
			Connection con = DriverManager.getConnection(url, "root", "576498");
			String sql = "select * from java";
			PreparedStatement p1= con.prepareStatement(sql);
			ResultSet resultSet = p1.executeQuery();

			int i = 0;
			// Process the ResultSet
			while (resultSet.next()) {
				// Retrieve data from the current row
				if( arr[i].equalsIgnoreCase(resultSet.getString("janswer"))){
					marks = marks + 1;
				}
				i++;
			}


		}catch(SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		return marks;
	}
		
		
	
	private Map<Integer, String> getQuestions2() {
		Map<Integer, String> questions=new HashMap<Integer, String>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/oes";
			Connection con = DriverManager.getConnection(url, "root", "576498");
			String sql="select * from os";
			PreparedStatement p3= con.prepareStatement(sql);
			ResultSet resultSet= p3.executeQuery();
			while(resultSet.next()) {
				questions.put(resultSet.getInt("oid"), resultSet.getString("oquestion"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		return questions;
	}
	private Map<Integer, String> getQuestions1() {
		Map<Integer, String> questions= new HashMap<Integer ,String>(); 
		try {

			Class.forName("com.mysql.cj.jdbc.Driver"); 
			String url ="jdbc:mysql://localhost:3306/oes"; 
			Connection con =DriverManager.getConnection(url, "root", "576498");
			String sql ="select * from java"; 
			PreparedStatement p2= con.prepareStatement(sql);
			ResultSet resultSet= p2.executeQuery();
			while(resultSet.next()) {
				questions.put(resultSet.getInt("jid"), resultSet.getString("jquestion"));
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

		return questions;
		}
	 
	private int dbanswers(String t1, String t2, String t3, String t4, String t5, String t6, String t7, String t8, String t9, String t10) {
		int marks = 0;
		try {
			String[] arr = new String[] {t1, t2, t3, t4, t5, t6, t7, t8, t9 ,t10};
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/oes";
			Connection con = DriverManager.getConnection(url, "root", "576498");
			String sql = "select * from dbms";
			PreparedStatement p1= con.prepareStatement(sql);
			ResultSet resultSet = p1.executeQuery();

			int i = 0;
			// Process the ResultSet
			while (resultSet.next()) {
				// Retrieve data from the current row
				if( arr[i].equalsIgnoreCase(resultSet.getString("danswer"))){
					marks = marks + 1;
				}
				i++;
			}


		}catch(SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		return marks;
	}
	private Map<Integer, String> getQuestions() {
		Map<Integer, String> questions = new HashMap<Integer ,String>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			String url = "jdbc:mysql://localhost:3306/oes";
			Connection con = DriverManager.getConnection(url, "root", "576498");
			//step3 create the statement object  
			String sql = "Select * From dbms";

			PreparedStatement preparedStatement = con.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			// Process the ResultSet
			while (resultSet.next()) {
				// Retrieve data from the current row
				questions.put(resultSet.getInt("did"), resultSet.getString("dquestion"));
				//,resultSet.getString("dquestion"),resultSet.getString("doption_a"),resultSet.getString("doption_b"),resultSet.getString("doption_c"),resultSet.getString("doption_d"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return questions;
	}
	private void DataBase(String firstName, String lastName, String email, String phoneNumber,String username, String password) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			String url = "jdbc:mysql://localhost:3306/oes";
			Connection con = DriverManager.getConnection(url, "root", "576498");
			//step3 create the statement object  
			String sql = "INSERT INTO Registration (FirstName, LastName, Email,Password, PhoneNumber,UserName) VALUES (?, ?, ?, ?,?, ?)";
			// Create prepared statement
			PreparedStatement pstmt = con.prepareStatement(sql);
			// Set values for parameters
			pstmt.setString(1, firstName);
			pstmt.setString(2, lastName);
			pstmt.setString(3, email);
			pstmt.setString(4, password);
			pstmt.setString(5, phoneNumber);
			pstmt.setString(6, username);
			// Execute the statement
			pstmt.executeUpdate();
			// Close the prepared statement
			pstmt.close();
			System.out.println("Data inserted successfully.");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}


	private int ValidateCredentials(String userName, String password) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			String url = "jdbc:mysql://localhost:3306/oes";
			Connection con = DriverManager.getConnection(url, "root", "576498");
			//step3 create the statement object  
			String sql = "Select * From Registration WHERE UserName = '"+userName+"'";

			PreparedStatement preparedStatement = con.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			// Process the ResultSet
			String user = null;
			String pass = null;
			while (resultSet.next()) {
				// Retrieve data from the current row
				user = resultSet.getString("UserName");
				pass = resultSet.getString("Password");
				// Print or process the retrieved data
			}
			if( Objects.isNull(user) || Objects.isNull(pass)) {
				return 0;
				//throw new IllegalArgumentException();
			}
			else if( !user.equals(userName) || !pass.equals(password)) {
				return 0;
				//throw new IllegalArgumentException();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return 1;
	}

	public static void main(String args[])
	{
		OES o1=new OES();


	}
}					

