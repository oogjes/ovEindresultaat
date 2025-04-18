package ovSysteem;

import java.util.*;

public class ovApparaat
{
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args)
    {
	// Andere classes
	ovKaart ov = new ovKaart();
	incheckPoortje poort = new incheckPoortje();
	Laadpunt opwaar = new Laadpunt(ov);
	uitcheckPoortje uitcheck = new uitcheckPoortje();

	// Ov plaats, naam en saldo
	poort.setPlaats("Nijmegen");
	ov.setName("Ov-kaart");
	ov.setSaldo(7.0);

	// Checken of ov is ingecheckt
	poort.GeldigheidChecken(ov);

	// Laat saldo zien als nodig
	//System.out.println("Saldo in ov: €" + ov.saldo);
	System.out.println("     ");

	// Opwaardeer menu
	opwaar.menu(ov, scan);

	// Na opwaarderen checken of ov nog ingecheckt is
	System.out.println("     ");
	poort.GeldigheidChecken(ov);

	// Uitchecken menu
	System.out.println("     ");
	uitcheck.vraagPlaats(ov, scan);
    }
}
