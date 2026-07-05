/*ERROR_CODE.java
 * Somanath Mishra & Akilesh Arun
 * 25 April 2026
 * 
 * Working On: UI, using Layouts(Grid, Card, Border and FlowLayout) and graphics(Font etc.)
 * 
 * Pseudocode(WEEK 1):
					*Imports:
							  *graphics
							  *dimension
							  *image
							  * fileIO
							  * Layouts
							  * Components(Button,RadioButton,TextField/Area,Label etc.)
							  * Events(Action,Change,Adjustment,Mouse)
							  * Listeners(Action,Change,Adjustment,Mouse)
					
					* Class ERROR_CODE:
									    * Make instance of fake main run
									    * Inside run create instance of JFrame and build it
									    * Create Instanceof Main Panel
					
					* Class ErrorCodeHolder(Panel):
											        * Set the background color 
											        * Create Instance of CardLayout
											        * Instantiate All cards needed for UI
											        * Intro,Info,Settings,Leaderboard
											        * Credits,Question,Correct and Wrong
											        * add all cards
							
					* Class IntroPagePanel:
										    * This will Hold all the UI Components that the user can navigate
										    * Create the main title of game "ERROR_CODE"
										    * setBounds for it 
										    * add to panel
										    * Same for The JButton Start
										    * Create and add JButton Leaderboard
										    * JButton Credits
										    * Add ActionListener too all the buttons
										    * Inside ButtonHandler class create a variable to store
										    * evt.getActionCommand()
										    * Using chain of if else decide which card 
										    * to show when something is pressed
					
					* Class InfoPanelHolder:
										     * Create instance of InfoPanel 
										     * In BorderLayout add a continue button which will take user to questionPanel
										     * In InfoPanel write a story about the user's mission and why
										     * JLabel for the recap
										     * SetBounds
										     * add it to the panel
					
					* Class SettingsPanelHolder:
							                     * For now just look at PutItTogether and add a similar button to
							                     * "Home" which takes user to main screen
							                     * Using ActionListener and ButtonHandler
							                     * The rest is just black(For Now)
					
					* Class LeaderboardPanelHolder:
							                        * Same as Settings Panel(For now)
					
					* Class CreditsPanelHolder:
							                    * Same as Settings Panel(For Now)
							                    * Using JLabel write both names "Somanath and Akilesh"
					
					* Class QuestionPanel:
							               * Add 2 JPanels in BorderLayout, North and Center
							               * In the North panel Using a JLabel write a random Java Question
							               * In the Center Panel, Use gridLayout to divide the panel into 4 equal parts
							               * 2 rows and 2 columns and add a JButton each with an answer in each slot
							               * add all to the Panel and add ActionListener to each
							               * In ButtonHandler group all wrong answers in an if condition
							               * The correct in else if condition
							               * If the answer is wrong show the wrong card panel
							               * if the answer is correct show the correct card panel
							              
					* Class RightPanel:
							            * Make this panel Green to represent that they succeded
					
					* Class WrongPanel:
					                    * Make this panel Red to represent that they failed
					                    
		Pseudocode(WEEK 2):		
		                          * Working on: Enhancing UI By adding Gifs and using timer for a countdown and typing animation
 
 * Pseudocode(WEEK 2):
					* Imports:
							  * ImageIcon(For gifs)
							  * JLayeredPane(To place components on top of gifs)
							  * Timer(For countdown and Typing Animation)
					
					* Class ErrorCodeHolder:
											 * Set InfoPanelHolder and QuestionPanel as
											 field variable so you can
											 * Call methods in them from the holder as
											 it has acces to all cards
											 * Use instance of QuestionPanel to call a
											 method to start the countdown in
											 QuestionPanel
											 * When it is entered not as soon as the
											 program starts
											 * Call a method to output username in info
											 panel
											 * And also a method to starttyping
											 animation which calls the method in
											 * InfoPanelHolder using its instance
					
					* Class IntroPagePanel:
											 * Use ImageIcon to load gifs
											 * Use source to see syntax
											 * Add the gif as background using
											 Default_Layer
											 * So you can add components on top of it
											 * Also add logo
					
					* Class InfoPanelHolder:
											 * This has the helper methods for name and
											 typing
											 * Call a method in InfoPanel to set the
											 username
											 * Also call startTyping method in InfoPanel
											 * In the buttonhandler use instance of
											 panels
											 * so it is accessible to start countdown
											 as after the button
											 * is pressed the next panel is QuestionPanel
					
					* Class InfoPanel:
											 * The username will be outputted here
											 * The timer fpr typing is also started
											 * Set variables for typing
											 * Store the story as a string
											 * Also add a Skip button and if it is
											 pressed
											 * Stop timer and output all text
					
					* Class Animater:
											 * This is the timer class and the main idea is to
											 output character by character
											 * so it looks like typing
											 * Keep adding each chracter to a variable and
											 output
											 * The idea is to convert /n to <br> and output
											 each time using
											 * <html> & </html>
											 * Increase the index each time
											 * Set appropriate millisecond delay
											 * and if the index is /n convert it to <br>
											 * The story is outputted as a JLabel and JLabels
											 are formatted
											 * Using html So thats why we conevrt to <br> and
											 html
					
					* Class Username:
											 * Have methods for Getting userName and setting
											 in(input and output)
											 * Input stores username
											 * output returns it
					
					* Class LoginPanel:
											 * Use some gifs and add them to different layers
											 * Default and Palette and add a textField
											 * The user will enter their name here and write
											 instructions
											 * using a label
					
					* Class Settings panel:
											 * Just add an appropriate gif for now
											 * Use ImageIcon
											 * Using instate of panels initiate the type
											 animation
											 * as after this is InfoPanel so it starts
											 as soon as the button for next is clicked
											 * Use instance of panels to call update
											 username
											 * and input user
											 method
					
					* Class QuestionPanel:
											 * Add gif for timer
											 * Add timer label on top of it
											 * Modal Layer
											 * Create instance of timer class
											 * StartTimer method which stats and
											 activates time class
					
					* Class TimeHandler:
											 * timeleft decreases by 1 each time
											 * The string is set to the value of timeleft
											 * as long as it is greater than or equal to 0
											 run
											 * and when it is les stop timer
											 * this gives effect of countdown
											 * When timer reaches 0 go to wrong
											 panel	
											 

 * Pseudocode(Week 3):
						* Working on: Randomized questions, different modules, Explantion if wrong with stats of module, Player animation
						
						* Imports:
									* KeyListener(To detect player movement)
									* KeyEvent(To add functionality to player movement)
						
						* Class ErrorCodeHolder:
											     * make field variable of TrialsPanel, QuestionPanel and ExplanationPanel
											     * initialize them and add them as cards
												 * add a helper method for starting the trial
											     * trial: user selected module that has questions from a specific topic
											     * send parameters for range a ints(will be used later to select specific
											     * questions for specific trials)
											     * calls method in question panel that continues functionality
											     * add a helper method to "receive" explanation and stats gathered
											     * explanation will have everything (wrong question, correct answer)
											     * stats is score in this case(out of 3 max, each trial has 3 questions)
											     * calls method in explanation panel that actually build the explanation that
											     * the user sees
											     
						
						* Class TrialsPanel:
						                     * This is the UI of trials and helps trials method by sending range of questions depending
						                     * on the trial the user chooses
						                     * add a JLayeredPane and add a background image in DEFAULT_LAYER
						                     * then all trial buttons will go on top in second layer PALETTE_LAYER
						                     * add all trials as jbutton and add actionlistener to each
						                     * In actionPerformed have chain of if else conditions depending to trial(1 - 5)
						                     * all of them show the question panel but will call startTrial method
						                     * startTrial has 2 parameters the minimum value and maximum value which make a range of questions
						                     * to choose from( 20 each)
						                     * Ex: trial one will send 1,20 then trial 2 is 21,40
						                     * and so on until trial five which will send 81,100
						            
						
						* Class QuestionPanel:
						                       * Have variables for randomizes question, all 4 answers(strings), 4 choices(JButtons)
						                       * correct answer, explanation received from file
						                       * minimum and maximum question range
						                       * number of questions answered and score
						                       * startTrial method will take in the min and max range and store it in variables
						                       * initialize necessary variables
						                       * call the method to build/construct the following question
						                       * buildNextQuestion will call questionGetter which reads question and all choices from file
						                       * timer is stopped first(to prevent multiple timers) then started so it is a fresh 30 sec countdown each time
						                       
						                       *File Structure:
																* Sample:   1 - What data type is '9' in Java?
																		    int
																		    String
																		    > char
																		    byte
																		    Single quotes represent a single character in Java.
																		    Even though 9 looks numeric, '9' is treated
																		    as a character symbol instead of a number.
																		    If written without quotes it would become
																		    an int, while double quotes would create
																		    a String.
																		    (Blank Line)
																		    
																		    * This structure is what the code will read 
																		    * first libe is the question with number, then
																		    * next 4 lines are the choices and the one marked with > is the correct answer
																		    * The following lines are the explanation and no matter how long it is the start is 
																		    * identified by the flow of fileio and there is a blank line only after explanation is done
																		    * so that is where it file storing of explanation stops
																		    * this structure is the same for all questions
																		    
									            * questionGetter 
									            * This is the method that uses fileIO
									            * read from the question file and try catch if file is not found
									            * have a variable to track if info is received
									            * now determine the random question by setting question number as math.random
									            * of a number in the chosen range as per trial number
									            * add the number to a hyphen - as per file structure then using hasNextLine
									            * find if the text ans starting of question index match
									            * if it does then store all choices by progressing throught the question in following lines
									            * initialize correct variable and now determine which option is the correct one
									            * have if conditions to see if it starts with > if it does store correct as the choice
									            * after that the explanation should be received and store a boolean to track explanation ending(blank line)
									            * if its a blank line boolean is false
									            * and add a while loop that runs when boolean is true and traverses line
									            * add the explanation string line by line with new lines just like the file
									            * in the end found variable is true so 1 full question block has been extracted of needed information
									            
									            * Buttonhandler 
									            * Stop timer as it should go to next question and using above mention methods reset and build new questio
									            * Logic for stats 
									            * If answer is correct increase users score and if not build structure of stats
									            * It will have question, the correct answer and explanation all formatted properly
									            * since a trial is 3 questions add if condition that calls method to receiv explanation
									            * and show explanation panel( done with answeredQuestion variable which tracks number of questions
									            * if not progress and make the next question

						
						* Class ExplanationPanel:
						                          * Add JLabel for title
						                          * and add JTextArea + JScrollBar(So that all explanations with stats can fit dynamically and user can scroll to see
						                          * add buttons to go back to trials or home
						                          * buildExplanation method with parameters of score and constructed explanation 
						                          * actionPerformed just gives functionality to home and back to trials button
						                          * if everything is correct show a congrats message
						                          * if not tell the user somethings are not correct in a way that fits theme
						                          * and add pre built explanation to textarea with scroll bar
						                          * set the text of textarea
						                          
						
									             
					                   
 */ 

//Week 1 Imports
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;

import java.awt.Image;
import javax.imageio.ImageIO;

import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.CardLayout;

import javax.swing.JFrame;	
import javax.swing.JPanel;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JCheckBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

//WEEK 2 Imports
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;

import javax.swing.Timer;

//WEEK 3 Imports
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

//WEEK 4 Imports
import java.awt.Rectangle;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.awt.event.MouseMotionListener;

import java.io.FileWriter;
import java.awt.event.FocusListener;
import java.awt.event.FocusEvent;
import java.net.URL;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.LineUnavailableException;
import java.awt.event.KeyAdapter;
public class ERROR_CODE
{
	public ERROR_CODE()
	{
	}
	
	public static void main(String [] args)
	{
		ERROR_CODE ec = new ERROR_CODE();
		ec.run();
	}
	
	public void run()
	{
		JFrame frame = new JFrame("[ERROR_CODE]");
		frame.setSize(960, 540);				
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE); 
		frame.setLocation(0,0);
		ErrorCodeHolder ech = new ErrorCodeHolder(); 		
		frame.getContentPane().add( ech );		
		frame.setVisible(true);		
		frame.setResizable(false);	
	}
}

class LeaderboardEntry
{
    int level;
    int score;
    String name;

    public LeaderboardEntry(String name, int level, int score)
    {
        this.level = level;
        this.score = score;
        this.name = name;
    }
}


class ErrorCodeHolder extends JPanel
{
	private InfoPanelHolder iph;
	private QuestionPanel qp;
	private ExplanationPanel ep;
	private OverworldPanel op;
	private TutorialPanel top;
	private BombDefusalPanel bdp;
	private MatchPanel mp;
	private BulletPanel bp;
	private WhackAMolePanel wamp;
	private FinalBossPanel fbp;
	private VictoryPanel vp;
	private LeaderboardPanel lbp;
	private GameOverPanel gop;
	
	public ErrorCodeHolder()
	{
		setBackground(Color.BLACK);

		CardLayout cardl = new CardLayout();
		setLayout(cardl);
		Accounts acs = new Accounts();
		
		IntroPagePanel ipp = new IntroPagePanel(this, cardl, acs);
		LoginPanel lp = new LoginPanel(this, cardl, acs);
	    iph = new InfoPanelHolder(this, cardl, acs); 
		lbp = new LeaderboardPanel(this, cardl, acs);
		CreditsPanelHolder cph = new CreditsPanelHolder(this, cardl);
		qp = new QuestionPanel(this, cardl, acs);
		ep = new ExplanationPanel(this,cardl);
		op = new OverworldPanel(this, cardl,acs);
		top = new TutorialPanel(this, cardl,acs);
		gop = new GameOverPanel(this, cardl, acs);
		bdp = new BombDefusalPanel(this, cardl,acs);
		mp = new MatchPanel(this, cardl,acs);
		bp = new BulletPanel(this, cardl,acs);
		wamp = new WhackAMolePanel(this, cardl, acs);
		fbp = new FinalBossPanel(this, cardl, acs);
		vp = new VictoryPanel(this, cardl, acs);
		
		add(ipp, "Title");
		add(iph, "Information");
		add(lp, "Login");
		add(lbp, "Leaderboard");
		add(cph, "Credits");
		add(qp,"Question");
		add(ep, "Explanation");
		add(op, "Overworld");
		add(top, "Tutorial");
		add(bdp, "Bomb");
		add(mp, "Match");
		add(bp, "Bullet");
		add(wamp, "Whack");
		add(fbp, "Final Boss");
		add(vp, "Victory");
		add(gop, "Game Over");
	}
	public int getStopPowers()
	{
		return qp.getStopPowers();
	}
	public int getSkipPowers()
	{
		return qp.getSkipPowers();
	}
	public int getRevealPowers()
	{
		return qp.getRevealPowers();
	}
	public void gameOverData()
	{
		gop.setGameOverData();
	}
	public LeaderboardPanel getLeaderboard()
	{
		return lbp;
	}
	public void startFinalBoss(int minRange, int maxRange)
	{
		fbp.startFinalBoss(minRange, maxRange);
	}
	public void startWhackBoss(int minRange, int maxRange, int currentLives)
    {
        wamp.startBoss(minRange, maxRange, currentLives);
	}
	public void startBullet(int minRange, int maxRange, int currentLives)
	{
		bp.startBoss(minRange, maxRange, currentLives);
	}
	public int getCurrentLevel()
	{
		return op.getLevel();
	}
	public int getCurrentScore()
	{
		return op.getScore();
	}
	public int getCurrentLives()
	{
		return op.currentLives();
	}
	public void startMatch(int minRange, int maxRange)
	{
		mp.startBoss(minRange, maxRange);
	}
	public void startBombGame(int minRange, int maxRange)
	{
		bdp.startBombTrial(minRange, maxRange);
	}
	public void returnScore(int sc, int lives) // calls method in question panel
	{
		op.scoreReturn(sc, lives);
	}
	
	public void startTrial(int minRange, int maxRange) // calls method in question panel
	{
		qp.startTrial(minRange, maxRange);
	}
	
	public void receiveExplanation(String explaination, int score) // build explanation using method in ExplanationPanel
	{
		ep.buildExplanation(explaination, score);
	}
	
	
	public void updateUsername(String name) // helper method
	{
		iph.updateUsername(name);
	}
	
	
	public void initiateTypeAnimation() // helper method
	{
		iph.startTypeAnimation();
	}
}

class IntroPagePanel extends JPanel
{
	private ErrorCodeHolder panels;
	private CardLayout cards;
	private Accounts account;
	
	public IntroPagePanel(ErrorCodeHolder ech2, CardLayout cardsIn, Accounts accountIn)
	{
		panels = ech2;
		cards = cardsIn;
		account = accountIn;
		
		setLayout(null);
		setBackground(Color.BLACK);
		
		JButton pb = new JButton("[START]");
		pb.setBounds(415,230,130,40);
		Font buttonFont = new Font("Sherif", Font.BOLD, 22);
		pb.setForeground(Color.RED); 
		pb.setBackground(Color.GRAY); 
		pb.setFont(buttonFont);
		add(pb);
		
		JButton lbb = new JButton("[LEADERBOARD]");
		lbb.setBounds(372,300,220,40);
		lbb.setForeground(Color.RED); 
		lbb.setBackground(Color.GRAY); 
		lbb.setFont(buttonFont);
		add(lbb);
		
		JButton cb = new JButton("[CREDITS]");
		cb.setBounds(409,375,150,40);
		cb.setForeground(Color.RED); 
		cb.setBackground(Color.GRAY); 
		cb.setFont(buttonFont);
		add(cb);
		
		
		// GIFS
		
		//This is the holder of the 2 gifs
	    JLayeredPane gifHolder = new JLayeredPane();
        gifHolder.setBounds(0,0,960,540);
         
        //added to first layer
	    ImageIcon hackerBg  = new ImageIcon("Hacker_Animation3.gif");
        JLabel hackerHolder = new JLabel(hackerBg);
        hackerHolder.setBounds(0,0,960,540);
        gifHolder.add(hackerHolder,JLayeredPane.DEFAULT_LAYER);
         
        //added on top of first layer(second layer)
        ImageIcon title  = new ImageIcon("Heading.gif"); 
        JLabel titleHolder = new JLabel(title);
        titleHolder.setBounds(230,25,500,90);
        gifHolder.add(titleHolder, JLayeredPane.PALETTE_LAYER); //added on top of default
       
        add(gifHolder);
		
		pb.addActionListener(new ButtonHandeler());
		lbb.addActionListener(new ButtonHandeler());
		cb.addActionListener(new ButtonHandeler());
	}
	class ButtonHandeler implements ActionListener
	{
		public void actionPerformed(ActionEvent evt) // deciding which card to show from title based on button clicked
		{
			String command = evt.getActionCommand();
			
			if (command.equals("[START]"))
			{
				if(account.getContinueToMap() == true)
				{
					cards.show(panels,"Overworld");
				}
				
				else
				{
					cards.show(panels, "Login");
				}
			}
			else if (command.equals("[LEADERBOARD]"))
			{
				cards.show(panels, "Leaderboard");
			}
			else if (command.equals("[CREDITS]"))
			{
				cards.show(panels, "Credits");
			}
		}
	}
}

