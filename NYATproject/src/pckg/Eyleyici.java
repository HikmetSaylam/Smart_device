package pckg;

public class Eyleyici implements IEyleyici
{
	private boolean acikMi;
	
	public Eyleyici() 
	{
		this.acikMi=false;
	}
	
	public void sogutucuAc() 
	{
		if(!acikMi)
		{
			System.out.println("Sogutucu aciliyor");
			acikMi=true;
			return;
		}
		System.out.println("Sogutucu zaten acik");
	}
	
	public void sogutucuKapat() 
	{
		if(acikMi)
		{
			System.out.println("Sogutucu kapaniyor");
			acikMi=false;
			return;
		}
		System.out.println("Sogutucu zaten kapal�");
	}
	

}
