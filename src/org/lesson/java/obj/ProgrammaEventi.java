package org.lesson.java.obj;

import java.util.List;

public class ProgrammaEventi {
	private String titolo;
	private List<Evento> eventi;
	
	public ProgrammaEventi(String titolo, List<Evento> eventi) {
		setTitolo(titolo);
		setEventi(eventi);
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public List<Evento> getEventi() {
		return eventi;
	}

	public void setEventi(List<Evento> eventi) {
		this.eventi = eventi;
	}
	
	@Override
	public String toString() {
		return "(PE) " + getTitolo() + getEventi() +"\n-----------------";
	}
}	
