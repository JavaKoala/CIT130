import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class testSandwich {

  // Test the MainIngredient 
  @Test
  public void evaluatesMainIngredient() {
    Sandwich_cit130_group4 sandwich = new Sandwich_cit130_group4();
    sandwich.setMainIngredient("tuna");
    String testMainIngredient = sandwich.getMainIngredient();
    assertEquals("tuna", testMainIngredient);
  }
  
  // Test the BreadType
  @Test
  public void evaluatesBreadType() {
    Sandwich_cit130_group4 sandwich = new Sandwich_cit130_group4();
    sandwich.setBreadType("wheat");
    String testBreadType = sandwich.getBreadType();
    assertEquals("wheat", testBreadType);
  }
  
  // Test the price
  @Test
  public void evaluatesPrice() {
    Sandwich_cit130_group4 sandwich = new Sandwich_cit130_group4();
    sandwich.setPrice(4.99);
    double testPrice = sandwich.getPrice();
    assertEquals(4.99, testPrice, 0.001);
  }
}