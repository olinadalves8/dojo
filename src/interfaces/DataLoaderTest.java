package src.interfaces;

public class DataLoaderTest {
    public static void main(String[] args) {
        
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();
    }

}
