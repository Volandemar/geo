import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.mockito.Mockito;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class GeoServiceImplTest {

    @Test
    @DisplayName("Тестирование IP localHost")
    void TestIPLocalhost() {
        String ip = "127.0.0.1";
        GeoServiceImpl geoService = new GeoServiceImpl();
        Location geoServiceLocal = geoService.byIp(ip);
        Location testLocation = new Location(null, null, null, 0);
        Assertions.assertEquals(testLocation.getCountry(), geoServiceLocal.getCountry());
        Assertions.assertEquals(testLocation.getCity(), geoServiceLocal.getCity());
        Assertions.assertEquals(testLocation.getStreet(), geoServiceLocal.getStreet());
        Assertions.assertEquals(testLocation.getBuiling(), geoServiceLocal.getBuiling());
    }

    @Test
    @DisplayName("Тестирование IP Moskow")
    void TestIPMoskow() {
        String ip = "172.0.32.11";
        GeoServiceImpl geoService = new GeoServiceImpl();
        Location geoServiceLocal = geoService.byIp(ip);
        Location testLocation = new Location("Moscow", Country.RUSSIA, "Lenina", 15);
        Assertions.assertEquals(testLocation.getCountry(), geoServiceLocal.getCountry());
        Assertions.assertEquals(testLocation.getCity(), geoServiceLocal.getCity());
        Assertions.assertEquals(testLocation.getStreet(), geoServiceLocal.getStreet());
        Assertions.assertEquals(testLocation.getBuiling(), geoServiceLocal.getBuiling());
    }

    @Test
    @DisplayName("Тестирование IP New York")
    void TestIPNewYork() {
        String ip = "96.44.183.149";
        GeoServiceImpl geoService = new GeoServiceImpl();
        Location geoServiceLocal = geoService.byIp(ip);
        Location testLocation = new Location("New York", Country.USA, " 10th Avenue", 32);
        Assertions.assertEquals(testLocation.getCountry(), geoServiceLocal.getCountry());
        Assertions.assertEquals(testLocation.getCity(), geoServiceLocal.getCity());
        Assertions.assertEquals(testLocation.getStreet(), geoServiceLocal.getStreet());
        Assertions.assertEquals(testLocation.getBuiling(), geoServiceLocal.getBuiling());

    }
}