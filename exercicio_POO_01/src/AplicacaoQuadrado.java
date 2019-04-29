import java.util.Scanner;

public class AplicacaoQuadrado {
    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado();

        Scanner input = new Scanner(System.in);

        boolean menu = true;

        while (menu == true){

            System.out.println("\nDigite 1 para calcular a área.\nDigite 2 para calcular o perímetro.\nDigite 3 para desenhar o quadrado.");
            System.out.print("Informe a opção: ");
            int opt = input.nextInt();

            switch (opt) {
                case 1:
                    System.out.print("\nInforme o lado do quadrado: ");
                    double ladoArea = input.nextDouble();
                    quadrado.setLado(ladoArea);

                    if (ladoArea >= 0) {
                        System.out.println("A área do quadrado é " + quadrado.area());
                    }
                    break;

                case 2:
                    System.out.print("\nInforme o lado do quadrado: ");
                    double ladoComprimento = input.nextDouble();

                    quadrado.setLado(ladoComprimento);

                    if (ladoComprimento >= 0) {
                        System.out.println("O comprimento do quadrado é " + quadrado.comprimento());
                    }
                    break;
                case 3:
                    System.out.print("Informe o lado do quadrado (O valor 0 é o padrão!): ");
                    double ladoDesenho = input.nextDouble();
                    quadrado.setLado(ladoDesenho);

                    if(ladoDesenho >= 0){
                        quadrado.desenhar();
                    }
                    break;
                case 0:
                    menu = false;
                    System.out.println("Obrigado por usar o nosso software!");
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
        }
    }
}
