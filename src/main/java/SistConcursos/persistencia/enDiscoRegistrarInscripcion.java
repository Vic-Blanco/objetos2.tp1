package SistConcursos.persistencia;

import SistConcursos.RegistrarInscripcion;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class enDiscoRegistrarInscripcion implements RegistrarInscripcion {

    public void registrar(String registro) {
        try {
            Files.write(Paths.get("D:/Documents/registroInscripcion.txt"), registro.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException("Error al registrar la inscripcion", e);
        }
    }


}
