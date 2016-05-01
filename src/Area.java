public enum Area implements Unit{
	METER("Square Meter" ,Math.pow(1.0,2)),
	KILOMETER("Square Kilometer" , Math.pow(1000.0,2)),
	MILE("Square Mile" , Math.pow(1609.344,2)),
	FOOT("Square Foot" , Math.pow(0.3048,2)),
	WA("Square Wa" , Math.pow(2.0,2)),
	CENTIMETER("Square Centimeter" , Math.pow(0.01,2));

	public final String name;
	public final double value;
	/**
	 * 
	 * @param name inherited name
	 * @param value inherited inherited
	 */
	private Area(String name , double value){
		this.name = name;
		this.value = value;
		
	}
	/**
	 * @return value
	 */
	public double getValue() {
		return value;
	}
	/**
	 * @return name 
	 */
	 public String toString(){
		 return name ;
	 }
}
