package pckg;

public class SicaklikAlgilayiciFactory 
{
	private SicaklikAlgilayici sicaklikAlgýlayýcý;
	
	public SicaklikAlgilayiciFactory() 
	{
		this.sicaklikAlgýlayýcý= new SicaklikAlgilayici();
	}

	public SicaklikAlgilayici getSicaklikAlgilayici()
	{
		return sicaklikAlgýlayýcý;
	}
}
