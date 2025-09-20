package tp2_programacionestructurada;

public class Ej13 {

   
    static double[] precios = {100, 340, 560, 780, 830};

   
    public static void imprimirOriginales(int index) {
        if (index >= precios.length) return;
        System.out.println("Precio inicial" + index +  + precios[index]);
        imprimirOriginales(index + 1);
    }

    
    public static void imprimirModificados(int index) {
        if (index >= precios) return;
        System.out.println("Precio modificado" + index +  + precios[index]);
        imprimirModificados(index + 1);
    }

    
    public static void main(String[] args) {
        System.out.println("Precios iniciales");
        imprimirOriginales(0);

       
        precios[2] = 899.00;

        System.out.println("Precios con modificación");
        imprimirModificados(0);
    }
}
