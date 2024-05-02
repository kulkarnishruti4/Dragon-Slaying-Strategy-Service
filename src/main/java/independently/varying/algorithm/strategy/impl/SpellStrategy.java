package independently.varying.algorithm.strategy.impl;

import java.util.logging.Logger;

import independently.varying.algorithm.strategy.DragonSlayingStrategy;

public class SpellStrategy  implements DragonSlayingStrategy {
	
	Logger log = Logger.getLogger(MeleeStrategy.class.getName());

	@Override
	public void execute() {
		
		log.info("You cast the spell of disintegration and the dragon vaporizes to a pile of dust!");
		
	}
	
	

}
