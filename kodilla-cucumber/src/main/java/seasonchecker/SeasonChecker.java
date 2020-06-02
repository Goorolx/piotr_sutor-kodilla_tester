package seasonchecker;

import java.time.MonthDay;

public class SeasonChecker {

    public String checkIfSummer(MonthDay date){
        if (date.isBefore(MonthDay.of(9,24)) && date.isAfter(MonthDay.of(6,20)))    {
        return "Yes! Summer!";
    }
    return "Nope";
}
}
