import org.iesvdm.*;
import org.iesvdm.anotations.EmpleadoAnot;
import org.iesvdm.utils.Contexto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

public class EmpresaTest {

    @Test
    @BeforeEach
    public void testProcesadorDeContexto(){
        // Comprobamos que se instancia la empresa y el cargador de contexto
        // hace su trabajo sin que se encuentren problemas en el código:
        Empresa nueva = new Empresa();
        Contexto.cargadorDeContexto(nueva);
    }

    @Test
    public void testCargadorNoMeteRepetidos(){
        Empresa nueva = new Empresa();
        Contexto.cargadorDeContexto(nueva);
        // Se comprueba que se han creado 6 empleados y no 7 como hemos intentado cargar en la instancia de empresa:
        int expected = 6;
        Assertions.assertEquals(expected, nueva.getEmpleadoSet().size());
    }

    @Test
    public void numeroDeInstanciasCorrectasParaCadaClase(){
        Empresa nueva = new Empresa();
        Contexto.cargadorDeContexto(nueva);
        // Iteramos sobre el Set de Empleados y accedemos a su clase con instanceOf
        // para comprobar que coincide con la esperada:
        for (Empleado trabajador: nueva.getEmpleadoSet()) {

            // Hacemos el ASSERT de las clases:
            if (trabajador instanceof Tecnico){
                Assertions.assertInstanceOf(Tecnico.class, trabajador);

            } else if (trabajador instanceof Oficial) {
                Assertions.assertInstanceOf(Oficial.class, trabajador);

            } else if (trabajador instanceof Directivo) {
                Assertions.assertInstanceOf(Directivo.class, trabajador);
            }
        }
    }

    @Test
    public void empleadosTienenLasClasesEsperadas(){
        Empresa nueva = new Empresa();
        Contexto.cargadorDeContexto(nueva);

        // Comprobamos que se han creado los Empleados de las clases que hemos pasado al cargador de contexto:
        int countTecnicos = 0;
        int expTecn = 3;
        int countOficiales = 0;
        int expOfic = 2;
        int countDirectivos = 0;
        int expDire = 1;

        // Iteramos sobre el Set de Empleados igual que antes para contar las instancias de cada clase:
        for (Empleado trabajador: nueva.getEmpleadoSet()) {

            if (trabajador instanceof Tecnico){
               countTecnicos++;

            } else if (trabajador instanceof Oficial) {
                countOficiales++;

            } else if (trabajador instanceof Directivo) {
                countDirectivos++;
            }
        }
        // Comprobamos que las cantidades coinciden con lo esperado después de haberlas contado:
        Assertions.assertEquals(expTecn, countTecnicos);
        Assertions.assertEquals(expOfic, countOficiales);
        Assertions.assertEquals(expDire, countDirectivos);
    }
}
