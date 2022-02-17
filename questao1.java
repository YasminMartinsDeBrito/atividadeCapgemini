import java.util.ArrayList;
import java.util.Scanner;


class Main {
    public static void main(String[] args) {

         Scanner entrada = new Scanner(System.in);
         ArrayList<String> degraus = new ArrayList<String>();

         int qtdDegraus = entrada.nextInt();

         for (int i = 0; i < qtdDegraus; i++) {
            degraus.add(" ".repeat(qtdDegraus - i) + "*".repeat(i + 1));
         }
     
         for (String d : degraus ) {
             System.out.println(d);
         }
    }
}