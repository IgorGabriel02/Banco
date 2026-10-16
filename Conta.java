

public class Conta {
    String nome;
    private float saldo;

    public Conta(String nome) {
        this.nome = nome;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;

    }

    public float getSaldo() {
        return saldo;
    }

    public void takeSaldo(float Saldo) {
        this.saldo -= saldo;
    }

}