import javax.swing.JOptionPane;

public class OperadorTernario {
    public static void main(String[] args) {
        // int idade = Integer.parseInt(
        //     JOptionPane.showInputDialog("Qual a sua idade?")
        // );
        // // if (idade >= 18){
        // //     System.out.println ("Você pode dirigir");
        // // }
        // // else{
        // //     System.out.println ("Você não pode dirigir");
        // // }

        // String resultado = idade >= 18 ? "Você pode dirigir" : "Você não pode dirigir";
        // System.out.println (resultado);

        int nota = Integer.parseInt(
            JOptionPane.showInputDialog ("Digite a nota")
        );

        String resultado = nota == 10 ? "A" : nota == 9 ? "A" : nota == 8 ? "B" : nota == 7 ? "C" : "R" ;

    }
}
