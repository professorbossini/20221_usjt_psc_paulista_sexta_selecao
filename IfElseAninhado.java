public class IfElseAninhado {
    public static void main(String[] args) {
        java.util.Scanner leitor = new java.util.Scanner(System.in);
        long nota;
        nota = leitor.nextLong();

        if (nota >= 90){
            System.out.println("Parabéns");
            System.out.println ("Conceito A");
        }
        else
            if (nota >= 80)
                System.out.println ("Conceito B");
            else
                if (nota >= 70)
                    System.out.println ("Conceito C");
                else
                    System.out.println("Conceito R");
        leitor.close();

    }
}
