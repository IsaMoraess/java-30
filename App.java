import java.util.Scanner; // obrigatorio quando usa o scanner

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in); // sc e so um nome pode ser qualquer
        System.out.println("digite seu nome completo:");
        String nomeCompleto = sc.nextLine(); //nextLine le a linha inteira
        System.out.println("Seu nome completo é: " + nomeCompleto);

        System.out.println("digite seu primeiro nome:");
        String primeiroNome = sc.next(); //next ler apenas o nome que e uma string
        System.out.println("Seu primeiro nome é: " + primeiroNome);

        System.out.println("digite a sua idade:");
        int idade = sc.nextInt();// ler um inteiro
        System.out.println("Sua idade é: " + idade);

        System.out.println("digite a sua altura:");
        double altura = sc.nextDouble(); // ler um com o . exemplo 1.50
        System.out.println("Sua altura é: " + altura);

        System.out.println("Digite seu nome, idade, quantidade de filhos, altura e se tem bichinho de estimação:");
        String primeiroNome = sc.next(); // ler so  primeiro o nome
        int idade = sc.nextInt();
        byte qtdFilhos = sc.nextByte();
        float altura = sc.nextFloat();
        boolean temPet = sc.nextBoolean();

        System.out.println("Voce digitou os seguintes valores");
        System.out.println("primeiro nome: " + primeiroNome);
        System.out.println("idade: " + idade);
        System.out.println("quantidade de filhos: " + qtdFilhos);
        System.out.println("altura: " + altura);
        System.out.println("tem bicinho de estimação" + temPet);
    }
}
