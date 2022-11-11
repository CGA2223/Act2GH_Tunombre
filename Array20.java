package entorno;

public class Array20 {

  public static void main(String[] args) {
    int[] numerosAleatoriosDelUnoAlCien;
    numerosAleatoriosDelUnoAlCien = new int [20];
    
    for (int i = 0; i < 20; i++) {
      numerosAleatoriosDelUnoAlCien[i] = (int) (Math.random() * 10 + 1);
    }

  }

}
