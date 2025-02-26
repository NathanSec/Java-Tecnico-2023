import java.util.Scanner;
public class TestaRanger {
    public static void main(String[] args) {
        System.out.println("\t"+"***It's Morphing Time***\n");

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do Ranger Verde: \n");
        String nomeVerde = sc.nextLine();
        PowerRanger ranger1 = new  PowerRangerVerde(nomeVerde);

        System.out.println("Digite o nome do Ranger Preto: \n");
        String nomePreto = sc.nextLine();
        PowerRanger ranger2 = new  PowerRangerPreto(nomePreto);

        System.out.println("Digite o nome do Ranger Rosa: \n");
        String nomeRosa = sc.nextLine();
        PowerRanger ranger3 = new  PowerRangerRosa(nomeRosa);
        
        System.out.println("Digite o nome do Ranger Azul: \n");
        String nomeAzul = sc.nextLine();
        PowerRanger ranger4 = new  PowerRangerAzul(nomeAzul);

        System.out.println("Digite o nome do Ranger Amarela: \n");
        String nomeAmarela = sc.nextLine();
        PowerRanger ranger5 = new  PowerRangerAmarela(nomeAmarela);

        System.out.println("Digite o nome do Ranger Vermelho: \n");
        String nomeVermelho = sc.nextLine();
        PowerRanger ranger6 = new  PowerRangerVermelho(nomeVermelho);

        ranger1.morfar();
        ranger2.morfar();
        ranger3.morfar();
        ranger4.morfar();
        ranger5.morfar();
        ranger6.morfar();
    }
}
