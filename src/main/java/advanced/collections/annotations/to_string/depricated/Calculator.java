package advanced.collections.annotations.to_string.depricated;

import java.util.List;

public class Calculator {

    //Versija 1

    @Deprecated                     // sako kad sekancios versijos metu sis sum metodas gali buti pasalintas
    public  int sum(int a, int b){
        return  a+b;
    }
    //Versija 2
    public  int sum(List<Integer> ints){
        int sum = 0;
        for(Integer number : ints){
            sum += number;
        }
        return sum;
    }

    }

// galima bus naudoti abi versijas
