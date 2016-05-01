

public class UnitFactory {
	
	private static UnitFactory instance = new UnitFactory();
	/**
	 *
	 * @return instance
	 */
	 public UnitFactory getInstance(){
	  return this.instance;
	 }
	 
	 /**
	  * 
	  * @return 
	  */
	 public UnitType[] getUnitTypes(){
	  return UnitType.values();
	 }
	 
	 /**
	  * 
	  * @param type
	  * @return 
	  */
	 public Unit[] getUnits(UnitType type){ 
	  return type.getUnit();
	 }
}
