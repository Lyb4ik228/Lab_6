package pl.lublin.wsei.java.cwiczenia;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Controller {
    public static void InAndOut() throws IOException {
        File oryginal = new File("sample_1920×1280.tiff");
        File kopia = new File("img_copy2.tiff");
        Files.copy(oryginal.toPath(), kopia.toPath());
    }
}
