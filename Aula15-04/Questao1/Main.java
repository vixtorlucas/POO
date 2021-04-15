class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    try{
      Calcular.soma(10,0);
    }catch (CalculationError error){
      System.out.println(error);
    }
  }  
}