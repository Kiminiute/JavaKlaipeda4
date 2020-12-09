package basics.tdd.NamuDarbai;

public class House {
    float houseArea = 0;
    String district;
    int builtYear = 0;
    String condition;


    House ( int builtYear, String district, float houseArea, String condition){
    }

    public String getCondition () {
        return condition;
    }

    public float getSmallestHouseArea(){
        return houseArea;
    }

    public int getNewestHouse(int builtYear){
        return builtYear;
    }

    public static void main(String[] args){
        int newestHouse = 0;
        float smallestHouse;
        int builtYear = 0;

        House[] houses;
        houses = new House[3];
        houses [0] = new House(1923,"Centras", 134.09f, "fitted");
        houses [1] = new House(1980, "Naujakiemis", 231.87f, "partially finished");
        houses [2] = new House(1950, "Melnrage", 80.80f, "not finished");

        int MaxBuiltYear = 0;
        int newestHose = 0;


        for(int i= 0; i <= houses.length; i ++){
             if( houses[i][i] > MaxBuiltYear){
                 MaxBuiltYear == newestHouse;
                System.out.println(" Naujausias namas yra : " + newestHouse);
            }

        }
    }


}
