package br.com.alura.screenmatch.model;

public enum Categoria {
    ACAO("Action", "Ação"),
    AVENTURA("Adventure", "Aventura"),
    COMEDIA("Comedy", "Comédia"),
    CRIME("Crime", "Crime"),
    DRAMA("Drama", "Drama"),
    FANTASIA("Fantasy", "Fantasia"),
    ROMANCE("Romance", "Romance"),
    TERROR("Horror", "Terror");

    private String categoriaOmdb;

    private String categoriaPortugues;

    Categoria(String categoriaOmdb, String categoriaPortugues){
        this.categoriaOmdb = categoriaOmdb;
        this.categoriaPortugues = categoriaPortugues;
    }

    public static Categoria fromString(String text) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaOmdb.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada para a string fornecida: " + text);
    }

    public static Categoria fromPortugues(String text) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaPortugues.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada para a string fornecida: " + text);
    }
}
