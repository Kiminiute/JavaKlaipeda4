package lt.sda.javafundamentals.task19;

public class Author {
    public String surname;
    public String nationality;

    public Author(String surname, String nationality){
        this.surname = surname;
        this.nationality = nationality;
    };

    public void setSurname(String surname) {
        surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setNationality(String nationality) {
        nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }
}
