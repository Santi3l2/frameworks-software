package quiz;


//REALIZADO CON JESUS GERARDO CORRALES SALGUEIRO #9
/**
 *
 * @author santi
 */
import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vida = 120;
        int aciertos = 0;
        int errores = 0;
        int preguntasc = 0;
        char opcion;
        String falladas = "";

        System.out.println("BIENVENIDO AL MEJOR QUIZ DE...");
        System.out.println("      HOLLOW KNIGHT!" + "\n");
        System.out.println("Vida: " + vida + "\n");

        // ---------- Pregunta 1 ----------
        if (vida > 0) {
            System.out.println("1. Que estudio desarrollo Hollow Knight?");
            System.out.println(" a) Team Cherry");
            System.out.println(" b) Moon Studios");
            System.out.println(" c) Supergiant Games");
            System.out.println(" d) Motion Twin");
            opcion = sc.next().charAt(0);
            preguntasc += 1;

            if (opcion == 'a' || opcion == 'A') {
                System.out.println("Correcto!! +5 de vida");
                aciertos += 1;
                vida += 5;
                if (vida > 120) {
                    vida = 120;
                }
            } else {
                System.out.println("Fallaste! La respuesta era la a) -30 de vida");
                vida -= 30;
                errores += 1;
                falladas += "1. Que estudio desarrollo Hollow Knight? (Respuesta: a) Team Cherry)\n";
            }
            System.out.println("Vida: " + vida + "\n");
        }

        // ---------- Pregunta 2 ----------
        if (vida > 0) {
            System.out.println("2. Como se llama el reino subterraneo en ruinas donde transcurre el juego?");
            System.out.println(" a) Pharloom");
            System.out.println(" b) Hallownest");
            System.out.println(" c) Lordran");
            System.out.println(" d) Nibel");
            opcion = sc.next().charAt(0);
            preguntasc += 1;

            if (opcion == 'b' || opcion == 'B') {
                System.out.println("Correcto!! +5 de vida");
                aciertos += 1;
                vida += 5;
                if (vida > 120) {
                    vida = 120;
                }
            } else {
                System.out.println("Fallaste! La respuesta era la b) -30 de vida");
                vida -= 30;
                errores += 1;
                falladas += "2. Como se llama el reino subterraneo en ruinas donde transcurre el juego? (Respuesta: b) Hallownest)\n";
            }
            System.out.println("Vida: " + vida + "\n");
        }

        // ---------- Pregunta 3 ----------
        if (vida > 0) {
            System.out.println("3. Cual es la moneda principal del juego, que pierdes al morir si no recuperas tu sombra?");
            System.out.println(" a) Almas");
            System.out.println(" b) Rupias");
            System.out.println(" c) Geo");
            System.out.println(" d) Esencia");
            opcion = sc.next().charAt(0);
            preguntasc += 1;

            if (opcion == 'c' || opcion == 'C') {
                System.out.println("Correcto!! +5 de vida");
                aciertos += 1;
                vida += 5;
                if (vida > 120) {
                    vida = 120;
                }
            } else {
                System.out.println("Fallaste! La respuesta era la c) -30 de vida");
                vida -= 30;
                errores += 1;
                falladas += "3. Cual es la moneda principal del juego, que pierdes al morir si no recuperas tu sombra? (Respuesta: c) Geo)\n";
            }
            System.out.println("Vida: " + vida + "\n");
        }

        // ---------- Pregunta 4 ----------
        if (vida > 0) {
            System.out.println("4. En que zona te enfrentas a Hornet por primera vez?");
            System.out.println(" a) Bocasucia (Dirtmouth)");
            System.out.println(" b) Sendero Verde (Greenpath)");
            System.out.println(" c) Nido Profundo (Deepnest)");
            System.out.println(" d) Ciudad de Lagrimas (City of Tears)");
            opcion = sc.next().charAt(0);
            preguntasc += 1;

            if (opcion == 'b' || opcion == 'B') {
                System.out.println("Correcto!! +5 de vida");
                aciertos += 1;
                vida += 5;
                if (vida > 120) {
                    vida = 120;
                }
            } else {
                System.out.println("Fallaste! La respuesta era la b) -30 de vida");
                vida -= 30;
                errores += 1;
                falladas += "4. En que zona te enfrentas a Hornet por primera vez? (Respuesta: b) Sendero Verde)\n";
            }
            System.out.println("Vida: " + vida + "\n");
        }

        // ---------- Pregunta 5 ----------
        if (vida > 0) {
            System.out.println("5. Que entidad es el origen de la Infeccion que corrompe Hallownest?");
            System.out.println(" a) El Rey Palido");
            System.out.println(" b) Grimm");
            System.out.println(" c) El Resplandor (The Radiance)");
            System.out.println(" d) La Dama Blanca");
            opcion = sc.next().charAt(0);
            preguntasc += 1;

            if (opcion == 'c' || opcion == 'C') {
                System.out.println("Correcto!! +5 de vida");
                aciertos += 1;
                vida += 5;
                if (vida > 120) {
                    vida = 120;
                }
            } else {
                System.out.println("Fallaste! La respuesta era la c) -30 de vida");
                vida -= 30;
                errores += 1;
                falladas += "5. Que entidad es el origen de la Infeccion que corrompe Hallownest? (Respuesta: c) El Resplandor)\n";
            }
            System.out.println("Vida: " + vida + "\n");
        }

        // ---------- Pregunta 6 ----------
        if (vida > 0) {
            System.out.println("6. Que objeto te permite entrar en los suenos y leer los pensamientos de otros?");
            System.out.println(" a) El Aguijon Onirico (Dream Nail)");
            System.out.println(" b) El Corazon del Vacio");
            System.out.println(" c) La Lagrima de Isma");
            System.out.println(" d) El Cristal de Corazon");
            opcion = sc.next().charAt(0);
            preguntasc += 1;

            if (opcion == 'a' || opcion == 'A') {
                System.out.println("Correcto!! +5 de vida");
                aciertos += 1;
                vida += 5;
                if (vida > 120) {
                    vida = 120;
                }
            } else {
                System.out.println("Fallaste! La respuesta era la a) -30 de vida");
                vida -= 30;
                errores += 1;
                falladas += "6. Que objeto te permite entrar en los suenos y leer los pensamientos de otros? (Respuesta: a) El Aguijon Onirico)\n";
            }
            System.out.println("Vida: " + vida + "\n");
        }

        // ---------- Pregunta 7 ----------
        if (vida > 0) {
            System.out.println("7. Quien es el cartografo que va dejando rastros de papel y te vende mapas de cada zona?");
            System.out.println(" a) Quirrel");
            System.out.println(" b) Cornifer");
            System.out.println(" c) Zote");
            System.out.println(" d) Sly");
            opcion = sc.next().charAt(0);
            preguntasc += 1;

            if (opcion == 'b' || opcion == 'B') {
                System.out.println("Correcto!! +5 de vida");
                aciertos += 1;
                vida += 5;
                if (vida > 120) {
                    vida = 120;
                }
            } else {
                System.out.println("Fallaste! La respuesta era la b) -30 de vida");
                vida -= 30;
                errores += 1;
                falladas += "7. Quien es el cartografo que va dejando rastros de papel y te vende mapas de cada zona? (Respuesta: b) Cornifer)\n";
            }
            System.out.println("Vida: " + vida + "\n");
        }

        // ---------- Pregunta 8 ----------
        if (vida > 0) {
            System.out.println("8. Cual de estos personajes NO es uno de los tres Sonadores que sellan al Recipiente Puro?");
            System.out.println(" a) Monomon la Maestra");
            System.out.println(" b) Lurien el Vigilante");
            System.out.println(" c) Herrah la Bestia");
            System.out.println(" d) Quirrel");
            opcion = sc.next().charAt(0);
            preguntasc += 1;

            if (opcion == 'd' || opcion == 'D') {
                System.out.println("Correcto!! +5 de vida");
                aciertos += 1;
                vida += 5;
                if (vida > 120) {
                    vida = 120;
                }
            } else {
                System.out.println("Fallaste! La respuesta era la d) -30 de vida");
                vida -= 30;
                errores += 1;
                falladas += "8. Cual de estos personajes NO es uno de los tres Sonadores que sellan al Recipiente Puro? (Respuesta: d) Quirrel)\n";
            }
            System.out.println("Vida: " + vida + "\n");
        }

        // ---------- Pregunta 9 ----------
        if (vida > 0) {
            System.out.println("9. Quien compuso la banda sonora de Hollow Knight?");
            System.out.println(" a) Darren Korb");
            System.out.println(" b) Toby Fox");
            System.out.println(" c) Christopher Larkin");
            System.out.println(" d) Gareth Coker");
            opcion = sc.next().charAt(0);
            preguntasc += 1;

            if (opcion == 'c' || opcion == 'C') {
                System.out.println("Correcto!! +5 de vida");
                aciertos += 1;
                vida += 5;
                if (vida > 120) {
                    vida = 120;
                }
            } else {
                System.out.println("Fallaste! La respuesta era la c) -30 de vida");
                vida -= 30;
                errores += 1;
                falladas += "9. Quien compuso la banda sonora de Hollow Knight? (Respuesta: c) Christopher Larkin)\n";
            }
            System.out.println("Vida: " + vida + "\n");
        }

        // ---------- Pregunta 10 ----------
        if (vida > 0) {
            System.out.println("10. Quien es la madre de Hornet?");
            System.out.println(" a) La Dama Blanca");
            System.out.println(" b) Herrah la Bestia");
            System.out.println(" c) Monomon la Maestra");
            System.out.println(" d) Unn");
            opcion = sc.next().charAt(0);
            preguntasc += 1;

            if (opcion == 'b' || opcion == 'B') {
                System.out.println("Correcto!! +5 de vida");
                aciertos += 1;
                vida += 5;
                if (vida > 120) {
                    vida = 120;
                }
            } else {
                System.out.println("Fallaste! La respuesta era la b) -30 de vida");
                vida -= 30;
                errores += 1;
                falladas += "10. Quien es la madre de Hornet? (Respuesta: b) Herrah la Bestia)\n";
            }
            System.out.println("Vida: " + vida + "\n");
        }

        // ---------- Resultados ----------
        if (vida <= 0) {
            System.out.println("Te quedaste sin vida... GAME OVER");
        } else {
            System.out.println("Sobreviviste a Hallownest!");
        }

        // Se calcula al final, cuando preguntasc ya no es 0.
        // El 100.0 hace que la division sea con decimales.
        double porcentaje = (aciertos * 100.0) / preguntasc;
        String resultado;

        if (porcentaje >= 90) {
            resultado = "Excelente!";
        } else if (porcentaje >= 70) {
            resultado = "Aprobado";
        } else {
            resultado = "Necesitas repasar";
        }

        System.out.println("============ RESUMEN ============");
        System.out.println("Preguntas contestadas: " + preguntasc + " de 10");
        System.out.println("Aciertos:              " + aciertos);
        System.out.println("Errores:               " + errores);
        System.out.printf("Porcentaje:            %.1f%%%n", porcentaje);
        System.out.println("Vida final:            " + vida);
        System.out.println("Resultado:             " + resultado);
        if (errores == 0) {
            System.out.println("No fallaste ninguna pregunta!");
        } else {
            System.out.println("Preguntas que fallaste:");
            System.out.print(falladas);
        }
        System.out.println("=================================");
    }
}
