package pckg;

public class SicaklikAlgilayiciFactory 
{
	private SicaklikAlgilayici sicaklikAlg�lay�c�;
	
	public SicaklikAlgilayiciFactory() 
	{
		this.sicaklikAlg�lay�c�= new SicaklikAlgilayici();
	}

	public SicaklikAlgilayici getSicaklikAlgilayici()
	{
		return sicaklikAlg�lay�c�;
	}
}
