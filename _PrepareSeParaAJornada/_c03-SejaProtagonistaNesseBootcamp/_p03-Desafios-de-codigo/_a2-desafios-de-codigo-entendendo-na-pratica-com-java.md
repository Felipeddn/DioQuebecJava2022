# Desafios de código entendendo na prática com Java

Venilton Falvo Jr. Education Tech Lead (Lider de educação tech)  
Doutorando no ICMC-USP  

@falvojr

Em um desafio precisamos ler o enunciado para saber o que é pedido para resolver.

Desafio Multiplicação simples

Durante os testes dos desafios existem testes que podemos verificar e existem testes com "cadeados" do qual não temos acesso.

Tentar entregar projetos com erros faz com que perdemos coração (uma espécie de vida do programador) que limita as tentativas do mesmo. Corações estão nos questionários e nos desafios, se todos forem perdidos, a pessoa é obrigada a aguardar um pouco.

~~~java

// biblioteca para usar o método de leitura de dados
import java.util.Scanner;

// classe principal que será executada
public class Main{

    // método principal
    public static void main(String arg[]){
        // criando objeto para acessar os métodos de entrada
        Scanner teclado = new Scanner (System.in);

        //declaração das variável
        int A, B, PROD;

        //entrada de dados
        A = teclado.nextInt();
        B = teclado.nextInt();

        //processamento
        PROD = A * B;

        //saída
        System.out.println("Produção" + PROD);


        teclado.close();
    }
}

~~~

Desafio Diferenças

~~~java

import java.io.IOException;
import java.util.Scanner;

public class Desafio{

    public static void main(String[] args) trows IOException {
        Scanner leitor = new Scanner (System.in);
        System.out.println("Digite o valor"):
        int a = leitor.nextInt();

        System.out.println("Digite o valor"):
        int b = leitor.nextInt();

        System.out.println("Digite o valor"):
        int c = leitor.nextInt();

        System.out.println("Digite o valor"):
        int d = leitor.nextInt();

        int diferenca = ((a * b)-(c * d));

        System.out.println("A diferença no calculo (a*b) - c*d é " + diferença);

        leitor.close();
        
    }
}

~~~

Fim da aula
