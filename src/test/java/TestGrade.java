
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestGrade {

   @Test
   public void testProps()
   {
     Grade g = new Grade("Clubs", 24.5);

     String a = r.getApparatus();
     assertEquals(a, "Clubs");

     int s = g.getScore()
     assertEquals(s, 24.5);     
   }
}
