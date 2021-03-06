package pckg;

public class AnaIslemPlatformu implements IAnaIslemPlatformu,IObserver
{

	private IEyleyici eyleyici;
	private SicaklikAlgilayici sicaklikAlgilayici;
	
	public AnaIslemPlatformu() 
	{
		this.eyleyici=new Eyleyici();
		SicaklikAlgilayiciFactory sicaklikAlgilayiciFactory=new SicaklikAlgilayiciFactory();
		this.sicaklikAlgilayici=sicaklikAlgilayiciFactory.getSicaklikAlgilayici();
		sicaklikAlgilayici.attach(this);
	}
	@Override
	public void sogutucuAc() 
	{
		this.eyleyici.sogutucuAc();
	}

	@Override
	public void sogutucuKapat() 
	{
		this.eyleyici.sogutucuKapat();
	}

	@Override
	public int sicaklikGoruntule() 
	{
		return this.sicaklikAlgilayici.getSicaklik();
	}
	@Override
	public void update(String s) 
	{
		System.out.println(s);
		
	}
	
}
