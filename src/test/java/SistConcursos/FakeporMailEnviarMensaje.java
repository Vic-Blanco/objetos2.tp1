package SistConcursos;

public class FakeporMailEnviarMensaje implements EnviarMensaje {


    @Override
    public void enviar(String mensaje, String cuerpo) {
        // Simular el envío de un mensaje por correo electrónico
        System.out.println("Enviando mensaje por correo: " + mensaje);
    }


}
