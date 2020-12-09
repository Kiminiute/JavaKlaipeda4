package basics;

import org.junit.jupiter.api.*;

public class Example1 {
    @Test
    public  void firstTest(){
        System.out.println("Executing first test...");
    }

    @Test
    public  void secondTest(){
        System.out.println("Executing second test...");
    }

    @Test
    @DisplayName("thirdTest")
    public  void thirdTest(){
        System.out.println("Executing third test...");
    }

    @Test
    @Disabled
    public void fourthTest(){
        System.out.println("Executing fourth test...");
    }

    @BeforeAll
    static void beforeAllTestSetUp(){
        System.out.println("Before all test ");
    }

    @BeforeEach
    public void init(){
        System.out.println("This message will be displayed before execution of each method ");
    }

    @AfterEach
    public void tear(){
        System.out.println("Displays after execution of each testing method ");
    }
    @AfterAll
    public static void tearDown(){
        System.out.println("Desplays after execution after all testing method ");
    }

}