class InfoPanelHolder extends JPanel
{
	private ErrorCodeHolder panels;
	private CardLayout cards;
	private InfoPanel sp;
	
	public InfoPanelHolder(ErrorCodeHolder ech3, CardLayout cardsIn, Accounts accountIn)
	{
		panels = ech3;
		cards=cardsIn;
		
		setLayout(new BorderLayout());
		sp = new InfoPanel(accountIn);
		
		JButton ab = new JButton("[I understand]");
		ab.setForeground(Color.RED); 
		ab.setBackground(Color.GRAY); 
		
		add(sp, BorderLayout.CENTER);
		add(ab, BorderLayout.SOUTH);
		
		ab.addActionListener(new ButtonHandeler());
	}
	
	
	public void updateUsername(String name) // username continuation method
	{
		sp.setUsername(name);
	}
	
	
	public void startTypeAnimation() //Initiates typing animation method in info panel 
	{
		sp.startTyping();
	}
	
	class ButtonHandeler implements ActionListener
	{
		public void actionPerformed(ActionEvent evt)
		{
			cards.show(panels, "Tutorial");
		}
	}
}

class InfoPanel extends JPanel implements ActionListener
{
	private String fullStory;
	private String typeStory;
	private JLabel animatedStory;
	private int index;
	private boolean start;
	private JLabel usernameLabel;
	private Timer timeAnimation;
	
	public InfoPanel(Accounts accountIn)
	{
		setBackground(Color.BLACK);
		setLayout(null);
		
		Font creditFont = new Font("Sherif", Font.BOLD, 22);
		
		
	    fullStory = "SYSTEM BREACH DETECTED...\n\n" + "Your device has been compromised.\n" +
	                "An unknown entity has taken over your system.\n\n" +
	                "It is evaluating your worth.\n" +
	                "To regain control you must complete its challenges.\n" +
	                "by entering the firewall using an anitvirus and completing nodes.\n\n" +
	                "Each node contains different trials.\n" +
	                "Some will test your knowledge, others will test your skills.\n\n" +
	                "Do you have what it takes to reclaim your system?\n\n" +
	                 "We shall see..."; // The full string
	   
	    typeStory = "";
	    index = 0; 
	    
	    animatedStory = new JLabel("");
	    animatedStory.setFont(creditFont);
		animatedStory.setForeground(Color.RED); 
		animatedStory.setBounds(120,10,720,430);
		add(animatedStory);
		
		
		usernameLabel = new JLabel("");
		usernameLabel.setFont(creditFont);
		usernameLabel.setForeground(Color.BLUE);
		usernameLabel.setBounds(600,-190,720,430);
		add(usernameLabel);
		
		
		JButton skip = new JButton("[Skip]");
		skip.setForeground(Color.RED); 
		skip.setBackground(Color.GREEN); 
		skip.setBounds(0,450,70,20);
		skip.addActionListener(this);
		add(skip);
		
	    
	    Animater animate = new Animater();  // syntax received from TimerExample.java
		timeAnimation = new Timer(70, animate);
	}
	
	
	public void setUsername(String name) // username appears on next panel
	{
		usernameLabel.setText("Welcome " + name + "...");
	}
	
	
	public void startTyping()
	{
		index = 0;
		typeStory = "";
		animatedStory.setText("");
		
		start = true;  
		timeAnimation.start();
	}
	
	public void actionPerformed(ActionEvent evt)
	{
		 String skipAction = evt.getActionCommand();
		 
		 if(skipAction.equals("[Skip]")) // if user is bored and clicks whole text appears
		 {
			 timeAnimation.stop(); // JLabel is formatted using Html as seen in PutItTogether
			 animatedStory.setText("<html>SYSTEM BREACH DETECTED...<br><br>Your device has been compromised.<br>An unknown entity has taken over your system.<br><br>It is evaluating your worth.<br>To regain control you must complete its challenges.<br>by entering the firewall using an anitvirus and completing nodes.<br><br>Each node contains different trials.<br>Some will test your knowledge, others will test your skills.<br><br>Do you have what it takes to reclaim your system?<br><br>We shall see...</html>");
		 }
	}
	
	private class Animater implements ActionListener
	{
	  
	   public void actionPerformed(ActionEvent evt)
	   {
		   
		  if(index< fullStory.length() && start == true)
		  {
			  String indexStory = "" + fullStory.charAt(index);
			  
			  if(indexStory.equals("\n")) 
			  {
				  typeStory += "<br>"; // since JLabel is formatted using HTML as seen in PutItTogether we convert
				                       //new line \n to <br>
			  }
			  
			  else
			  {
				  typeStory += indexStory;
			  }
			  
			  animatedStory.setText("<html>" + typeStory + "</html>");
			  index++; // looping using the timer
		  } 
		  
		  else
		  {
			  timeAnimation.stop(); 
		  }
		
		}
		
    }
}

class Accounts
{
	//Info about User account
	private String userPassword;
	private String userName;
	
   //Info about gameplay and carda seen
	private boolean storySeen;
	private boolean tutorialCompleted;
	private boolean continueToMap;
	
	//Progress
	private int levelsFinished;
	
	//Powerups count-
	private int revealWrong;
	private int skipQuestion;
	private int stopClock;
	
	public Accounts()
	{
		userPassword = "";
		userName = "";
		
		storySeen = false;
		tutorialCompleted = false;
		continueToMap = false;
		
		levelsFinished = 0;
		
		skipQuestion = 0;
		revealWrong =0;
		stopClock = 0;
	}
	
	//Account creation and checking
	public void createAccount() // Syntax seen from RecipeList.java
	{
		String userInfo = userName + ".txt";
		File user = new File(userInfo);

		PrintWriter infoWriter = null;
		
		try
		{
			infoWriter = new PrintWriter(userInfo);
		}
		
		catch(FileNotFoundException e)
		{
			System.err.println("Cannot create File to Save Account");
			System.exit(4);
		}
		
		infoWriter.println(userName);
		infoWriter.println(userPassword);
		
		infoWriter.println(storySeen);
		infoWriter.println(tutorialCompleted);
		infoWriter.println(continueToMap);
		infoWriter.println(levelsFinished);
		
		infoWriter.println(stopClock);
		infoWriter.println(revealWrong);
		infoWriter.println(skipQuestion);
		
		infoWriter.close();
		
	}
	
	public void saveData() //helper method that will be called when smth needs to be saved
	{
		createAccount(); // This method updates file so also serves as updater
	}
	
	//returns a number which corresponds to state of login key: 0 - Account does not exist, 1- Exists and Correct Password
	//2- exists but wrong password
	public int validateInfo()
	{
		String userFile = userName + ".txt";
		File readUserFile = new File(userFile);
		
		Scanner reader = null;
		
		try
		{
			reader = new Scanner(readUserFile);
		}
		
		catch( FileNotFoundException e)
		{
			System.err.println("Error: Account does not exist");
			
			return 0;
		}
		
		String fileName = reader.nextLine();
		String filePassword = reader.nextLine();
		
		reader.close();
		
		if(filePassword.equals(userPassword))
		{
			return 1;
		}
		
		else if(!filePassword.equals(userPassword))
		{
			return 2;
		}
		
		return 0;
	}
	
	public void loadData()
	{
		String userFile = userName + ".txt";
		File readUserFile = new File(userFile);
		
		Scanner reader = null;
		
		try
		{
			reader = new Scanner(readUserFile);
		}
		
		catch( FileNotFoundException e)
		{
			System.err.println("Error: Account does not exist");
			System.exit(19);
		}
		
		userName = reader.nextLine();
		userPassword = reader.nextLine();
		
		storySeen = reader.nextBoolean();
		tutorialCompleted = reader.nextBoolean();
		continueToMap = reader.nextBoolean();
		
		levelsFinished = reader.nextInt();
		
		stopClock = reader.nextInt();
		revealWrong = reader.nextInt();
		skipQuestion = reader.nextInt();
		
		reader.close();
	}
	
	//Obtaining info
	public void userIn(String nameIn)
	{
		userName = nameIn;
	}
	
	public String getUserName()
	{
		return userName;
	}
	
	public void passwordIn(String password)
	{
		userPassword = password;
	}
	
	public String getPassword()
	{
		return userPassword;
	}
	
	public void storySeenIn(boolean storySeenChecked)
	{
		storySeen = storySeenChecked;
	}
	
	public boolean getStorySeen()
	{
		return storySeen;
	}
	
	public void TutorialCompletedIn(boolean tutorialCompletedChecked)
	{
		tutorialCompleted = tutorialCompletedChecked;
	}
	
	public boolean getTutorialCompleted()
	{
		return tutorialCompleted;
	}
	
	public void ContinueToMapIn(boolean ContinueToMapChecked)
	{
		continueToMap = ContinueToMapChecked;
	}
	
	public boolean getContinueToMap()
	{
		return continueToMap;
	}
	
	public void levelsFinishedIn(int levelsFinishedChecked)
	{
		levelsFinished = levelsFinishedChecked;
	}
	
	public int getLevelsFinished()
	{
		return levelsFinished;
	}
	
	//Powerups, Max 3 for one type of powerup
	public int getStopClock()
	{
		return stopClock;
	}
	
	public void increaseStopClock()
	{
		if(stopClock < 3)
		{
			stopClock++;
		}
	}
	
	public int getRevealWrong()
	{
		return revealWrong;
	}
	
	public void increaseRevealWrong()
	{
		if(revealWrong < 3)
		{
			revealWrong++;
		}
	}
	
	public int getSkipQuestion()
	{
		return skipQuestion;
	}
	
	public void increaseSkipQuestion()
	{
		if(skipQuestion < 3)
		{
			skipQuestion++;
		}
	}
	
}

class LoginPanel extends JPanel
{
	private ErrorCodeHolder panels;
	private CardLayout cards;
	private Accounts account;
	
	private JTextField enterName;
	private JTextField enterPassword;
	private JLabel accountStatus;
	
	
	public LoginPanel(ErrorCodeHolder ech3, CardLayout cardsIn, Accounts accountIn)
	{
		panels = ech3;
		cards=cardsIn;
		account = accountIn;
		
		setLayout(new BorderLayout());
		setBackground(Color.BLACK);
		
		JPanel log_in = new JPanel();
		log_in.setBackground(Color.BLACK);
		JButton cb = new JButton("[CONTINUE]");
		cb.setForeground(Color.RED); 
		cb.setBackground(Color.GRAY); 
		
		//This is the holder of the gif so text fied can be added on the layer top of the gif
	    JLayeredPane gifHolderLogin = new JLayeredPane();
        gifHolderLogin.setBounds(0,0,960,540);
         
        // gifs added to first layer
	    ImageIcon loginBg  = new ImageIcon("Login_Screen3.gif");
        JLabel loginHolder = new JLabel(loginBg);
        loginHolder.setBounds(0,0,960,520);
        gifHolderLogin.add(loginHolder,JLayeredPane.DEFAULT_LAYER);
       
        //gif added in same layer
        ImageIcon leftMatrix = new ImageIcon("Matrix_Alt1.gif");
        JLabel leftMatrixHolder = new JLabel(leftMatrix);
        leftMatrixHolder.setBounds(0,0,275,475);
        gifHolderLogin.add(leftMatrixHolder,JLayeredPane.DEFAULT_LAYER);
        
        //same layer 
        ImageIcon rightMatrix = new ImageIcon("Matrix_Alt1.gif");
        JLabel rightMatrixHolder = new JLabel(rightMatrix);
        rightMatrixHolder.setBounds(690,0,285,475);
        gifHolderLogin.add(rightMatrixHolder,JLayeredPane.DEFAULT_LAYER);
        
        //JLabel to guide User
        JLabel instructions = new JLabel("Sign-up/Login");
        instructions.setBounds(390,0,400,90);
        Font instuctFont = new Font("Sherif", Font.BOLD, 30);
		instructions.setFont(instuctFont);
		instructions.setForeground(Color.RED); 
        gifHolderLogin.add(instructions,JLayeredPane.PALETTE_LAYER);
        
        
        //TextField to enter name
        enterName = new JTextField("Enter Your Name Here");
        enterName.setBounds(395,157,190,30);
        gifHolderLogin.add(enterName,JLayeredPane.PALETTE_LAYER);
        enterName.addFocusListener(new TextHandeler("0"));
        
        JLabel name = new JLabel("Enter your name");
        name.setBounds(410,127,190,30);
        Font nameFont = new Font("Sherif", Font.BOLD, 20);
		name.setFont(nameFont);
		name.setForeground(Color.RED); 
        gifHolderLogin.add(name,JLayeredPane.PALETTE_LAYER);
        
        enterPassword = new JTextField("Enter your desired Password");
        enterPassword.setBounds(395,225,190,30);
        gifHolderLogin.add(enterPassword,JLayeredPane.PALETTE_LAYER);
        enterPassword.addFocusListener(new TextHandeler("1"));
        
        JLabel password = new JLabel("Enter a password");
        password.setBounds(410,195,190,30);
        Font passwordFont = new Font("Sherif", Font.BOLD, 20);
		password.setFont(passwordFont);
		password.setForeground(Color.RED); 
        gifHolderLogin.add(password,JLayeredPane.PALETTE_LAYER);
        
        JButton logOrSign = new JButton("Login/Sign-up");
        logOrSign.setBounds(395,355,190,30);
        logOrSign.addActionListener(new ButtonHandeler());
        gifHolderLogin.add(logOrSign,JLayeredPane.PALETTE_LAYER);
        
        accountStatus = new JLabel("");
        accountStatus.setBounds(360,390,500,40);
        Font statusFont = new Font("Sherif", Font.BOLD, 20);
        accountStatus.setFont(statusFont);
		accountStatus.setForeground(Color.RED); 
		gifHolderLogin.add(accountStatus,JLayeredPane.PALETTE_LAYER);
        
		
		add(gifHolderLogin);
		add(log_in, BorderLayout.CENTER);
		add(cb, BorderLayout.SOUTH);
		cb.addActionListener(new ButtonHandeler());
	}
	
	class TextHandeler implements FocusListener
	{
		private String labelId;
		
		public TextHandeler(String id)
		{
			labelId = id;
		}
		public void focusGained(FocusEvent evt)
		{
			if (labelId.equals("1"))
			{
				enterPassword.setText("");
			}
			else
			{
				enterName.setText("");
			}
		}
		
		public void focusLost(FocusEvent evt)
		{}
	}
	
	class ButtonHandeler implements ActionListener
	{
		public void actionPerformed(ActionEvent evt)
		{
			String name = enterName.getText();
			account.userIn(name);
			
			panels.updateUsername(name);
			
			String password = enterPassword.getText();
			String command = evt.getActionCommand();
			
			if(command.equals("[CONTINUE]") && !(name.equals("") || password.equals("") || password.equals("Enter a password") || name.equals("Enter Your Name Here")))
			{
			  if(account.getContinueToMap() == true)
			  {
				  cards.show(panels, "Overworld");
			  }
			  
			  else
			  {
				  cards.show(panels, "Information");
				  panels.initiateTypeAnimation();
			  }
		    }
		 
		    
		    
		    //sending info to use later
		    account.passwordIn(password);
			
			int state = account.validateInfo(); //storing return from validateInfo in account 
			if((name.equals("") || password.equals("") || password.equals("Enter a password") || name.equals("Enter Your Name Here")))
			{
				accountStatus.setText("ENTER YOUR NAME AND PASSWORD...");
			}
			else if(state == 0) // If account dies not exist
			{
				account.saveData();
				accountStatus.setForeground(Color.GREEN);
				
				accountStatus.setText("Account Created Succesfully");
			}
			
			else if(state == 1)
			{
				account.loadData();
				accountStatus.setForeground(Color.GREEN);
				
				accountStatus.setText("Welcome back!");
			}
			
			else if(state == 2)
			{
				accountStatus.setForeground(Color.RED);
				
				accountStatus.setText("Incorrect Password, Try Again");
			}
		}
	}
}

class LeaderboardPanel extends JPanel
{
    private LeaderboardEntry[] entries;
    private int entryCount;

    private JTextArea display;
    private File saveFile;

    private ErrorCodeHolder panels;
    private CardLayout cards;
    private Accounts account;

    public LeaderboardPanel(ErrorCodeHolder ech, CardLayout cardsIn, Accounts acc)
    {
        panels = ech;
        cards = cardsIn;
        account = acc;
        setBackground(Color.BLACK);
        setLayout(new BorderLayout());

        entries = new LeaderboardEntry[50];
        entryCount = 0;

        saveFile = new File("leaderboard.txt");

        display = new JTextArea();
        display.setEditable(false);
        display.setBackground(Color.BLACK);
        display.setForeground(Color.GREEN);
        display.setFont(new Font("Monospaced", Font.BOLD, 18));

        add(new JScrollPane(display), BorderLayout.CENTER);

        JButton back = new JButton("[BACK]");
        back.setForeground(Color.RED);
        back.setBackground(Color.DARK_GRAY);
        back.setFont(new Font("Arial", Font.BOLD, 20));
        back.setFocusPainted(false);

        back.addActionListener(new ButtonHandeler());

        add(back, BorderLayout.SOUTH);

        loadFromFile();
        refresh();
    }
    class ButtonHandeler implements ActionListener
    {
		public void actionPerformed(ActionEvent e)
        {
            cards.show(panels, "Title");
        }
	}
    
    public void addEntry(String name, int level, int score)
    {
        if(entryCount < entries.length)
        {
            entries[entryCount] = new LeaderboardEntry(name, level, score);
            entryCount++;
        }

        saveToFile();
        refresh();
    }
    
