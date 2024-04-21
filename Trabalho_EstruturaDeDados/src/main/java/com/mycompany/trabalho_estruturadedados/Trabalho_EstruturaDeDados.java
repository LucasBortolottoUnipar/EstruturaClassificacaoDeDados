package com.mycompany.trabalho_estruturadedados;
import java.util.Arrays;
import java.util.Scanner;

public class Trabalho_EstruturaDeDados {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int chave;
        System.out.println("Digite o tamanho do vetor: ");
        int n = s.nextInt();
        
        int[]vetorNumeros = new int[n];
        
        for (int i=0; i< vetorNumeros.length; i++){
            System.out.println("Digite o valor do vetor na posicao " + i); 
            vetorNumeros[i] = s.nextInt();
        }
        System.out.println("Vetor Original:");
        for (int i=0; i< vetorNumeros.length; i++){
                    System.out.println("Vetor["+i+"]: " + vetorNumeros[i]);
        }
        
        System.out.println("Qual metodo você gostaria de usar? 1- Insercao, 2 - Selecao, 3 - Bolha");
        int opcao = s.nextInt();
        switch(opcao){
            case 1:
                
                long inicio1 = System.currentTimeMillis();
                System.out.println("Metodo Insercao: ");
                int j; 
                for (int i=1; i<vetorNumeros.length; i++){
                    chave = vetorNumeros[i];
                    for(j = i-1; j>=0 && vetorNumeros[j]>chave; j--){
                        vetorNumeros[j+1] = vetorNumeros[j];
                    }
                    vetorNumeros[j+1]= chave;
                }

                for (int i = 0; i < vetorNumeros.length; i++) {
                        System.out.println("Vetor ["+i+"] = "+vetorNumeros[i]);            
                        }  
                    long fim1 = System.currentTimeMillis();
                    long tempoExecucao1 = fim1 - inicio1;
                    System.out.println("Tempo de execucao: "+tempoExecucao1 + " ms");
                 break;
                 
            case 2:   
                
                long inicio2 = System.currentTimeMillis();
                System.out.println("Método Selecao: ");
                for(int i = 0; i < vetorNumeros.length-1; i++){
                   int posicaoMenor = i;

                   for(int k = i+1; k < vetorNumeros.length; k++){
                       if(vetorNumeros[k] < vetorNumeros[posicaoMenor]){
                           posicaoMenor = k;
                        }
                    }
                   if(posicaoMenor != i){
                       int aux = vetorNumeros[i];
                       vetorNumeros[i] = vetorNumeros[posicaoMenor];
                       vetorNumeros[posicaoMenor] = aux;
                    }
                }

                   for(int i = 0; i < vetorNumeros.length; i++){
                   System.out.println("Vetor Ordenado ["+i+"] = "+vetorNumeros[i]);
                   }
                   long fim2 = System.currentTimeMillis();
                   long tempoExecucao2 = fim2 - inicio2;
                   System.out.println("Tempo de execucao: "+tempoExecucao2 + " ms");
               break;
               
            case 3:                 
                
                long inicio3 = System.currentTimeMillis();
                boolean houveTroca = true;
                System.out.println("Metodo Bolha: ");
                while(houveTroca){
                    houveTroca = false;
                    for(int i = 0; i < vetorNumeros.length - 1; i++){
                        if(vetorNumeros[i] > vetorNumeros[i+1]){
                            int aux = vetorNumeros[i];
                            vetorNumeros[i] = vetorNumeros[i+1];
                            vetorNumeros[i+1] = aux;
                            houveTroca = true;
                        }
                    }
                    
                }
                    System.out.println("Vetor Ordenado:");
                    System.out.println(Arrays.toString(vetorNumeros));
                    long fim3 = System.currentTimeMillis();
                    long tempoExecucao3 = fim3 - inicio3;
                    System.out.println("Tempo de execucao: "+tempoExecucao3 + " ms");
                break;
                
            default: 
                System.out.println("Opcao Invalida! Reinicie o Sistema.");
                break;
                }
                
                
                
    }
}
