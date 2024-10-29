package diagnostic;

import java.util.Scanner;

public class DiagnosticCabine {

    public static String obtenirUniteMedicale(int indexSante) {
        StringBuilder uniteMedicale = new StringBuilder();

        // Vérifie si l'index de santé est un multiple de 3
        if (indexSante % 3 == 0) {
            uniteMedicale.append("Cardiologie");
        }
        
        // Vérifie si l'index de santé est un multiple de 5
        if (indexSante % 5 == 0) {
            if (uniteMedicale.length() > 0) {
                uniteMedicale.append(", ");
            }
            uniteMedicale.append("Traumatologie");
        }

        // Si aucune unité médicale n'est trouvée, le patient n'a pas de pathologie
        if (uniteMedicale.length() == 0) {
            return "Aucune pathologie détectée";
        }

        return uniteMedicale.toString();
    }

    public static void main(String[] args) {
        // Exemples de tests
        int[] indexSanteExemples = {33, 55, 15, 7};

        for (int index : indexSanteExemples) {
            System.out.println("Index de santé : " + index + " => " + obtenirUniteMedicale(index));
        }
        
        Scanner scanner = new Scanner(System.in);

        // Test du programme avec saisie d'un utilisateur
        System.out.print("Veuillez entrer l'index de santé du patient : ");
        int indexSante = scanner.nextInt();

        String resultat = obtenirUniteMedicale(indexSante);
        System.out.println("Diagnostic : " + resultat);

        scanner.close();
    }
}