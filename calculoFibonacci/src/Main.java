import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int limit;

        while (true) {
            System.out.println("Digite o tamanho do calcoo de fibonacci: ");
            limit = sc.nextInt();

            if (limit < 0) {
                break;
            }

            int f = 0;
            int i = 1;


            while (i < limit) {
                int r = f + i;

                if (r > limit) {
                    break;
                }

                System.out.println(r);

                f = i;
                i = r;

                // Thread por second
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    System.out.println("Error de Thred: " + e);
                }


            }
        }
        sc.close();
        System.out.println("Programa finalizado com sucesso!");
    }

}