package notas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Estudante[] estudantes = new Estudante[2];
        
        for (int i = 0; i < estudantes.length; i++) {
            estudantes[i] = new Estudante();
            System.out.println("Nome, idade e nota");
            estudantes[i].nome = input.nextLine();
            estudantes[i].idade = input.nextInt();
            estudantes[i].nota = input.nextDouble();
            input.nextLine(); // Limpa o buffer após a entrada do número
        }
        
        for (int i = 0; i < estudantes.length; i++) {
            System.out.println("Nome: " + estudantes[i].nome);
            System.out.println("Idade: " + estudantes[i].idade);
            System.out.println("Nota: " + estudantes[i].nota);
        }
        
        input.close(); // Feche o Scanner no final para evitar vazamentos de recursos
    }
}