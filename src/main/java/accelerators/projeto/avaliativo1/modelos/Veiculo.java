package accelerators.projeto.avaliativo1.modelos;

//classe abstrata Veiculo
public abstract class Veiculo {
    protected float velocidade;
    protected int marcha;
    private String modelo;

    //construtor que recebe modelo
    //por padrão, velocidade iniciará como 0 e marcha como 1
    public Veiculo(String modelo) {
        this.velocidade = 0;
        this.marcha = 0;
        this.modelo = modelo;
    }

    //get e set para o modelo
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //metodo info para exibir dados
    public String[] info(){
        String[] aux = new String[3];
        aux[0] = modelo;
        aux[1] = velocidade + "";
        aux[2] = marcha + "";
        return aux;
    }

    //metodos abstratos
    public abstract void aumentarVelocidade();
    public abstract void diminuirVelocidade();
    
}
