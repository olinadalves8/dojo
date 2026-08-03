package src.initi;

public class Anime01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        
        for (int episodio : anime.getEpisodios()){
            System.out.print( episodio + " ");

        }
    }

}
