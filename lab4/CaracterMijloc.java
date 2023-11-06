public class CaracterMijloc {
    public static void main(String[] args) {
        String cuvant = "masina";
        String mijloc = gasesteCaracterMijloc(cuvant);
        System.out.println("Caracterul/caracterele din mijloc: " + mijloc);
    }

    public static String gasesteCaracterMijloc(String cuvant) {
        int lungime = cuvant.length();
        if (lungime % 2 == 0) {
            // Cuvântul are un număr par de litere, deci mijlocul are două litere.
            int mijloc1 = lungime / 2 - 1;
            int mijloc2 = lungime / 2;
            return cuvant.substring(mijloc1, mijloc2 + 1);
        } else {
            // Cuvântul are un număr impar de litere, deci mijlocul are o singură literă.
            int mijloc = lungime / 2;
            return cuvant.substring(mijloc, mijloc + 1);
        }
    }
}
