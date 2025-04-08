package SistCostos.persistencia;

import SistCostos.RegistrarPedido;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class enDiscoRegistrarPedido implements RegistrarPedido {

    @Override
    public void registrar(String registro) {
        try {
            Files.write(Paths.get("D:/Documents/registroPedido.txt"), registro.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(" Error al registrar el pedido: " + e.getMessage());
        }
    }
}
