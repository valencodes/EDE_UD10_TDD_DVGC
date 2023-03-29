public class Coche {
    public int velocidad;

    public void acelerar_Daniela_Valentina_Galeote_Calderon(int aceleracion) {
        velocidad += aceleracion;
    }

    public void decelerar_Daniela_Valentina_Galeote_Calderon(int deceleracion) {
        velocidad -= deceleracion;
        if (velocidad <0) velocidad = 0;
    }
}
