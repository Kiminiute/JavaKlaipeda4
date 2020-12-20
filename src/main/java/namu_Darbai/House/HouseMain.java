package namu_Darbai.House;

public class HouseMain {


    public static House getSmallestHouseArea(House[]builtedHouse) {
        House smallestHouse = builtedHouse[0];

        for(int i = 0; i < builtedHouse.length; i++){
            if(smallestHouse.getHouseArea() > builtedHouse[i].getHouseArea()){
                smallestHouse = builtedHouse[i];
            }
        }
        return smallestHouse;
    }

    public static House getNewestHouse(House[]builtedHouse) {
        House newestHouse = builtedHouse[0];

        for (int i = 0; i < builtedHouse.length; i++) {
            if (newestHouse.getBuiltYear() < builtedHouse[i].getBuiltYear()) {
                newestHouse = builtedHouse[i];
            }
        }
        return newestHouse;
    }

    public static int getNumberOfFittedHouses(House[]builtedHouse){
        int numberOfFittedHouses = 0;

        for (int i = 0; i < builtedHouse.length; i++) {
            if(builtedHouse[i].getCondition().equals("fitted")){
                numberOfFittedHouses ++;
            }
        }
        return numberOfFittedHouses;
    }

    public static void main(String[] args){

        House[] builtedHouse;
        builtedHouse = new House[3];
        builtedHouse[0] = new House(2001,"Centras", 134.09f, "fitted");
        builtedHouse[1] = new House(1980, "Naujakiemis", 231.87f, "partially finished");
        builtedHouse[2] = new House(1950, "Melnrage", 80.80f, "fitted");

        System.out.println("Smallest house is :" + getSmallestHouseArea(builtedHouse).ArraytoString());
        System.out.println();
        System.out.println("Number of fitted houses is: " + getNumberOfFittedHouses(builtedHouse));
        System.out.println();
        System.out.println("Newest house is : " + getNewestHouse(builtedHouse).ArraytoString());

    }
}