	public void deleteSaveFile()
    {
        File file = new File(account.getUserName() + ".txt");

        if(file.exists())
        {
            file.delete();
        }
    }
    public void loadFromFile()
    {
        entryCount = 0;

        if(!saveFile.exists())
        {
            return;
        }

        try
        {
            Scanner sc = new Scanner(saveFile);

            while(sc.hasNextLine() && entryCount < entries.length)
            {
                String line = sc.nextLine().trim();

                String[] parts = line.split(",");

                if(parts.length == 3)
                {
                    String name = parts[0].trim();
                    int level = Integer.parseInt(parts[1].trim());
                    int score = Integer.parseInt(parts[2].trim());

                    entries[entryCount] = new LeaderboardEntry(name, level, score);
                    entryCount++;
                }
            }

            sc.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public void saveToFile()
    {
        try
        {
            PrintWriter pw = new PrintWriter(new FileWriter(saveFile));

            for(int i = 0; i < entryCount; i++)
            {
                pw.println(
                    entries[i].name + "," +
                    entries[i].level + "," +
                    entries[i].score
                );
            }

            pw.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        deleteSaveFile();
    }

    public void refresh()
    {
        String text = "";

        text += "=====================\n";
        text += "     LEADERBOARD     \n";
        text += "=====================\n\n";

        if(entryCount == 0)
        {
            text += "No records yet.\n";
        }

        for(int i = 0; i < entryCount; i++)
        {
            text += (i + 1)
                + ". " + entries[i].name
                + " | Level: " + entries[i].level
                + " | Score: " + entries[i].score + "\n";
        }

        display.setText(text);
    }
}

class CreditsPanelHolder extends JPanel
{
	private ErrorCodeHolder panels;
	private CardLayout cards;
	
	public CreditsPanelHolder(ErrorCodeHolder ec6, CardLayout cardsIn)
	{
		panels = ec6;
		cards=cardsIn;
		
		setLayout(new BorderLayout());
		CreditsPanel cp = new CreditsPanel();
		
		JButton bb = new JButton("[BACK]");
		bb.setForeground(Color.RED); 
		bb.setBackground(Color.GRAY); 
		
		add(cp, BorderLayout.CENTER);
		add(bb, BorderLayout.SOUTH);
		
		bb.addActionListener(new ButtonHandeler());
		
	}
	
	class ButtonHandeler implements ActionListener
	{
		public void actionPerformed(ActionEvent evt)
		{
			cards.show(panels, "Title");
		}
	}
}

class CreditsPanel extends JPanel
{
	public CreditsPanel()
	{
		setBackground(Color.BLACK);
		setLayout(new FlowLayout());
		JLabel cl = new JLabel("GAME MADE BY: SOMANATH & AKILESH");
		cl.setBounds(280,25,300,200);
		Font creditFont = new Font("Sherif", Font.BOLD, 32);
		cl.setFont(creditFont);
		cl.setForeground(Color.RED); 
		add(cl);
		ImageIcon matrixBg  = new ImageIcon("Matrix.gif");
        JLabel  matrixHolder = new JLabel(matrixBg);
        matrixHolder.setBounds(0,0,960,540);
        add(matrixHolder);
	}
}

class QuestionPanel extends JPanel
{
	private ErrorCodeHolder panels;
	private CardLayout cards;
	private Accounts account;
	
	private JLabel timerLabel;
	private Timer countdownTimer;
	private int timeLeft;
	
	private String questionRNG; // randomized question
	private String answer1;// all answers
	private String answer2;
	private String answer3;
	private String answer4;
	
	private JButton choice1;// JButtons to place answers in
	private JButton choice2;
	private JButton choice3;
	private JButton choice4;
	
	private JButton stopButton;
	private JButton skipButton;
	private JButton revealButton;
	
	private JTextArea lbl;//heading
	private String correct;// answer to question
	
	
	private String explanationFromFile; // explanation text
	
	private int minQuestionRNG; // min range
	private int maxQuestionRNG; // max range
	
	private int answeredQuestions; // number of questions tracker
	private int rank; // user rank
	private int score;
	private int lives;
	private int currentLevelId;
	
	private int stopPowers = 0;
	private int skipPowers = 0;
	private int revealPowers = 0;

	private final int MAX_POWER = 3;
	
	private String explanationText; //molded explanation to be outputed
	private Clip music;
	
	public QuestionPanel(ErrorCodeHolder ech7, CardLayout card, Accounts accountIn)
	{
		cards = card;
		panels=ech7;
		account = accountIn;
		
		setLayout(new BorderLayout());
		
		JLayeredPane questionLayer = new JLayeredPane();
		questionLayer.setPreferredSize(new Dimension(960, 120));
		
		JPanel choices = new JPanel();
		JPanel questions = new JPanel();
		
		add(questions, BorderLayout.NORTH);
		add(choices, BorderLayout.CENTER);
		questions.add(questionLayer);
		
		ImageIcon clockGif = new ImageIcon("clock.gif");
		Image img = clockGif.getImage();
		Image scaledImg = img.getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		JLabel clockLabel = new JLabel(new ImageIcon(scaledImg));
		clockLabel.setBounds(0, 0, 200, 120);
		questionLayer.add(clockLabel, JLayeredPane.DEFAULT_LAYER);
		
		timerLabel = new JLabel("30");
		Font clockFont = new Font("Sherif", Font.BOLD, 55);
		timerLabel.setFont(clockFont);
		timerLabel.setForeground(Color.RED);
		timerLabel.setBounds(70, 25, 100, 60);
		questionLayer.add(timerLabel, JLayeredPane.MODAL_LAYER);
		
		countdownTimer = new Timer(1000, new TimerHandeler());
		
		questions.setBackground(Color.GRAY);
	    lbl = new JTextArea(questionRNG);
		lbl.setLineWrap(true);
		lbl.setWrapStyleWord(true);
		lbl.setEditable(false);
		lbl.setOpaque(false);
		lbl.setBackground(new Color(0,0,0,0));
		lbl.setBorder(null);
		Font titleFont = new Font("Sherif", Font.BOLD, 20);
		lbl.setFont(titleFont);
		lbl.setForeground(Color.BLACK);
		lbl.setBounds(200, 15, 500, 90);
		questionLayer.add(lbl, JLayeredPane.PALETTE_LAYER);
		
		ImageIcon powerStopTimer  = new ImageIcon("StopTimerPowerUp1.png");
        JLabel powerStopTimerHolder = new JLabel(powerStopTimer);
        powerStopTimerHolder.setBounds(630,42,90,80);
        questionLayer.add(powerStopTimerHolder, JLayeredPane.PALETTE_LAYER);
        
        stopButton = new JButton("Stop");
        stopButton.setBounds(630,42,90,80);
        stopButton.setBackground(Color.GRAY);
        stopButton.addActionListener(new PowerHandler());
        questionLayer.add(stopButton, JLayeredPane.PALETTE_LAYER);
        
        ImageIcon powerSkipQuestion  = new ImageIcon("SkipQuestionPowerUp1.png");
        JLabel powerSkipQuestionHolder = new JLabel(powerSkipQuestion);
        powerSkipQuestionHolder.setBounds(740,42,90,80);
        questionLayer.add(powerSkipQuestionHolder, JLayeredPane.PALETTE_LAYER);
        
        skipButton = new JButton("Skip");
        skipButton.setBounds(740,42,90,80);
        skipButton.setBackground(Color.GRAY);
        skipButton.addActionListener(new PowerHandler());
        questionLayer.add(skipButton, JLayeredPane.PALETTE_LAYER);
        
        ImageIcon powerRevealWrong  = new ImageIcon("RevealTwoWrongAnswersPowerUp1.png");
        JLabel powerRevealWrongHolder = new JLabel(powerRevealWrong);
        powerRevealWrongHolder.setBounds(835,42,90,80);
        questionLayer.add(powerRevealWrongHolder, JLayeredPane.PALETTE_LAYER);
        
        revealButton = new JButton("Reveal");
        revealButton.setBounds(835,42,90,80);
        revealButton.setBackground(Color.GRAY);
        revealButton.addActionListener(new PowerHandler());
        questionLayer.add(revealButton, JLayeredPane.PALETTE_LAYER);
        
        
		choices.setLayout(new GridLayout(2,2));
		
		JPanel firstCell = new JPanel();
		firstCell.setLayout(new BorderLayout());
	    choice1 = new JButton(answer1);
		choice1.setForeground(Color.BLUE); 
		choice1.setBackground(Color.LIGHT_GRAY);
		firstCell.add(choice1, BorderLayout.CENTER);
		choices.add(firstCell);
		choice1.addActionListener(new ButtonHandeler());
		
		JPanel secondCell = new JPanel();
		secondCell.setLayout(new BorderLayout());
		choice2 = new JButton(answer2);
		choice2.setForeground(Color.BLUE); 
		choice2.setBackground(Color.LIGHT_GRAY);
		secondCell.add(choice2, BorderLayout.CENTER);
		choices.add(secondCell);
		choice2.addActionListener(new ButtonHandeler());
		
		JPanel thirdCell = new JPanel();
		thirdCell.setLayout(new BorderLayout());
	    choice3 = new JButton(answer3);
		choice3.setForeground(Color.BLUE); 
		choice3.setBackground(Color.LIGHT_GRAY);
		thirdCell.add(choice3, BorderLayout.CENTER);
		choices.add(thirdCell);
		choice3.addActionListener(new ButtonHandeler());
		
		JPanel fourthCell = new JPanel();
		fourthCell.setLayout(new BorderLayout());
	    choice4 = new JButton(answer4);
		choice4.setForeground(Color.BLUE); 
		choice4.setBackground(Color.LIGHT_GRAY);
		fourthCell.add(choice4, BorderLayout.CENTER);
		choices.add(fourthCell);
		choice4.addActionListener(new ButtonHandeler());
		
		try
        {
            // Load sound file
            URL url = getClass().getResource("/QuestionMusic.wav");
            // Check if file exists
            if (url == null)
            {
                System.out.println("Could not find QuestionMusic.wav");
                return;
            }
            // Open audio stream
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
            // Create clip
            music = AudioSystem.getClip();
            // Load audio into clip
            music.open(audioIn);
            // Play sound
        }
        catch (UnsupportedAudioFileException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (LineUnavailableException e)
        {
            e.printStackTrace();
        }
	}
	
	
	public void startTrial(int minRange, int maxRange) // helper method deciding what range question is randomized from
	{
		music.loop(Clip.LOOP_CONTINUOUSLY);
		minQuestionRNG = minRange; 
		maxQuestionRNG = maxRange;
		
		lives = 0;
		score = 0;
		answeredQuestions = 0;
		rank = 0;
		explanationText = "";
		currentLevelId = (minRange / 9) + 1;
		
		buildNextQuestion();
		
	}
	
	public int getStopPowers()
	{
		return stopPowers;
	}
	public int getSkipPowers()
	{
		return skipPowers;
	}
	public int getRevealPowers()
	{
		return revealPowers;
	}
	
	public void buildNextQuestion()
	{
		questionGetter(); // randomize questions repeatedly
		
		lbl.setText(questionRNG); // load new question each time timer starts
		
	    choice1.setText(answer1); // all choices match the question
		choice2.setText(answer2);
		choice3.setText(answer3);
		choice4.setText(answer4);
		
		choice1.setEnabled(true);
		choice2.setEnabled(true);
		choice3.setEnabled(true);
		choice4.setEnabled(true);
		
		restoreColor();
		
		timeLeft = 30;
		timerLabel.setText("30");
		
		countdownTimer.stop(); // fresh start
		
		
		countdownTimer.start();
	}
	
	class TimerHandeler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			timeLeft--;
			timerLabel.setText(String.valueOf(timeLeft));
			if (timeLeft <= 0)
			{
				countdownTimer.stop();
			}
		}
	}
	
	public void questionGetter()
    {
		String inFileName = "Java_Questions.txt";
		File inFile = new File(inFileName); 
		Scanner keyboard = null;
		
		try 
		{
			keyboard = new Scanner(inFile);
		}
		
		catch(FileNotFoundException e)
		{
			System.err.printf("\n\n\nERROR! CANNOT FIND/OPEN FILE %s. \n\n\n", inFileName);
			System.exit(1);
		}
		
		boolean found = false;
		
		int questionNum = (int)(Math.random() * (maxQuestionRNG - minQuestionRNG + 1)) + minQuestionRNG; // math for randomization within range
		
		String questionNumStr = questionNum + " - ";
		
		while (keyboard.hasNextLine() && found == false)
		{
			String gottext = keyboard.nextLine();
			
			if (gottext.startsWith(questionNumStr)) // finding question using index number
			{
				questionRNG = gottext;
				
				answer1 = keyboard.nextLine();
				answer2 = keyboard.nextLine();
				answer3 = keyboard.nextLine();
				answer4 = keyboard.nextLine();
				
				correct = "";
				
				if(answer1.charAt(0) == '>') // cheking if each choice is the correct answer
				{
					correct = answer1.substring(2);
					answer1 = answer1.substring(2);
				}
				
				if(answer2.charAt(0) == '>')
				{
					correct = answer2.substring(2);
					answer2 = answer2.substring(2);
				}
				
				if(answer3.charAt(0) == '>')
				{
					correct = answer3.substring(2);
					answer3 = answer3.substring(2);
				}
				
				if(answer4.charAt(0) == '>')
				{
					correct = answer4.substring(2);
					answer4 = answer4.substring(2);
				}
				
				explanationFromFile = "";
				
				boolean traversingExplanation = true;
				
				while(keyboard.hasNextLine() && traversingExplanation == true) // true if blank like is not yet reached
				{
					String explanationLine = keyboard.nextLine(); // blank marks transition to next question
					
					if(explanationLine.equals(""))
					{
						traversingExplanation = false;
					}
					
					else
					{
						explanationFromFile += explanationLine + "\n";
					}
				}
				
				found = true;
			}
		}
	
	keyboard.close();
}
	private void rewardRandomPowerUp()
	{
		int roll = (int)(Math.random() * 3);

		if (roll == 0 && stopPowers < MAX_POWER)
		{
			stopPowers++;
		}
		else if (roll == 1 && skipPowers < MAX_POWER)
		{
			skipPowers++;
		}	
		else if (roll == 2 && revealPowers < MAX_POWER)
		{
			revealPowers++;
		}
	}
	class ButtonHandeler implements ActionListener
	{
		public void actionPerformed(ActionEvent evt)
		{
			String action = evt.getActionCommand();
			
			countdownTimer.stop();
			
			answeredQuestions++;
			
			if(action.equals(correct)) // if answer is correct, increase score
			{
				rank++;
			}
			
			else if(!action.equals(correct)) //building content of explanation panel 
			{
				explanationText += "Question:\n" + questionRNG + "\n\n" + "Correct answer:\n" + correct + "\n\n"
								+ explanationFromFile + "\n\n====================================================\n\n";                  
			}
			
			
			if(answeredQuestions == 3) //going to explanation panel every 3 questions(1 trial)
			{
				panels.receiveExplanation(explanationText, rank);
				music.stop();
				cards.show(panels, "Explanation");
				
				if (rank == 3)
				{
					rewardRandomPowerUp();
					score += 300;
					lives++;
					
					if (account.getLevelsFinished() < currentLevelId)
					{
						account.levelsFinishedIn(currentLevelId);
						account.saveData();
					}
				}
				
				else if (rank == 2)
				{
					score += 100;
					
					if (account.getLevelsFinished() < currentLevelId)
					{
						account.levelsFinishedIn(currentLevelId);
						account.saveData();
					}
				}
				
				else if (rank == 1)
				{
					score = score;
					lives--;
				}
				
				else
				{
					score -= 100;
					lives--;
				}
				panels.returnScore(score,lives);
			}
			
			else // if not done progress through trial
			{
				buildNextQuestion();
			}
			
		}
	}
	
	class PowerHandler implements ActionListener
	{
		public PowerHandler()
		{
			
		}
		
		public void actionPerformed(ActionEvent evt)
		{
			String action = evt.getActionCommand();
			
			if(action == "Stop")
			{
				if (stopPowers > 0)
				{
					stopPowers--;
					countdownTimer.stop();
				}
			}
			
			else if(action == "Skip")
			{
				if (skipPowers > 0)
				{
					skipPowers--;
					activateSkipQuestion();
				}
			}
			
			else if(action == "Reveal")
			{
				if (revealPowers > 0)
				{
					revealPowers--;
					activateRevealWrong();
				}
			}
		}
	}
	
	
	public void activateSkipQuestion()
	{
		  countdownTimer.stop();
		  
		  answeredQuestions++;
		  rank++;
		  
		  if(answeredQuestions == 3)
		  {
				panels.receiveExplanation(explanationText, rank);
				music.stop();
				cards.show(panels, "Explanation");

				if(rank == 3)
				{
					score += 300;
					lives++;

					account.levelsFinishedIn(account.getLevelsFinished() + 1);
					account.saveData();
				}

				else if(rank == 2)
				{
					score += 100;

					account.levelsFinishedIn(account.getLevelsFinished() + 1);
					account.saveData();
				}

				else if(rank == 1)
				{
					lives--;
				}

				else
				{
					score -= 100;
					lives--;
				}

			  panels.returnScore(score, lives);
		}

		else
		{
			buildNextQuestion();
		}
	
	}
	
	
	public void activateRevealWrong()
	{
		int removed = 0; // the questions removed (Maximum is 2 as per the power up
		
		String firstAnswer = choice1.getText();
		String secondAnswer = choice2.getText();
		String thirdAnswer = choice3.getText();
		String fourthAnswer = choice4.getText();
		
		if(!firstAnswer.equals(correct) && removed < 2) // go through all and disable wrong answers
		{
			choice1.setEnabled(false); // seen from gameModuleFiles
			choice1.setBackground(Color.RED);
			removed++;
		}
		
	    if(!secondAnswer.equals(correct) && removed < 2)
		{
			choice2.setEnabled(false); 
			choice2.setBackground(Color.RED);
			removed++;
		}
		
       if(!thirdAnswer.equals(correct) && removed < 2)
		{
			choice3.setEnabled(false); 
			choice3.setBackground(Color.RED);
			removed++;
		}
		
	   if(!fourthAnswer.equals(correct) && removed < 2)
		{
			choice4.setEnabled(false); 
			choice4.setBackground(Color.RED);
			removed++;
		}
		
		
	}
	
	public void restoreColor()
	{
		choice1.setBackground(Color.LIGHT_GRAY);
		choice2.setBackground(Color.LIGHT_GRAY);
		choice3.setBackground(Color.LIGHT_GRAY);
		choice4.setBackground(Color.LIGHT_GRAY);
	}
	
}

class ExplanationPanel extends JPanel implements ActionListener
{
	private ErrorCodeHolder panels;
	private CardLayout cards;
	private JTextArea stats;
	
	public ExplanationPanel(ErrorCodeHolder ech9, CardLayout card)
	{
		cards = card;
		panels=ech9;
		
		setLayout(new BorderLayout());
		setBackground(Color.BLACK);
		
		JPanel explanation = new JPanel();
		explanation.setLayout(new BorderLayout());
		
		JLabel fireWall = new JLabel("Firewall Module Update",JLabel.CENTER);
		Font titleFont = new Font("Sherif", Font.BOLD,32);
		fireWall.setFont(titleFont);
		fireWall.setOpaque(true);
		fireWall.setBackground(Color.BLACK);
		fireWall.setForeground(Color.RED);
		explanation.add(fireWall,BorderLayout.NORTH);
		
		
	    stats = new JTextArea();
		stats.setEditable(false);
		stats.setFont(titleFont);
		stats.setBackground(Color.BLACK);
		stats.setForeground(Color.RED);
		
		JScrollPane statsScroll = new JScrollPane(stats);
		explanation.add(statsScroll, BorderLayout.CENTER);
		
		
		JPanel buttons = new JPanel();
		buttons.setLayout(new GridLayout(1, 2));

		JButton backToTrials = new JButton("[BACK TO MAP]");
		backToTrials.setForeground(Color.RED);
		backToTrials.setBackground(Color.GRAY);
		backToTrials.addActionListener(this);
		buttons.add(backToTrials);

		JButton home = new JButton("[HOME]");
		home.setForeground(Color.RED);
		home.setBackground(Color.GRAY);
		home.addActionListener(this);
		buttons.add(home);
	
		add(explanation, BorderLayout.CENTER);
		add(buttons, BorderLayout.SOUTH);
		
	}
	
	public void buildExplanation(String explaination , int score)
	{
		String statsOutput = "";
		
		statsOutput += "FIREWALL MODULE UPDATED...\n\nTrial Score: " + score + "/3\n\n";
		
		if(explaination.equals("")) // if everything was correct, could if score is 3
		{
			statsOutput += "You perfectly completed the trial\n reducing the hackers powers\ngood job!";
		}
		
		else
		{
			statsOutput += "There were some complications which\n you could not overcome:\n\nExplanation\n" + explaination + "\n\nDont worry you gained more knowledge now!"; //building text
		}
		
		stats.setText(statsOutput);
	}
	
	public void actionPerformed(ActionEvent evt)
	{
		String command = evt.getActionCommand();
		
		if(command.equals("[HOME]"))
		{
			cards.show(panels, "Title"); // back to home
		}
		
		else if(command.equals("[BACK TO MAP]"))
		{
			cards.show(panels, "Overworld"); // trials map
		}
	}
	
}

class TutorialPanel extends JPanel implements ActionListener
{
	private ErrorCodeHolder panels;
	private CardLayout cards;
	private Accounts account;

	private Timer animationTimer;
	private ImageIcon[] guideFrames;
	private ImageIcon[] downAtk;
	
	private ImageIcon guideBox;
	
    private ImageIcon stopPower;
    private ImageIcon revealPower;
    private ImageIcon skipPower;
    
    private ImageIcon perfectScore;
    private ImageIcon Arrow;
    private ImageIcon arrived;
    
    private ImageIcon levelPassed;
    private ImageIcon levelLocked;
	
	private int frame;
	private int frameCounter;
	
	private int attackFrame;
	private int attackCounter;

	private String[] tutorialText;
	private int tutorialStep;

	private JButton next;
	private JButton begin;

	public TutorialPanel(ErrorCodeHolder ech10, CardLayout card, Accounts accountIn)
	{
		panels = ech10;
		cards = card;
		account = accountIn;

		setLayout(null);
		setBackground(Color.BLACK);

		loadTutorialImages();
		buildTutorialText();

		JLabel title = new JLabel("FIREWALL MOVEMENT TRAINING", JLabel.CENTER);
		title.setFont(new Font("Sherif", Font.BOLD, 34));
		title.setForeground(Color.RED);
		title.setBounds(100, 30, 760, 50);
		add(title);

		next = new JButton("[NEXT]");
		next.setForeground(Color.RED);
		next.setBackground(Color.GRAY);
		next.setFont(new Font("Sherif", Font.BOLD, 22));
		next.setBounds(610, 440, 130, 40);
		next.addActionListener(this);
		add(next);

		begin = new JButton("[START]");
		begin.setForeground(Color.RED);
		begin.setBackground(Color.GRAY);
		begin.setFont(new Font("Sherif", Font.BOLD, 22));
		begin.setBounds(750, 440, 170, 40);
		begin.addActionListener(this);
		begin.setEnabled(false);
		add(begin);

		animationTimer = new Timer(120, this);
		animationTimer.start();
	}

	private void loadTutorialImages()
	{
		guideFrames = new ImageIcon[3];

		guideFrames[0] = new ImageIcon("down_idle.png");
		guideFrames[1] = new ImageIcon("down_walk1.png");
		guideFrames[2] = new ImageIcon("down_walk2.png");
		
		downAtk = new ImageIcon[4];
		
		downAtk[0] = new ImageIcon("down_attack1.png");
	    downAtk[1] = new ImageIcon("down_attack2.png");
	    downAtk[2] = new ImageIcon("down_attack3.png");
	    downAtk[3] = new ImageIcon("down_attack4.png");
	    
	    guideBox = new ImageIcon("Map_Guide.png");
	    
	    stopPower = new ImageIcon("StopTimerPowerUp1.png");
		revealPower = new ImageIcon("RevealTwoWrongAnswersPowerUp1.png");
		skipPower= new ImageIcon("SkipQuestionPowerUp1.png");

        perfectScore = new ImageIcon("Perfect_Score.png");
		Arrow = new ImageIcon("Right_Arrow.png");
		arrived = new ImageIcon("You_Reached.png");

		levelLocked = new ImageIcon("Locked_Emblem.png");

	}

	private void buildTutorialText()
	{
		tutorialText = new String[13];

		tutorialText[0] = "Welcome to firewall movement training.";
		tutorialText[1] = "Use the arrow keys to move around.";
		tutorialText[2] = "Hold SHIFT to sprint through if the path is safe.";
		tutorialText[3] = "Press SPACE while standing on a module to activate it.";
		tutorialText[4] = "On the map, follow the guide box to reach the next module.";
		tutorialText[5] = "The arrow guide points toward your next firewall module.";
		tutorialText[6] = "When you arrive, the guide will display YOU REACHED.";
		tutorialText[7] = "Powerups can help you during firewall trials.";
		tutorialText[8] = "Stop Clock freezes time.";
		tutorialText[9] = "Reveal Wrong disables 2 wrong answers.";
		tutorialText[10] = "Skip Question instantly clears the current challenge.";
		tutorialText[11] = "Perfectly complete trials (3/3) to earn powerups.";
		tutorialText[12] = "This Message is triggered when a non reached level is approached";
		
	}

	private void updateGuideAnimation()
	{
		
			frameCounter++;

			if(frameCounter > 2)
			{
				frame++;

				if(frame >= guideFrames.length)
				{
					frame = 0;
				}

				frameCounter = 0;
			}
			
			attackCounter++;
			
			if(attackCounter > 2)
			{
				attackFrame++;
				
				if(attackFrame >= downAtk.length)
				{
					attackFrame = 0;
				}
				
				attackCounter = 0;
	   }
	}

	public void actionPerformed(ActionEvent evt)
	{
		if(evt.getSource() == animationTimer)
		{
			updateGuideAnimation();
			repaint();
		}

		else if(evt.getActionCommand().equals("[NEXT]"))
		{
			if(tutorialStep < tutorialText.length - 1) // prevents IndexOutOfBoundsException
			{
			  tutorialStep++;
		    }
		    
		    if(tutorialStep == 12)
		    {
				begin.setEnabled(true);
				next.setEnabled(false);
			}
			
			repaint();
			
		}

		else if(evt.getActionCommand().equals("[START]"))
		{
			//saving and updating panels seen so next time from title screen player can directly go to Map
			account.storySeenIn(true);
			account.TutorialCompletedIn(true);
			account.ContinueToMapIn(true);
			account.saveData();
			
			animationTimer.stop();
		    cards.show(panels, "Overworld");
		}
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		ImageIcon img = guideFrames[frame];
		Image getImg = img.getImage();
		
		ImageIcon img2 = downAtk[attackFrame];
		Image getImg2 = img2.getImage();
		
		if(tutorialStep <= 2)
		{
			if(guideFrames[frame] != null)
			{
				g.drawImage(getImg, 405, 145, 150, 150, this);
			}
		}
		
		else if(tutorialStep == 3)
		{
			if(downAtk[attackFrame] != null)
			{
				g.drawImage(getImg2,405,145,150,150,this);
				
			}
		}
		
		// Drawing Appropriate Image in the box as per tutorial text to visualize 
		if(tutorialStep == 4)
		{
			g.drawImage(guideBox.getImage(),350,120,250,130,this);
		}
		
		else if(tutorialStep == 5)
		{
			g.drawImage(Arrow.getImage(),390,140,150,150,this);
		}
		
	    else if(tutorialStep == 6)
		{
			g.drawImage(arrived.getImage(),340,150,280,120,this);
		}
		
		else if(tutorialStep == 7)// All owerups
		{
			g.drawImage(stopPower.getImage(),220,160,100,100,this);
			
			g.drawImage(revealPower.getImage(), 420,160,100,100, this);
			
			g.drawImage(skipPower.getImage(), 620, 160,100,100,this);
		}
		
		else if(tutorialStep == 8)
		{
			g.drawImage(stopPower.getImage(),390,140,150,150,this);
		}
		
		else if(tutorialStep == 9)
		{
			g.drawImage(revealPower.getImage(),390,140,150,150,this);
		}
		
		else if(tutorialStep == 10)
		{
			g.drawImage(skipPower.getImage(),390,140,150,150,this);
		}
		
		else if(tutorialStep == 11)
		{
			g.drawImage(perfectScore.getImage(),350,150,250,120,this);
		}
		
		else if(tutorialStep == 12)
		{
			g.drawImage(levelLocked.getImage(),390,140,150,150,this);
		}
		

		g.setColor(Color.RED); // Upper outline for character box
		g.drawRect(0, 100, 910, 220);

		g.setColor(Color.GREEN);
		g.drawRect(5, 105, 900, 210);

		g.setColor(Color.RED);// tutorial dialogue outline
		g.drawRect(60, 350, 840, 130);

		g.setColor(Color.GREEN);
		g.drawRect(65, 355, 830, 120);

		g.setFont(new Font("Sherif", Font.BOLD, 22));
		g.setColor(Color.RED);
		g.drawString("SYSTEM GUIDE", 95, 385);

		g.setFont(new Font("Sherif", Font.BOLD, 20));
		g.setColor(Color.WHITE);
		g.drawString(tutorialText[tutorialStep], 95, 430); // drawing next tutorial
	}


}

class OverworldPanel extends JPanel
{
	private int score = 0;
	private int lives = 5;
	
    // WINDOW SIZE
    private final int SCREEN_W = 800;
    private final int SCREEN_H = 600;
    
    // PLAYER SIZE
    private final int DRAW_SIZE = 90;
    // PLAYER WORLD POSITION
    private int x = 208;
    private int y = 2054;
    
	private boolean sprinting;
    private final int WALK_SPEED = 4;
	private final int SPRINT_SPEED = 8;
    // CAMERA POSITION
    private int cameraX = 0;
    private int cameraY = 0;
    
    // MAP SIZE
    private int MAP_W;
    private int MAP_H;
    
    private boolean up, down, left, right, attacking;
    
    // 0 = down,1 = up,2 = left,3 = right
    private int direction = 0;
    
    private int walkFrame = 0;
    private int walkCounter = 0;
    
    private int attackFrame = 0;
    private int attackCounter = 0;
    
    private Timer timer;
    // BACKGROUND
    private ImageIcon background;

    private ImageIcon[] downImg = new ImageIcon[3];
    private ImageIcon[] upImg = new ImageIcon[3];
    private ImageIcon[] leftImg = new ImageIcon[3];
    private ImageIcon[] rightImg = new ImageIcon[3];

    private ImageIcon[] downAtk = new ImageIcon[4];
    private ImageIcon[] upAtk = new ImageIcon[4];
    private ImageIcon[] leftAtk = new ImageIcon[4];
    private ImageIcon[] rightAtk = new ImageIcon[4];
    
	private Rectangle[] walls = {new Rectangle(320, 830, 372, 280), new Rectangle(421, 133, 366, 483), new Rectangle(339, 1207, 306, 292), new Rectangle(-42, 1, 152, 2446), new Rectangle(0, 2275, 3986, 101), new Rectangle(3885, 1, 96, 2366), new Rectangle(3402, 686, 293, 339), new Rectangle(3387, 146, 334, 410), new Rectangle(3391, 1227, 245, 288), new Rectangle(3634, 1241, 98, 251), new Rectangle(3413, 1694, 316, 331), new Rectangle(3368, 2101, 395, 156), new Rectangle(3011, 1635, 178, 442), new Rectangle(2566, 1746, 269, 335), new Rectangle(2261, 877, 278, 485), new Rectangle(2851, 1149, 283, 351), new Rectangle(2814, 742, 363, 276), new Rectangle(2743, 152, 332, 408), new Rectangle(1715, 35, 603, 650), new Rectangle(1460, 1454, 391, 186), new Rectangle(1370, 1768, 490, 272), new Rectangle(1035, 519, 333, 399), new Rectangle(1537, 1026, 330, 323)};
	private Trigger[] triggers = {new Trigger(320, 1750, 348, 348, 1, false), new Trigger(309, 1474, 374, 125, 2, false), new Trigger(292, 1094, 433, 102, 3, false), new Trigger(416, 611, 386, 111, 4, false), new Trigger(1527, 1312, 320, 119, 5, false), new Trigger(1434, 1627, 435, 110, 6, false), new Trigger(1375, 2041, 501, 94, 7, false), new Trigger(1001, 886, 381, 151, 8, false), new Trigger(2539, 2020, 316, 192, 9, false), new Trigger(2977, 2025, 249, 183, 10, false), new Trigger(2250, 1449, 325, 163, 11, false), new Trigger(2246, 1365, 319, 74, 12, false), new Trigger(2850, 1485, 288, 138, 13, false), new Trigger(2812, 1021, 367, 88, 14, false), new Trigger(2724, 557, 373, 110, 15, false), new Trigger(3336, 533, 435, 130, 16, false), new Trigger(3380, 1480, 363, 148, 17, false), new Trigger(3415, 1995, 314, 74, 18, false), new Trigger(3304, 2077, 552, 181, 19, false), new Trigger(1775, 672, 476, 124, 20, false)};
    
    private int guideStep;
	private int[] guideTriggerIndexes;
	private String[] guideMessages;
    
    private ErrorCodeHolder panels;
	private CardLayout cards;
	private Accounts account;
    
    private String cheatBuffer = "";
    
    private ImageIcon upArrow;
    private ImageIcon downArrow;
    private ImageIcon rightArrow;
    private ImageIcon leftArrow;
    private ImageIcon locationReached;
    
    public OverworldPanel(ErrorCodeHolder ech, CardLayout card, Accounts accountIn)
    {
		panels = ech;
		cards = card;
		account = accountIn;
		
        setBackground(Color.BLACK);
        setFocusable(true);
        
        loadImages();
        setupMapGuide();
        
        Mover mover = new Mover();
        
        addKeyListener(mover);
        
        timer = new Timer(20, mover);
        timer.start();
    }
    
    private Rectangle getPlayerBounds(int nextX, int nextY)
	{
		return new Rectangle(nextX + 20, nextY + 50, 50, 35);
	}
	private boolean isColliding(int nextX, int nextY)
	{
		Rectangle player = getPlayerBounds(nextX, nextY);
		
		for (int i = 0; i < walls.length; i++)
		{
			Rectangle wall = walls[i];
			
			if (player.intersects(wall))
			{
				return true;
			}
		}
		
		return false;
	}
    private void loadImages()
    {
        // LOAD BACKGROUND
        background = new ImageIcon("background.png");

        // USE REAL IMAGE SIZE
        MAP_W = background.getIconWidth();
        MAP_H = background.getIconHeight();

        // WALK IMAGES
        downImg[0] = new ImageIcon("down_idle.png");
        downImg[1] = new ImageIcon("down_walk1.png");
        downImg[2] = new ImageIcon("down_walk2.png");

        upImg[0] = new ImageIcon("up_idle.png");
        upImg[1] = new ImageIcon("up_walk1.png");
        upImg[2] = new ImageIcon("up_walk2.png");

        leftImg[0] = new ImageIcon("left_idle.png");
        leftImg[1] = new ImageIcon("left_walk1.png");
        leftImg[2] = new ImageIcon("left_walk2.png");

        rightImg[0] = new ImageIcon("right_idle.png");
        rightImg[1] = new ImageIcon("right_walk1.png");
        rightImg[2] = new ImageIcon("right_walk2.png");

        // ATTACK IMAGES
        downAtk[0] = new ImageIcon("down_attack1.png");
        downAtk[1] = new ImageIcon("down_attack2.png");
        downAtk[2] = new ImageIcon("down_attack3.png");
        downAtk[3] = new ImageIcon("down_attack4.png");

        upAtk[0] = new ImageIcon("up_attack1.png");
        upAtk[1] = new ImageIcon("up_attack2.png");
        upAtk[2] = new ImageIcon("up_attack3.png");
        upAtk[3] = new ImageIcon("up_attack4.png");

        leftAtk[0] = new ImageIcon("left_attack1.png");
        leftAtk[1] = new ImageIcon("left_attack2.png");
        leftAtk[2] = new ImageIcon("left_attack3.png");
        leftAtk[3] = new ImageIcon("left_attack4.png");

        rightAtk[0] = new ImageIcon("right_attack1.png");
        rightAtk[1] = new ImageIcon("right_attack2.png");
        rightAtk[2] = new ImageIcon("right_attack3.png");
        rightAtk[3] = new ImageIcon("right_attack4.png");
        
        //Guide images
        upArrow = new ImageIcon("Up_Arrow.png");
        downArrow = new ImageIcon("Down_Arrow.png");
        rightArrow = new ImageIcon("Right_Arrow.png");
        leftArrow = new ImageIcon("Left_Arrow.png");
        locationReached = new ImageIcon("You_Reached.png");
    }
    
    public class Trigger
	{
		Rectangle box;
		
		int id;
		boolean oneTime;
		boolean activated;

		public Trigger(int x, int y, int w, int h, int id, boolean oneTime)
		{
			box = new Rectangle(x, y, w, h);
			this.id = id;
			this.oneTime = oneTime;
		}
	}
	
	private void setupMapGuide()
	{
		guideTriggerIndexes = new int[20];
		guideMessages = new String[20];
        
        guideStep = account.getLevelsFinished();
        
       
		for(int i = 0; i < guideTriggerIndexes.length; i++)
		{
			guideTriggerIndexes[i] = i;
			guideMessages[i] = "Go to firewall module " + (i + 1) + "."; // repetetive and tells user to go to # module
		}

        //unique messages, updates some after full array is set by for loop above
		guideMessages[0] = "Follow the guide to the first firewall module."; 
		guideMessages[3] = "Get ready to face your first challenge.";
		guideMessages[6] = "Your second challenge awaits.";
		guideMessages[9] = "The challenges are geting harder!";
		guideMessages[11] = "Will you reclaim your device?";
		guideMessages[12] = "Ready for the fourth challenge?.";
		guideMessages[15] = "You know what time it is.";
		guideMessages[19] = "This is the moment to face the hacker";
	}
	
	public boolean unlockedLevel(int level)
	{
		return account.getLevelsFinished() >= level - 1; // checking if the level is unlocked, in comparision to previous
		//as the last level has to be completed for the next to be unlocked, So if user goes to any other trigger this method
		// will check and lock it of the requirement is not met
		
		//purpose is to tell user "Not unlocked yet" if approached a random level without requirement
	}
	
	public boolean levelFinished(int level)
	{
		return account.getLevelsFinished() >= level; // Checks if player beat the current level
		
		//purpose is to say "Level Already Completed" In case user attempts to replay (Only if score is min 2/3)
	}
	
	
	private Trigger getGuideTrigger()
	{
		int nextModule = account.getLevelsFinished();
		
		if(nextModule >= guideTriggerIndexes.length) // if its greater than array
	    {
		  nextModule = guideTriggerIndexes.length - 1; // reduce it to prevent IndexOutOfBoundsException
	    }

	   return triggers[guideTriggerIndexes[nextModule]]; // Returns trigger object/coordinates for next module
	}
	
	private void updateMapGuide()
	{
		
		Trigger guide = getGuideTrigger();

	}
	
	
	private int getDistanceToGuide()
    {
		Trigger guide = getGuideTrigger();

		int xDistance = guide.box.x - x;

		if(xDistance < 0)
		{
			xDistance = xDistance * -1;
		}

		int yDistance = guide.box.y - y;

		if(yDistance < 0)
		{
			yDistance = yDistance * -1;
		}

		return xDistance + yDistance;
   } 
	
	
	private void drawMapGuide(Graphics g)
	{
		Trigger guide = getGuideTrigger();

		if(guide == null)
		{
			return;
		}

		g.setColor(new Color(0, 0, 0, 215));
		g.fillRect(20, 60, 430, 105);

		g.setColor(Color.RED);
		g.drawRect(20, 60, 430, 105);

		g.setColor(Color.CYAN);
		g.drawRect(25, 65, 420, 95);

		g.setFont(new Font("Sherif", Font.BOLD, 18));
		g.setColor(Color.RED);
		g.drawString("MAP GUIDE", 40, 90);

		guideStep = account.getLevelsFinished();

		if(guideStep >= guideMessages.length)
		{
			guideStep = guideMessages.length - 1;
		}

		g.setColor(Color.WHITE);
		g.drawString(guideMessages[guideStep], 40, 115);
    
		g.setColor(Color.GREEN);
		g.drawString("Distance: " + getDistanceToGuide(), 40, 140);
	}
	
	public void checkTriggers()
	{
		Rectangle player = getPlayerBounds(x, y);
		for (int i = 0; i < triggers.length; i++)
		{
			Trigger t = triggers[i];
			
			if (player.intersects(t.box) && attacking == true)
			{
				if (!t.oneTime || !t.activated)
				{
					activateTrigger(t.id);
					t.activated = true;
					attacking = false;
				}
			}
		}
	}
	
	public int currentLives()
	{
		return lives;
	}
	public int getLevel()
	{
		return account.getLevelsFinished();
	}
	public int getScore()
	{
		return score;
	}
	public void scoreReturn(int sc, int lv)
	{
		score += sc;
		lives += lv;
		repaint();
		
		if (lives > 5)
		{
			lives = 5;
		}
		if (lives == 0)
		{
			cards.show(panels, "Game Over");
			panels.gameOverData();
			
		}
	}

	public void activateTrigger(int id)
	{
		if(unlockedLevel(id) == false)
		{
			JOptionPane.showMessageDialog(null, "Firewall is too advanced");
			return;
		}
		
		if (id == 1)
		{
			
		   panels.startTrial(1,9); 
		   cards.show(panels, "Question");
		   attacking = false;
		}
		
		else if (id == 2)
		{
			
		  panels.startTrial(10,18); 
		  cards.show(panels, "Question");
		  attacking = false;
			
		}
		
		else if (id == 3)
		{
			
		  panels.startTrial(19,27);
		  cards.show(panels, "Question");
		  attacking = false;
			
		}
		
		else if (id == 4)
		{
			
		  panels.startBombGame(1,27);
		  cards.show(panels, "Bomb");
		  attacking = false;
			
		}
		
		else if (id == 5)
		{
			
		  panels.startTrial(28,36);
		  cards.show(panels, "Question");
		  attacking = false;
			
		}
		
		else if (id == 6)
		{
			
		  panels.startTrial(37,45);
		  cards.show(panels, "Question");
		  attacking = false;
			
		}
		
		else if (id == 7)
		{
			
		  panels.startTrial(46,54);
		  cards.show(panels, "Question");
		  attacking = false;
			
		}
		
		else if (id == 8)
		{
			
		  panels.startMatch(28,54);
		  cards.show(panels, "Match");
		  attacking = false;
			
		}
		
		else if (id == 9)
		{
			
		  panels.startTrial(55,63);
		  cards.show(panels, "Question");
		  attacking = false;
			
		}
		
		else if (id == 10)
		{
			
		  panels.startTrial(64,72);
		  cards.show(panels, "Question");
		  attacking = false;
			
		}
		
		else if (id == 11)
		{
			
		  panels.startTrial(73,81);
		  cards.show(panels, "Question");
		  attacking = false;
			
		}
		
		else if (id == 12)
		{
			
		  panels.startBullet(55,81,lives);
		  cards.show(panels, "Bullet");
		  attacking = false;
			
		}
		
		else if (id == 13)
		{
			
		  panels.startTrial(82,90); 
		  cards.show(panels, "Question");
		  attacking = false;
			
		}
		
		else if (id == 14)
		{
			
		  panels.startTrial(91,99); 
		  cards.show(panels, "Question");
		  attacking = false;
			
		}
		
		else if (id == 15)
		{
			
		  panels.startTrial(100,108); 
		  cards.show(panels, "Question");
		  attacking = false;
			
		}
		
		else if (id == 16)
		{
			
		 panels.startWhackBoss(82,108,lives);
		 cards.show(panels, "Whack");
		 attacking = false;
			
		}
		
		else if (id == 17)
		{
			
		  panels.startTrial(109,117); 
		  cards.show(panels, "Question");
		  attacking = false;
			
		}
		
		else if (id == 18)
		{
			
		  panels.startTrial(118,126); 
		  cards.show(panels, "Question");
		  attacking = false;
			
		}
		
		else if (id == 19)
		{
			
		  panels.startTrial(127,135); 
		  cards.show(panels, "Question");
		  attacking = false;
			
		}
		
		else if (id == 20)
		{
			
		  panels.startFinalBoss(1,135);
		  cards.show(panels, "Final Boss");
		  attacking = false;
		}
	}
	
    private class Mover implements ActionListener, KeyListener
    {
        public void actionPerformed(ActionEvent evt)
        {
			int speed;
			if (sprinting)
			{
				speed = SPRINT_SPEED;
			}
			else
			{
				speed = WALK_SPEED;
			}
            // MOVEMENT
            if (!attacking)
            {
                if (up)
                {
                    direction = 1;
                    
					if (!isColliding(x, y - speed))
					{
						y -= speed;
					}
                }
                
                if (down)
				{
					direction = 0;
					
					if (!isColliding(x, y + speed))
					{
						y += speed;
					}
				}
				
				if (left)
				{
					direction = 2;
					
					if (!isColliding(x - speed, y))
					{
						x -= speed;
					}
				}
				
				if (right)
				{
					direction = 3;
					
					if (!isColliding(x + speed, y))
					{
						x += speed;
					}
				}
            }

            // KEEP PLAYER INSIDE MAP
            x = Math.max(0, Math.min(x, MAP_W - DRAW_SIZE));
            y = Math.max(0, Math.min(y, MAP_H - DRAW_SIZE));

            // CAMERA FOLLOW PLAYER
            cameraX = x - SCREEN_W / 2;
            cameraY = y - SCREEN_H / 2;

            // STOP CAMERA AT MAP EDGES
            cameraX = Math.max(0, Math.min(cameraX, MAP_W - SCREEN_W));
            cameraY = Math.max(0, Math.min(cameraY, MAP_H - SCREEN_H));
			int animSpeed;
			if (sprinting)
			{
				animSpeed = 5;
			}
			else
			{
				animSpeed = 10;
			}
			
            // WALK ANIMATION
            if ((up || down || left || right) && !attacking)
            {
                walkCounter++;

                if (walkCounter > animSpeed)
                {
                    walkFrame++;

                    if (walkFrame > 2)
                    {
                        walkFrame = 1;
                    }

                    walkCounter = 0;
                }
            }
            else
            {
                walkFrame = 0;
            }

            // ATTACK ANIMATION
            if (attacking)
            {
                attackCounter++;

                if (attackCounter > 6)
                {
                    attackFrame++;
                    attackCounter = 0;

                    if (attackFrame >= 4)
                    {
                        attackFrame = 0;
                        attacking = false;
                    }
                }
            }
            
            checkTriggers();
            updateMapGuide();
            
            repaint();
        }

        public void keyPressed(KeyEvent evt)
        {
			requestFocusInWindow();
			char c = evt.getKeyChar();
			checkCheatCode(c);
            int k = evt.getKeyCode();
            if (k == KeyEvent.VK_SHIFT)
			{
				sprinting = true;
			}
            if (k == KeyEvent.VK_W || k == KeyEvent.VK_UP)
            {
                up = true;
			}
            if (k == KeyEvent.VK_S || k == KeyEvent.VK_DOWN)
            {
                down = true;
			}
            if (k == KeyEvent.VK_A || k == KeyEvent.VK_LEFT)
            {
                left = true;
			}
            if (k == KeyEvent.VK_D || k == KeyEvent.VK_RIGHT)
            {
                right = true;
			}
            if (k == KeyEvent.VK_SPACE && !attacking)
            {
                attacking = true;
                attackFrame = 0;
            }
        }

        public void keyReleased(KeyEvent evt)
        {
            int k = evt.getKeyCode();
            if (k == KeyEvent.VK_SHIFT)
			{
				sprinting = false;
			}
            if (k == KeyEvent.VK_W || k == KeyEvent.VK_UP)
            {
                up = false;
			}
            if (k == KeyEvent.VK_S || k == KeyEvent.VK_DOWN)
            {
                down = false;
			}
            if (k == KeyEvent.VK_A || k == KeyEvent.VK_LEFT)
            {
                left = false;
			}
            if (k == KeyEvent.VK_D || k == KeyEvent.VK_RIGHT)
            {
                right = false;
			}
        }
        
        public void keyTyped(KeyEvent evt) {}
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        requestFocusInWindow();
        // DRAW BACKGROUND WITH CAMERA OFFSET
        g.drawImage(background.getImage(), -cameraX, -cameraY, this);

		g.setColor(Color.BLACK); // This will have arrows and tell user if they reachedm a module
        g.fillRect(15, 380, 170, 100);
        g.setColor(Color.GREEN);
        g.drawRect(15, 380, 170, 100);
        
        Trigger location = getGuideTrigger();
        
        
        Rectangle playerLocation = getPlayerBounds(x,y);
      
        int locationX = location.box.x + 30;
        int locationY = location.box.y + 30;
        int playerCenterX = x + DRAW_SIZE / 2;
        int playerCenterY = y + DRAW_SIZE / 2;
        
        int xDistance = locationX - playerCenterX;
        int yDistance = locationY - playerCenterY;
        
        
        if(playerLocation.intersects(location.box)) // if the player is touching the trigger draw Imahe for you reached
        {
               g.drawImage(locationReached.getImage(),20,390,160,80,this);
        }
                
        else // if player is still looking foor the image
        {
                if(xDistance > yDistance) // when horizontal distance is greater
                {
                           // If else to decide if right or left arrow is drawn
                     if(location.box.x > playerLocation.x)
                     {
                     g.drawImage(rightArrow.getImage(), 60, 390, 80, 80, this);
                     }
                          
                     else
                     {
                           g.drawImage(leftArrow.getImage(), 60, 390, 80, 80, this);
                     }
                }
                    
                else if(yDistance > xDistance) // vertical distance is greater
                {
                        // If else to decide if up or down is drawn
                        if(location.box.y > playerLocation.y)
                        {
                                g.drawImage(downArrow.getImage(), 60, 390, 80, 80, this);
                        }
                                
                        else
						{
                                 g.drawImage(upArrow.getImage(), 60, 390, 80, 80, this);
                        }
                }
        }
        ImageIcon img = null;

        if (attacking)
        {
            if (direction == 0)
                img = downAtk[attackFrame];

            if (direction == 1)
                img = upAtk[attackFrame];

            if (direction == 2)
                img = leftAtk[attackFrame];

            if (direction == 3)
                img = rightAtk[attackFrame];
        }
        else
        {
            if (direction == 0)
                img = downImg[walkFrame];

            if (direction == 1)
                img = upImg[walkFrame];

            if (direction == 2)
                img = leftImg[walkFrame];

            if (direction == 3)
                img = rightImg[walkFrame];
        }

        if (img != null)
        {
            Image image = img.getImage();

            int w = image.getWidth(this);
            int h = image.getHeight(this);

            double scale = Math.min((double)DRAW_SIZE / w,(double)DRAW_SIZE / h);

            int newW = (int)(w * scale);
            int newH = (int)(h * scale);

            // PLAYER POSITION ON SCREEN
            int screenX = x - cameraX;
            int screenY = y - cameraY;

            // DRAW PLAYER
            g.drawImage(image, screenX, screenY, newW, newH, this);
            
        }
		
		Rectangle p = getPlayerBounds(x, y);
        // DEBUG TEXT
        
        g.setColor(Color.RED);
        g.drawString("Lives: " + lives, 20, 200);
        g.setColor(Color.YELLOW);
        g.drawString("Score: " + score, 20, 220);
        g.setColor(Color.CYAN);
		g.drawString("Powers:", 20, 240);
		g.drawString("Stop: " + panels.getStopPowers(), 20, 260);
		g.drawString("Skip: " + panels.getSkipPowers(), 20, 280);
		g.drawString("Reveal: " + panels.getRevealPowers(), 20, 300);
        drawMapGuide(g);
    }
    
    private void checkCheatCode(char keyChar)
	{
		cheatBuffer += Character.toUpperCase(keyChar);
		
		if(cheatBuffer.length() > 20)
		{
			cheatBuffer = cheatBuffer.substring(cheatBuffer.length() - 20);
		}

		// CHEAT CODE
		if(cheatBuffer.contains("UNLOCKALL"))
		{
			account.levelsFinishedIn(19);
			account.saveData();
			
			JOptionPane.showMessageDialog(null, "CHEAT ACTIVATED!\nAll firewall modules unlocked.");
			cheatBuffer = "";
		}
	}
}

class BombDefusalPanel extends JPanel
{
    private ErrorCodeHolder panels;
    private CardLayout cards;
    private Accounts account;

    private JTextArea questionArea;

    private JLabel timerLabel;
    private JLabel strikeLabel;

    private Timer bombTimer;

    private int timeLeft;
    private int strikes;
    private int solvedQuestions;

    private String questionRNG;

    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;

    private String correct;

    private String correctWire;

    private String wire1;
    private String wire2;
    private String wire3;
    private String wire4;

    private int num1;
    private int num2;
    private int num3;
    private int num4;

    private int correctNumber;

    private String word1;
    private String word2;
    private String word3;
    private String word4;

    private String correctWord;

    private int currentActionType;

    private JTextField wordField;

    private int minQuestionRNG;
    private int maxQuestionRNG;
    private Clip music;
    private Clip beep;

    public BombDefusalPanel(ErrorCodeHolder ech,CardLayout card, Accounts accountIn)
    {
        panels = ech;
        cards = card;
        account = accountIn;
        
        setLayout(new GridLayout(1,2,10,10));
        
        // LEFT SIDE
        JPanel left = new JPanel();
        left.setLayout(new BorderLayout());
        left.setBackground(Color.BLACK);
        
        questionArea = new JTextArea();
        questionArea.setEditable(false);
        questionArea.setBackground(Color.BLACK);
        questionArea.setForeground(Color.GREEN);
        
        Font qFont = new Font("Monospaced", Font.BOLD, 20);
        
        questionArea.setFont(qFont);
        
        JScrollPane scroll =
        new JScrollPane(questionArea);
        
        left.add(scroll, BorderLayout.CENTER);
        
        JPanel infoPanel = new JPanel(new GridLayout(2,1));
        infoPanel.setBackground(Color.BLACK);
        
        timerLabel = new JLabel("TIME: 90");
        timerLabel.setOpaque(true);
		timerLabel.setBackground(Color.BLACK);
		
        timerLabel.setForeground(Color.RED);
        
        strikeLabel = new JLabel("STRIKES: O O O");
        strikeLabel.setOpaque(true);
		strikeLabel.setBackground(Color.BLACK);
        strikeLabel.setForeground(Color.YELLOW);
        
        infoPanel.add(timerLabel);
        infoPanel.add(strikeLabel);
        left.add(infoPanel, BorderLayout.SOUTH);
        add(left);
        
        // RIGHT SIDE
        JPanel right = new JPanel();
        right.setLayout(null);
        right.setBackground(Color.DARK_GRAY);
        ButtonHandler bh = new ButtonHandler();
        
        JButton cutRed = new JButton("CUT RED");
        cutRed.setBounds(40,40,200,40);
        cutRed.setActionCommand("red");
        cutRed.addActionListener(bh);
        cutRed.setBackground(Color.RED);
		cutRed.setForeground(Color.WHITE);
        right.add(cutRed);
        JButton cutBlue = new JButton("CUT BLUE");
        cutBlue.setBounds(40,100,200,40);
        cutBlue.setActionCommand("blue");
        cutBlue.addActionListener(bh);
        cutBlue.setBackground(Color.BLUE);
		cutBlue.setForeground(Color.WHITE);
        right.add(cutBlue);
        JButton cutGreen = new JButton("CUT GREEN");
        cutGreen.setBounds(40,160,200,40);
        cutGreen.setActionCommand("green");
        cutGreen.addActionListener(bh);
        cutGreen.setBackground(Color.GREEN);
		cutGreen.setForeground(Color.BLACK);
        right.add(cutGreen);
        JButton cutYellow = new JButton("CUT YELLOW");
        cutYellow.setBounds(40,220,200,40);
        cutYellow.setActionCommand("yellow");
        cutYellow.addActionListener(bh);
        cutYellow.setBackground(Color.YELLOW);
		cutYellow.setForeground(Color.BLACK);
        right.add(cutYellow);

        // NUMBER BUTTONS
        JPanel numPad = new JPanel();
		numPad.setLayout(new GridLayout(3, 3, 5, 5));
		numPad.setBounds(260, 40, 180, 180);
		
		for(int i = 1; i <= 9; i++)
		{
			JButton b = new JButton("" + i);
			b.setActionCommand("" + i);
			b.addActionListener(bh);
			numPad.add(b);
		}
		right.add(numPad);
		
        // WORD INPUT
        wordField = new JTextField();
        wordField.setBounds(40,420,200,40);
        right.add(wordField);
        JButton enterWord = new JButton("ENTER");
        
        enterWord.setBounds(260,420,120,40);
        enterWord.setActionCommand("ENTER_WORD");
        enterWord.addActionListener(bh);
        right.add(enterWord);
        add(right);
        
        // TIMER
        bombTimer = new Timer(1000, new TimerHandler());
        
        try
        {
            // Load sound file
            URL url = getClass().getResource("/Bomb Defusing.wav");
            // Check if file exists
            if (url == null)
            {
                System.out.println("Could not find Bomb Defusing.wav");
                return;
            }
            // Open audio stream
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
            // Create clip
            music = AudioSystem.getClip();
            // Load audio into clip
            music.open(audioIn);
            // Play sound
        }
        catch (UnsupportedAudioFileException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (LineUnavailableException e)
        {
            e.printStackTrace();
        }
        
        try
        {
            // Load sound file
            URL url = getClass().getResource("/beep.wav");
            // Check if file exists
            if (url == null)
            {
                System.out.println("Could not find beep.wav");
                return;
            }
            // Open audio stream
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
            // Create clip
            beep = AudioSystem.getClip();
            // Load audio into clip
            beep.open(audioIn);
            // Play sound
        }
        catch (UnsupportedAudioFileException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (LineUnavailableException e)
        {
            e.printStackTrace();
        }
    }

    public void startBombTrial(int minRange,int maxRange)
    {
        minQuestionRNG = minRange;
        maxQuestionRNG = maxRange;
        music.start();
        strikes = 0;
        solvedQuestions = 0;
        timeLeft = 90;
        updateStrikeLabel();
        timerLabel.setText("TIME: " + timeLeft);
        buildNextQuestion();
        bombTimer.start();
    }

    public void buildNextQuestion()
    {
        questionGetter();
        buildQuestionText();
    }

    public void buildQuestionText()
    {
        currentActionType = (int)(Math.random() * 3);
        String output = "";
        output += questionRNG + "\n\n";
        if(currentActionType == 0)
        {
            output += answer1 + " (Cut the " + wire1 + " wire)\n";
            output += answer2 + " (Cut the " + wire2 + " wire)\n";
            output += answer3 + " (Cut the " + wire3 + " wire)\n";
            output += answer4 + " (Cut the " +  wire4 + " wire)\n";
        }
        else if(currentActionType == 1)
        {
            output += answer1 + " (Press " + num1 + ")\n";
            output += answer2 + " (Press " + num2 + ")\n";
            output += answer3 + " (Press " + num3 + ")\n";
            output += answer4 + " (Press " + num4 + ")\n";
        }
        else
        {
            output += answer1 + " (Type '" + word1 + "')\n";
            output += answer2 + " (Type '" + word2 + "')\n";
            output += answer3 + " (Type '" + word3 + "')\n";
            output += answer4 + " (Type '" + word4 + "')\n";
        }
        output += "\nDo the action corresponding with \nthe correct answer to defuse the bomb\n";
        questionArea.setText(output);
    }
    public String randomWire()
    {
        String[] wires = {"red","blue","green","yellow"};
        int index = (int)(Math.random() * wires.length);
        return wires[index];
    }
    public String randomWord()
    {
        String[] words = {"alpha", "omega", "virus","java","cipher","debug","binary","matrix"};
        int index = (int)(Math.random() * words.length);
        return words[index];
    }

    public void updateStrikeLabel()
    {
        String text = "STRIKES: ";
        for(int i = 0; i < 3; i++)
        {
            if(i < strikes)
            {
                text += "X ";
            }
            else
            {
                text += "O ";
            }
        }
        strikeLabel.setText(text);
    }

    public void questionGetter()
    {
        String inFileName = "Java_Questions.txt";
        File inFile = new File(inFileName);
        Scanner keyboard = null;
        try
        {
            keyboard =
            new Scanner(inFile);
        }
        catch(FileNotFoundException e)
        {
            System.exit(1);
        }
        boolean found = false;
        int questionNum = (int)(Math.random() * (maxQuestionRNG - minQuestionRNG + 1)) + minQuestionRNG;
        String questionNumStr = questionNum + " - ";
        while(keyboard.hasNextLine() && found == false)
        {
            String gottext = keyboard.nextLine();
            if(gottext.startsWith(questionNumStr))
            {
                questionRNG = gottext;
                answer1 = keyboard.nextLine();
                answer2 = keyboard.nextLine();
                answer3 = keyboard.nextLine();
                answer4 = keyboard.nextLine();
                correct = "";
                if(answer1.charAt(0) == '>')
                {
                    correct = answer1.substring(2);
                    answer1 = answer1.substring(2);
                }
                if(answer2.charAt(0)  == '>')
                {
                    correct = answer2.substring(2);
                    answer2 = answer2.substring(2);
                }
                if(answer3.charAt(0) == '>')
                {
                    correct = answer3.substring(2);
                    answer3 = answer3.substring(2);
                }
                if(answer4.charAt(0) == '>')
                {
                    correct = answer4.substring(2);
                    answer4 = answer4.substring(2);
                }
                wire1 = randomWire();
                wire2 = randomWire();
                wire3 = randomWire();
                wire4 = randomWire();
                
                num1 = 1 + (int)(Math.random()*9);
                num2 = 1 + (int)(Math.random()*9);
                num3 = 1 + (int)(Math.random()*9);
                num4 = 1 + (int)(Math.random()*9);
                word1 = randomWord();
                word2 = randomWord();
                word3 = randomWord();
                word4 = randomWord();
                if(correct.equals(answer1))
                {
                    correctWire = wire1;
                    correctNumber = num1;
                    correctWord = word1;
                }
                if(correct.equals(answer2))
                {
                    correctWire = wire2;
                    correctNumber = num2;
                    correctWord = word2;
                }
                if(correct.equals(answer3))
                {
                    correctWire = wire3;
                    correctNumber = num3;
                    correctWord = word3;
                }
                if(correct.equals(answer4))
                {
                    correctWire = wire4;
                    correctNumber = num4;
                    correctWord = word4;
                }
                found = true;
            }
        }
        keyboard.close();
    }
    class TimerHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent evt)
        {
            beep.stop();
            timeLeft--;
            timerLabel.setText("TIME: " + timeLeft);
            
            beep.setFramePosition(0); 
            beep.start();
            if(timeLeft <= 0)
            {
                bombTimer.stop();
                music.stop();
                cards.show(panels,"Game Over");
            }
        }
    }

    class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent evt)
        {
            String action = evt.getActionCommand();
            boolean success = false;
            if(currentActionType == 0)
            {
                if(action.equals(correctWire))
                {
                    success = true;
                }
            }
            
            else if (currentActionType == 1)
            {
                try
                {
                    int chosen = Integer.parseInt(action);

                    if(chosen == correctNumber)
                    {
                        success = true;
                    }
                }
                catch(Exception e)
                {
                }
            }
            else if
            (currentActionType == 2)
            {
                if(action.equals("ENTER_WORD"))
                {
                    String typed =
                    wordField.getText();
                    if(typed.equalsIgnoreCase(correctWord))
                    {
                        success = true;
                    }
                }
            }
            if(success)
            {
				solvedQuestions++;
				
				if(solvedQuestions >= 7)
				{
					bombTimer.stop();
					JOptionPane.showMessageDialog(null,"BOMB DEFUSED!");
					account.levelsFinishedIn(account.getLevelsFinished() + 1);
					account.saveData();
					music.stop();
					cards.show(panels,"Overworld");
				}
				else
				{
					buildNextQuestion();
				}
            }
            else
            {
                strikes++;
                updateStrikeLabel();
                if(strikes >= 3)
                {
                    bombTimer.stop();
                    music.stop();
                    cards.show(panels, "Game Over");
                }
            }
        }
    }
}

