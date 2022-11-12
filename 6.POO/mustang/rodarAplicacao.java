package mustang;

public class rodarAplicacao {
    
    public static void main(String[] args) {
        // INSTÂNCIANDO O OBJETO
        funcionario f = new funcionario();
        // UPCAST
        funcionario g = new gerente();
        funcionario v = new vendedor();
        funcionario fx = new faxineiro();

        // DOWNCAST (NÃO USAR!!!)
        //vendedor vvv = (vendedor) new funcionario();
    }
}
