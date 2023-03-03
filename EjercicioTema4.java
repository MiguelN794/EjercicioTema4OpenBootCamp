public class EjercicioEstructurasControl {
    public static void main(String[] args) {
        int numeroIf = 5;

        if (numeroIf > 0) {
            System.out.println("El número es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }

        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        int numeroDoWhile = 0;
        do {
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
        } while (numeroDoWhile < 3);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        String estacion = "Verano";
        switch (estacion) {
            case "Primavera":
                System.out.println("Estamos en primavera");
                break;
            case "Verano":
                System.out.println("Estamos en verano");
                break;
            case "Otoño":
                System.out.println("Estamos en otoño");
                break;
            case "Invierno":
                System.out.println("Estamos en invierno");
                break;
            default:
                System.out.println("No se reconoce la estación");
        }
    }
}