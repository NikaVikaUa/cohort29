import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main m = new Main();

 //   @BeforeEach
 //   public void init(){
 //       m = new Main();


  //  }

    @Test
    public void list_with_length4(){
        List<String> actual = Arrays.asList("John", "Mary", "Stephan", "Amalia","Johan");// метод asList  класса
                                                                    // Arrays для быстрого создания листа

                            // еще один метод для быстрого созлания листа
        List<String>expected = List.of("Stephan", "Amalia","Johan");

    //    assertEquals(expected,;
    }

}