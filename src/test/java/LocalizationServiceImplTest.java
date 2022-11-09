import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class LocalizationServiceImplTest {

    @Test
    @DisplayName("Тестирование текста на RUS")
    void localeRUS() {
        Country country = Country.RUSSIA;
        LocalizationServiceImpl localizationService = new LocalizationServiceImpl();
        String localizationServiceText = localizationService.locale(country);
        String testText = "Добро пожаловать";
        Assertions.assertEquals(testText,localizationServiceText);
    }

    @Test
    @DisplayName("Тестирование текста на RUS")
    void localeENG() {
        Country country = Country.USA;
        LocalizationServiceImpl localizationService = new LocalizationServiceImpl();
        String localizationServiceText = localizationService.locale(country);
        String testText = "Welcome";
        Assertions.assertEquals(testText,localizationServiceText);
    }
}