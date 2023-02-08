package ch05.sec12;

import java.util.Calendar;

public class EnumExample {
    public static void main(String[] args) {

        Enum_Week today = null;

        Calendar cal = Calendar.getInstance();

        int week = cal.get(Calendar.DAY_OF_WEEK);

        switch(week){

            case 1: today = Enum_Week.SUNDAY; break;
            case 2: today = Enum_Week.MONDAY; break;
            case 3: today = Enum_Week.TUESDAY; break;
            case 4: today = Enum_Week.WEDNESDAY; break;
            case 5: today = Enum_Week.THURSDAY; break;
            case 6: today = Enum_Week.FRIDAY; break;
            case 7: today = Enum_Week.SATURDAY;

        }

        if(today == Enum_Week.TUESDAY){
            System.out.println("Today is Tuesday");
        }else{
            System.out.println("Not Tuesday");
        }

    }
}
