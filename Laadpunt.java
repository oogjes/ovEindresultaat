package ovSysteem;

import java.util.Scanner;

public class Laadpunt
{
    private ovKaart ov;

    public Laadpunt(ovKaart ov)
    {
	this.ov = ov;
    }

    public void menu(ovKaart o, Scanner scanner)
    {
	// Laat keuzes zien
	System.out.println("Opwaarderen apparaat menu");
	System.out.println("1. Saldo bekijken");
	System.out.println("2. Opwaarderen");
	System.out.print("Maak een keuze (1 of 2): ");

	// Laat reziger keuze maken
	int keuze = scanner.nextInt();

	// Voert de keuze uit
	if (keuze == 1)
	{
	    System.out.println("Huidig saldo: €" + o.getSaldo());
	} else if (keuze == 2)
	{
	    System.out.print("Voer bedrag in om op te waarderen: €");
	    double bedrag = scanner.nextDouble();
	    if (bedrag > 0)
	    {
		o.setSaldo(o.getSaldo() + bedrag);
		System.out.println("Opwaarderen gelukt! Nieuw saldo: €" + o.getSaldo());
	    } else
	    {
		System.out.println("Ongeldig bedrag/keuze.");
	    }
	}
    }
}
