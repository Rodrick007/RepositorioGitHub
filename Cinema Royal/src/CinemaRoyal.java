
import java.util.Scanner;

public class CinemaRoyal {

    public static void main(String[] args) {
        int i, qt, idade, valortotal, valor, soma, mediaid, maiorid, menorid;
        valortotal = 0;
        qt = 0;
        valor = 0;
        soma = 0;
        for (i = 1; i <= 300; i++) {
            Scanner s = new Scanner(System.in);
            System.out.println("Bem vindo ao Cinema Royal ");
            
            System.out.println(" Hoje com promoção de pipoca!!!! ");
            System.out.println(" Venha conferir "); 
            
            System.out.println("  ");
            System.out.println("Informe a idade do usuário " + i);
            idade = s.nextInt();

            if (idade == 0) {
                break;
            }
            if ((idade > 0) && (idade <= 10)) {
                valor = 5;
                System.out.println("O valor do ingresso é :" + valor);
            } else if ((idade > 10) && (idade <= 20)) {
                valor = 10;
                System.out.println("O valor do ingresso é :" + valor);
            } else if ((idade > 20) && (idade <= 90)) {
                valor = 15;
                System.out.println("O valor do ingresso é :" + valor);
            } else if (idade > 90) {
                valor = 0;
                System.out.println("Seu ingresso é gratuito" + valor);

                maiorid = idade;
                menorid = idade;
                if (idade > maiorid) {
                    maiorid = idade;
                } else if (idade < menorid) {
                    menorid = idade;
                }
                System.out.println("O usuário mais velho tem " + maiorid);
                System.out.println("O usuário mais novo tem " + menorid);

            }
            valortotal = valortotal + valor;
            qt = qt + 1;
            soma = soma + idade;
        }
        mediaid = soma / qt;

        System.out.println("O valor total da compra " + valortotal);
        System.out.println("A quantidade de usuários é " + qt);
        System.out.println("A soma das idades é " + soma);
        System.out.println("A média das idades é " + mediaid);
        
        System.out.println("Obrigado pela preferência ");

    }
}
