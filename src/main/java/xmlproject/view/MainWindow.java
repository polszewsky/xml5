package xmlproject.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import xmlproject.controller.WineManager;
import xmlproject.exception.RepoException;

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
			
			wineManager = WineManager.getInstance();
			
			
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
			
			// menu bar
			menuBar = new JMenuBar();
			setJMenuBar(menuBar);
			
			JMenu mnFile = new JMenu("Plik");
			menuBar.add(mnFile);
			
			
			JMenuItem mnAddWine = new JMenuItem("Nowe wino");
			mnFile.add(mnAddWine);
			mnFile.addSeparator();
			mnFile.addSeparator();
			
			
			//dodanie nowego wina
			mnAddWine.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					
					NewWineDialog newWineDialog = new NewWineDialog();
					newWineDialog.setVisible(true);
			
				}
			});
			
			
			JMenuItem refresh = new JMenuItem("Odswiez");
			mnFile.add(refresh);
			mnFile.addSeparator();
			mnFile.addSeparator();
			
			
			refresh.addActionListener(new ActionListener() {			
				public void actionPerformed(ActionEvent e)
				{
					

					winePanel.showWinesAll();
					
					JOptionPane.showMessageDialog(null, "Odsiwezono.");
				}	
				
			});
			
			
			
			JMenuItem mnOpenFile = new JMenuItem("Otwórz z...");
			mnFile.add(mnOpenFile);
			
			// akcja otwarcia pliku xml
			mnOpenFile.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					
					
					try
					{
						wineManager.importFromXML();
						
						JOptionPane.showMessageDialog(null, "imported XML.");
					}
					catch (RepoException e1)
					{
						
						e1.printStackTrace();
						
						JOptionPane.showMessageDialog(null, "**ERROR** importing xml.", "Error", JOptionPane.ERROR_MESSAGE);
					}
					finally
					{
					winePanel.showWinesAll();
					}
				}
			});
			
			JMenuItem mnSaveFile = new JMenuItem("Zapisz do...");
			mnFile.add(mnSaveFile);
			
			// akcja zapisu pliku xml
			mnSaveFile.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					try
					{
						wineManager.exportToXML();
						
						JOptionPane.showMessageDialog(null, "exported XML.");
					}
					catch (RepoException e1)
					{
						
						e1.printStackTrace();
						JOptionPane.showMessageDialog(null, "**ERROR** exporting xml.", "Error", JOptionPane.ERROR_MESSAGE);
					}
					finally
					{
					winePanel.showWinesAll();
					}
				}
			});
			
			
			JMenu mnTransform = new JMenu("Transformacja");
			menuBar.add(mnTransform);
			
			
			JMenuItem mnPDFTrans = new JMenuItem("XML to PDF");
			mnTransform.add(mnPDFTrans);
			
			// akcja transformacji
			mnPDFTrans.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					
					
					
						wineManager.transformToPDF();
						
						
				
				}
			});
			
			
		}
}
