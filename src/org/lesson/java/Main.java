package org.lesson.java;

import java.time.LocalDate;
import java.util.Scanner;

import org.lesson.java.obj.Evento;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci il titolo dell'evento");
		String titolo = sc.nextLine();
		
		System.out.println("Inserisci la data dell'evento");
		LocalDate data = LocalDate.parse(sc.nextLine());
		
		System.out.println("Inserisci il numero totale di posti");
		int num_posti_totale = sc.nextInt();
		
		sc.close();
		
		try {
			Evento evento = new Evento(titolo, data, num_posti_totale);
			System.out.println(evento);
			evento.prenota(data, 5);
			System.out.println(evento);
			evento.disdici(data, 4);
			System.out.println(evento);
			
		} catch(Exception e) {
			System.err.println("Errore!\n" + e.getMessage());
		}
		
		
	}
}
