package independently.varying.algorithm.main;

import java.util.logging.Logger;

import independently.varying.algorithm.strategy.DragonSlayingStrategy;

public class StrategySelector {
	
	static Logger LOGGER = Logger.getLogger(StrategySelector.class.getName());

	  /**
	   * Enum to demonstrate strategy pattern.
	   */
	  public enum Strategy implements DragonSlayingStrategy {
		  
	    MeleeStrategy(() -> LOGGER.info(
	        "With your Excalibur you sever the dragon's head!")),
	    
	    CrossbowStrategy(() -> LOGGER.info(
	        "You shoot the dragon with the magical crossbow and it falls dead on the ground!")),
	    
	    SpellStrategy(() -> LOGGER.info(
	        "You cast the spell of disintegration and the dragon vaporizes to a pile of dust!"));

	    private final DragonSlayingStrategy dragonSlayingStrategy;

	    Strategy(DragonSlayingStrategy dragonSlayingStrategy) {
	      this.dragonSlayingStrategy = dragonSlayingStrategy;
	    }

	    @Override
	    public void execute() {
	      dragonSlayingStrategy.execute();
	    }
	  }
	}
