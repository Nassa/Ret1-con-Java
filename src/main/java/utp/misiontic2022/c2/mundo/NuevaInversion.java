package utp.misiontic2022.c2.mundo;

public class NuevaInversion {

    // ---------------------------------------------
    // Atributos

    private double capital;
    private double interes;
    private Integer tiempo;

    // ---------------------------------------------
    // Constructor

    public NuevaInversion() {

    
    }

    // ---------------------------------------------
    // Métodos
    public void compararInversion(int pTiempo, double pCapital, double pInteres){

        this.capital = pCapital;
        this.interes = pInteres;
        this.tiempo = pTiempo;


        double simple = capital * (interes / 100) * tiempo;
        double compuesto = capital * (Math.pow(1 + interes / 100, tiempo) - 1);
        double diferencia = compuesto - simple;

        if ((simple != 0) && (compuesto != 0)) {

            System.out.println("El interés simple es: " + simple + ", el interés compuesto es: " + compuesto
                    + ", La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: "+diferencia);
        }else{

            System.out.println("Faltan datos para calcular la diferencia en el total de intereses generados para el proyecto.");


        }
    }

}
