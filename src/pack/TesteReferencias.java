package pack;

public class TesteReferencias {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        System.out.println("Saldo da Primeira Conta: " + primeiraConta.saldo);

        Conta segundaConta = primeiraConta;
        System.out.println(primeiraConta + " - " + segundaConta);
    }
}
