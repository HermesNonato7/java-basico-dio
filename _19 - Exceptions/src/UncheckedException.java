import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args) {

        boolean continueLooping = true;
        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {
                double resultado = dividir((int) Double.parseDouble(a), (int) Double.parseDouble(b));
                System.out.println("Resultado : " + resultado);
                continueLooping = false;

            } catch (NumberFormatException e) {
                //e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Entrada inv�lida, informe um n�mero inteiro! " + e.getMessage());
            } catch (ArithmeticException e) {
                //e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Imposs�vel dividir um n�mero por 0.");
            } catch (NullPointerException e) {
                //e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Entrada inv�lida, informe um n�mero inteiro nos 2 campos!");
            } finally {
                System.out.println("Chegou no finally!");
            }
        } while (continueLooping);

        System.out.println("O c�digo continua...");
    }
    public static double dividir(double a, double b) {
        return  a / b;
    }
}
