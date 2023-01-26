
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Person 
{
    // instance variables
    private String id;
    private String name;
    private String email;
    
    /*************************************************************************************************
     * Constructors
     ************************************************************************************************/
    
     /**
     * Constructor for objects of class Person
     */
    public Person(String id, String name)
    {
        // initialise instance variables
        //setId(id);
        //setName(name);
    }
    
    /**
     * Constructor for objects of class Person
     */
    public Person(String id, String name, String email)
    {
        // initialise instance variables
        //setId(id);
        //setName(name);
        //setEmail(email);
    }

    /*************************************************************************************************
     * Acsessors
     ************************************************************************************************/
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getId(){return id;}
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getName(){return name;}
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getEmail(){return email;}

    /*************************************************************************************************
     * Mutators
     ************************************************************************************************/
     
    // /**
     // * An example of a method - replace this comment with your own
     // *
     // * @param  y  a sample parameter for a method
     // * @return    the sum of x and y
     // */
    // public void setId(String id){
        // if(isValidId(id)){
            // this.id = id;
        // }else{
            // throw new IllegalArgumentException("Invalid ID.");
        // }
    // }

    /**
     * Mutator - validate firstname an instance varible
     * @param firstName - a string varible representing a first name
     */
    public void setFirstName(String firstName )
    {
        if (firstName.matches("[A-Za-z\t \n 0B \f \r]+")) {
            this.name = name;
        }else{
            throw  new  IllegalArgumentException("Your name should only have letters or spaces.");
        }      
    }
    
    // /**
     // * An example of a method - replace this comment with your own
     // *
     // * @param  y  a sample parameter for a method
     // * @return    the sum of x and y
     // */
    // public String setEmail(String email)
    // {
        // if(email.matches("")){
        
        // }
    // }
    
    /*
     * 
     */
    public abstract Boolean isValidId(String id);
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String toString()
    {
        return "";
    }

    public void test()
}
