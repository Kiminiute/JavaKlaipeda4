package advanced.collections.inxeritance.vehicleExample.javaDeveloperExample;

public class Developer extends Person {

    protected int ageOfExperience;
    protected String name;


    public Developer (String name, int ageOfExperience){
        super(name);
        this.ageOfExperience = ageOfExperience;
    }

    public String displayInfo(){
        return ( "Java developer'io vardas yra:" + displayName() + ", " + "metu patirtis:" + ageOfExperience);
    }


}
