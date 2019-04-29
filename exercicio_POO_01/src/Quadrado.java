public class Quadrado {

    private double lado;

    /* Construtor padrão */
    public Quadrado(){
        this.setLado(0);
    }

    public Quadrado(double lado){
        this.setLado(lado);
    }

    public double area(){
        return Math.pow(this.getLado(), 2);
    }

    public double comprimento(){
        return this.getLado() * 4;
    }

    public void desenhar(){
        if(this.getLado() == 0){ /*Nesse caso que quis definir um quadrado padrão.*/
            for(int row = 0; row < 4; row++){
                for(int columms = 0; columms < 3; columms++){
                    if((row == 0 || (row > 0 && columms == 0) || (row == 3))){
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
                System.out.println("* ");
            }
        } else{
            for(int row = 0; row < this.lado; row++){ /*Aqui eu imprimo o quadrado de acordo com o número informado*/
                for(int columms = 0; columms < this.lado-1; columms++){
                    if((row == 0 || (row > 0 && columms == 0) || (row == this.lado-1))){
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
                System.out.println("* ");
            }
        }
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if (lado >= 0){
            this.lado = lado;
        }
        else{
            System.out.println("Valor Inválido!");
        }
    }
}
