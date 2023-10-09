import org.iesvdm.Empresa;
import org.junit.jupiter.api.Test;

public class EmpresaTest {

    @Test
    public void testProcesadorDeContexto(){

        Empresa nueva = new Empresa();
        Empresa.cargadorDeContexto(nueva);
    }
}
