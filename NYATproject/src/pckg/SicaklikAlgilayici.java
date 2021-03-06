package pckg;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SicaklikAlgilayici implements ISubject
{
	private List<IObserver> subscribers = new ArrayList<>();
	private int sicaklik;
	public SicaklikAlgilayici() 
	{
		this.sicaklik=0;
	}
	public int getSicaklik() 
	{
		Random random=new Random();
		sicaklik=random.nextInt(60);
		notify("sicaklik degerimiz: "+sicaklik);
		return sicaklik;
	}
	@Override
	public void attach(IObserver o) 
	{
		subscribers.add(o);
		
	}
	@Override
	public void detach(IObserver o) 
	{
		subscribers.remove(o);
		
	}
	@Override
	public void notify(String m) 
	{
		for(IObserver subscriber: subscribers) {
            subscriber.update(m);
        }
		
	}
	
}
