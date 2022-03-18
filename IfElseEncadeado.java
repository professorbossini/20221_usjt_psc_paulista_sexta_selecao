import javax.swing.JOptionPane;
public class IfElseEncadeado {
    public static void main(String... args) { //varargs
        //byte: Byte
        //short: Short
        //int: Integer
        //long: Long
        //boolean: Boolean
        //float: Float
        //double: Double
        //char: Character
        short nota = Short.parseShort(
            JOptionPane.showInputDialog ("Digite a nota")
        );
        //if/else encadeado
        if (nota >= 90){
            JOptionPane.showMessageDialog(null, "Parabéns.");
            JOptionPane.showMessageDialog(null, "Conceito A.");
        }
        else if (nota >= 80){
            JOptionPane.showMessageDialog(null, "Conceito B.");
        }
        else if (nota >= 70){
            JOptionPane.showMessageDialog(null, "Conceito C.");
        }
        else{
            JOptionPane.showMessageDialog(null, "Reprovado");
        }
    }
}
