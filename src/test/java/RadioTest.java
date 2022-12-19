import ru.netology.radio.radiomaniac.service.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetMinAndMaxStation() {
        Radio service = new Radio(5, 25);
        Assertions.assertEquals(5, service.getMinStation());
        Assertions.assertEquals(25, service.getMaxStation());
        Assertions.assertEquals(5, service.getStation());
    }

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
    public void shouldStayMaxVolume() {
        Radio service = new Radio();
        service.setVolume(101);

        Assertions.assertEquals(service.getMaxVolume(), service.getVolume());
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

        Assertions.assertEquals(6, service.next());
    }

    @Test
    public void shouldReturnMinStation() {
        Radio service = new Radio();
        service.setStation(service.getMaxStation());

        Assertions.assertEquals(service.getMinStation(), service.next());
    }

    @Test
    public void shouldReturnPrevStation() {
        Radio service = new Radio();
        service.setStation(5);

        Assertions.assertEquals(4, service.prev());
    }

    @Test
    public void shouldReturnLastStation() {
        Radio service = new Radio();

        service.setStation(service.getMinStation());
        Assertions.assertEquals(service.getMaxStation(), service.prev());
    }
    @Test
    public void shouldNotSetAboveAllowed() {
        Radio service = new Radio();
        service.setStation(15);

        Assertions.assertEquals(service.getMinStation(), service.getStation());
    }

    @Test
    public void shouldNotSetBelowAllowed() {
        Radio service = new Radio();

        service.setStation(-1);
        Assertions.assertEquals(service.getMinStation(), service.getStation());
    }
}
