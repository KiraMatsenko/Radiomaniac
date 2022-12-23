import ru.netology.radio.radiomaniac.service.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldReturnVolume() {
        Radio service = new Radio();

        service.setVolume(5);

        int expected = 5;
        int actual = service.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnStation() {
        Radio service = new Radio();

        service.setStation(5);

        int expected = 5;
        int actual = service.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnTenVolume() {
        Radio service = new Radio();

        service.setVolume(11);

        int expected = 10;
        int actual = service.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnZeroVolume() {
        Radio service = new Radio();

        service.setVolume(-3);

        int expected = 0;
        int actual = service.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume(){
        Radio service = new Radio();

        service.setVolume(6);

        int expected = 7;
        int actual = service.increaseVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldReturnMaxVolume(){
        Radio service = new Radio();

        service.setVolume(10);

        int expected = 10;
        int actual = service.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume(){
        Radio service = new Radio();

        service.setVolume(6);

        int expected = 5;
        int actual = service.decreaseVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldReturnMinVolume(){
        Radio service = new Radio();

        service.setVolume(0);

        int expected = 0;
        int actual = service.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() {
        Radio service = new Radio();

        service.setStation(5);

        int expected = 6;
        int actual = service.next();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFirstStation() {
        Radio service = new Radio();

        service.setStation(9);

        int expected = 0;
        int actual = service.next();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnPrevStation() {
        Radio service = new Radio();

        service.setStation(5);

        int expected = 4;
        int actual = service.prev();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnNinthStation() {
        Radio service = new Radio();

        service.setStation(1);

        int expected = 9;
        int actual = service.prev();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetAboveAllowed() {
        Radio service = new Radio();

        service.setStation(15);

        int expected = 0;
        int actual = service.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetBelowAllowed() {
        Radio service = new Radio();

        service.setStation(-5);

        int expected = 0;
        int actual = service.getStation();

        Assertions.assertEquals(expected, actual);
    }
}
