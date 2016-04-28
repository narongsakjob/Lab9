
public class UnitConverter {
	public double convert(double amount,Unit fromUnit,Unit toUnit){
		
		double result = amount*fromUnit.getValue();
			result/=toUnit.getValue();
		return result;
	
	
	}
	public Unit[] getUnit(){
		return Length.values();
	}
	
}
