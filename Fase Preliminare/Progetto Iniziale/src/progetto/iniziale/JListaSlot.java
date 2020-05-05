package progetto.iniziale;

import java.util.ArrayList;


/**
* @brief classe JListaSlot
*/
public class JListaSlot {

	/* Attributi */
	private ArrayList<JSlot> slot;
  private Boolean chiuso;
  private Boolean negozioSbarrato;
	
	/* Metodi */
  public JListaSlot();
  
  public void stimaTempi(Boolean spesaFatta); //stima in tempo reale quando si potrebbe inserire lo slot
  
  public void creaSlot(JCliente cliente, Boolean spesaFatta); //crea uno slot, *calcolandosi data e ora in base a quelli presenti*
  public void eliminaSlot(JSlot slot); //elimina un dato slot
  public void impostaSlot(JSlot slot); //imposta uno specifico slot se possibile; da usare ad esempio per cambi di orari
  
  public void rimandaSlot(JSlot slot); //elimina, poi ricrea
  
  public void chiudi(); //rimanda ogni slot da qui fino a input successivo (da usare se capienza massima raggiunta)
  public void apri(); //riapre gli slot
  
  public void rimandaDaA(Date inizio, Date fine); //rimanda ogni slot tra le due date alla data successiva
  
  public void sbarraNegozio(); //elimina tutti gli slot con spesa non fatta e accetta solo quelli con spesa giá fatta (misura di sicurezza)
  public void riapriNegozio(); //permette di nuovo di fare la spesa direttamente nel mercato
  
  public void reset(); //chiudi tutto, cancellando gli slot
  
  public void notificaCliente(Integer tipoNotifica); //notifica il cliente con un dato messaggio, che puó essere, ad esempio: momento dello slot raggiunto - presentarsi al negozio, slot eliminato o modificato, slot aggiunto alla lista
 
