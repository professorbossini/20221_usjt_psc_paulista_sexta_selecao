import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite sua nota");
        byte nota = s.nextByte();

        if (nota >= 70){
            System.out.println ("Parabéns");
            System.out.println ("Aprovado");        
        }
        else
            System.out.println ("Reprovado");
        
        // if (nota >= 70){
        //     System.out.println ("Aprovado");
        // }
        // if (nota < 70){
        //     System.out.println ("Reprovado");
        // }

        s.close();
    }
}
