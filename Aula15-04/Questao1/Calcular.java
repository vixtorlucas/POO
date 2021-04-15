public class Calcular{
  public static int soma(int a, int b) throws CalculationError{

      if (b == 0){
        throw new CalculationError("numero nao pode ser zero");
      }
      return a + b;
  }
}