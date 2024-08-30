public class ContaTerminal {

    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public ContaTerminal(int numero, String agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public void exibirMensagem() {
        String mensagem = "Olá ".concat(nomeCliente)
                                  .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                                  .concat(agencia)
                                  .concat(", conta ")
                                  .concat(String.valueOf(numero))
                                  .concat(" e seu saldo ")
                                  .concat(String.valueOf(saldo))
                                  .concat(" já está disponível para saque.");
        System.out.println(mensagem);
    }

    // Getters e Setters (opcionais, caso queira usá-los posteriormente)
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
