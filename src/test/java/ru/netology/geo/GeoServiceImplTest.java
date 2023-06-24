package ru.netology.geo;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

public class GeoServiceImplTest {

    @ParameterizedTest
    @ValueSource(strings = {GeoServiceImpl.MOSCOW_IP, GeoServiceImpl.LOCALHOST, GeoServiceImpl.NEW_YORK_IP})
    public void testByIP(String ip) {
        Location expected = new Location("MOSCOW", Country.RUSSIA, "", 0);

        GeoServiceImpl geoService = new GeoServiceImpl();

        Location location = geoService.byIp(GeoServiceImpl.MOSCOW_IP);

        Assertions.assertEquals(expected.getCountry(), location.getCountry());

    }
}
