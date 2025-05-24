package alinepaz_atividade1;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class MinhaClasse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados: o usuário digita a frase que será analisada
        System.out.println("📝 Digite uma cadeia de caracteres:");
        String texto = scanner.nextLine();

        // Mapa para armazenar a frequência de cada caractere encontrado
        Map<Character, Integer> frequencia = new HashMap<>();

        // Loop para percorrer cada caractere da string
        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);

            // Atualiza o contador do caractere no mapa
            frequencia.put(caractere, frequencia.getOrDefault(caractere, 0) + 1);
        }

        // Impressão do relatório com formatação personalizada
        System.out.println("\n📊 RELATÓRIO DE FREQUÊNCIA");
        System.out.println("==========================");

        for (Map.Entry<Character, Integer> entrada : frequencia.entrySet()) {
            char caractere = entrada.getKey();
            int quantidade = entrada.getValue();

            // Define singular ou plural para "vez" ou "vezes"
            String vezes = quantidade == 1 ? "VEZ" : "VEZES";

            // Exibe o caractere entre aspas + hífen + número de ocorrências
            System.out.println("\"" + caractere + "\" – " + quantidade + " " + vezes);
        }

        // Minha assinatura
        System.out.println("\n----------------------------");
        System.out.println("Desenvolvido por Aline Paz 💻");
        System.out.println("Data: 24/05/2025");
        System.out.println("----------------------------");

        scanner.close();
    }
}