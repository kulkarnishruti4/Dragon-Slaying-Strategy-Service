package independently.varying.algorithm.main;

import independently.varying.algorithm.entity.DragonSlayer;
import independently.varying.algorithm.strategy.impl.CrossbowStrategy;
import independently.varying.algorithm.strategy.impl.MeleeStrategy;
import independently.varying.algorithm.strategy.impl.SpellStrategy;

public class App {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(Constants.GREEN_DRAGON_SPOTTED);
		DragonSlayer dragonSlayer = new DragonSlayer(new MeleeStrategy());
		dragonSlayer.goToBattle();
		
		Thread.sleep(1000);
		System.out.println(Constants.RED_DRAGON_EMERGES);
		dragonSlayer.changeStrategy(new CrossbowStrategy());
		dragonSlayer.goToBattle();
		
		Thread.sleep(1000);
		System.out.println(Constants.BLACK_DRAGON_LANDS);
		dragonSlayer.changeStrategy(new SpellStrategy());
		dragonSlayer.goToBattle();
		
	}

}
