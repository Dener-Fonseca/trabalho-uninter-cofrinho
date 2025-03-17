package src.cofrinho;

import src.moedas.Moeda;

import java.util.ArrayList;
import java.util.List;

public class Cofrinho {
  private List<Moeda> ListaMoedas;

  public Cofrinho() {
    this.ListaMoedas = new ArrayList<>();
  }

  public void adicionar(Moeda moeda) {
    this.ListaMoedas.add(moeda);
    System.out.println("Moeda adicionada com sucesso."); 
  }

   public void remover(int tipo, double valor) {
     for (Moeda moeda : this.ListaMoedas) {
       if ((tipo == 1 && moeda instanceof Real) || (tipo == 2 && moeda instanceof Dolar) || (tipo == 3 && moeda instanceof Euro)) {
         if (moeda.getValor() >= valor) {
           moeda.setValor(moeda.getValor() - valor);
           System.out.println(valor + "removido com sucesso.");

           if(moeda.getValor() == 0){
             this.ListaMoedas.remove(moeda);
             Syste.out.println("Moeda removida com sucesso.");
             return;
           }

           else {
             System.out.println("Valor insuficiente para remover a moeda.");
             return;
           }
         }
       }
else {
       System.out.println("A moeda não foi encontrada.");
         
      }
    }
  }
   

  public void listagemMoedas() {
    if(this.ListaMoedas.isEmpty()){
      System.out.println("O cofrinho está vazio.");
    } else {
      System.out.println("Moedas no confrinho:");
      for(Moeda moeda : this.ListaMoedas) {
      moeda.info();
      }
    }  
  }

  public double totalConvertido() {
    double total = 0;
    for(Moeda moeda : this.ListaMoedas) {
      total += moeda.converter();
    }
    return total;
  } 
}