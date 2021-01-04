package lt.sda.javafundamentals.task19;

public class Main19 {
    public static void main(String[] args) {

        Author author1 = new Author("Kudirka", "Lietuvis");
        Author author2 = new Author("Dostojevskis", "Rusas");
        Author author3 = new Author("Dikensas", "Anglas");

        Poem poem1 = new Poem(author1, 1500);
        Poem poem2 = new Poem(author2, 5600);
        Poem poem3 = new Poem(author3, 7600);

        Poem[] allPoems = new Poem[3];
        allPoems[0] = poem1;
        allPoems[1] = poem2;
        allPoems[2] = poem3;

        int longestPoemPages = 0;
        String authorWhoWroteLongestPoem = null;

        for (Poem poem : allPoems) {
            if (longestPoemPages < poem.getStropheNumbers()){
                longestPoemPages = poem.getStropheNumbers();
                authorWhoWroteLongestPoem = poem.getCreator();
            }
        }
        System.out.println(authorWhoWroteLongestPoem + " parašė ilgiausią poemą");
    }
}
