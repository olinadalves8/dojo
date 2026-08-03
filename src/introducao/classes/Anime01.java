package src.introducao.classes;

public class Anime01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("dbd", "crunchyroll", 2);
        anime.init("dbd", "crunchyroll", 2, "Ação");
        anime.imprime();

    }

}
