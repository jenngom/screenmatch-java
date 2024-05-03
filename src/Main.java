import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        //System.out.println("Película Matrix");

        //Declaración de variables
        int fechaDeLanzamiento = 199;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        //Las 3 comillas dobles son para crear un bloque de texto
        String sinopsis = """
                La mejor película del fin del milenio
                """;
        double mediaEvaluacionUsuario = 0;

        //Impresión de los atributos de las variables
        System.out.println("Película: " + nombre);
        System.out.println("Año de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Evaluación: " + evaluacion);
        System.out.println("¿Está incluido en el plan básico?: " + incluidoEnElPlanBasico);

        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        System.out.println("Media de la evaluación de la Matrix: " + mediaEvaluacion);

        if (fechaDeLanzamiento > 2023) {
            System.out.println("Pelicula Popular en el momento");
        } else {
            System.out.println("Película Retro que vale la pena ver");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la evaluación que le darías a Matrix");
            double evaluacionMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + evaluacionMatrix;
        }
        System.out.println("La media de la película " +
                "Matrix por el usuario es: " + mediaEvaluacionUsuario / 3);
    }
}