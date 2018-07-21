package Programowanie.zaj6;

import java.io.IOException;

public class MainService {

    private FileAccesService fileAccesService;

    public MainService(FileAccesService fileAccesService) {
        this.fileAccesService = fileAccesService;
    }

    public int numOfLines() throws IOException {
        return fileAccesService.loadAllLines().size();
    }
}
