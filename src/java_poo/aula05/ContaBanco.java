package java_poo.aula05;

// Classe que representa uma conta bancária
public class ContaBanco {
    // Atributos da conta
    public int numConta;         // Número da conta (público)
    protected String tipo;       // Tipo de conta (CC para conta corrente, CP para conta poupança)
    private String dono;         // Nome do proprietário da conta (privado)
    private float saldo;         // Saldo atual da conta (privado)
    private boolean status;      // Status da conta (aberta ou fechada)

    // Método que exibe o estado atual da conta
    public void estadoAtual() {
        System.out.println("-----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    // Método para abrir uma nova conta
    public void abrirConta(String t) {
        this.setTipo(t);          // Define o tipo de conta
        this.setStatus(true);     // Define a conta como aberta
        
        // Define o saldo inicial com base no tipo de conta
        if (t == "CC") {
            this.setSaldo(50);    // Saldo inicial para conta corrente
        } else if(t == "CP") {
            this.setSaldo(150);   // Saldo inicial para conta poupança
        }
        System.out.println("Conta aberta com sucesso!");
    }

    // Método para fechar a conta
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada ainda tem dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada pois tem débito");
        } else {
            this.setStatus(false);  // Fecha a conta se não houver saldo ou débito
            System.out.println("Conta fechada com sucesso!");
        }
    }

    // Método para depositar um valor na conta
    public void depositar(float v) {
        if (this.getStatus()) {   // Verifica se a conta está aberta
            this.setSaldo(this.getSaldo() + v);  // Adiciona o valor ao saldo
            System.out.println("Deposito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Impossível depositar em uma conta fechada!");
        }
    }

    // Método para sacar um valor da conta
    public void sacar(float v) {
        if (this.getStatus()) {   // Verifica se a conta está aberta
            if (this.getSaldo() >= v) { 
                this.setSaldo(this.getSaldo() - v);  // Deduz o valor do saldo
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque");
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada");
        }
    }

    // Método para pagar a mensalidade da conta
    public void pagarMensal() {
        int v = 0;
        
        // Define o valor da mensalidade com base no tipo de conta
        if (this.getTipo() == "CC") {
            v = 12;  // Mensalidade para conta corrente
        } else if(this.getTipo() == "CP"){
            v = 20;  // Mensalidade para conta poupança
        }
        
        if(this.getStatus()) {   // Verifica se a conta está aberta
            this.setSaldo(this.getSaldo() - v);  // Deduz a mensalidade do saldo
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        } else {
            System.out.println("Impossível pagar uma conta fechada!");
        }
    }

    // Construtor da classe ContaBanco
    public ContaBanco() {
        this.setSaldo(0);       // Inicializa o saldo como zero
        this.setStatus(false);   // Inicializa o status como fechado
    }

    // Métodos especiais (getters e setters)
    
    public int getNumConta() {
        return numConta;       // Retorna o número da conta
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;  // Define o número da conta
    }

    public String getTipo() {
        return tipo;          // Retorna o tipo de conta
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;     // Define o tipo de conta
    }

    public String getDono() {
        return dono;         // Retorna o nome do dono da conta
    }

    public void setDono(String dono) {
        this.dono = dono;     // Define o nome do dono da conta
    }

    public float getSaldo() {
        return saldo;         // Retorna o saldo da conta
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;   // Define o saldo da conta
    }

    public boolean getStatus() {
        return status;       // Retorna o status da conta (aberta ou fechada)
    }

    public void setStatus(boolean status) {
        this.status = status;  // Define o status da conta