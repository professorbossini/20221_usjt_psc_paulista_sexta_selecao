C:\Program Files\Java\jdk

$Env:path += ';C:\Program Files\Java\jdk\bin'

import java.util.Random;
public class IfSimples{
    static public void main (String args []){
        Random gerador = new Random();
        double nota;
        nota = gerador.nextDouble() * 100;
        System.out.println ("A nota é: " + nota);
        if (nota >= 70)
            System.out.println("Aprovado");
        System.out.println("Você está aprovado");
        
        
    }
}