package xmlproject.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
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

public class EditWineDialog extends JDialog 
{

	Wine editWine = null;
	
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
	
	public EditWineDialog(final String selectedWineId) 
	{
		
	
	editWine =  WineManager.getInstance().getWineById(selectedWineId);
	
	
	
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
	
	eventId = new JTextField(editWine.getId());
	eventId.setBounds(200, 11, 260, 20);
	contentPanel.add(eventId);
	
	//		description;
	JLabel lblAvail = new JLabel("Dostepoœæ (yes|no)");
	lblAvail.setBounds(15, 44, 147, 14);
	contentPanel.add(lblAvail);
	
	eventAvail = new JTextField(editWine.getAvailable());
	eventAvail.setBounds(200, 41, 260, 20);
	contentPanel.add(eventAvail);
	
	//		location;		
	JLabel lblName = new JLabel("Nazwa");
	lblName.setBounds(15, 74, 147, 14);
	contentPanel.add(lblName);
	
	eventName = new JTextField(editWine.getName());
	eventName.setBounds(200, 71, 260, 20);
	contentPanel.add(eventName);
	
	//		location2;		
	JLabel lblCountry = new JLabel("Kraj");
	lblCountry.setBounds(15, 104, 147, 14);
	contentPanel.add(lblCountry);
	
	eventContr = new JTextField(editWine.getCountry().getValue());
	eventContr.setBounds(200, 101, 260, 20);
	contentPanel.add(eventContr);
	
	//		location;		
	JLabel lblCont = new JLabel("Kontynent");
	lblCont.setBounds(15, 134, 147, 14);
	contentPanel.add(lblCont);
	
	eventCont = new JTextField(editWine.getCountry().getCont());
	eventCont.setBounds(200, 131, 260, 20);
	contentPanel.add(eventCont);
	
	//		location;		
	JLabel lblColor = new JLabel("Kolor");
	lblColor.setBounds(15, 164, 147, 14);
	contentPanel.add(lblColor);
	
	eventCol = new JTextField(editWine.getColor());
	eventCol.setBounds(200, 161, 260, 20);
	contentPanel.add(eventCol);
	
	//		location;		
	JLabel lbltaste = new JLabel("Smak");
	lbltaste.setBounds(15, 194, 147, 14);
	contentPanel.add(lbltaste);
	
	eventTaste = new JTextField(editWine.getTaste());
	eventTaste.setBounds(200, 191, 260, 20);
	contentPanel.add(eventTaste);
	
	//		location;		
	JLabel lblYear = new JLabel("Rok");
	lblYear.setBounds(15, 224, 147, 14);
	contentPanel.add(lblYear);
	
	eventYear = new JTextField(editWine.getYear());
	eventYear.setBounds(200, 221, 260, 20);
	contentPanel.add(eventYear);
	
	//		location;		
	JLabel lblAlc = new JLabel("Alkohol ( %)");
	lblAlc.setBounds(15, 254, 147, 14);
	contentPanel.add(lblAlc);
	
	eventAlc = new JTextField(editWine.getAlcohol());
	eventAlc.setBounds(200, 251, 260, 20);
	contentPanel.add(eventAlc);
	
	//		location;		
	JLabel lblObj = new JLabel("Objêtoœæ");
	lblObj.setBounds(15, 284, 147, 14);
	contentPanel.add(lblObj);
	
	eventObj = new JTextField(editWine.getVolume());
	eventObj.setBounds(200, 281, 260, 20);
	contentPanel.add(eventObj);
	
	//		location;		
	JLabel lblPrice = new JLabel("Cena");
	lblPrice.setBounds(15, 314, 147, 14);
	contentPanel.add(lblPrice);
	
	eventPrice = new JTextField(editWine.getPirce().getValue());
	eventPrice.setBounds(200, 311, 260, 20);
	contentPanel.add(eventPrice);
	
	//		location;		
	JLabel lblVat = new JLabel("VAT");
	lblVat.setBounds(15, 344, 147, 14);
	contentPanel.add(lblVat);
	
	eventVat = new JTextField(editWine.getPirce().getVat());
	eventVat.setBounds(200, 341, 260, 20);
	contentPanel.add(eventVat);
	
	//		location;		
	JLabel lblDost = new JLabel("Dostawa");
	lblDost.setBounds(15, 374, 147, 14);
	contentPanel.add(lblDost);
	
	//LocalDate eventStartDate = LocalDate.now();
	
	//LocalDate startDate = eventStartDate;
	eventDost = new JTextField(editWine.getShipment().getText().toString());
	eventDost.setBounds(200, 371, 260, 20);
	contentPanel.add(eventDost);
	
	
	//		location;		
	JLabel lblStatus = new JLabel("Status (ontime|delayed)");
	lblStatus.setBounds(15, 404, 147, 14);
	contentPanel.add(lblStatus);
	
	eventStatus = new JTextField(editWine.getShipment().getStatus());
	eventStatus.setBounds(200, 401, 260, 20);
	contentPanel.add(eventStatus);
	

	
		
		JPanel buttonPane = new JPanel();
		buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER));
		getContentPane().add(buttonPane, BorderLayout.SOUTH);
		{
			JButton okButton = new JButton("Update New Wine");
			okButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0)
				{
					if(EditWineDialog.this.eventId.getText().isEmpty() ||
							EditWineDialog.this.eventName.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "ID i Nazwa nie mog¹ byc puste");
						return;
					}
					
					String evId = EditWineDialog.this.eventId.getText();
					String evAval = EditWineDialog.this.eventAvail.getText();
					String evName = EditWineDialog.this.eventName.getText();
					String evContr = EditWineDialog.this.eventContr.getText();
					String evCont = EditWineDialog.this.eventCont.getText();
					String evCol = EditWineDialog.this.eventCol.getText();
					String evTaste = EditWineDialog.this.eventTaste.getText();
					String evYear = EditWineDialog.this.eventYear.getText();
					String evAlc = EditWineDialog.this.eventAlc.getText();
					String evObj = EditWineDialog.this.eventObj.getText();
					String evPrice = EditWineDialog.this.eventPrice.getText();
					String evVat = EditWineDialog.this.eventVat.getText();
					String evDost = EditWineDialog.this.eventDost.getText();
					String evStatus = EditWineDialog.this.eventStatus.getText();
					
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
					
					
					
					WineManager.getInstance().getWineById(selectedWineId).setId(evId);
					WineManager.getInstance().getWineById(selectedWineId).setAvailable(evAval);
					WineManager.getInstance().getWineById(selectedWineId).setName(evName);
					WineManager.getInstance().getWineById(selectedWineId).setCountry(new Country(evContr, evCont));
					WineManager.getInstance().getWineById(selectedWineId).setColor(evCol);
					WineManager.getInstance().getWineById(selectedWineId).setTaste(evTaste);
					WineManager.getInstance().getWineById(selectedWineId).setYear(evRok);
					WineManager.getInstance().getWineById(selectedWineId).setAlcohol(evAlc);
					WineManager.getInstance().getWineById(selectedWineId).setVolume(evObj);
					WineManager.getInstance().getWineById(selectedWineId).setPirce(new Price(evPrice,evVat));
					WineManager.getInstance().getWineById(selectedWineId).setShipment(new Shipment(evStatus,evDostawa));
					
					System.out.println("updating wine");
					
					

					dispose();
					
					
				}
			});
			okButton.setActionCommand("Update Wine");
			buttonPane.add(okButton);
			getRootPane().setDefaultButton(okButton);
		}
	
	setResizable(false);
	
	
	
	
	}

}
