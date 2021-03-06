public class RentableCar extends Car implements Rentable
{
    // instance variables - replace the example below with your own
    private Date returnDate;
    private boolean rented;
    
    public RentableCar(String c, String m, String d)
    {
       super (c,m,d);

    }
    
    public RentableCar(String c,String m, String d, Fuel p, int engsize)
    {
        super(c,m,d,p,engsize);
        rented = false;
    } 
        
    public RentableCar(String hd,String c,String m, String d, Fuel p, int engsize)
    {
        super(hd,c,m,d,p,engsize);
        super.setHomeDepot(hd);
        rented = false;
    } 
    
    public boolean pickUp(Date d)
    {
        returnDate = d;
        if (toString()!= null && returnDate!= null){
            rented = true;
            return rented;
        
        }
        return false;
    }
        
    public boolean isRented()
    {
        if (toString()!= null && rented == true && returnDate != null){
            return rented;//date.equals(date);
        }
        return false;
    }
    
    public Date getReturnDate()
    {
        if (toString()!= null && rented == true){

        return returnDate;
    }
        else{return null;}
  }
    
    
    public void dropOff()
     {
         returnDate = null;
         rented = false;
     }
     
     public String toString()
     {
         return super.toString() +" "+"RentedCar:" + rented +" "+ "ReturnDate:"+ returnDate;
         
     } 
      
}
