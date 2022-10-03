import java.util.Scanner;

class list01_atv06 {
    public static void main (String [] args){
        System.out.println("Aréa de um círculo com base no raio.\n");
        Double raio;
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o raio do círculo em metros: ");
        raio = sc.nextDouble();
        sc.close();
        Double area = (Math.PI*Math.pow(raio, 2));
        System.out.print("A área do circulo é "+Math.round(area)+" metros");
    }
}