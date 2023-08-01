package EnumsPractice;

enum Days{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
public class PracticeDaysEnums {
    public static void main(String[] args) {
        System.out.println(Days.MONDAY);
        System.out.println(Days.TUESDAY);

        Days[] values = Days.values();
        for(Days days : values){
            System.out.println(days);
            System.out.println(days.ordinal());
        }
        System.out.println();
        Days valueOf = Days.valueOf("MONDAY");
        System.out.println(valueOf);
    }
}