class MatchPanel extends JPanel
{
	private ErrorCodeHolder panels;
	private CardLayout cards;
	private Accounts account;
	private JLabel title;
	private JLabel progressLabel;
	private JLabel livesLabel;
	private JPanel questionPanel;
	private JPanel answerPanel;
	
	private QuestionBox[] questions;
	private AnswerCard[] answers;
	private int correctTotal;
	private int visualLives;
	private int minQuestionRNG;
	private int maxQuestionRNG;
	private int[] usedQuestionNumbers;
	private JButton draggedButton;
	private int offsetX;
	private int offsetY;
	private Clip music;
	private Clip rightBeep;
	private Clip wrongBeep;
	
	public MatchPanel(ErrorCodeHolder ech, CardLayout card,Accounts accountIn)
	{
		panels = ech;
		cards = card;
		account = accountIn;
		
		setLayout(null);
		setBackground(Color.BLACK);
		
		title = new JLabel("MATCH THE FIREWALL");
		title.setBounds(270,10,500,40);
		title.setForeground(Color.RED);
		title.setFont(new Font("Sherif",Font.BOLD,34));
		add(title);
		
		progressLabel = new JLabel("Correct: 0 / 5");
		progressLabel.setBounds(30,60,220,30);
		progressLabel.setForeground(Color.GREEN);
		progressLabel.setFont(new Font("Sherif",Font.BOLD,22));
		add(progressLabel);
		
		livesLabel = new JLabel("Lives: 5");
		livesLabel.setBounds(760,60,150,30);
		livesLabel.setForeground(Color.YELLOW);
		livesLabel.setFont(new Font("Sherif",Font.BOLD,22));
		add(livesLabel);
		
		questionPanel = new JPanel();
		questionPanel.setLayout(new GridLayout(5,2,10,10));
		questionPanel.setBounds(20,110,450,390);
		questionPanel.setBackground(Color.BLACK);
		add(questionPanel);
		
		answerPanel = new JPanel();
		answerPanel.setLayout(new GridLayout(10,2,10,10));
		answerPanel.setBounds(500,110,430,390);
		answerPanel.setBackground(Color.BLACK);
		add(answerPanel);
		
		try
        {
            // Load sound file
            URL url = getClass().getResource("/MatchMusic.wav");
            // Check if file exists
            if (url == null)
            {
                System.out.println("Could not find MatchMusic.wav");
                return;
            }
            // Open audio stream
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
            // Create clip
            music = AudioSystem.getClip();
            // Load audio into clip
            music.open(audioIn);
            // Play sound
        }
        catch (UnsupportedAudioFileException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (LineUnavailableException e)
        {
            e.printStackTrace();
        }
        try
        {
            // Load sound file
            URL url = getClass().getResource("/RightBeep.wav");
            // Check if file exists
            if (url == null)
            {
                System.out.println("Could not find RightBeep.wav");
                return;
            }
            // Open audio stream
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
            // Create clip
            rightBeep = AudioSystem.getClip();
            // Load audio into clip
            rightBeep.open(audioIn);
            // Play sound
        }
        catch (UnsupportedAudioFileException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (LineUnavailableException e)
        {
            e.printStackTrace();
        }
        try
        {
            // Load sound file
            URL url = getClass().getResource("/WrongBeep.wav");
            // Check if file exists
            if (url == null)
            {
                System.out.println("Could not find WrongBeep.wav");
                return;
            }
            // Open audio stream
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
            // Create clip
            wrongBeep = AudioSystem.getClip();
            // Load audio into clip
            wrongBeep.open(audioIn);
            // Play sound
        }
        catch (UnsupportedAudioFileException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (LineUnavailableException e)
        {
            e.printStackTrace();
        }
	}

	public void startBoss(int minRange, int maxRange)
	{
		music.loop(Clip.LOOP_CONTINUOUSLY);
		minQuestionRNG = minRange;
		maxQuestionRNG = maxRange;
		correctTotal = 0;
		visualLives = panels.getCurrentLives();
		progressLabel.setText("Correct: 0 / 5");
		livesLabel.setText("Lives: " + visualLives);
		buildBoard();
	}

	public void buildBoard()
	{
		questionPanel.removeAll();
		answerPanel.removeAll();
		usedQuestionNumbers = new int[10];
		questions = new QuestionBox[10];
		answers = new AnswerCard[20];
		String[] usedQuestions = new String[10];
		int answerIndex = 0;
		
		for(int i = 0; i < 10; i++)
		{
			QuestionData q = loadQuestion(i);
			questions[i] = new QuestionBox(q.question,q.correct);
			questionPanel.add(questions[i]);
			usedQuestions[i] = q.correct;
			answers[answerIndex] = new AnswerCard(q.correct);
			answerIndex++;
			answers[answerIndex] = new AnswerCard(q.fake);
			answerIndex++;
		}
		shuffleAnswers();
		for(int i = 0; i < answers.length; i++)
		{
			answerPanel.add(answers[i]);
		}
		repaint();
		revalidate();
	}

	public void shuffleAnswers()
	{
		for(int i = 0; i < answers.length; i++)
		{
			int rand = (int)(Math.random() * answers.length);
			AnswerCard temp = answers[i];
			answers[i] = answers[rand];
			answers[rand] = temp;
		}
	}

	public QuestionData loadQuestion(int index)
	{
		String questionRNG = "";
		String correctAnswer = "";
		String fakeAnswer = "";
		String inFileName = "Java_Questions.txt";
		File inFile = new File(inFileName);
		Scanner keyboard = null;
		try
		{
			keyboard = new Scanner(inFile);
		}
		catch(FileNotFoundException e)
		{
			System.exit(1);
		}
		int questionNum;
		boolean duplicate;
		do
		{
			duplicate = false;
			questionNum = (int)(Math.random() * (maxQuestionRNG - minQuestionRNG + 1)) + minQuestionRNG;
			for(int i = 0; i < index; i++)
			{
				if(usedQuestionNumbers[i] == questionNum)
				{
					duplicate = true;
				}
			}
		}
		while(duplicate);
		
		usedQuestionNumbers[index] =
		questionNum;
		String questionNumStr = questionNum + " - ";

		boolean found = false;
		while(keyboard.hasNextLine() && found == false)
		{
			String line = keyboard.nextLine();
			if(line.startsWith(questionNumStr))
			{
				questionRNG = line;
				String[] answers = new String[4];
				for(int i = 0; i < 4; i++)
				{
					answers[i] = keyboard.nextLine();
					if(answers[i].charAt(0) == '>')
					{
						correctAnswer = answers[i].substring(2);
						answers[i] = answers[i].substring(2);
					}
				}
				do
				{
					int fake = (int)(Math.random() * 4);
					fakeAnswer = answers[fake];
				}
				while(fakeAnswer.equals(correctAnswer));
				found = true;
			}
		}
		keyboard.close();
		return new QuestionData(questionRNG,correctAnswer,fakeAnswer);
	}

	class QuestionData
	{
		String question;
		String correct;
		String fake;
		public QuestionData
		(String q,String c,String f)
		{
			question = q;
			correct = c;
			fake = f;
		}
	}

	class QuestionBox extends JLabel
	{
		private String correctAnswer;
		private boolean solved;
		
		public QuestionBox
		(String question,String correct)
		{
			correctAnswer = correct;
			solved = false;
			setOpaque(true);
			setBackground(Color.DARK_GRAY);
			setForeground(Color.WHITE);
			setHorizontalAlignment(JLabel.CENTER);
			setVerticalAlignment(JLabel.CENTER);
			setFont(new Font("Sherif",Font.BOLD,14));
			setText("<html><center>" + question + "</center></html>");
		}
	}

	class AnswerCard extends JButton
	{
		private String answerText;
		
		public AnswerCard(String txt)
		{
			answerText = txt;
			setText("<html><center>" + txt + "</center></html>");
			setBackground(Color.RED);
			setForeground(Color.WHITE);
			setFocusPainted(false);
			DragHandler dh = new DragHandler();
			addMouseListener(dh);
			addMouseMotionListener(dh);
		}

		public String getAnswer()
		{
			return answerText;
		}
	}

	class DragHandler implements MouseListener,MouseMotionListener
	{
		public void mousePressed(MouseEvent evt)
		{
			draggedButton = (JButton)evt.getSource();
			offsetX = evt.getX();
			offsetY = evt.getY();
		}

		public void mouseDragged(MouseEvent evt)
		{
			if(draggedButton != null)
			{
				int x = draggedButton.getX() + evt.getX() - offsetX;
				int y = draggedButton.getY() + evt.getY() - offsetY;
				draggedButton.setLocation(x,y);
			}
		}
		public void mouseReleased(MouseEvent evt)
		{
			if(draggedButton == null)
			{
				return;
			}
			AnswerCard card = (AnswerCard)draggedButton;
			boolean matched = false;
			for(int i = 0; i < questions.length; i++)
			{
				QuestionBox q = questions[i];
				if(q.solved == false)
				{
					int buttonCenterX = draggedButton.getX() + draggedButton.getWidth()/2 + answerPanel.getX();
					int buttonCenterY = draggedButton.getY() + draggedButton.getHeight()/2 + answerPanel.getY();
					int qX = q.getX() + questionPanel.getX();
					int qY = q.getY() + questionPanel.getY();
					int qW = q.getWidth();
					int qH = q.getHeight();
					if(buttonCenterX >= qX && buttonCenterX <= qX + qW && buttonCenterY >= qY && buttonCenterY <= qY + qH)
					{
						matched = true;
						if(card.getAnswer().equals(q.correctAnswer))
						{
							q.setBackground(Color.GREEN);
							q.setText("<html><center>✔<br>" + card.getAnswer() + "</center></html>");
							q.solved = true;
							rightBeep.start();
							correctTotal++;
							progressLabel.setText("Correct: " + correctTotal + " / 5");
							draggedButton.setVisible(false);
							
							if(correctTotal >= 5)
							{
								JOptionPane.showMessageDialog(null,"BOSS DEFEATED");
								
								account.levelsFinishedIn(account.getLevelsFinished() + 1);
					            account.saveData();
								music.stop();
								cards.show(panels,"Overworld");
							}
						}
						else
						{
							wrongBeep.start();
							q.setBackground(Color.RED);
							q.setText("<html><center>X<br>" + q.getText() + "</center></html>");
							q.solved = true;
							
							visualLives--;
							panels.returnScore(0,-1);
							livesLabel.setText("Lives: " + visualLives);
							if(visualLives <= 0)
							{
								music.stop();
								cards.show(panels,"Game Over");
							}
						}
					}
				}
			}

			draggedButton = null;

			repaint();
		}

		public void mouseMoved(MouseEvent evt){}
		public void mouseClicked(MouseEvent evt){}
		public void mouseEntered(MouseEvent evt){}
		public void mouseExited(MouseEvent evt){}
	}
}

class BulletPanel extends JPanel
{
	private ErrorCodeHolder panels;
	private CardLayout cards;
    private Accounts account;
    
	private String question;
	private String correct;

	private String[] answers;

	private Rectangle[] zones;

	private int playerX;
	private int playerY;
	private int playerSize;

	private boolean up;
	private boolean down;
	private boolean left;
	private boolean right;

	private Timer gameTimer;
	private Timer countdownTimer;

	private int timeLeft;

	private int questionsDone;

	private int lives;

	private int minQuestionRNG;
	private int maxQuestionRNG;

	private int[] usedQuestions;
	private int usedCount;
	
	private final int PANEL_LINE_Y = 170;
	private final int ANSWER_BOX_W = 180;
	private final int ANSWER_BOX_H = 220;
	
	private JTextArea questionArea;
	private JTextArea[] answerAreas;
	private Clip music;

	public BulletPanel(ErrorCodeHolder ech, CardLayout card, Accounts accountIn)
	{
		panels = ech;
		cards = card;
		account = accountIn;
		
		setFocusable(true);
		setBackground(Color.BLACK);
		setLayout(null);
		
		playerSize = 40;
		playerX = 440;
		playerY = 400;
		
		questionArea = new JTextArea();
		questionArea.setEditable(false);
		questionArea.setLineWrap(true);
		questionArea.setWrapStyleWord(true);
		questionArea.setBackground(Color.BLACK);
		questionArea.setForeground(Color.WHITE);
		questionArea.setFont(new Font("Arial", Font.BOLD, 22));
		questionArea.setBounds(40,20,850,90);
		add(questionArea);
		
		answerAreas = new JTextArea[4];
		for(int i = 0; i < 4; i++)
		{
			answerAreas[i] = new JTextArea();
			answerAreas[i].setEditable(false);
			answerAreas[i].setLineWrap(true);
			answerAreas[i].setWrapStyleWord(true);
			answerAreas[i].setOpaque(false);
			answerAreas[i].setForeground(Color.WHITE);
			answerAreas[i].setFont(new Font("Arial", Font.PLAIN, 16));
			answerAreas[i].setBorder(null);
			add(answerAreas[i]);
		}
		answers = new String[4];
		zones = new Rectangle[4];
		
		zones[0] = new Rectangle(20,220,ANSWER_BOX_W,ANSWER_BOX_H);
		zones[1] = new Rectangle(250,220,ANSWER_BOX_W,ANSWER_BOX_H);
		zones[2] = new Rectangle(480,220,ANSWER_BOX_W,ANSWER_BOX_H);
		zones[3] = new Rectangle(710,220,ANSWER_BOX_W,ANSWER_BOX_H);
		
		for(int i = 0; i < 4; i++)
		{
			answerAreas[i].setBounds(zones[i].x + 5,zones[i].y + 5,zones[i].width - 10,zones[i].height - 10);
		}
		
		usedQuestions = new int[200];
		usedCount = 0;
		addKeyListener(new Mover());
		gameTimer = new Timer(20, new GameLoop());
		countdownTimer = new Timer(1000, new CountDown());
		
		try
        {
            // Load sound file
            URL url = getClass().getResource("/BulletMusic.wav");
            // Check if file exists
            if (url == null)
            {
                System.out.println("Could not find BulletMusic.wav");
                return;
            }
            // Open audio stream
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
            // Create clip
            music = AudioSystem.getClip();
            // Load audio into clip
            music.open(audioIn);
            // Play sound
        }
        catch (UnsupportedAudioFileException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (LineUnavailableException e)
        {
            e.printStackTrace();
        }
	}

	public void startBoss(int minRange, int maxRange, int currentLives)
	{
		minQuestionRNG = minRange;
		maxQuestionRNG = maxRange;

		lives = currentLives;
		music.loop(Clip.LOOP_CONTINUOUSLY);
		questionsDone = 0;

		usedCount = 0;

		loadQuestion();

		timeLeft = 15;

		gameTimer.start();

		countdownTimer.start();

		requestFocusInWindow();
	}

	public boolean alreadyUsed(int num)
	{
		for(int i = 0; i < usedCount; i++)
		{
			if(usedQuestions[i] == num)
			{
				return true;
			}
		}

		return false;
	}

	public void loadQuestion()
	{
		playerX = 450;
		playerY = 350;

		timeLeft = 15;

		String inFileName = "Java_Questions.txt";

		File inFile = new File(inFileName);

		Scanner keyboard = null;

		try
		{
			keyboard = new Scanner(inFile);
		}
		catch(FileNotFoundException e)
		{
			System.exit(1);
		}

		boolean found = false;

		int questionNum = 0;

		while(found == false)
		{
			questionNum = (int)(Math.random() * (maxQuestionRNG - minQuestionRNG + 1)) + minQuestionRNG;
			if(alreadyUsed(questionNum) == false)
			{
				usedQuestions[usedCount] = questionNum;

				usedCount++;

				found = true;
			}
		}

		found = false;

		String questionNumStr = questionNum + " - ";

		while(keyboard.hasNextLine() && found == false)
		{
			String line = keyboard.nextLine();

			if(line.startsWith(questionNumStr))
			{
				question = line;

				for(int i = 0; i < 4; i++)
				{
					String ans = keyboard.nextLine();

					if(ans.charAt(0) == '>')
					{
						correct = ans.substring(2);

						ans = ans.substring(2);
					}

					answers[i] = ans;
				}

				found = true;
			}
		}
		keyboard.close();
		
		questionArea.setText(question);
		for(int i = 0; i < 4; i++)
		{
			answerAreas[i].setText(answers[i]);
		}
	}

	public void nextQuestion()
	{
		questionsDone++;

		if(questionsDone >= 10)
		{
			gameTimer.stop();

			countdownTimer.stop();

			panels.returnScore(500, lives - 5);
			
            account.levelsFinishedIn(account.getLevelsFinished() + 1);
		    account.saveData();
		    music.stop();
			cards.show(panels, "Overworld");

			return;
		}

		loadQuestion();
	}

	public void checkAnswer()
	{
		Rectangle player =
		new Rectangle(playerX, playerY, playerSize, playerSize);

		boolean correctZone = false;

		for(int i = 0; i < 4; i++)
		{
			if(player.intersects(zones[i]))
			{
				if(answers[i].equals(correct))
				{
					correctZone = true;
				}
			}
		}

		if(correctZone == false)
		{
			lives--;

			if(lives <= 0)
			{
				gameTimer.stop();

				countdownTimer.stop();
				music.stop();
				cards.show(panels, "Game Over");

				return;
			}
		}

		nextQuestion();
	}

	class CountDown implements ActionListener
	{
		public void actionPerformed(ActionEvent evt)
		{
			timeLeft--;

			if(timeLeft <= 0)
			{
				checkAnswer();
			}

			repaint();
		}
	}

	class GameLoop implements ActionListener
	{
		public void actionPerformed(ActionEvent evt)
		{
			int speed = 6;
	
			if(up)
			{
				playerY -= speed;
			}

			if(down)
			{
				playerY += speed;
			}

			if(left)
			{
				playerX -= speed;
			}

			if(right)
			{
				playerX += speed;
			}

			// LEFT/RIGHT WALLS
			if(playerX < 0)
			{
				playerX = 0;
			}

			if(playerX > getWidth() - playerSize)
			{
				playerX = getWidth() - playerSize;
			}

			// TOP WALL
			if(playerY < PANEL_LINE_Y + 10)
			{
				playerY = PANEL_LINE_Y + 10;
			}

			// BOTTOM WALL
			if(playerY > getHeight() - playerSize)
			{
				playerY = getHeight() - playerSize;
			}

			repaint();
		}
	}

	class Mover implements KeyListener
	{
		public void keyPressed(KeyEvent evt)
		{
			int k = evt.getKeyCode();

			if(k == KeyEvent.VK_W || k == KeyEvent.VK_UP)
			{
				up = true;
			}

			if(k == KeyEvent.VK_S || k == KeyEvent.VK_DOWN)
			{
				down = true;
			}

			if(k == KeyEvent.VK_A || k == KeyEvent.VK_LEFT)
			{
				left = true;
			}

			if(k == KeyEvent.VK_D || k == KeyEvent.VK_RIGHT)
			{
				right = true;
			}
		}

		public void keyReleased(KeyEvent evt)
		{
			int k = evt.getKeyCode();

			if(k == KeyEvent.VK_W || k == KeyEvent.VK_UP)
			{
				up = false;
			}

			if(k == KeyEvent.VK_S || k == KeyEvent.VK_DOWN)
			{
				down = false;
			}

			if(k == KeyEvent.VK_A || k == KeyEvent.VK_LEFT)
			{
				left = false;
			}

			if(k == KeyEvent.VK_D || k == KeyEvent.VK_RIGHT)
			{
				right = false;
			}
		}

		public void keyTyped(KeyEvent evt)
		{
		}
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		requestFocusInWindow();
		
		g.setColor(Color.BLACK);
		g.fillRect(0,0,getWidth(),getHeight());
		g.setColor(Color.WHITE);
		g.drawLine(0, PANEL_LINE_Y, getWidth(), PANEL_LINE_Y);
		
		g.setColor(Color.RED);
		g.setFont(new Font("Arial", Font.BOLD, 22));
		g.drawString("Lives: " + lives, 30, 150);
		
		g.setColor(Color.WHITE);
		g.drawString("Question: " + (questionsDone + 1) + "/10", 720, 150);

		// TIMER BAR BACKGROUND
		g.setColor(Color.DARK_GRAY);
		g.fillRect(250, 115, 450, 30);

		// TIMER BAR
		int barWidth = (int)((timeLeft / 15.0) * 450.0);
		if(barWidth < 0)
		{
			barWidth = 0;
		}

		// COLOR CHANGES AS TIME GOES DOWN
		if(timeLeft > 10)
		{
			g.setColor(Color.GREEN);
		}
		else if(timeLeft > 5)
		{
			g.setColor(Color.YELLOW);
		}	
		else
		{
			g.setColor(Color.RED);
		}

		g.fillRect(250, 115, barWidth, 30);

		// TIMER OUTLINE
		g.setColor(Color.WHITE);
		g.drawRect(250, 115, 450, 30);

		// ANSWER ZONES
		for(int i = 0; i < 4; i++)
		{
			Rectangle r = zones[i];

			// BOX FILL
			g.setColor(new Color(40,40,40));
			g.fillRect(r.x, r.y, r.width, r.height);

			// BOX BORDER
			g.setColor(Color.WHITE);
			g.drawRect(r.x, r.y, r.width, r.height);
		}

		// EXTRA SEPARATORS BETWEEN ANSWERS
		g.setColor(Color.WHITE);

		g.drawLine(225, 170, 225, getHeight());
		g.drawLine(455, 170, 455, getHeight());
		g.drawLine(685, 170, 685, getHeight());

		// PLAYER
		g.setColor(Color.CYAN);
		g.fillRect(playerX, playerY, playerSize, playerSize);

		// PLAYER BORDER
		g.setColor(Color.WHITE);
		g.drawRect(playerX, playerY, playerSize, playerSize);
	}
}

class WhackAMolePanel extends JPanel
{
    private ErrorCodeHolder panels;
    private CardLayout cards;
    private Accounts account;
    private JLabel questionLabel;
    private JLabel livesLabel;
    private JLabel progressLabel;

    private JButton[] moleButtons;

    private Timer shuffleTimer;

    private int lives;
    private int solved;

    private int minQuestionRNG;
    private int maxQuestionRNG;

    private boolean[] usedQuestions;

    private String question;
    private String correctAnswer;
    private String[] wrongAnswers;

    public WhackAMolePanel(ErrorCodeHolder ech, CardLayout card, Accounts accountIn)
    {
        panels = ech;
        cards = card;
        account = accountIn;
        
        setLayout(new BorderLayout());
        setBackground(Color.BLACK);

        // TOP PANEL
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new GridLayout(3,1));
        topPanel.setBackground(Color.BLACK);

        questionLabel = new JLabel("", JLabel.CENTER);
        questionLabel.setForeground(Color.WHITE);
        questionLabel.setFont(new Font("Arial", Font.BOLD, 24));

        livesLabel = new JLabel("Lives: 5", JLabel.CENTER);
        livesLabel.setForeground(Color.RED);
        livesLabel.setFont(new Font("Arial", Font.BOLD, 20));

        progressLabel = new JLabel("Solved: 0 / 10", JLabel.CENTER);
        progressLabel.setForeground(Color.GREEN);
        progressLabel.setFont(new Font("Arial", Font.BOLD, 20));

        topPanel.add(questionLabel);
        topPanel.add(livesLabel);
        topPanel.add(progressLabel);

        add(topPanel, BorderLayout.NORTH);

        // GRID PANEL
        JPanel gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(3,4,10,10));
        gridPanel.setBackground(Color.BLACK);

        moleButtons = new JButton[12];

        for(int i = 0; i < 12; i++)
        {
            JButton btn = new JButton();
            btn.setFont(new Font("Arial", Font.BOLD, 14));
            btn.setBackground(new Color(120, 0, 0));
            btn.setForeground(Color.WHITE);
			btn.setOpaque(true);
			btn.setContentAreaFilled(true);
            btn.setForeground(Color.WHITE);
            btn.setFocusPainted(false);
            btn.setBorderPainted(false);

            int index = i;

            btn.addActionListener(e -> handleClick(btn));

            btn.setVisible(false);

            moleButtons[i] = btn;
            gridPanel.add(btn);
        }

        add(gridPanel, BorderLayout.CENTER);

        shuffleTimer = new Timer(1000, new ShuffleHandler());
    }

    public void startBoss(int minRange, int maxRange, int currentLives)
    {
        minQuestionRNG = minRange;
        maxQuestionRNG = maxRange;

        usedQuestions = new boolean[maxQuestionRNG + 1];

        lives = currentLives;
        solved = 0;

        updateLabels();

        loadQuestion();
        reshuffleAnswers();

        shuffleTimer.start();
    }

    public void updateLabels()
    {
        livesLabel.setText("Lives: " + lives);
        progressLabel.setText("Solved: " + solved + " / 10");
    }

    public void loadQuestion()
    {
        String inFileName = "Java_Questions.txt";
        File inFile = new File(inFileName);
        Scanner keyboard = null;

        try
        {
            keyboard = new Scanner(inFile);
        }
        catch(FileNotFoundException e)
        {
            System.exit(1);
        }

        int questionNum;
        do
        {
            questionNum = (int)(Math.random() * (maxQuestionRNG - minQuestionRNG + 1)) + minQuestionRNG;
        }
        while(usedQuestions[questionNum]);

        usedQuestions[questionNum] = true;

        String questionNumStr = questionNum + " - ";

        wrongAnswers = new String[3];
        correctAnswer = "";

        boolean found = false;

        while(keyboard.hasNextLine() && !found)
        {
            String line = keyboard.nextLine();

            if(line.startsWith(questionNumStr))
            {
                question = line.substring(questionNumStr.length());

                String a1 = keyboard.nextLine();
                String a2 = keyboard.nextLine();
                String a3 = keyboard.nextLine();
                String a4 = keyboard.nextLine();

                int w = 0;

                if(a1.charAt(0) == '>') correctAnswer = a1.substring(2);
                else wrongAnswers[w++] = a1;

                if(a2.charAt(0) == '>') correctAnswer = a2.substring(2);
                else wrongAnswers[w++] = a2;

                if(a3.charAt(0) == '>') correctAnswer = a3.substring(2);
                else wrongAnswers[w++] = a3;

                if(a4.charAt(0) == '>') correctAnswer = a4.substring(2);
                else wrongAnswers[w++] = a4;

                found = true;
            }
        }

        keyboard.close();

        questionLabel.setText(question);
    }
    
    private String wrap(String text)
    {
        return "<html><div style='text-align:center;'>" + text + "</div></html>";
    }

    public void reshuffleAnswers()
    {
        for(int i = 0; i < 12; i++)
        {
            moleButtons[i].setVisible(false);
            moleButtons[i].setText("");
        }

        int correctSpot = (int)(Math.random() * 12);

        moleButtons[correctSpot].setText(wrap(correctAnswer));
        moleButtons[correctSpot].setVisible(true);

        for(int i = 0; i < 3; i++)
        {
            int spot;
            do
            {
                spot = (int)(Math.random() * 12);
            }
            while(moleButtons[spot].isVisible());

            moleButtons[spot].setText(wrap(wrongAnswers[i]));
            moleButtons[spot].setVisible(true);
        }
    }

    private void handleClick(JButton clicked)
    {
        if(!clicked.isVisible()) return;

        // strip HTML before comparing
        String chosen = clicked.getText().replaceAll("<[^>]*>", "");

        if(chosen.equals(correctAnswer))
        {
            nextQuestion();
        }
        else
        {
            loseLife();

            if(lives > 0)
            {
                reshuffleAnswers();
            }
        }
    }

    public void nextQuestion()
    {
        solved++;

        if(solved >= 10)
        {
            victory();
            return;
        }

        loadQuestion();
        reshuffleAnswers();
        updateLabels();
    }

    public void loseLife()
    {
        lives--;
        updateLabels();

        if(lives <= 0)
        {
            gameOver();
        }
    }

    public void victory()
    {
        shuffleTimer.stop();

        JOptionPane.showMessageDialog(null, "BOSS DEFEATED!");

        panels.returnScore(1000, 0);
        cards.show(panels, "Overworld");
    }

    public void gameOver()
    {
        shuffleTimer.stop();
        cards.show(panels, "Game Over");
    }

    class ShuffleHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent evt)
        {
            reshuffleAnswers();
        }
    }
}

