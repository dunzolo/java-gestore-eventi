package org.lesson.java.obj;

import java.time.LocalDate;

public class Evento {
	private String titolo;
	private LocalDate data;
	private int num_posti_totale;
	private int num_posti_prenotati;
	
	public Evento(String titolo, LocalDate data, int num_posti_totale) throws Exception {
		
		setTitolo(titolo);
		setData(data);
		setNumPostiTotale(num_posti_totale);
		this.num_posti_prenotati = 0;
		
	}

	//get e set
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) throws Exception {
		
		//creo eccezione per verificare che la data non sia già passata
		if(data.isBefore(LocalDate.now())) {
			throw new Exception("Non si può inserire una data già passata!");
		}
		this.data = data;
	}
	public int getNumpostiTotale() {
		return num_posti_totale;
	}
	private void setNumPostiTotale(int num_posti_totale) throws Exception {
		
		//creo eccezione per il numero totale di posti che deve essere positivo
		if(num_posti_totale <= 0) {
			throw new Exception("Non si può inserire un numero totale di posti minore o uguale a 0");
		}
		
		this.num_posti_totale = num_posti_totale;
	}
	public int getNumPostiPrenotati() {
		return num_posti_prenotati;
	}
	
	//metodo per stampare tutti gli attributi
	protected String getEventoToString() {
		return "Titolo: " + getTitolo() 
			+ "\nData: " + getData()
			+ "\nNumero posti totali: " + getNumpostiTotale()
			+ "\nNumero posti prenotati: " + getNumPostiPrenotati();
	}
	
	@Override
	public String toString() {
		return "(E)\n" + getEventoToString() + "\n-----------------";
	}
}
