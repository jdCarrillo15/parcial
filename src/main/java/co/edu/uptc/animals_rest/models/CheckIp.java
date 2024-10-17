package co.edu.uptc.animals_rest.models;

import java.net.InetAddress;

public class CheckIp {

    public String obtenerIP() {
        try {
            InetAddress ip = InetAddress.getLocalHost();
            return ip.getHostAddress();
        } catch (Exception e) {
            return "No se pudo obtener la IP";
        }
    }

}
