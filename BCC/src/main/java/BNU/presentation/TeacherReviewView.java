package BNU.presentation;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import BNU.logic.LoginController;
import BNU.logic.TeacherReviewController;
import refactor.these.ReviewModel2;

public class TeacherReviewView {
	static JButton butNavigation;
	static JLabel labTitle;
	private static final Logger LOGGER = Logger.getLogger(TeacherReviewController.class.getName());

	@SuppressWarnings("unused")
	public static void BuildTeacherReviewView(JFrame mainFrame, TeacherReviewController controller) {
		FileHandler fileHandler = null;
		try {
			fileHandler = new FileHandler("BCC.log", true);
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LOGGER.addHandler(fileHandler);
		LOGGER.setLevel(Level.FINEST);
		LOGGER.info("Teacher Review page loaded correctly");

		controller.setPanel(new JPanel());
		controller.getPanel().setLayout(null);
		
		//professor label
		controller.getModel().setProfessor(new JLabel("Professor:"));
		controller.getPanel().add(controller.getModel().getProfessor()).setBounds(234, 9, 130, 41);
		controller.getPanel().add(controller.getModel().getProfessor()).setFont(new Font("Segoe UI", Font.PLAIN, 25));
		
		//professor name label
		controller.getModel().setProfessorName(new JLabel(controller.getTeacherName()));
		controller.getPanel().add(controller.getModel().getProfessorName()).setBounds(362, 9, 515, 41);
		controller.getPanel().add(controller.getModel().getProfessorName()).setFont(new Font("Segoe UI", Font.PLAIN, 25));

		//class label
		controller.getModel().setLblClass(new JLabel("Class:"));
		controller.getPanel().add(controller.getModel().getLblClass()).setBounds(234, 57, 118, 41);
		controller.getPanel().add(controller.getModel().getLblClass()).setFont(new Font("Segoe UI", Font.PLAIN, 25));
		
		//class name label
		controller.getModel().setLblClassName(new JLabel(controller.getClassName()));
		controller.getPanel().add(controller.getModel().getLblClassName()).setBounds(362, 57, 515, 41);
		controller.getPanel().add(controller.getModel().getLblClassName()).setFont(new Font("Segoe UI", Font.PLAIN, 25));
		
		//score label
		controller.getModel().setScore(new JLabel("Score"));
		controller.getPanel().add(controller.getModel().getScore()).setBounds(146, 121, 56, 41);
		controller.getPanel().add(controller.getModel().getScore()).setFont(new Font("Segoe UI", Font.BOLD, 18));
		
		//helpfulness label
		controller.getModel().setHelpfulness(new JLabel("Helpfulness"));
		controller.getPanel().add(controller.getModel().getHelpfulness()).setBounds(327, 121, 112, 41);
		controller.getPanel().add(controller.getModel().getHelpfulness()).setFont(new Font("Segoe UI", Font.BOLD, 18));
		
		//teaching ability label
		controller.getModel().setTeachingAbility(new JLabel("Teaching Ability"));
		controller.getPanel().add(controller.getModel().getTeachingAbility()).setBounds(527, 121, 160, 41);
		controller.getPanel().add(controller.getModel().getTeachingAbility()).setFont(new Font("Segoe UI", Font.BOLD, 18));
		
		//workload label
		controller.getModel().setWorkload(new JLabel("Workload"));
		controller.getPanel().add(controller.getModel().getWorkload()).setBounds(729, 121, 112, 41);
		controller.getPanel().add(controller.getModel().getWorkload()).setFont(new Font("Segoe UI", Font.BOLD, 18));
		
		//back button
		controller.getModel().setBtnBack(new JButton("Back"));
		controller.getPanel().add(controller.getModel().getBtnBack()).setBounds(10, 11, 106, 41);
		controller.getPanel().add(controller.getModel().getBtnBack()).setFont(new Font("Segoe UI", Font.BOLD, 18));
		controller.getModel().getBtnBack().setActionCommand("teacher_review:back");
		controller.getModel().getBtnBack().addActionListener(controller);
		
		// score score label
		controller.getModel().setScoreScore(new JLabel("83"));
		controller.getPanel().add(controller.getModel().getScoreScore()).setBounds(146, 173, 56, 41);
		controller.getPanel().add(controller.getModel().getScoreScore()).setFont(new Font("Segoe UI", Font.BOLD, 18));
		controller.getPanel().add(controller.getModel().getScoreScore()).setBackground(Color.YELLOW);
		controller.getPanel().add(controller.getModel().getScoreScore()).setForeground(Color.DARK_GRAY);
		
		// helpfulness score label
		controller.getModel().setHelpfulnessScore(new JLabel("50"));
		controller.getPanel().add(controller.getModel().getHelpfulnessScore()).setBounds(327, 173, 56, 41);
		controller.getPanel().add(controller.getModel().getHelpfulnessScore()).setFont(new Font("Segoe UI", Font.BOLD, 18));
		controller.getPanel().add(controller.getModel().getHelpfulnessScore()).setForeground(Color.DARK_GRAY);
		
		// teaching ability score label
		controller.getModel().setTeachingAbilityScore(new JLabel("99"));
		controller.getPanel().add(controller.getModel().getTeachingAbilityScore()).setBounds(527, 173, 56, 41);
		controller.getPanel().add(controller.getModel().getTeachingAbilityScore()).setFont(new Font("Segoe UI", Font.BOLD, 18));
		controller.getPanel().add(controller.getModel().getTeachingAbilityScore()).setForeground(Color.DARK_GRAY);
		
		// workload score label
		controller.getModel().setWorkloadScore(new JLabel("45"));
		controller.getPanel().add(controller.getModel().getWorkloadScore()).setBounds(729, 173, 56, 41);
		controller.getPanel().add(controller.getModel().getWorkloadScore()).setFont(new Font("Segoe UI", Font.BOLD, 18));
		controller.getPanel().add(controller.getModel().getWorkloadScore()).setForeground(Color.DARK_GRAY);
		
		//main scroll pane 
		controller.getModel().setScrollPane(new JScrollPane());
		controller.getModel().getScrollPane().setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		//main scroll pane panel
		controller.getModel().getScrollPane().setViewportBorder(new LineBorder(Color.RED));
		controller.getModel().setScrollPanePanel(new JPanel());
		controller.getModel().getScrollPanePanel().setLayout(new BoxLayout(controller.getModel().getScrollPanePanel(), BoxLayout.Y_AXIS));
		
		
		for(int i = 0; i < 10; i++) {
			ReviewModel2 rm1 = new ReviewModel2();
			rm1.createReviewItem();
			if(rm1 == null) {
				LOGGER.info("Review Record not populated correclty.");
			}else {
				rm1.getPanel().setBounds(0,i*200,804,250);
				controller.getModel().getScrollPanePanel().add(rm1.getPanel());	
				controller.getModel().getScrollPanePanel().add(Box.createRigidArea(new Dimension(0,15)));
			}

		}

		controller.getModel().getScrollPane().getViewport().add(controller.getModel().getScrollPanePanel(), null);
		controller.getPanel().add(controller.getModel().getScrollPane()).setBounds(40, 257, 900, 450);
		
		mainFrame.getContentPane().removeAll();
		mainFrame.setContentPane(controller.getPanel());
		mainFrame.setVisible(true);
	}
}