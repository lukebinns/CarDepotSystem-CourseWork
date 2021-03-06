public abstract class Vehicle
{
    /**
    * Declaring instance variables - replace the example below with your own
    */
    private  String code;
    private  String HomeDepot;
    private  String make;
    private  String serviceDate;

     /**
     * Instialise instant variables within the constructor
     */
    public Vehicle(String c, String m, String d)
    {
       code = c;
       this.HomeDepot = "No Depot";
       make = m;
       serviceDate = d;

    }
    
     /**
     * set the set method for home depot
     * this method is a way of using the encapsulated variable outside it's scope
     */

    public void setHomeDepot(String hd)
    {

         HomeDepot = hd;
    }
    
    /**
     * set the get method for home depot
     * this is a way of adjusting the variable as appropriate
     */
    
    public String getHomeDepot(){
    
        return HomeDepot;
    
    }
    
     /**
     * set the get method for make
     * this method is a way of using the encapsulated variable outside it's scope
     * this variable only has a get method to keep inline with the specifications
     */
    
    public String getMake(){
    
        return make;
    }
    
    /**
     * set the get method for serviceDate
     * this method is a way of using the encapsulated variable outside it's scope
     * this variable only has a get method to keep inline with the specifications
     */
    
    public String getDate(){
    
        return serviceDate;
    }
    
    /**
     * set the get method for code
     * this method is a way of using the encapsulated variable outside it's scope
     * this variable only has a get method to keep inline with the specifications
     */
    
    public String getCode()
    {
        return code;
    }
    
    /**
     * set the string mehtod 
     * this allows you to return all variable results in string format
     */
    
    public String toString(){
    
       return "Depot:"+ getHomeDepot() + " " + "Code:"+ code+ " "+ "Make:" + make + " " +"Service Date:"+ serviceDate ;
    }
}
