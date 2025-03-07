package accelerators.projeto.avaliativo1.modelos;

public class CarroEsportivo extends Veiculo {

    //construtor do Carro esportivo
    //se apoia no construtor de Veiculo
    public CarroEsportivo(String modelo){
        super(modelo);
    }

    //metodo para aumentar velocidade
    //a cada marco específico de velocidade, incrementa a marcha em 1
    //checa cada marcha para impedir incremento infinito de marcha conforme clique do botão acelerar
    @Override
    public void aumentarVelocidade() {
        velocidade += 4;
        //checagem inicial para verificar se a marcha ficará zerada
        if (velocidade > 0 && velocidade <= 20) {
            marcha = 1;
        }else if (velocidade > 20 && marcha < 2) {
            this.marcha += 1;
        }else if (velocidade > 60 && marcha < 3) {
            marcha += 1;
        }else if (velocidade > 90 && marcha < 4) {
            marcha += 1;
        }else if (velocidade > 110 && marcha < 5) {
            marcha += 1;
        }else if (velocidade > 120 && marcha < 6) {
            marcha += 1;
        }
    }

    //metodo para diminuir velocidade
    //redefine a marcha conforme cada marco específico de velocidade
    @Override
    public void diminuirVelocidade() {
        velocidade -= 3;
        if (velocidade < 0) {
            velocidade = 0;
        }

        if (velocidade <= 10 && marcha > 1) {
            marcha -= 1;
        }else if (velocidade <= 20 && marcha > 2) {
            marcha -= 1;
        }else if (velocidade <= 40 && marcha > 3) {
            marcha -= 1;
        }else if (velocidade <=  70 && marcha > 4) {
            marcha -= 1;
        }else if (velocidade <= 90 && marcha > 5) {
            marcha -= 1;
        }
    }

}
