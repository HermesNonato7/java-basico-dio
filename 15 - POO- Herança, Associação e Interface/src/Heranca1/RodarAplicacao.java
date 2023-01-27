package Heranca1;

/**
 * Classe de resolu��o do exerc�cio da Aula 3- Exerc�cio 1 de 2
 * Heran�a: Upcast e Downcast
 * Heran�a: Polimorfismo e Sobrescrita
 */
class RodarAplicacao {
    
    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario();

        //Upcast- Classe m�e: Funcion�rio | gerente, vendedor, faxineiro s�o classes filhos.
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();    


        //Dowcast
        //Gerente gerente_ = new Funcionario(); 
        //O Dewcast acima d� erro. � preciso deixar a classe Gerente expl�cita.

        // Vendedor vendedor_ = (Vendedor) new Funcionario(); //Deve ser evitado em Java o Dowcast.
    }
}