class FinalBossPanel extends JPanel
{
    private ErrorCodeHolder panels;
    private CardLayout cards;
    private Accounts account;

    // PLAYER
    private int playerHealth;
    private int maxHealth;

    // BOSS
    private int bossHealth;
    private int phase;

    // UI
    private JLabel titleLabel;
    private JLabel playerHealthLabel;
    private JLabel bossHealthLabel;
    private JLabel infoLabel;

    // BUTTONS
    private JButton fightButton;
    private JButton actButton;
    private JButton itemButton;

    // QUESTION SYSTEM
    private JTextArea questionArea;
    private JButton[] answerButtons;

    private String correctAnswer;

    private int questionsAnswered;
    private int correctAnswers;

    // 0 = none
    // 1 = fight
    // 2 = act
    private int currentMode;

    private int minQuestionRNG;
    private int maxQuestionRNG;

    // HACKER SPRITES
    private ImageIcon idleSprite;
    private ImageIcon attackSprite;

    private boolean attacking;

    // POWERUPS
    private int freezeTurns;
    private boolean easierQuestions;
    private boolean skipQuestions;
    
	private boolean usedFreeze;
	private boolean usedEasier;
	private boolean usedSkip;
	
	private int glitchTick = 0;
	private Clip music;

    public FinalBossPanel(ErrorCodeHolder ech, CardLayout card, Accounts accountIn)
    {
        panels = ech;
        cards = card;
        account = accountIn;
        
        setLayout(null);
        setBackground(Color.BLACK);
        
        idleSprite = new ImageIcon("hacker_idle.png");
        attackSprite = new ImageIcon("hacker_attack.png");
        
        titleLabel = new JLabel("THE HACKER", JLabel.CENTER);
        titleLabel.setBounds(250, 10, 400, 50);
        titleLabel.setForeground(Color.RED);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 38));
        add(titleLabel);
        
        playerHealthLabel = new JLabel("HP: 0");
        playerHealthLabel.setBounds(40, 70, 260, 40);
        playerHealthLabel.setForeground(Color.GREEN);
        playerHealthLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(playerHealthLabel);
        
        bossHealthLabel = new JLabel("Hacker HP: 100");
        bossHealthLabel.setBounds(620, 70, 260, 40);
        bossHealthLabel.setForeground(Color.RED);
        bossHealthLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(bossHealthLabel);
        
        infoLabel = new JLabel("The Hacker blocks your path.",JLabel.CENTER);
        
        infoLabel.setBounds(120, 300, 720, 40);
        infoLabel.setForeground(Color.WHITE);
        infoLabel.setFont(new Font("Arial", Font.BOLD, 22));
        add(infoLabel);
        
        questionArea = new JTextArea();
        
        questionArea.setBounds(140, 330, 680, 70);
        
        questionArea.setEditable(false);
        questionArea.setLineWrap(true);
        questionArea.setWrapStyleWord(true);
        
        questionArea.setBackground(Color.BLACK);
        questionArea.setForeground(Color.WHITE);
        
        questionArea.setFont(new Font("Arial", Font.BOLD, 18));
        
        questionArea.setVisible(false);
        
        add(questionArea);
        
		answerButtons = new JButton[4];
		
		answerButtons[0] = new JButton();
		answerButtons[1] = new JButton();
		answerButtons[2] = new JButton();
		answerButtons[3] = new JButton();
		answerButtons[0].setBounds(150, 390, 300, 55);
		answerButtons[1].setBounds(490, 390, 300, 55);
		answerButtons[2].setBounds(150, 455, 300, 55);
		answerButtons[3].setBounds(490, 455, 300, 55);
		
		for(int i = 0; i < 4; i++)
		{
			answerButtons[i].setBackground(Color.BLACK);

			answerButtons[i].setForeground(Color.WHITE);

			answerButtons[i].setFont(
			new Font("Arial", Font.BOLD, 16));

			answerButtons[i].setFocusPainted(false);

			answerButtons[i].setVisible(false);

			answerButtons[i].addActionListener(new QuestionHandler());

			add(answerButtons[i]);
		}

        // MAIN BUTTONS
        fightButton = new JButton("[FIGHT]");
        fightButton.setBounds(100, 420, 200, 50);
        styleMainButton(fightButton);
        fightButton.addActionListener(
        new MainActionHandler());
        add(fightButton);

        actButton = new JButton("{ACT}");
        actButton.setBounds(370, 420, 200, 50);
        styleMainButton(actButton);
        actButton.addActionListener(
        new MainActionHandler());
        add(actButton);

        itemButton = new JButton("(ITEM)");
        itemButton.setBounds(640, 420, 200, 50);
        styleMainButton(itemButton);
        itemButton.addActionListener(
        new MainActionHandler());
        add(itemButton);
        
        class TimerHandeler implements ActionListener
        {
			public void actionPerformed(ActionEvent e)
			{
				glitchTick++;
				repaint();
			}
		}
        
        Timer glitchTimer = new Timer(50, new TimerHandeler());

		glitchTimer.start();
		try
        {
            // Load sound file
            URL url = getClass().getResource("/HackerMusic.wav");
            // Check if file exists
            if (url == null)
            {
                System.out.println("Could not find HackerMusic.wav");
                return;
            }
            // Open audio stream
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
            // Create clip
            music = AudioSystem.getClip();
            // Load audio into clip
            music.open(audioIn);
            // Play sound
        }
        catch (UnsupportedAudioFileException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (LineUnavailableException e)
        {
            e.printStackTrace();
        }
    }

    public void styleMainButton(JButton btn)
    {
        btn.setBackground(Color.BLACK);
        btn.setForeground(Color.ORANGE);

        btn.setFont(new Font("Arial", Font.BOLD, 24));

        btn.setFocusPainted(false);
    }

    public void startFinalBoss(int minRange, int maxRange)
    {
		music.loop(Clip.LOOP_CONTINUOUSLY);
        minQuestionRNG = minRange;
        maxQuestionRNG = maxRange;

        maxHealth = panels.getCurrentLives() * 20;
        playerHealth = maxHealth;
        
        bossHealth = 120;
        
        phase = 1;
		usedFreeze = false;
		usedEasier = false;
		usedSkip = false;

        freezeTurns = 0;
        easierQuestions = false;
        skipQuestions = false;

        updateLabels();

        showMainButtons(true);
        showQuestionUI(false);

        infoLabel.setText("The Hacker blocks your path.");

        repaint();
    }

    public void updateLabels()
    {
        playerHealthLabel.setText("HP: " + playerHealth + " / " + maxHealth);

        bossHealthLabel.setText("Hacker HP: " + bossHealth);
    }

    public void showMainButtons(boolean show)
    {
        fightButton.setVisible(show);
        actButton.setVisible(show);
        itemButton.setVisible(show);
    }

    public void showQuestionUI(boolean show)
    {
        questionArea.setVisible(show);

        for(int i = 0; i < answerButtons.length; i++)
        {
            answerButtons[i].setVisible(show);
        }
    }

    public void beginQuestions(int mode)
    {
        currentMode = mode;

        questionsAnswered = 0;
        correctAnswers = 0;

        showMainButtons(false);
        showQuestionUI(true);

        // SKIP POWERUP
        if(skipQuestions)
        {
            skipQuestions = false;

            correctAnswers = 3;
            questionsAnswered = 3;

            infoLabel.setText("Questions skipped!");

            finishTurn();

            return;
        }

        loadQuestion();
    }

    public void loadQuestion()
    {
        String inFileName = "Java_Questions.txt";

        File inFile = new File(inFileName);

        Scanner keyboard = null;

        try
        {
            keyboard = new Scanner(inFile);
        }
        catch(FileNotFoundException e)
        {
            return;
        }

        int low = minQuestionRNG;
        int high = maxQuestionRNG;

        // Easier questions powerup
        if(easierQuestions)
        {
            high = low + 5;

            if(high > maxQuestionRNG)
            {
                high = maxQuestionRNG;
            }
        }

        int questionNum = (int)(Math.random() * (high - low + 1)) + low;

        String questionNumStr = questionNum + " - ";

        boolean found = false;

        while(keyboard.hasNextLine() && found == false)
        {
            String line = keyboard.nextLine();

            if(line.startsWith(questionNumStr))
            {
                questionArea.setText(line);

                for(int i = 0; i < 4; i++)
                {
                    String ans =
                    keyboard.nextLine();

                    if(ans.charAt(0) == '>')
                    {
                        correctAnswer = ans.substring(2);

                        ans = ans.substring(2);
                    }

                    answerButtons[i].setText(ans);
                }

                found = true;
            }
        }

        keyboard.close();
    }

    class MainActionHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent evt)
        {
            String cmd = evt.getActionCommand();

            // FIGHT
            if(cmd.equals("[FIGHT]"))
            {
                infoLabel.setText("Answer 3 questions to attack!");

                beginQuestions(1);
            }

            // ACT
            else if(cmd.equals("{ACT}"))
            {
                infoLabel.setText(
                "Answer 3 questions to weaken him!");

                beginQuestions(2);
            }

            // ITEM
            else if(cmd.equals("(ITEM)"))
            {
                useItemMenu();
            }
        }
    }

    public void useItemMenu()
	{
		showMainButtons(false);
		showQuestionUI(true);

		questionArea.setText("Choose an item:");

		if(usedFreeze)
		{
			answerButtons[0].setText("Freeze Time (USED)");
		}
		else
		{
			answerButtons[0].setText("Freeze Time");
		}

		if(usedEasier)
		{
			answerButtons[1].setText("Easier Questions (USED)");
		}
		else
		{
			answerButtons[1].setText("Easier Questions");
		}

		if(usedSkip)
		{
			answerButtons[2].setText("Skip Questions (USED)");
		}
		else
		{
			answerButtons[2].setText("Skip Questions");
		}

		answerButtons[3].setText("Back");

		currentMode = 99;
	}

    class QuestionHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent evt)
		{
			JButton clicked = (JButton)evt.getSource();

			String text = clicked.getText();

			if(currentMode == 99)
			{
				showQuestionUI(false);
				showMainButtons(true);

				if(text.equals("Freeze Time") && !usedFreeze)
				{
					usedFreeze = true;
					freezeTurns = 2;

					infoLabel.setText("Time frozen for 2 turns!");
				}
				else if(text.equals("Easier Questions") && !usedEasier)
				{
					usedEasier = true;
					easierQuestions = true;

					infoLabel.setText("Next questions will be easier.");
				}
				else if(text.equals("Skip Questions") && !usedSkip)
				{
					usedSkip = true;
					skipQuestions = true;

					infoLabel.setText("Next question set will be skipped.");
				}
				else if(text.equals("Back"))
				{
					infoLabel.setText("The Hacker watches carefully...");
				}
				else
				{
					infoLabel.setText("That item is already used.");
				}

				repaint();
			}
			
			if(text.equals(correctAnswer))
			{
				correctAnswers++;
			}

			questionsAnswered++;

			if(questionsAnswered >= 3)
			{
				finishTurn();
			}
			else
			{
				loadQuestion();
			}
		}
	}

    public void finishTurn()
    {
        showQuestionUI(false);
        showMainButtons(true);

        // FIGHT
        if(currentMode == 1)
        {
            int damage =
            correctAnswers * 10;

            bossHealth -= damage;

            infoLabel.setText("You dealt "  + damage + " damage!");
        }

        // ACT
        else if(currentMode == 2)
        {
            int weaken =
            correctAnswers * 5;

            bossHealth -= weaken;

            playerHealth += weaken;

            if(playerHealth > maxHealth)
            {
                playerHealth = maxHealth;
            }

            infoLabel.setText(
            "You disrupted the hacker " + "and restored " + weaken + " HP!");
        }

        if(easierQuestions)
        {
            easierQuestions = false;
        }

        // PHASES
        if(bossHealth <= 70)
        {
            phase = 2;
        }

        if(bossHealth <= 35)
        {
            phase = 3;
        }

        if(bossHealth <= 0)
        {
            victory();
            return;
        }

        // FREEZE TURN
        if(freezeTurns > 0)
        {
            freezeTurns--;

            infoLabel.setText(infoLabel.getText() + " Hacker turn skipped!");

            updateLabels();

            repaint();

            return;
        }

        int hackerDamage = 15;

        if(phase == 2)
        {
            hackerDamage = 20;
        }

        if(phase == 3)
        {
            hackerDamage = 30;
        }

        hackerAttack(hackerDamage);

        updateLabels();

        repaint();
    }

    public void hackerAttack(int damage)
    {
        attacking = true;

        repaint();

        playerHealth -= damage;

        if(playerHealth < 0)
        {
            playerHealth = 0;
        }

        infoLabel.setText("The Hacker attacks for " + damage + " damage!");

        attacking = false;

        updateLabels();

        repaint();

        if(playerHealth <= 0)
        {
            gameOver();
        }
    }

    public void victory()
    {
        infoLabel.setText("THE HACKER HAS BEEN DEFEATED!");

        panels.returnScore(10000, 0);

        account.levelsFinishedIn(21);

        account.saveData();
        
        class TimerHandeler implements ActionListener
		{
			public void actionPerformed(ActionEvent evt)
			{
				music.stop();
				cards.show(panels,"Victory");
			}
		}
		
        Timer timer = new Timer(2500, new TimerHandeler());
        timer.setRepeats(false);
        timer.start();
        
    }

    public void gameOver()
    {
        infoLabel.setText("You were defeated...");
        
        class TimerHandeler implements ActionListener
		{
			public void actionPerformed(ActionEvent evt)
			{
				music.stop();
				cards.show(panels,"Game Over");
			}
		}
		
        Timer timer = new Timer(2000,new TimerHandeler());
        
        timer.setRepeats(false);
        timer.start();
        
    }
    
    public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, getWidth(), getHeight());
		g.setColor(new Color(0, 255, 0, 25));
		for(int y = 0; y < getHeight(); y += 4)
		{
			g.drawLine(0, y, getWidth(), y);
		}
		
		// GLITCH BLOCKS
		for(int i = 0; i < 8; i++)
		{
			int x = (glitchTick * (i + 3) * 37) % getWidth();
			int y = (glitchTick * (i + 7) * 19) % getHeight();

			int w = 60 + ((glitchTick * i * 13) % 80);
			int h = 10 + ((glitchTick * i * 29) % 25);

			int alpha = 20 + ((glitchTick * i * 11) % 40);

			g.setColor(new Color(0, 255, 0, alpha));
			g.fillRect(x, y, w, h);
		}

		// SHAKE
		int shakeX = 0;
		int shakeY = 0;

		if(attacking)
		{
			shakeX = ((glitchTick % 5) - 2) * 2;
			shakeY = ((glitchTick % 7) - 3) * 2;
		}
		
		ImageIcon current;
		if(attacking)
		{
			current = attackSprite;
		}
		else
		{
			current = idleSprite;
		}
		g.drawImage(current.getImage(),330 + shakeX,90 + shakeY,240,200,this);

	}
}

