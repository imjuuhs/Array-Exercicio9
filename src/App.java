import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner read = new Scanner(System.in);

        int vetorA[] = new int[6];
        int vetorB[] = new int[6];
        int vetorC[] = new int[6];                                    // vetor que vai guardar os elementos em comum
        int igual = 0;


        // preenchendo o vetor A
        System.out.println("Preenchendo o vetor A...");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.printf("Digite o valor para a posição " + i + " do vetor A: ");
            vetorA[i] = read.nextInt();
        }

        // preenchendo o vetor B
        System.out.println("Preenchendo o vetor B...");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.printf("Digite o valor para a posição " + i + " do vetor B: ");
            vetorB[i] = read.nextInt();
        }
        read.close();


        // verificando elementos em comum
        for (int i = 0; i < vetorA.length; i++) {                     // verifica todos os valores de A
            
            for (int j = 0; j < vetorB.length; j++) {                 // compara com todos os valores de B
              
                if (vetorA[i] == vetorB[j]) {                         // se encontrar um valor igual nos dois vetores
          
                    vetorC[igual] = vetorA[i];                        // guarda o valor em comum
                    igual++;                                          // vai pra próxima posição livre do vetor C
                    break;
                }
            }
        }


        // resultados
        System.out.println("Elementos em comum nos dois vetores:");
        
        for (int i = 0; i < igual; i++) {                             // mostra só até onde o vetor foi preenchido
      
            System.out.print(vetorC[i] + " ");  

        }
    }
}
