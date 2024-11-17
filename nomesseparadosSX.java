import java.util.ArrayList;
import java.util.Scanner;

public class nomesseparadosSX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> masculino = new ArrayList<>();
        ArrayList<String> feminino = new ArrayList<>();

        System.out.println("Quantas pessoas você quer cadastrar?");
        int quantidade = scanner.nextInt();
        scanner.nextLine();


        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o nome da pessoa:");
            String nome = scanner.nextLine();

            System.out.println("Digite o sexo da pessoa (M para masculino, F para feminino):");
            String sexo = scanner.nextLine().toUpperCase();

            if (sexo.equals("M")) {
                masculino.add(nome);
            } else if (sexo.equals("F")) {
                feminino.add(nome);
            } else {
                System.out.println("Sexo inválido. Nome não será adicionado.");
            }
        }

        System.out.println("\nPessoas do sexo masculino:");
        for (String nome : masculino) {
            System.out.println(nome);
        }

        System.out.println("\nPessoas do sexo feminino:");
        for (String nome : feminino) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
