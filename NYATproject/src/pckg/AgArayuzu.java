package pckg;

public class AgArayuzu 
{
	DB db = new DB();
	private IAnaIslemPlatformu aip;
	AnaIslemPlatformu anaIslemPlatformu=new AnaIslemPlatformu();
	
	public AgArayuzu() 
	{
		aip=new AnaIslemPlatformu();
	}
	
	public boolean kullaniciDogrula(String isim)
	{
		return db.isimDogrula(isim);
	}
	
	public boolean kullanicSifreiDogrula(String isim,String pass)
	{
		return db.sifreSorgula(isim, pass);
	}
	
	public void sogutucuAc()
	{
		aip.sogutucuAc();
	}
	
	public void sogutucuKapat()
	{
		aip.sogutucuKapat();
	}
	
	public int sicaklikGoruntule()
	{
		return aip.sicaklikGoruntule();
	}
	
	
	
	
}
