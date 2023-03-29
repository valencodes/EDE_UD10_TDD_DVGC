import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCoche {
    @Test
    public void test_al_crear_un_coche_su_velocidad_es_cero_Daniela_Valentina_Galeote_Calderon(){
        Coche nuevoCoche = new Coche();
        Assertions.assertEquals(0, nuevoCoche.velocidad);
    }
    @Test
    public void test_al_acelerar_un_coche_su_velocidad_aumenta_Daniela_Valentina_Galeote_Calderon(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.acelerar_Daniela_Valentina_Galeote_Calderon(30);
        Assertions.assertEquals(30, nuevoCoche.velocidad);
    }

    @Test
    public void test_al_decelerar_un_coche_su_velocidad_disminuye_Daniela_Valentina_Galeote_Calderon(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.velocidad = 50;
        nuevoCoche.decelerar_Daniela_Valentina_Galeote_Calderon(20);
        Assertions.assertEquals(30, nuevoCoche.velocidad);
    }

    @Test
    public void test_al_decelerar_un_coche_su_velocidad_no_puede_ser_menor_que_cero_Daniela_Valentina_Galeote_Calderon(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.velocidad = 50;
        nuevoCoche.decelerar_Daniela_Valentina_Galeote_Calderon(80);
        Assertions.assertEquals(0, nuevoCoche.velocidad);
    }
}
