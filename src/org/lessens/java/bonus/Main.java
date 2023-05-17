package org.lessens.java.bonus;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.lesson.java.obj.Concerto;
import org.lesson.java.obj.Evento;
import org.lesson.java.obj.ProgrammaEventi;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Evento evento = null;
		Concerto concerto = null;
		
		List<Evento> eventi = new ArrayList<>();
		
		int contatore = 0;
		
		System.out.print("Inserisci il titolo del programma: ");
		String titolo_programma = sc.nextLine();
		
		System.out.print("Quante prenotazioni vuoi effettuare? ");
		int prenotazioni = sc.nextInt();
		sc.nextLine();
		
		while(contatore < prenotazioni) {	
			
			System.out.print("Inserisci il titolo dell'evento: ");
			String titolo = sc.nextLine();
			
			System.out.print("Inserisci la data dell'evento: ");
			LocalDate data = LocalDate.parse(sc.nextLine());
			
			System.out.print("Inserisci il numero totale di posti: ");
			int num_posti_totale = sc.nextInt();
			sc.nextLine();
			
			//verifico se i dati inseriti dall'utente sono corretti
			try {
				evento = new Evento(titolo, data, num_posti_totale);
				eventi.add(evento);
				
			} catch(Exception e) {
				System.err.println("Errore!\n" + e.getMessage());
			}
			
			contatore++;
			
		}
		
		ProgrammaEventi programma = new ProgrammaEventi(titolo_programma, eventi);
		
		//un metodo che svuota la lista di eventi
		//eventi.removeAll(eventi);
		
		//metodo che restituisce quanti eventi sono presenti nel programma
		System.out.println(programma);
	}
}
