package xmlproject.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import xmlproject.controller.WineManager;

@SuppressWarnings("serial")
public class MainWindow extends JFrame
{

	// Widgety
		private JMenuBar menuBar;
		public WinePanel winePanel;
		
	// Menager
	
		private WineManager wineManager;
		
		//! Inicjalizuje pola klasy
		//! Tworzy okno, ustala jego wymiary i inne wlasciwosci
		public MainWindow()
		{
			
			// wineManager = WineManager.getInstance();
			
			
			setBounds(100, 100, 1000, 600);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(1100, 600);
			setLayout(null);
			setResizable(false);
			getContentPane().setBackground(new Color(240, 240, 240));
			
			initializeMenuBar();
			
			winePanel = new WinePanel(wineManager);
			winePanel.setBounds(530, 10, 550, 530);
			add(winePanel);
			
			
			winePanel.showPanel();
			
			
			
		}

		private void initializeMenuBar() {

			menuBar = new JMenuBar();
			setJMenuBar(menuBar);
			
			JMenu mnFile = new JMenu("Plik");
			menuBar.add(mnFile);
			
			JMenuItem mnOpenFile = new JMenuItem("Otwórz z...");
			mnFile.add(mnOpenFile);
			
			
			mnOpenFile.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
//					NewEventDialog newEventDialog = new NewEventDialog(calendarPanel.getCurrentDate());
	//				newEventDialog.setVisible(true);
//					eventsPanel.showEventsFromDay(calendarPanel.getCurrentDate());
				}
			});
			
			JMenuItem mnSaveFile = new JMenuItem("Zapisz do...");
			mnFile.add(mnSaveFile);
			
		
			mnSaveFile.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
//					NewEventDialog newEventDialog = new NewEventDialog(calendarPanel.getCurrentDate());
	//				newEventDialog.setVisible(true);
//					eventsPanel.showEventsFromDay(calendarPanel.getCurrentDate());
				}
			});
			
			
		}
}
