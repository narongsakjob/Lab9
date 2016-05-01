public enum UnitType{

	 LENGTH(Length.values()),
	 AREA(Area.values()),
	 WEIGHT(Weight.values()),
	 VOLUME(Volume.values());
	
	 private Unit[] u;
	 /**
	  * 
	  * @param u set value Unit
	  */
	 private UnitType ( Unit[] u){
		 this.u = new Unit[u.length];
		 for(int i=0;i<u.length;i++){
		 this.u[i] = u[i] ;
		 }
		
	 }
	 
	 /**
	  * 
	  * @return unit various
	  */
	 public Unit[] getUnit(){
	  return u;
	 }
	 
	

}
