package zaj5;

import Programowanie.zaj5.Employee;
import Programowanie.zaj5.EmployeeService;
import Programowanie.zaj5.EmployeeServiceImpl;
import org.junit.*;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class EmployeeServiceTest {

    private EmployeeService employeeService = new EmployeeServiceImpl();

    @Before //wykona się za każdym razem przed wykonaniem każdej metody testowej
    public void setUpBefore() {
        employeeService.add(new Employee(1L, "TestEmpl1", 999.0));
        employeeService.add(new Employee(2L, "TestEmpl2", 10000.0));
        employeeService.add(new Employee(3L, "TestEmpl3", 6000.0));
    }

    @BeforeClass //wykona się tylko 1raz przed wykonaniem wszystkich metod testowych
    public static void setUpBeforeClass() {
        //System.out.println("beforeClass - tutaj najczęściej jest przygotowywanie różnych obiektów do testu");
    }

    @After
    public void setUpAfter() {
        //System.out.println("after - tutaj najczęściej następuje sprzątanie po testach: np. usuwanie pliku który powstał jako produkt uboczny testów");
    }

    @BeforeClass //wykona się tylko 1raz przed wykonaniem wszystkich metod testowych
    public static void setUpBeforeClass2() {
        //System.out.println("beforeClass - tutaj najczęściej jest przygotowywanie różnych obiektów do testu");
    }

    /*
    TESTY JEDNOSTKOWE POWINNY BYĆ NIEZALEŻNE CZYLI WYNIK JEDNEJ METODY TESTOWEJ
    NIE POWINIEN WPŁYWAĆ NA WYNIK INNEJ
     */

    @Test
    public void testRemoveemployee() {
        employeeService.remove(4L);
        assertEquals(3,employeeService.count());

        employeeService.remove(2L);
        assertFalse(employeeService.exist(new Employee(2L,"TestEmp2", 10000.0)));
    }

    @Test
    public void testExist() {
        assertTrue(employeeService.exist(new Employee(1L, "TestEmpl1", 999.0)));
        assertFalse(employeeService.exist(new Employee(5L, "TestEmpl1", 999.0)));
    }

    @Test
    public void testCount() {
        assertEquals(3, employeeService.count());
        employeeService.remove(1L);
        assertEquals(2,employeeService.count());
    }
}


