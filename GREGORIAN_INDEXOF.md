import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class EjemplosCalendar {

    public static void main(String[] args) {

        System.out.println("===== 1. Crear Calendarios =====");
        Calendar calActual = new GregorianCalendar();  // Fecha y hora actual
        Calendar calEspecifico = new GregorianCalendar(2025, Calendar.NOVEMBER, 24);

        mostrarFecha("Fecha actual", calActual);
        mostrarFecha("Fecha específica (24/11/2025)", calEspecifico);


        System.out.println("\n===== 2. Obtener Valores =====");
        int anio = calActual.get(Calendar.YEAR);
        int mes = calActual.get(Calendar.MONTH) + 1; // corregido para humano
        int dia = calActual.get(Calendar.DAY_OF_MONTH);

        int diaSemana = calActual.get(Calendar.DAY_OF_WEEK); // domingo=1
        int hora = calActual.get(Calendar.HOUR_OF_DAY);
        int minuto = calActual.get(Calendar.MINUTE);

        System.out.println("Año: " + anio);
        System.out.println("Mes: " + mes);
        System.out.println("Día: " + dia);
        System.out.println("Día de la semana (1=Domingo): " + diaSemana);
        System.out.println("Hora actual: " + hora);
        System.out.println("Minuto actual: " + minuto);


        System.out.println("\n===== 3. Modificar Fechas =====");

        // set()
        calEspecifico.set(Calendar.YEAR, 2030);
        calEspecifico.set(Calendar.MONTH, Calendar.JULY);
        calEspecifico.set(Calendar.DAY_OF_MONTH, 15);

        mostrarFecha("Fecha modificada con set()", calEspecifico);

        // add()
        calEspecifico.add(Calendar.DAY_OF_MONTH, 5);
        calEspecifico.add(Calendar.MONTH, -1);

        mostrarFecha("Fecha modificada con add()", calEspecifico);

        // roll()
        Calendar calRoll = new GregorianCalendar(2025, Calendar.JANUARY, 30);
        calRoll.roll(Calendar.DAY_OF_MONTH, 5);  // NO cambia el mes

        mostrarFecha("Ejemplo roll() (30 Ene + 5 días)", calRoll);


        System.out.println("\n===== 4. Máximos y mínimos del mes =====");
        Calendar calFeb = new GregorianCalendar(2024, Calendar.FEBRUARY, 1);
        int diasFebrero = calFeb.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("Días de Febrero 2024: " + diasFebrero);


        System.out.println("\n===== 5. Timestamp y conversiones =====");
        long ms = System.currentTimeMillis();
        Calendar calDesdeMs = new GregorianCalendar();
        calDesdeMs.setTimeInMillis(ms);

        mostrarFecha("Fecha desde milisegundos", calDesdeMs);

        // Calendar → Date
        Date fechaDate = calActual.getTime();
        System.out.println("Calendar a Date: " + fechaDate);

        // Date → Calendar
        Date ahora = new Date();
        Calendar calDesdeDate = new GregorianCalendar();
        calDesdeDate.setTime(ahora);

        mostrarFecha("Fecha obtenida desde Date", calDesdeDate);


        System.out.println("\n===== 6. Ejemplo Completo =====");
        Calendar ejemplo = new GregorianCalendar();
        ejemplo.set(Calendar.YEAR, 2030);
        ejemplo.add(Calendar.MONTH, 2);

        mostrarFecha("Fecha final ejemplo", ejemplo);
    }


    // Método para imprimir fechas en formato dd/MM/yyyy
    public static void mostrarFecha(String titulo, Calendar cal) {
        int d = cal.get(Calendar.DAY_OF_MONTH);
        int m = cal.get(Calendar.MONTH) + 1;
        int a = cal.get(Calendar.YEAR);
        System.out.println(titulo + ": " + d + "/" + m + "/" + a);
    }
}

//=============

public class EjemploIndexOfYChar {

    public static void main(String[] args) {

        String texto = "Programación en Java";

        System.out.println("Texto: " + texto);

        // ===== 1. indexOf con char =====
        char busqueda1 = 'J';
        int pos1 = texto.indexOf(busqueda1);
        System.out.println("\nBuscar char '" + busqueda1 + "' → posición: " + pos1);

        char busqueda2 = 'o';
        int pos2 = texto.indexOf(busqueda2);
        System.out.println("Buscar char '" + busqueda2 + "' → posición: " + pos2);


        // ===== 2. indexOf con String =====
        String palabra = "Java";
        int pos3 = texto.indexOf(palabra);
        System.out.println("\nBuscar palabra \"" + palabra + "\" → posición: " + pos3);


        // ===== 3. indexOf desde un índice concreto =====
        int pos4 = texto.indexOf('a', 5); // buscar 'a' empezando desde el índice 5
        System.out.println("\nBuscar 'a' desde índice 5 → posición: " + pos4);


        // ===== 4. Comprobar si un char existe en el texto =====
        char letra = 'z';
        if (texto.indexOf(letra) != -1) {
            System.out.println("\nLa letra '" + letra + "' está en el texto.");
        } else {
            System.out.println("\nLa letra '" + letra + "' NO está en el texto.");
        }


        // ===== 5. Recorrer un String char por char =====
        System.out.println("\nRecorriendo texto char por char:");
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            System.out.println("Índice " + i + " → '" + c + "'");
        }
    }
}// ===================

public class ExtraerFecha {

    public static void main(String[] args) {

        String texto = "La fecha del evento es 2/3/2024 a las 17:00.";
        // También sirve: "La fecha es 02/03/2024 y debes venir."

        // 1. Buscar la PRIMERA barra
        int posPrimeraBarra = texto.indexOf('/');

        // 2. Buscar la SEGUNDA barra (empezando desde después de la primera)
        int posSegundaBarra = texto.indexOf('/', posPrimeraBarra + 1);

        // 3. Desde la primera barra, retrocedemos para encontrar el inicio del día
        int inicio = posPrimeraBarra - 1;
        while (inicio >= 0 && Character.isDigit(texto.charAt(inicio))) {
            inicio--;
        }
        inicio++; // nos quedamos en el primer dígito

        // 4. Avanzamos desde la segunda barra hasta el final del año
        int fin = posSegundaBarra + 1;
        while (fin < texto.length() && Character.isDigit(texto.charAt(fin))) {
            fin++;
        }

        String fecha = texto.substring(inicio, fin);

        System.out.println("Fecha encontrada: " + fecha);
    }
}// =============

// ======= Clase de excepción personalizada =======
class MiExcepcion extends Exception {

    public MiExcepcion(String mensaje) {
        super(mensaje);
    }
}


// ======= Programa principal =======
public class EjemploExcepcionPersonalizada {

    // Método que lanza la excepción
    public static void comprobarEdad(int edad) throws MiExcepcion {
        if (edad < 18) {
            throw new MiExcepcion("La edad debe ser mayor o igual a 18.");
        }
        System.out.println("Edad correcta: " + edad);
    }


    public static void main(String[] args) {

        try {
            comprobarEdad(15);  // Provoca la excepción
        }
        catch (MiExcepcion e) {
            System.out.println(">> Excepción capturada:");
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Bloque finally ejecutado (opcional).");
        }

        System.out.println("El programa no se detuvo, sigue funcionando.");
    }
}

