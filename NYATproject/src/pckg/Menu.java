package pckg;

import java.util.Scanner;

public class Menu 
{
	Scanner input = new Scanner(System.in);
	AgArayuzu agArayuzu=new AgArayuzu();
	
	public void basla()
	{
		String name;
		String pass;
		do 
		{
			System.out.println("Kullanici adinizi girin: ");
			name=input.nextLine();
		} 
		while (!agArayuzu.kullaniciDogrula(name));
		do 
		{
			System.out.println("Sifrenizi girin: ");
			pass=input.nextLine();
		} 
		while (!agArayuzu.kullanicSifreiDogrula(name,pass));
		Override: while (true)
		{
			System.out.println("1. Sogutucu Ac ");
			System.out.println("2. Sogutucu Kapat ");
			System.out.println("3. Sicaklik goruntule ");
			System.out.println("4. Cikis ");
			switch (input.nextInt()) {
			case 1:
			{
				agArayuzu.sogutucuAc();
				break;
			}
			case 2:
			{
				agArayuzu.sogutucuKapat();
				break;
			}
			case 3:
			{
				System.out.println(agArayuzu.sicaklikGoruntule());
				break;
			}
			case 4:
			{
				System.out.println("Programdan cikilmistir");
				break Override;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + input.nextInt());
			}
			
		}
		
	}
}
