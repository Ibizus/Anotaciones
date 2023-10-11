import org.iesvdm.Empresa;
import org.iesvdm.utils.Contexto;
import org.junit.jupiter.api.Test;

public class EmpresaTest {

    @Test
    public void testProcesadorDeContexto(){

        Empresa nueva = new Empresa();
        Contexto.cargadorDeContexto(nueva);
    }
}
