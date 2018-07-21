package Programowanie.zaj6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileAccesService {

    private String path;

    public FileAccesService(String path) {
        this.path = path;
    }

    //zwraca wszystkie linie z pliku testowaego w postaci listy
    public List<String> loadAllLines() throws IOException {
        Path p = Paths.get(path);
        return Files.readAllLines(p);
    }
}
