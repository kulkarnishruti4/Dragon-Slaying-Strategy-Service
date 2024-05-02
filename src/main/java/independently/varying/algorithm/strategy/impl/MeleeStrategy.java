package independently.varying.algorithm.strategy.impl;

import java.util.logging.Logger;

import independently.varying.algorithm.strategy.DragonSlayingStrategy;

public class MeleeStrategy implements DragonSlayingStrategy {
	
	Logger log = Logger.getLogger(MeleeStrategy.class.getName());

	@Override
	public void execute() {
		
		log.info("With your Excalibur you sever the dragon's head!");
		
	}
	
	

}
