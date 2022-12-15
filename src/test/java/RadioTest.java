import ru.netology.radio.radiomaniac.service.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldIncreaseVolume() {
        Radio service = new Radio();


        int expected = 2;
        int actual = service.increaseVolume(1);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMax() {
        Radio service = new Radio();

        int expected = 10;
        int actual = service.increaseVolume(11);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnTen() {
        Radio service = new Radio();

        int expected = 10;
        int actual = service.increaseVolume(10);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio service = new Radio();


        int expected = 1;
        int actual = service.decreaseVolume(2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMin() {
        Radio service = new Radio();

        int expected = 0;
        int actual = service.decreaseVolume(-1);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnZero() {
        Radio service = new Radio();

        int expected = 0;
        int actual = service.decreaseVolume(0);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCurrentStation() {
        Radio service = new Radio();

        service.setStation(10);

        int expected = 0;
        int actual = service.station;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnNewStation() {
        Radio service = new Radio();

        service.setStation(5);

        int expected = 5;
        int actual = service.station;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotReturnNewStation() {
        Radio service = new Radio();

        service.setStation(-1);

        int expected = 0;
        int actual = service.station;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnNextStation() {
        Radio service = new Radio();

        int expected = 6;
        int actual = service.next(5);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnZeroStation() {
        Radio service = new Radio();

        int expected = 0;
        int actual = service.next(10);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnPrevStation() {
        Radio service = new Radio();

        int expected = 4;
        int actual = service.prev(5);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnNinthStation() {
        Radio service = new Radio();

        int expected = 9;
        int actual = service.prev(0);

        Assertions.assertEquals(expected, actual);
    }
}
