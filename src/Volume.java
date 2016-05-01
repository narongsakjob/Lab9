

public enum Volume implements Unit{

	CUBICMETER("Cubic Meter" ,1.0),
	CUBICCENTIMETER("Cubic Centimeter" , 0.000001),
	CUBICINCH("Cubic Inch" , 0.000016),
	CUBICFOOT("Cubic Foot" , 0.028),
	CUBICWA("Cubic Wa" , 7.999999),
	LITER("Liter" , 0.01);
	
	
	public final String name;
	public final double value;
	/**
	 * 
	 * @param name inherited name
	 * @param value inherited inherited
	 */
	 private Volume(String name,double value){
		 this.name = name;
		this.value = value;
	 }
	 
	 /**
	  * @return value
	  */
	 public double getValue(){
		 return value;
	 }
	 
	 /**
	  * @return name
	  */
	 public String toString(){
		 return name ;
	 }

}
