class BloodData{
    private String bloodType;
    private String rhFactor;

	public BloodData(){
        bloodType = "O";
        rhFactor = "+";
    }
    
    public void setBloodType(String newbt){
        bloodType = newbt;
        
    }
    public void setRhFactor(String newrh){
        rhFactor = newrh;
        
    }
    
    public String getBloodType(){
    	return bloodType;
    	}
    	
	public String getRhFactor(){
    	return rhFactor;
    	}
    	
    public void display(){
    	System.out.println(getBloodType() + getRhFactor() + " is added to the blood bank.");
    }
}