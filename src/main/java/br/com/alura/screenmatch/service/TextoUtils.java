package br.com.alura.screenmatch.service;

public class TextoUtils {
    public static String limparTexto(String texto) {
        if (texto == null) return "";

        return texto
                .replaceAll("[\\n\\r\\t]+", " ") // remove quebras de linha e tabulações
                .replaceAll("\\s{2,}", " ")      // substitui múltiplos espaços por 1
                .replaceAll("^\\s+|\\s+$", "")   // remove espaços no início e no fim
                .replaceAll("^['\"]|['\"]$", ""); // remove aspas simples ou duplas no início/fim
    }
}
