package zaj5;

import Programowanie.zaj6.FileAccesService;
import Programowanie.zaj6.MainService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.Arrays;
import static org.assertj.core.api.Assertions.assertThat;

import static org.mockito.Mockito.when;

/*
      Mockowanie - robienie "oszukanego" obiektu / atrapy obiektu
                   pominiecie pewnej logiki w testowanej funkcji
*/

@RunWith(MockitoJUnitRunner.class)
public class MainServiceTest {

    /* deklarujemy ze Mockito ma automatycznie zrobic obiekt klasy FileAccessService*/
    @Mock
    private FileAccesService fileAccessService;

    /* deklarujemy ze Mockito ma automatycznie zrobic obiekt klasy MainService
    i wstrzyknac temu obiektowi, obiekt fileAccessService **/
    @InjectMocks
    private MainService mainService;

    @Test
    public void testCount() throws IOException {

        //deklarujemy ze jesli zostanie wywolana metoda loadAllLines, to
        //zamiast laczyc sie z plikiem/baza danych i wyciagac z niego wartosci,
        //ma zostac zwrocona (na sztywno) lista stringow (atrapa pliku/BD)

        //mockowanie

        when(fileAccessService.loadAllLines()).thenReturn(Arrays.asList("one", "two"));


        //test zasadniczy
        int numOfLines = mainService.numOfLines();
        assertThat(numOfLines).isEqualTo(2);


    }

}