package ovSysteem;

import java.util.Scanner;

public class uitcheckPoortje
{
    private String plaats;

    // Method voor de plaats
    public void vraagPlaats(ovKaart o, Scanner scanner)
    {
	System.out.println("Waar wilt u uitchecken?");
	System.out.println("1. Arnhem");
	System.out.println("2. Utrecht");
	System.out.println("3. Venlo");
	System.out.print("Maak een keuze (1, 2, of 3): ");
	int keuze = scanner.nextInt();

	// Plaats voor de keuze
	if (keuze == 1)
	{
	    plaats = "Arnhem";
	} else if (keuze == 2)
	{
	    plaats = "Utrecht";
	} else if (keuze == 3)
	{
	    plaats = "Venlo";
	} else
	{
	    System.out.println("Ongeldige keuze.");
	    return;
	}

	// Voer het uitchecken uit
	Uitchecken(o);
    }

    public void Uitchecken(ovKaart o)
    {
	double prijs = 0;

	// Kies prijs vvoor elke plaats
	if (plaats.equals("Arnhem"))
	{
	    prijs = 2.5;
	} else if (plaats.equals("Utrecht"))
	{
	    prijs = 3.0;
	} else if (plaats.equals("Venlo"))
	{
	    prijs = 3.5;
	}

	// Haalt de prijs eraf van uitchecken
	o.setSaldo(o.getSaldo() - prijs);
	
	//Reiziger is niet meer ingecheckt
	o.setIngecheckt(false);

	// Na uitchecken
	System.out.println("Uitgecheckt bij " + plaats + "! Kosten: €" + prijs);
	System.out.println("Huidig saldo: €" + o.getSaldo());
    }
}
