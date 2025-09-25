import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int[][] getDaysForMonth() {
        int[][] days = new int[13][1];
        for(int i=1; i<=12; i++){
            int dayAmount = 0;
            if(i == 1 || i == 3 || i == 5 || i == 7
                || i == 8 || i == 10 || i == 12){
                dayAmount = 31;
            }else if(i == 4 || i == 6 || i == 9 || i == 11){
                dayAmount = 30;
            }else{
                dayAmount = 28;
            }
            days[i][0] = dayAmount;
        }  
        return days;
    }

    public static String getWeekStr(int weekInt){
        return switch (weekInt) {
            case 1 -> "MON";
            case 2 -> "TUE";
            case 3-> "WED";
            case 4 -> "THU";
            case 5 -> "FRI";
            case 6 -> "SAT";
            default -> "SUN";
        };
    }

    public static int getWeekInt(int x, int y, int[][] days){
        int totalDays = 0;
        for(int i=1; i<x; i++){
            int amount = days[i][0];
            totalDays+=amount;
        }
        totalDays+=y;
        return totalDays % 7;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] days = getDaysForMonth();
        
        String s = br.readLine();
        String[] xy = s.split(" ");
        
        int x = Integer.parseInt(xy[0]);
        int y = Integer.parseInt(xy[1]);
        
        int weekInt = getWeekInt(x, y, days);

        String weekStr = getWeekStr(weekInt);
        System.out.println(weekStr);        
    }
}