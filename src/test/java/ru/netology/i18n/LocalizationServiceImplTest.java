package ru.netology.i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import ru.netology.entity.Country;

public class LocalizationServiceImplTest {

    @ParameterizedTest
    @EnumSource(names = {"USA", "RUSSIA", "BRAZIL", "GERMANY"})
    public void testLocation(Country country) {

        LocalizationServiceImpl localizationService = new LocalizationServiceImpl();
        String expected = "Welcome";
        if (country == Country.RUSSIA) {
            expected = "Добро пожаловать";
        }
        String text = localizationService.locale(country);

        Assertions.assertEquals(expected, text);

    }
}
