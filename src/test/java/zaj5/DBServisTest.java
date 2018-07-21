package zaj5;

import Programowanie.zaj6.DBConnector;
import Programowanie.zaj6.DBServis;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DBServisTest {

    public class MainServiceTest {

        @Mock
        private DBConnector dbConnector;

        @InjectMocks
        private DBServis dbServis;

        @Test
        public void testCount() throws IOException {

            when(dbConnector.getContent("x", 1, "x")).thenReturn("zzz aa vv aa ww aa");


            int res = dbServis.countWord("x", 1, "x", "aa");

            assertThat(res).isEqualTo(3);


        }
    }
}