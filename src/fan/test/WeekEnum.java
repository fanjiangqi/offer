package fan.test;

/**
 * Created by fanjiangqi on 2017/1/14.
 */
public enum WeekEnum {
    MONDAY, THUEDAY, WEDNESDAY,THURSDAY,FRIDAY;
    private int number;

    public static void main(String[] args) {
        WeekEnum one = WEDNESDAY.MONDAY;
        one.number = 1;
        System.out.println(WeekEnum.FRIDAY);
    }
}
