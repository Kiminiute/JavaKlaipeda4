package basics.tdd.NamuDarbai;

public class House {
    float houseArea = 0;
    String district;
    int builtYear = 0;
    String condition;
    int newestHouse;

    House(int y, String d, float a, String c) {
        builtYear = y;
        district = d;
        houseArea = a;
        condition = c;
    }

    public String getCondition() {
       return condition;
    }

    public float getHouseArea() {
        return houseArea;
    }

    public int getBuiltYear() {
        return builtYear;
    }

      public String ArraytoString()
    {
         return builtYear + " " + district + " " + houseArea + " " + condition;
    }

    public int getNumberOfFittedHouses(){

        int numberOfFittedHouses= 0;

        return numberOfFittedHouses;
    }

}












