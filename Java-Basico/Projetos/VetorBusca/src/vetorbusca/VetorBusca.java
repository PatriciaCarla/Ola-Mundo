package vetorbusca;

import java.util.Arrays;

public class VetorBusca {

    public static void main(String[] args) {
         int vet[] = {3, 7, 6, 1, 9, 4, 2} ;
         for (int v: vet) System.out.println(v);
         System.out.println("");
         int p = Arrays.binarySearch(vet, 1);
         System.out.println("Encontrei o valor na posição "+p+"\n");
    }
}