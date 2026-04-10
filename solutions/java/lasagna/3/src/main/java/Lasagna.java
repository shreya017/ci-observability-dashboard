public class Lasagna {
    int minutes= 40;
    //defining the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return minutes;
    }
    //defining the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int x){
        return expectedMinutesInOven()-x;
    }
    //defining the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int y){
        return y*2;
    }
    //defining the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int y,int x){
        return preparationTimeInMinutes(y)+x;
    }
}
