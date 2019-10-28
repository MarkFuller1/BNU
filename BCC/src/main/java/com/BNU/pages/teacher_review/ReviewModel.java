package com.BNU.pages.teacher_review;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class ReviewModel {
	
	private JButton btnUp;
	private JButton btnDown;
	private JLabel reviewScore;
	private JScrollPane reviewScrollPane;
	private JLabel studentReview;
	private JLabel reviewerID;
	private JButton btnMessageReviewer;
	private JPanel panel;
	private JTextPane textPane;
	
	
	public JButton getBtnUp() {
		return btnUp;
	}
	public void setBtnUp(JButton btnUp) {
		this.btnUp = btnUp;
	}
	public JButton getBtnDown() {
		return btnDown;
	}
	public void setBtnDown(JButton btnDown) {
		this.btnDown = btnDown;
	}
	public JLabel getReviewScore() {
		return reviewScore;
	}
	public void setReviewScore(JLabel reviewScore) {
		this.reviewScore = reviewScore;
	}
	public JScrollPane getReviewScrollPane() {
		return reviewScrollPane;
	}
	public void setReviewScrollPane(JScrollPane reviewScrollPane) {
		this.reviewScrollPane = reviewScrollPane;
	}
	public JLabel getStudentReview() {
		return studentReview;
	}
	public void setStudentReview(JLabel studentReview) {
		this.studentReview = studentReview;
	}
	public JLabel getReviewerID() {
		return reviewerID;
	}
	public void setReviewerID(JLabel reviewerID) {
		this.reviewerID = reviewerID;
	}
	public JButton getBtnMessageReviewer() {
		return btnMessageReviewer;
	}
	public void setBtnMessageReviewer(JButton btnMessageReviewer) {
		this.btnMessageReviewer = btnMessageReviewer;
	}
	public JPanel getPanel() {
		return panel;
	}
	public void setPanel(JPanel panel) {
		this.panel = panel;
	}
	public JTextPane getTextPane() {
		return textPane;
	}
	public void setTextPane(JTextPane textPane) {
		this.textPane = textPane;
	}
	
	
	
	public void createReviewItem() {  //Should take a database object as a parameter and populate this info using a record.
		//ReviewModel rm = new ReviewModel();
		panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.setSize(804,200);
		panel.setVisible(true);
		
		// up button
		setBtnUp(new JButton("U"));
		getBtnUp().setForeground(Color.BLUE);
		getBtnUp().setFont(new Font("Segoe UI", Font.PLAIN, 18));
		//getBtnUp().setBounds(0, 45, 55, 38);
		panel.add(getBtnUp());


		// down button
		setBtnDown(new JButton("D"));
		getBtnDown().setForeground(Color.RED);
		getBtnDown().setFont(new Font("Segoe UI", Font.PLAIN, 18));
		//getBtnDown().setBounds(0, 83, 55, 38);		
		panel.add(getBtnDown());

		// review score label
		setReviewScore(new JLabel("4"));
		getReviewScore().setHorizontalAlignment(SwingConstants.CENTER);
		getReviewScore().setFont(new Font("Segoe UI", Font.PLAIN, 30));
		//getReviewScore().setBounds(52, 55, 61, 48);
		panel.add(getReviewScore());

		// scroll pane
		setReviewScrollPane(new JScrollPane());
		//getReviewScrollPane().setBounds(111, 30, 675, 129);
		panel.add(getReviewScrollPane());
		
		// text pane
		setTextPane(new JTextPane());
		getTextPane().setFont(new Font("Segoe UI", Font.PLAIN, 12));
		getTextPane().setEditable(false);
		getTextPane().setText("Write a professional review about your professor here please\n"
				+ "Write a professional review about your professor here please\n"
				+ "Write a professional review about your professor here please\n"
				+ "Write a professional review about your professor here please\n"
				+ "Write a professional review about your professor here please\n"
				+ "Write a professional review about your professor here please\n"
				+ "Write a professional review about your professor here please\n"
				+ "Write a professional review about your professor here please\n"
				+ "Write a professional review about your professor here please\n");
		getReviewScrollPane().setViewportView(getTextPane());
		
		// reviewer label
		setReviewerID(new JLabel("GreatReviewer4444"));
		getReviewerID().setFont(new Font("Segoe UI", Font.PLAIN, 12));
		//getReviewerID().setBounds(111, 11, 499, 14);
		panel.add(getReviewerID());
		
		// down button
		setBtnMessageReviewer(new JButton("Message Reviewer"));
		getBtnMessageReviewer().setFont(new Font("Segoe UI", Font.PLAIN, 12));
		//getBtnMessageReviewer().setBounds(657, 7, 129, 23);		
		panel.add(getBtnMessageReviewer());
		

		setPanel(panel);
	
		
	}
	
	
}