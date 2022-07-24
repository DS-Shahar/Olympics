
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestGroup {

  @Test
  public void testGroup()
  {
    Athlete a1 = new Athlete("Linoy Ashram", 4);
    Grade g1 = new Grade("Clubs", 24.1);
    Grade g2 = new Grade("Ribbon", 25.1);
    a1.addGrade(g2);

    Athlete a2 = new Athlete("Dina Averina", 4);
    g1 = new Grade("Hoop", 23.8);
    g2 = new Grade("Ribbon", 24.1);
    a2.addGrade(g1);
    a2.addGrade(g2);
    
    Group g = new Group("ISR", 2);
    g.addAthlete(a1);
    g.addAthlete(a2);
    g.
  }
}
