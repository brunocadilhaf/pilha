import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Pilha pilha = new Pilha(5);

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe a matricula do empregado");
            Empregado emp = new Empregado(sc.next());
            pilha.adicionar(emp);
        }

        sc.close();
    }
}
