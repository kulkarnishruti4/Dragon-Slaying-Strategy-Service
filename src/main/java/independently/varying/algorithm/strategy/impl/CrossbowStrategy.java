package independently.varying.algorithm.strategy.impl;

import java.util.logging.Logger;

import independently.varying.algorithm.strategy.DragonSlayingStrategy;

public class CrossbowStrategy  implements DragonSlayingStrategy {
	
	Logger log = Logger.getLogger(MeleeStrategy.class.getName());

	@Override
	public void execute() {
		
		log.info("You shoot the dragon with the magical crossbow and it falls dead on the ground!");
		
	}
	

}
