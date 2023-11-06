public class SumaCifrelor {
    public static void main(String[] args) {
        int numar = 254;
        int suma = calculeazaSumaCifrelor(numar);
        System.out.println("Suma cifrelor este: " + suma);
    }

    public static int calculeazaSumaCifrelor(int numar) {
        int suma = 0;

        while (numar != 0) {
            suma += numar % 10; // Adaugăm ultima cifră la suma
            numar /= 10; // Eliminăm ultima cifră
        }

        return suma;
    }
}
