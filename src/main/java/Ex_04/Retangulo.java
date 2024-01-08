package Ex_04;

public class Retangulo {
    double largura;
    double altura;


    Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;

    }

    public Retangulo() {

    }

    public double calcularRetangulo(double altura, double largura){
        return altura * largura;
    }

    public double calcularPerimetro(double altura, double largura) {
        return (largura * 2) + (altura * 2);
    }
}
