package xmlproject.view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JMenuBar;

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
			
			
		}
}
