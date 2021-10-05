/**
 * Data of a person, should be stored in an arraylist in another class somewhere to keep adding more people
 *
 * Graham Gee
 * 4 October 2021
 */
public class Person
{
    String name, firstDose, secondDose;
    byte age;
    //Someone else should declare this somewhere for use in the gui so it all looks the same
    //public static final String VACCINES[] = {"Pfizer", "Moderna", "Astra Zeneca", "Johnson & Johnson"};
    boolean firstDoseRecieved, secondDoseRecieved, secondDoseRequired;
    
    //Default constructor
    public Person() {
    
        this.name = "N/A";
        this.firstDose = "N/A";
        this.secondDose = "N/A";
        this.age = 0;
        this.firstDoseRecieved = false;
        this.secondDoseRecieved = false;
        this.secondDoseRequired = false;
    
    }
    
    //Takes in Name, Age, Has first Dose been recieved, first dose, is second dose required,
    //Has second dose been received, second dose
    //In that order
    public Person(String n,  byte a,boolean fDR,String fD, boolean sDRequired, boolean sDR, String sD) {
    
        this.name = n;
        this.firstDose = fD;
        this.secondDose = sD;
        this.age = a;
        this.firstDoseRecieved = fDR;
        this.secondDoseRecieved = sDR;
        this.secondDoseRequired = sDRequired;
    
    }
    
    public Person(String n,  byte a,boolean fDR,String fD, boolean sDRequired) {
    
        this.name = n;
        this.firstDose = fD;
        this.secondDose = "";
        this.age = a;
        this.firstDoseRecieved = fDR;
        this.secondDoseRecieved = false;
        this.secondDoseRequired = sDRequired;
    
    }
    
    public String toString() {
    
        if(this.secondDoseRecieved = true) {
        
            return "Name: " + this.name + "\nAge: " + age + "\nHas first dose been recieved: " + this.firstDoseRecieved + 
                    "\nFirst Dose: " + this.firstDose + "\nHas second dose been recieved: " + this.secondDoseRecieved + 
                    "\nSecond Dose: " + this.secondDose;
        
        } else if(age < 12){
        
            return "Not Eligible";
        
        } else if(secondDoseRequired == false) {
        
            return "Name: " + this.name + "\nAge: " + age + "\nHas first dose been recieved: " + this.firstDoseRecieved + 
                    "\nFirst Dose: " + this.firstDose;
        
        } else {
        
            return "Name: " + this.name + "\nAge: " + age + "\nHas first dose been recieved: " + this.firstDoseRecieved + 
                    "\nFirst Dose: " + this.firstDose + "\nHas second dose been recieved: " + this.secondDoseRecieved;    
        
        }
    }
}
