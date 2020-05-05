package progetto.iniziale;

/**
* @brief classe JSlot
*/
public class JSlot {

	/* Attributi */
    	private Date orario; //ora di inizio dello slot di tempo
	private Boolean spesaFatta; //boolean per cui true = spesa giá fatta, false = spesa da fare al momento
	private JCliente cliente; //cliente a cui é assegnato lo slot
	
	/* Metodi */
	public JSlot();
	public JSlot(Date orario, Boolean spesaFatta, JCliente cliente);
	
	public Date getDataInizio(); //return orario;
	public Date getDataFine(); //aggiunge tempo a getDataInizio in base a spesaFatta
	
	public JCliente getCliente();
}
