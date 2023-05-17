package org.lesson.java;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

import org.lesson.java.obj.Concerto;
import org.lesson.java.obj.Evento;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Evento evento = null;
		Concerto concerto = null;
		
		int contatore = 0;
		
		System.out.print("Inserisci il titolo dell'evento: ");
		String titolo = sc.nextLine();
		
		System.out.print("Inserisci la data dell'evento: ");
		LocalDate data = LocalDate.parse(sc.nextLine());
		
		System.out.print("Inserisci il numero totale di posti: ");
		int num_posti_totale = sc.nextInt();
		
		//verifico se i dati inseriti dall'utente sono corretti
		try {
			evento = new Evento(titolo, data, num_posti_totale);
			
		} catch(Exception e) {
			System.err.println("Errore!\n" + e.getMessage());
		}
		
		while(true) {
			
			System.out.println("1 - Vuoi procedere con una nuova prenotazione");
            System.out.println("2 - Esci e stampa evento");
            
            int userVal = sc.nextInt();
            
            if(userVal < 1 || userVal > 2) continue;
            if (userVal == 2) break;
            
            sc.nextLine();
            
			System.out.print("Quante prenotazioni vuoi effettuare? ");
			int prenotazioni = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Inserisci la data dell'evento: ");
			LocalDate data_evento = LocalDate.parse(sc.nextLine());
			
			try {
				while(contatore < prenotazioni) {
					
					System.out.print("Inserisci il numero totale di posti da prenotare: ");
					int num_posti_prenotazione = sc.nextInt();
					sc.nextLine();
					
					evento.prenota(data_evento, num_posti_prenotazione);
					System.out.println("Posti prenotati: " 
										+ evento.getNumPostiPrenotati() + " su " 
										+ evento.getNumpostiTotale() + " disponibili");
					contatore++;
					
				}
			} catch (Exception e) {
				System.err.println("Errore!\n" + e.getMessage());
			}
			
			System.out.println("1 - Vuoi procedere con la cancellazione dei posti");
            System.out.println("2 - Esci e stampa evento");
            
            int userVal1 = sc.nextInt();
            
            if (userVal1 < 1 || userVal1 > 2) continue;
            if (userVal1 == 2) break;
            
            sc.nextLine();
            
			try {
				System.out.print("Quanti posti vuoi canellare? ");
				int canellazioni = sc.nextInt();
				sc.nextLine();
				
				evento.disdici(data, canellazioni);
				System.out.println("Posti prenotati: " 
									+ evento.getNumPostiPrenotati() + " su " 
									+ evento.getNumpostiTotale() + " disponibili");
			} catch (Exception e) {
				System.err.println("Errore!\n" + e.getMessage());
			}
		}
		
		System.out.println(evento);
		
		while(true) {
			
			System.out.println("1 - Vuoi procedere con una nuovo evento");
			System.out.println("2 - Esci e stampa evento");
			int userVal2 = sc.nextInt();
			
			if (userVal2 < 1 || userVal2 > 2 ) continue;
			if (userVal2 == 2) break;
			
			sc.nextLine();
			
			System.out.println("Inserisci il titolo del concentro");
			String titolo_concentro = sc.nextLine(); 
			
		    System.out.println("Inserisci l'ora del concentro");
		    LocalTime ora = LocalTime.parse(sc.nextLine());
		    
		    System.out.println("Inserisci il prezzo del biglietto");
		    BigDecimal prezzo = sc.nextBigDecimal();
		    
			try {			
				concerto = new Concerto(titolo_concentro, data, num_posti_totale, ora, prezzo);				
			} catch (Exception e) {
				System.err.println("Errore!\n" + e.getMessage());
			}
		}
		System.out.println(concerto);
		
	}
}
