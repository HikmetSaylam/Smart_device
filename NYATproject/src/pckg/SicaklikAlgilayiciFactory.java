package pckg;

public class SicaklikAlgilayiciFactory 
{
	private SicaklikAlgilayici sicaklikAlgılayıcı;
	
	public SicaklikAlgilayiciFactory() 
	{
		this.sicaklikAlgılayıcı= new SicaklikAlgilayici();
	}

	public SicaklikAlgilayici getSicaklikAlgilayici()
	{
		return sicaklikAlgılayıcı;
	}
}
