// 1 - nome do Pacote

package Introjana;
//2 - referindo as biblioteca

import java.awt.image.ShortLookupTable;
import java.sql.SQLInvalidAuthorizationSpecException;

//3 - classes
public class Medidas {
    //3.1 - atributos - carascteristicas

    // metodos e funçoes
    public static void main (String[] args){
        System.out.println("Calculo de área");
        // calaculo de area - exemplo: o tamanho do tapete ou do piso
          int largura;
          int comprimento;
          int resultado;

          largura = 4;
          comprimento = 3;

          resultado = largura * comprimento;
        System.out.println("Para a largura de " +largura + " e o comprimento de "
                           + comprimento + " A área é de " +resultado + " m2");
    }
}
