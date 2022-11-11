package array20;

public class array20 {

  public static void main(String[] args) {
      int[] contadorDeNumeros;
      contadorDeNumeros = new int [20];
      int[] numerosAleatorios;
      numerosAleatorios = new int [20];
      
      for (int i = 0; i < 20; i++) {
        numerosAleatorios[i] = (int) (Math.random() * 10 + 1);
        contadorDeNumeros[numerosAleatorios[i]]++;
        
      }
      for (int j = 0; j <= 19; j++) {
        System.out.println("el numero " + j + " se ha introducido " + contadorDeNumeros[j] + " veces");                    
    }

    

  }

}
