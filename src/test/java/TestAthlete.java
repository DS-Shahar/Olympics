
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestAthlete {

  @Test
  public void testGeneral()
  {
    Athlete a1 = new Athlete("Linoy Ashram", 4);
    assertEquals(a1.getName(), "Linoy Ashram");
    Grade g1 = new Grade("Clubs", 24);
    Grade g2 = new Grade("Ribbon", 25);
    boolean b = a1.addGrade(g1);
    assertEquals(b, true);
    a1.addGrade(g2);
    double d = a1.average();
    assertEquals(d, 24.5);
    b = a1.allGradesAbove(20);
    assertEquals(b, true);

    Athlete a2 = new Athlete(a1);
    a2.setName("Dina averina");
    a2.delete("Ribbon");
    g1 = new Grade("Hoop", 23);
    b = a2.addGrade(g1);
    assertEquals(b, true);
    b = a1.allGradesAbove(24);
    assertEquals(b, false);
    
    assertEquals(a1.surpasses(a2), false);    
    b = a2.delete("Clubs");
    assertEquals(b, true);
    a2.addGrade(new Grade("Clubs", 23));
    assertEquals(a1.surpasses(a2), true);    
   }
}
