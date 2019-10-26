package com.BNU.pages.main;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class MainModel {
	private JLabel txt_Title;
	private JLabel txt_SearchClass;
	private JLabel txt_SearchProfessor;
	private JComboBox cb_SearchProfessor;
	private JComboBox cb_SearchClass;
	private JLabel txt_Image; 
	private JLabel txt_Messages;
	
	public JLabel getTxt_Title() {
		return txt_Title;
	}
	public void setTxt_Title(JLabel txt_Title) {
		this.txt_Title = txt_Title;
	}
	public JLabel getTxt_SearchClass() {
		return txt_SearchClass;
	}
	public void setTxt_SearchClass(JLabel txt_SearchClass) {
		this.txt_SearchClass = txt_SearchClass;
	}
	public JLabel getTxt_SearchProfessor() {
		return txt_SearchProfessor;
	}
	public void setTxt_SearchProfessor(JLabel txt_SearchProfessor) {
		this.txt_SearchProfessor = txt_SearchProfessor;
	}
	public JComboBox getCb_SearchProfessor() {
		return cb_SearchProfessor;
	}
	public void setCb_SearchProfessor(JComboBox cb_SearchProfessor) {
		this.cb_SearchProfessor = cb_SearchProfessor;
	}
	public JComboBox getCb_SearchClass() {
		return cb_SearchClass;
	}
	public void setCb_SearchClass(JComboBox cb_SearchClass) {
		this.cb_SearchClass = cb_SearchClass;
	}
	public JLabel getTxt_Image() {
		return txt_Image;
	}
	public void setTxt_Image(JLabel txt_Image) {
		this.txt_Image = txt_Image;
	}
	public JLabel getTxt_Messages() {
		return txt_Messages;
	}
	public void setTxt_Messages(JLabel txt_Messages) {
		this.txt_Messages = txt_Messages;
	}
	
	
	
}
