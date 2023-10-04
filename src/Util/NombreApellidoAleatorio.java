package Util;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class NombreApellidoAleatorio {
    private static final String projectPath = System.getProperty("user.dir");
    private static final String RUTA_ARCHIVO_NOMBRE = projectPath + File.separator +
                                                      "src" + File.separator +
                                                      "Util" + File.separator +
                                                      "nombres.txt";

    private static final String RUTA_ARCHIVO_APELLIDO = projectPath + File.separator +
                                                     "src" + File.separator +
                                                     "Util" + File.separator +
                                                     "apellidos.txt";
    private static int NUMERO_DE_NOMBRES;
    private static int NUMERO_DE_APELLIDO;
    private static final Random RANDOM = new Random();

    static {
        try {
            NUMERO_DE_NOMBRES = (int) Files.lines(Paths.get(RUTA_ARCHIVO_NOMBRE)).count();
            NUMERO_DE_APELLIDO = (int) Files.lines(Paths.get(RUTA_ARCHIVO_APELLIDO)).count();
        } catch (Exception e) {
            e.printStackTrace();
            NUMERO_DE_NOMBRES = 0;
            NUMERO_DE_APELLIDO = 0;
        }
    }

    private static String DatoAleatorio(String rutaArchivo, int nroDatos) {
        if (nroDatos == 0) {
            return "Dato genérico";
        }

        int indiceAleatorio = RANDOM.nextInt(nroDatos);
        try {
            return Files.lines(Paths.get(rutaArchivo))
                    .skip(indiceAleatorio)
                    .findFirst()
                    .orElse("Dato no encontrado");
        } catch (Exception e) {
            e.printStackTrace();
            return "Dato genérico";
        }
    }

    public static String Nombre() {
        return AleatorioNombre();
    }

    public static String Apellido() {
        return AleatorioApellido();
    }

    public static String AleatorioNombre() {
        return DatoAleatorio(RUTA_ARCHIVO_NOMBRE, NUMERO_DE_NOMBRES);
    }

    public static String AleatorioApellido() {
        return DatoAleatorio(RUTA_ARCHIVO_APELLIDO, NUMERO_DE_APELLIDO);
    }
}

