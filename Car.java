public class Car extends Vehicle
{
    /**
    * Declaring instance variables - replace the example below with your own
    */
   
    private Fuel petrol;
    private int cc;
    
     /**
     * create contructor and instialise instant variables within the constructor
     */
    
    public Car(String c,String m, String d)
    {
       super (c,m,d);
    }
    
    /**
     * create contructor and instialise instant variables within the constructor
     */
    
      public Car(String c, String m, String d, Fuel p,int engsize)
    {
        super(c,m,d);
        petrol = p;
        cc = engsize;
    }
    
    /**
     * create contructor and instialise instant variables within the constructor
     */
    
    public Car(String hd,String c, String m, String d, Fuel p,int engsize)
    {
        super(c,m,d);
        super.setHomeDepot(hd);
        petrol = p;
        cc = engsize;
    } 
    
     /**
     * set the set method for Fuel
     * this method is a way of using the encapsulated variable outside it's scope
     */
    
    public void setFuel(Fuel p)
    {
        petrol = p;
    }
    
     /**
     * set the set method for home depot
     * this method is a way of using the encapsulated variable outside it's scope
     */
    
    public void setEngSize(int engsize)
    {
       cc = engsize;  
    }
    
    /**
     * set the get method for class Fuel
     * this is a way of adjusting the variable as appropriate
     * in this instance petrol is used as the default setting fuel type 
     */
    
    public Fuel getFuel()
    {

        return petrol;
    }
    
    /**
     * set the get method for engsize
     * this is a way of adjusting the variable as appropriate
     */
    
    public int getEngSize()
    {
        return cc;        
    }
    
      /**
     * set the string mehtod 
     * this allows you to return all variable results in string format
     */
    
    public String toString()
    {
    
        return super.toString() +" "+"Fuel:"+petrol.getFuel()+ " "+"EngineSize:"+ cc + "\n"+"\n";
    }
}