class VictoryPanel extends JPanel
{
    private ErrorCodeHolder panels;
    private CardLayout cards;
    private Accounts account;

    private JLabel title;
    private JLabel stats;

    private JButton continueButton;

    private int finalScore;
    private int finalLevel;
	private int tick = 0;
    public VictoryPanel(ErrorCodeHolder ech, CardLayout card, Accounts acc)
    {
        panels = ech;
        cards = card;
        account = acc;

        setLayout(null);
        setBackground(Color.BLACK);

        title = new JLabel("YOU WIN", JLabel.CENTER);
        title.setBounds(100, 80, 700, 60);
        title.setForeground(Color.GREEN);
        title.setFont(new Font("Arial", Font.BOLD, 32));
        add(title);

        stats = new JLabel("", JLabel.CENTER);
        stats.setBounds(100, 170, 700, 60);
        stats.setForeground(Color.WHITE);
        stats.setFont(new Font("Arial", Font.BOLD, 22));
        add(stats);

        continueButton = new JButton("CONTINUE");
        continueButton.setBounds(330, 320, 200, 60);
        continueButton.setFont(new Font("Arial", Font.BOLD, 20));
        continueButton.addActionListener(new ButtonListener());

        add(continueButton);
        new Timer(50, new GlitchHandler()).start();
    }
    class GlitchHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			tick++;
			repaint();
		}
	}
    class ButtonListener implements ActionListener
    {
		public void actionPerformed(ActionEvent e)
        {
            finishAndSave();
        }
	}
    
    public void setStats()
    {
		
        stats.setText("Score: " + panels.getCurrentScore() + " | Level: " + panels.getCurrentLevel());
    }

    public void finishAndSave()
    {
		setStats();
        // ADD TO LEADERBOARD
        panels.getLeaderboard().addEntry(account.getUserName(), panels.getCurrentLevel(), panels.getCurrentScore());

        // RETURN TO TITLE
        cards.show(panels, "Title");
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        int w = getWidth();
        int h = getHeight();

        int shakeX = (tick % 3) - 1;
        int shakeY = ((tick / 2) % 3) - 1;

        g.translate(shakeX, shakeY);

        g.setColor(new Color(255, 0, 0, 40));

        for (int i = 0; i < 8; i++)
        {
            int y = (tick * (i + 3) * 7) % h;
            int height = 10 + ((i * 13) % 25);

            g.fillRect(0, y, w, height);
        }

        g.setColor(new Color(0, 255, 0, 25));

        for (int i = 0; i < 12; i++)
        {
            int x = (i * 97 + tick * 11) % w;
            int y = (i * 53 + tick * 17) % h;

            int bw = 30 + (i * 7) % 120;
            int bh = 10 + (i * 5) % 40;

            g.fillRect(x, y, bw, bh);
        }

        g.setColor(new Color(0, 0, 0, 60));

        for (int y = 0; y < h; y += 4)
        {
            g.drawLine(0, y, w, y);
        }

        // reset transform
        g.translate(-shakeX, -shakeY);
    }
}

