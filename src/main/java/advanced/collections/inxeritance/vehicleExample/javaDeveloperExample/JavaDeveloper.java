package advanced.collections.inxeritance.vehicleExample.javaDeveloperExample;

 public class JavaDeveloper extends Developer {

     public JavaDeveloper(String name, int ageOfExperience) {
         super(name, ageOfExperience);
         }

     public static void main(String[] args) {

        JavaDeveloper javaDeveloper1 = new JavaDeveloper("Martynas", 12 );
        JavaDeveloper javaDeveloper2 = new JavaDeveloper("Jonas", 20 );

        System.out.println(javaDeveloper1.displayInfo());
        System.out.println(javaDeveloper2.displayInfo());

    }
}

//         Create 3 classes: Person, Developer, JavaDeveloper.
//        * Developer object must have `ageOfExperience` attribute
//        * Person object must have `name` attribute
//        * Person is a parent class, Developer inherits from Person, JavaDeveloper inherits from
//          Developer

//        * Create constructor for every class that will call constructor of the super class. Each
//          constructor should display an information, that it has been called.

//        * Create an object of type JavaDeveloper.

//        * Using an object of type JavaDeveloper call a method that is defined in Developer
//          class. Method should print the name and age of experience.