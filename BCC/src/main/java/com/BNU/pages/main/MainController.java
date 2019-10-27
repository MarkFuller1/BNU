package com.BNU.pages.main;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.BNU.database.DatabaseMock;
import com.BNU.database.dbWrapper;
import com.BNU.pages.PageController;
import com.BNU.pages.login.LoginController;
import com.BNU.pages.main.MainController;
import com.BNU.windowbuilder.WindowBuilder;

public class MainController extends PageController {

	static MainView view;
	static MainModel model = new MainModel();
	static JPanel panel;
	static dbWrapper db;
	private static final Logger LOGGER = Logger.getLogger(MainController.class.getName());

	public MainController() {
		model = new MainModel();
		panel = new JPanel();
		view = new MainView();
		db = new DatabaseMock();
	}

	@Override
	public void dispatchBuilder(JFrame mainFrame, dbWrapper db) throws SecurityException, IOException {
		MainView.BuildLoginView(mainFrame, this);

		FileHandler fileHandler = new FileHandler("BCC.log", true);
		LOGGER.addHandler(fileHandler);
		LOGGER.setLevel(Level.FINEST);
	}

	public static dbWrapper getDb() {
		return db;
	}

	public static void setDb(DatabaseMock db) {
		MainController.db = db;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		MainController.panel = panel;
	}

	public MainView getView() {
		return view;
	}

	public void setView(MainView view) {
		MainController.view = view;
	}

	public MainModel getModel() {
		return model;
	}

	public void setModel(MainModel model) {
		MainController.model = model;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "main:searchProfessor") {
			LOGGER.info("main:searchProfessor Button Pressed");
			try {
				WindowBuilder.loadPage(new LoginController());
			} catch (Exception e1) {
				LOGGER.severe("Failed to load main:searchProfessor");
			}
		} else if (e.getActionCommand() == "main:searchClass") {
			LOGGER.info("main:searchClass Button Pressed");
			try {
				WindowBuilder.loadPage(new LoginController());
			} catch (Exception e1) {
				LOGGER.severe("Failed to load main:searchProfessor");
			}
		}

	}

}