class GameOverPanel extends JPanel
{
    private ErrorCodeHolder panels;
    private CardLayout cards;
    private Accounts account;

    private JLabel crashText;
    private JLabel statsText;
    private JButton returnButton;

    private String playerName;
    private int score;
    private int level;
    
    // animation
    private int tick = 0;

    public GameOverPanel(ErrorCodeHolder ech4, CardLayout cardsIn, Accounts ach)
    {
        panels = ech4;
        cards = cardsIn;
        account = ach;
        
        playerName = account.getUserName();
        score = panels.getCurrentScore();
        level = panels.getCurrentLevel();
        
        setLayout(null);
        setBackground(Color.BLACK);

        crashText = new JLabel("SYSTEM FAILURE", JLabel.CENTER);
        crashText.setBounds(100, 40, 760, 120);
        crashText.setForeground(Color.RED);
        crashText.setFont(new Font("Monospaced", Font.BOLD, 64));
        add(crashText);

        statsText = new JLabel("", JLabel.CENTER);
        statsText.setBounds(100, 180, 760, 120);
        statsText.setForeground(Color.GREEN);
        statsText.setFont(new Font("Monospaced", Font.BOLD, 24));
        add(statsText);

        returnButton = new JButton("[REBOOT SYSTEM]");
        returnButton.setBounds(320, 420, 300, 60);
        returnButton.setForeground(Color.RED);
        returnButton.setBackground(Color.DARK_GRAY);
        returnButton.setFont(new Font("Monospaced", Font.BOLD, 18));
        add(returnButton);

        returnButton.addActionListener(new ButtonHandler());

        // animation loop
        new Timer(50, new GlitchHandler()).start();
    }
	class GlitchHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			tick++;
			repaint();
		}
	}
    public void setGameOverData()
    {
		playerName = account.getUserName();
		score = panels.getCurrentScore();
		level = panels.getCurrentLevel();
        statsText.setText(
            "USER: " + playerName +
            "   SCORE: " + score +
            "   LEVEL: " + level
        );

        // send to leaderboard immediately
        panels.getLeaderboard().addEntry(playerName, level, score);
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        int w = getWidth();
        int h = getHeight();

        int shakeX = (tick % 3) - 1;
        int shakeY = ((tick / 2) % 3) - 1;

        g.translate(shakeX, shakeY);

        g.setColor(new Color(255, 0, 0, 40));

        for (int i = 0; i < 8; i++)
        {
            int y = (tick * (i + 3) * 7) % h;
            int height = 10 + ((i * 13) % 25);

            g.fillRect(0, y, w, height);
        }

        g.setColor(new Color(0, 255, 0, 25));

        for (int i = 0; i < 12; i++)
        {
            int x = (i * 97 + tick * 11) % w;
            int y = (i * 53 + tick * 17) % h;

            int bw = 30 + (i * 7) % 120;
            int bh = 10 + (i * 5) % 40;

            g.fillRect(x, y, bw, bh);
        }

        g.setColor(new Color(0, 0, 0, 60));

        for (int y = 0; y < h; y += 4)
        {
            g.drawLine(0, y, w, y);
        }

        // reset transform
        g.translate(-shakeX, -shakeY);
    }

    class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent evt)
        {
            cards.show(panels, "Title");
        }
    }
}

