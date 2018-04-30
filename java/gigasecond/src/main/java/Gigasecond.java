import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

    private LocalDateTime bDay;
    private static long GIGASECONDS = 1000000000L;

    Gigasecond(LocalDate birthDate) {
        this.bDay = birthDate.atStartOfDay();
    }

    Gigasecond(LocalDateTime birthDateTime) {
        this.bDay = birthDateTime;
    }

    LocalDateTime getDate() {
        return bDay.plusSeconds(GIGASECONDS);
    }

}
