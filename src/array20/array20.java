package array20;

public class array20 {

  public static void main(String[] args) {
    
      int[] numerosAleatoriosDelUnoAlCien;
      numerosAleatoriosDelUnoAlCien = new int [20];
      
      for (int i = 0; i < 20; i++) {
        numerosAleatoriosDelUnoAlCien[i] = (int) (Math.random() * 10 + 1);
        System.out.println(numerosAleatoriosDelUnoAlCien[i]);}

    

  }

}
