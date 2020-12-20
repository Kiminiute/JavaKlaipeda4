package namu_Darbai.ProgrammRunner;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ProgrammRunner {

    public static void main(String[] args) {

        StringTasksExecutor stringTasks = new StringTasksExecutor();
        stringTasks.executeTask1();
        System.out.println();
        stringTasks.executeTask2();
        System.out.println();
        stringTasks.executeTask3();
        System.out.println();
        stringTasks.executeTask4();
        System.out.println();
        stringTasks.executeTask5();
        System.out.println();
        stringTasks.executeTask6();
        System.out.println();
        stringTasks.executeTask7();
        System.out.println();
        stringTasks.executeTask8();
        System.out.println();
        stringTasks.executeTask9();
        System.out.println();
        stringTasks.executeTask10();

        LoopTasksExecutor loopTasks = new LoopTasksExecutor();
        loopTasks.executeLoopTask1();
        System.out.println();
        loopTasks.executeLoopTask2();
        System.out.println();
        loopTasks.executeLoopTask3();
        System.out.println();
        loopTasks.executeLoopTask4();
      //  loopTasks.executeLoopTask44();
        System.out.println();
        loopTasks.executeLoopTask5();
        System.out.println();

        ArrayTasksExecutor arrayTasks = new ArrayTasksExecutor();
        arrayTasks.executeArrayTask1();
        System.out.println();
        arrayTasks.executeArrayTask2();
        System.out.println();
        arrayTasks.executeArrayTask3();
        System.out.println();
        arrayTasks.executeArrayTask4();
        System.out.println();
        arrayTasks.executeArrayTask5();
        System.out.println();




        LocalTime now = LocalTime.now();
        now = now.plusHours(10).plusMinutes(12).plusNanos(222);
        String formattedTime = now.getHour() + ":" + now.getMinute() + now.getSecond();
        System.out.println("Dabar yra :" + formattedTime);

        LocalDate localDate = LocalDate.of(1972,2, 24);
        System.out.println(localDate);

        String formattedLocalDate = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);

        System.out.println(formattedLocalDate);

//       public static DujinisKatilas();
//       DujinisKatilas.getmodel();










    }
}
