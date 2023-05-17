package org.lesson.java.obj;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Concerto extends Evento{
	
	private LocalTime ora;
	private BigDecimal prezzo;

	public Concerto(String titolo, LocalDate data, int num_posti_totale, LocalTime ora, BigDecimal prezzo) throws Exception {
		super(titolo, data, num_posti_totale);
		
		setPrezzo(prezzo);
		setOra(ora);
	}

	//get e set
	public LocalTime getOra() {
		return ora;
	}
	public void setOra(LocalTime ora) {
		this.ora = ora;
	}
	public BigDecimal getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(BigDecimal prezzo) {
		this.prezzo = prezzo;
	}
	
	//metodo per formattare l'ora
	private String getFormattedLocalTime() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
		return getOra().format(dtf);
	}
	
	//metodo per stampare tutti gli attributi
	protected String getConcertoToString() {
		return "Data e ora: " + getData() + " " + getFormattedLocalTime() 
			+ " - Titolo: " + getTitolo()
			+ " - Prezzo: " + String.format("%.2f", getPrezzo()) + "€";
	}
	
	@Override
	public String toString() {
		return "(C) " + getConcertoToString() + "\n-----------------";
	}
}
