package xmlproject.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import xmlproject.controller.WineManager;
import xmlproject.model.Country;
import xmlproject.model.Price;
import xmlproject.model.Shipment;
import xmlproject.model.Wine;

public class NewWineDialog extends JDialog 
{

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	
	public JTextField eventTitle;
	public JTextField eventDesc;
	public JTextField eventLoc;
	public JTextField eventStartDateField;
	public JTextField eventRemindDateField;
	private JTextField eventAvail;
	private JTextField eventName;
	private JTextField eventContr;
	private JTextField eventCont;
	private JTextField eventCol;
	private JTextField eventTaste;
	private JTextField eventYear;
	private JTextField eventAlc;
	private JTextField eventObj;
	private JTextField eventPrice;
	private JTextField eventVat;
	private JTextField eventDost;
	private JTextField eventStatus;
	private JTextField eventId;
	
	public NewWineDialog()
	{
	setTitle("New Wine");
	setBounds(400, 250, 550, 500);
	getContentPane().setLayout(new BorderLayout());
	contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
	getContentPane().add(contentPanel, BorderLayout.CENTER);
	//contentPanel.setLayout(new BorderLayout(0, 0));
	contentPanel.setLayout(null);
			
	//		ID;
	JLabel lblTitle = new JLabel("ID");
	lblTitle.setBounds(15, 14, 147, 14);
	contentPanel.add(lblTitle);
	
	eventId = new JTextField();
	eventId.setBounds(200, 11, 260, 20);
	contentPanel.add(eventId);
	
	//		description;
	JLabel lblAvail = new JLabel("Dostepoœæ (yes|no)");
	lblAvail.setBounds(15, 44, 147, 14);
	contentPanel.add(lblAvail);
	
	eventAvail = new JTextField();
	eventAvail.setBounds(200, 41, 260, 20);
	contentPanel.add(eventAvail);
	
	//		location;		
	JLabel lblName = new JLabel("Nazwa");
	lblName.setBounds(15, 74, 147, 14);
	contentPanel.add(lblName);
	
	eventName = new JTextField();
	eventName.setBounds(200, 71, 260, 20);
	contentPanel.add(eventName);
	
	//		location2;		
	JLabel lblCountry = new JLabel("Kraj");
	lblCountry.setBounds(15, 104, 147, 14);
	contentPanel.add(lblCountry);
	
	eventContr = new JTextField();
	eventContr.setBounds(200, 101, 260, 20);
	contentPanel.add(eventContr);
	
	//		location;		
	JLabel lblCont = new JLabel("Kontynent");
	lblCont.setBounds(15, 134, 147, 14);
	contentPanel.add(lblCont);
	
	eventCont = new JTextField();
	eventCont.setBounds(200, 131, 260, 20);
	contentPanel.add(eventCont);
	
	//		location;		
	JLabel lblColor = new JLabel("Kolor");
	lblColor.setBounds(15, 164, 147, 14);
	contentPanel.add(lblColor);
	
	eventCol = new JTextField();
	eventCol.setBounds(200, 161, 260, 20);
	contentPanel.add(eventCol);
	
	//		location;		
	JLabel lbltaste = new JLabel("Smak");
	lbltaste.setBounds(15, 194, 147, 14);
	contentPanel.add(lbltaste);
	
	eventTaste = new JTextField();
	eventTaste.setBounds(200, 191, 260, 20);
	contentPanel.add(eventTaste);
	
	//		location;		
	JLabel lblYear = new JLabel("Rok");
	lblYear.setBounds(15, 224, 147, 14);
	contentPanel.add(lblYear);
	
	eventYear = new JTextField();
	eventYear.setBounds(200, 221, 260, 20);
	contentPanel.add(eventYear);
	
	//		location;		
	JLabel lblAlc = new JLabel("Alkohol ( %)");
	lblAlc.setBounds(15, 254, 147, 14);
	contentPanel.add(lblAlc);
	
	eventAlc = new JTextField();
	eventAlc.setBounds(200, 251, 260, 20);
	contentPanel.add(eventAlc);
	
	//		location;		
	JLabel lblObj = new JLabel("Objêtoœæ");
	lblObj.setBounds(15, 284, 147, 14);
	contentPanel.add(lblObj);
	
	eventObj = new JTextField();
	eventObj.setBounds(200, 281, 260, 20);
	contentPanel.add(eventObj);
	
	//		location;		
	JLabel lblPrice = new JLabel("Cena");
	lblPrice.setBounds(15, 314, 147, 14);
	contentPanel.add(lblPrice);
	
	eventPrice = new JTextField();
	eventPrice.setBounds(200, 311, 260, 20);
	contentPanel.add(eventPrice);
	
	//		location;		
	JLabel lblVat = new JLabel("VAT");
	lblVat.setBounds(15, 344, 147, 14);
	contentPanel.add(lblVat);
	
	eventVat = new JTextField();
	eventVat.setBounds(200, 341, 260, 20);
	contentPanel.add(eventVat);
	
	//		location;		
	JLabel lblDost = new JLabel("Dostawa");
	lblDost.setBounds(15, 374, 147, 14);
	contentPanel.add(lblDost);
	
	LocalDate eventStartDate = LocalDate.now();
	
	LocalDate startDate = eventStartDate;
	eventDost = new JTextField(startDate.toString());
	eventDost.setBounds(200, 371, 260, 20);
	contentPanel.add(eventDost);
	
	
	//		location;		
	JLabel lblStatus = new JLabel("Status (ontime|delayed)");
	lblStatus.setBounds(15, 404, 147, 14);
	contentPanel.add(lblStatus);
	
	eventStatus = new JTextField();
	eventStatus.setBounds(200, 401, 260, 20);
	contentPanel.add(eventStatus);
	

	
		
		JPanel buttonPane = new JPanel();
		buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER));
		getContentPane().add(buttonPane, BorderLayout.SOUTH);
		{
			JButton okButton = new JButton("Create New Wine");
			okButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0)
				{
					if(NewWineDialog.this.eventId.getText().isEmpty() ||
							NewWineDialog.this.eventName.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "ID i Nazwa nie mog¹ byc puste");
						return;
					}
					
					String evId = NewWineDialog.this.eventId.getText();
					String evAval = NewWineDialog.this.eventAvail.getText();
					String evName = NewWineDialog.this.eventName.getText();
					String evContr = NewWineDialog.this.eventContr.getText();
					String evCont = NewWineDialog.this.eventCont.getText();
					String evCol = NewWineDialog.this.eventCol.getText();
					String evTaste = NewWineDialog.this.eventTaste.getText();
					String evYear = NewWineDialog.this.eventYear.getText();
					String evAlc = NewWineDialog.this.eventAlc.getText();
					String evObj = NewWineDialog.this.eventObj.getText();
					String evPrice = NewWineDialog.this.eventPrice.getText();
					String evVat = NewWineDialog.this.eventVat.getText();
					String evDost = NewWineDialog.this.eventDost.getText();
					String evStatus = NewWineDialog.this.eventStatus.getText();
					
					Date evDostawa;
					int evRok;
					
					evRok = Integer.parseInt(evYear);
					
					try {
						
						 SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
						 evDostawa = formatter.parse(evDost);
					}
					catch(Exception e) {
						JOptionPane.showMessageDialog(null, "Data w podanym formacie nie jest poprawna!");
						return;
					}
					
					
					Wine w = new Wine(evId,evAval,evName,new Country(evContr, evCont),evCol,evTaste,evRok,evAlc,evObj,new Price(evPrice,evVat),new Shipment(evStatus,evDostawa));
					System.out.println("Adding new wine = " + w.toString());
					WineManager.getInstance().addNewWine(w);
					

					dispose();
					
					
				}
			});
			okButton.setActionCommand("Create New Wine");
			buttonPane.add(okButton);
			getRootPane().setDefaultButton(okButton);
		}
	
	setResizable(false);
}
	
}
