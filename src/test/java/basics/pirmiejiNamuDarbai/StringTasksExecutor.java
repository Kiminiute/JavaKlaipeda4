package basics.pirmiejiNamuDarbai;

public class StringTasksExecutor {


    public void stringTask1() {
    }

    public void executeTask1() {
        System.out.println("Hello" + "\n" + "John");                   // 1 uzduotis
    }

    public void executeTask2() {
        System.out.println("   J     a   v     v   a");                 // 2 uzduotis
        System.out.println("   J    a a   v   v   a a ");
        System.out.println("J  J   aaaaa   V V   aaaaa");
        System.out.println(" JJ   a     a   V   a     a");
    }

    public void executeTask3() {
        String text1 = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";   // 3 uzduotis
        System.out.println(text1.toLowerCase());
    }

    public void executeTask4() {
        StringBuffer text2 = new StringBuffer("avaJ");                   // 4 uzduotis
        text2.reverse();
        System.out.println(text2);
    }

    public void executeTask5() {
        String text3 = "Programmer";
        System.out.println(text3.substring(0, 5));                       // 5 uzduotis
    }

    public void executeTask6() {
        String text4 = "Java";                                           // 6 uzduotis
        String str1 = text4.substring(1, 4);
        String text5 = "Fundamentals";
        String str2 = text5.substring(1, 12);
        String str3 = str1.concat(str2);
        System.out.println(str3);
    }

    public void executeTask7() {
        String text6 = "This is Java!";                                  // 7 uzduotis
        System.out.println("Text size is:" + text6.length());
    }

    public void executeTask8() {
        String text7 = "This is a comparison";                            // 8 uzduotis
        String text8 = "THIS is A Comparison";
        System.out.println(text7.equalsIgnoreCase(text8));
    }

    public void executeTask9() {
        String text9 = "Java exercises";
        System.out.println(text9.contains("ses"));                          // 9 uzduotis
    }

    public void executeTask10() {
        String text10 = "Aa kiu, I swd skieo 2387. GH kiu: sieo?? 25.33";   // 10 uzduotis
        int Letter = 0;
        int space = 0;
        int number = 0;
        int other = 0;

        for (int i = 0; i < text10.length(); i++) {
            if (Character.isLetter(text10.charAt(i))) {
                Letter++;
            } else if (Character.isDigit(text10.charAt(i))) {
                number++;
            } else if (Character.isSpaceChar(text10.charAt(i))) {
                space++;
            } else {
                other++;
            }
            System.out.println("Letters" + Letter);
            System.out.println("Numbers" + number);
            System.out.println("Spaces" + space);
            System.out.println("Other" + other);
        }
    }
}

