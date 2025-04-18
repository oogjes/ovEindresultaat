package ovSysteem;

public class incheckPoortje
{
    private String plaats;

    public void setPlaats(String newPlaats)
    {
	plaats = newPlaats;
    }

    public void GeldigheidChecken(ovKaart o)
    {
	// Saldo checken voor inchecken
	if (o.getSaldo() >= 3.0)
	{
	    o.setIngecheckt(true);
	    o.setPlaats(plaats);
	    System.out.println("Ingecheckt bij " + plaats);
	} else
	{
	    o.setIngecheckt(false);
	    System.out.println("Error! Niet genoeg saldo.");
	}
    }
}
