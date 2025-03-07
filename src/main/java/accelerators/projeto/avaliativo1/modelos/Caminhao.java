package accelerators.projeto.avaliativo1.modelos;

public class Caminhao extends Veiculo {

    //construtor do Caminhão
    public Caminhao(String modelo){
        super(modelo);
    }

    @Override
    public void aumentarVelocidade() {
        velocidade += 2;

        if (velocidade > 0 && velocidade <= 15) {
            marcha = 1;
        }else if (velocidade > 15 && marcha < 2) {
            marcha += 1;
        }else if (velocidade > 40 && marcha < 3) {
            marcha += 1;
        }else if (velocidade > 50 && marcha < 4) {
            marcha += 1;
        }else if (velocidade > 70 && marcha < 5) {
            marcha += 1;
        }
    }

    @Override
    public void diminuirVelocidade() {
        velocidade -= 2;
        if (velocidade < 0) {
            velocidade = 0;
        }

        if (velocidade <= 60 && marcha > 4) {
            marcha -= 1;
        }else if (velocidade <= 45 && marcha > 3) {
            marcha -= 1;
        }else if (velocidade <= 35 && marcha > 2) {
            marcha -= 1;
        }else if (velocidade <= 10 && marcha > 1) {
            marcha -= 1;
        }
    }

}
