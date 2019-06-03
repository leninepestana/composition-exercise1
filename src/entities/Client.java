package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	private String clientName;
	private String clientEmail;
	private Date clientBirthDate;
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Client() {
		
	}

	public Client(String clientName, String clientEmail, Date clientBirthDate) {
		this.clientName = clientName;
		this.clientEmail = clientEmail;
		this.clientBirthDate = clientBirthDate;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientEmail() {
		return clientEmail;
	}

	public void setClientEmail(String clientEmail) {
		this.clientEmail = clientEmail;
	}

	public Date getClientBirthDate() {
		return clientBirthDate;
	}

	public void setClientBirthDate(Date clientBirthDate) {
		this.clientBirthDate = clientBirthDate;
	}
	
	@Override
	public String toString() {
		return "Client: " + clientName + "(" + sdf.format(clientBirthDate) + ")" + " - " + clientEmail;
			
	}
	
}