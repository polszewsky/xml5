package xmlproject.view;

import xmlproject.model.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

import xmlproject.controller.WineManager;

@SuppressWarnings("serial")
public class WinePanel extends JPanel{

	private static final long serialVersionUID = 1L;

	private WineManager wManager = null;
	JButton removeWineButton = null;
	JButton editWineButton = null;
	JScrollPane winesScrollPane;
	JList<String> winesJList;
	JLabel winesCountLabel = new JLabel("");
	
	public WinePanel(WineManager wineManager)
	{
		this.wManager = wineManager;
		
		setLayout(null);
		setBackground(new Color(254, 254, 254));
		setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		
		
		
		winesScrollPane = new JScrollPane();
		
		
		
		removeWineButton = new JButton("Usu� pozycj�");
		removeWineButton.setBounds(155, 480, 140, 25);
		removeWineButton.setVisible(false);
		removeWineButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	// bierzemy pierwsze 5 znakow z elementu listy - 
            	// bo event_id wyswietlamy zawsze na 5 miejscach (tak jak jest napisane w Event toString())
            	String selectedWineId = WinePanel.this.winesJList.getSelectedValue().substring(0, 5).replaceAll(" ", "");
//            	Long eventId = Long.parseLong(selectedEventId);
            	WineManager.getInstance().removeWineById(selectedWineId);
            	showWinesAll();
            }
        });
		add(removeWineButton);
		
		
		editWineButton = new JButton("edytuj pozycj�");
		editWineButton.setBounds(300, 480, 200, 25);
		editWineButton.setVisible(false);
		editWineButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	// bierzemy pierwsze 5 znakow z elementu listy - 
            	// bo event_id wyswietlamy zawsze na 5 miejscach (tak jak jest napisane w Event toString())
            	String selectedWineId = WinePanel.this.winesJList.getSelectedValue().substring(0, 5).replaceAll(" ", "");

				
				EditWineDialog editWineDialog = new EditWineDialog(selectedWineId);
				editWineDialog.setVisible(true);
            	
            }
        });
		add(editWineButton);
		
		
		winesCountLabel.setBounds(10, 40, 250, 25);
		winesCountLabel.setVerticalAlignment(JLabel.TOP);
		winesCountLabel.setVerticalTextPosition(JLabel.TOP);
		add(winesCountLabel);
		
		showWinesAll();
		
		System.out.println("1");
		
	}

	public void showWinesAll()
	{
		List<Wine> wines = WineManager.getInstance().getAllWines();
		
		System.out.println("2");
		showWines(wines);
	}
	
	
	public void showWines(List<Wine> wines)
	{
		remove(winesScrollPane);
		repaint();
		revalidate();
		if(wines.size() == 0) {
			winesCountLabel.setFont(new Font("Helvetica", Font.PLAIN, 18));
			winesCountLabel.setText("Brak win w bibliotece.");
			removeWineButton.setVisible(false);
			winesScrollPane.setVisible(false);
			winesScrollPane.repaint();
		}
		else {
			String content = "Liczba win: " + wines.size() + "";
			removeWineButton.setVisible(true);
			editWineButton.setVisible(true);
			
			
			
			List<String> winesList = new ArrayList<String>();
			for(Wine w : wines) {
				winesList.add(w.toString());
			}
			
			String[] eventsArray = winesList.toArray(new String[winesList.size()]);
			winesJList = new JList<String>(eventsArray);
			winesJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			winesJList.setSelectedIndex(0);
			winesScrollPane.repaint();
			winesScrollPane = new JScrollPane(winesJList);
			winesCountLabel.setText(content);
			winesScrollPane.setBounds(10, 70, 530, 300);
			add(winesScrollPane);
			
		}
		
		System.out.println("3");
	}
	
	
	public void showPanel() {}
	
}
