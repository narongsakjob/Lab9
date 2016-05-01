

public class UnitConverter {
	
	/**
	 * 
	 * @param amount value of unit
	 * @param fromUnit before unit
	 * @param toUnit after unit
	 * @return result calculate your unit
	 */
	public double convert(double amount,Unit fromUnit,Unit toUnit){
		
		double result = amount*fromUnit.getValue();
			result/=toUnit.getValue();
		return result;
	
	
	}
	/**
	 * 
	 * @return Length unit
	 */
	public Unit[] getUnit(){
		return Length.values();
	}
	
	
}
