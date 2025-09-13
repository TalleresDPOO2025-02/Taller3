package uniandes.dpoo.aerolinea.modelo;

/**
 * Esta clase tiene la información de una ruta entre dos aeropuertos que cubre una aerolínea.
 */
public class Ruta {

    private Aeropuerto origen;
    private Aeropuerto destino;
    private int duracionEstimada;
    private String codigoRuta;
    public Ruta(Aeropuerto origen, Aeropuerto destino, int duracionEstimada, String codigoRuta) {
        this.origen = origen;
        this.destino = destino;
        this.duracionEstimada = duracionEstimada;
        this.codigoRuta = codigoRuta;
    }

    public Aeropuerto getOrigen() {
        return origen;
    }

    public Aeropuerto getDestino() {
        return destino;
    }

    public int getDuracionEstimada() {
        return duracionEstimada;
    }

    public String getCodigoRuta() {
        return codigoRuta;
    }

    public static int getMinutos(String horaCompleta) {
        int minutos = Integer.parseInt(horaCompleta) % 100;
        return minutos;
    }


    public static int getHoras(String horaCompleta) {
        int horas = Integer.parseInt(horaCompleta) / 100;
        return horas;
    }
}