

public enum Weight implements Unit{
	GRAM("Gram",1.0),
	KILOGRAM("Kilogram",1000.0),
	MILLIGRAM("Milligram",0.001),
	POUND("Pound",453.59237),
	OUNCE("Ounce",28.34952),
	CARAT("Carat",0.199999);
	
	
	public final String name;
	public final double value;
	/**
	 * 
	 * @param name inherited name
	 * @param value inherited value
	 */
	private Weight(String name , double value){
		this.name = name;
		this.value = value;
	}
	/**
	 * return your value
	 */
	public double getValue() {
		return value;
	}
	/**
	 * return your name
	 */
	 public String toString(){
		 return name ;
	 }


}
