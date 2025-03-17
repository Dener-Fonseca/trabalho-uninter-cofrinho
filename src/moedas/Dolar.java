package src.moedas;

public class Dolar extends Moeda {
  public Dolar(double valor) {
    super(valor);
  }

  @Override
  public void info() {
    System.out.println("Moeda: Dolar");
    System.out.println("Valor: " + this.valor + " dólares");
  }

  @Override
  public double converter() {
    return this.valor * 5.00;
  } 
}