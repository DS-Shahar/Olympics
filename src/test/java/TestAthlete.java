
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestGrade {

  @Test
  public void testProps()
  {
    Athlete a1 = new Athlete("Linoy Ashram", 4);
    assertEquals(a1.getName(), "Linoy Ashram");
    Grade g1 = new Grade("Clubs", 24.1);
    Grade g2 = new Grade("Ribbon", 25.1);
    a1.addGrade(g1);
    a1.addGrade(g2);
    double d = a1.average();
    assertEquals(d, 24.6);
    boolean b = a1.allAbove(20);
    assertEquals(b, true);

    Athlete a2 = new Athlete(a1);
    a2.setName("Dina averina");
    a2.delete("Ribbon");
    g1 = new Grade("Hoop", 23.8);
    a2.addGrade(g1);
    b = a1.allAbove(24);
    assertEquals(b, false);
    
    assertEquals(a1.surpasses(a2), false);    
    a2.delete("Clubs");
    a2.addGrade(new Grade("Clubs", 23.1));
    assertEquals(a1.surpasses(a2), true);    
   }
}
