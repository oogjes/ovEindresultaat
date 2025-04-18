package ovSysteem;

public class ovKaart
{
    public static ovApparaat plaatsPoort = new ovApparaat();

    // Saldo van het ov
    public double saldo;
    public String name;
    public String plaats;
    public boolean ingecheckt;

    // Method voor de saldo
    public void setSaldo(double newSaldo)
    {
	saldo = newSaldo;
    }

    public double getSaldo()
    {
	return saldo;
    }

    // Method voor de naam
    public void setName(String newName)
    {
	name = newName;
    }

    // Method voor inchecken
    public void setIngecheckt(Boolean newIngecheckt)
    {
	ingecheckt = newIngecheckt;
    }

    // Method voor de plaats
    public void setPlaats(String newPlaats)
    {
	plaats = newPlaats;
    }
}
