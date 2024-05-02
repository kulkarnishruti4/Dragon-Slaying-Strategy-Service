package independently.varying.algorithm.entity;

import independently.varying.algorithm.strategy.DragonSlayingStrategy;

public class DragonSlayer {
	
	
	private DragonSlayingStrategy dragonSlayingStrategy;
	
	public DragonSlayer(DragonSlayingStrategy dragonSlayingStrategy) {
		this.dragonSlayingStrategy = dragonSlayingStrategy;
	
	}
	
	public void changeStrategy (DragonSlayingStrategy dragonSlayingStrategy) {
		this.dragonSlayingStrategy = dragonSlayingStrategy;
		
	}
	
	public void goToBattle() {
		dragonSlayingStrategy.execute();
	}
}
