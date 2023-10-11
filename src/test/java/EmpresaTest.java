import org.iesvdm.*;
import org.iesvdm.anotations.EmpleadoAnot;
import org.iesvdm.utils.Contexto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpresaTest {

    @Test
    @BeforeEach
    public void testProcesadorDeContexto(){

        Empresa nueva = new Empresa();
        Contexto.cargadorDeContexto(nueva);
    }


    @Test
    public void empleadosTienenLaClaseEsperada(){

        int countTecnicos = 0;
        int expTecn = 4;
        int countOficiales = 0;
        int expOfic = 2;
        int countDirectivos = 0;
        int expDire = 1;

        Empresa nueva = new Empresa();
        Contexto.cargadorDeContexto(nueva);
        for (Empleado trabajador: nueva.getEmpleadoSet()) {

            if (trabajador instanceof Tecnico){
               countTecnicos++;

            } else if (trabajador instanceof Oficial) {
                countOficiales++;

            } else if (trabajador instanceof Directivo) {
                countDirectivos++;
            }
        }

        Assertions.assertEquals(expTecn, countTecnicos);
        Assertions.assertEquals(expOfic, countOficiales);
        Assertions.assertEquals(expDire, countDirectivos);

    }
}
