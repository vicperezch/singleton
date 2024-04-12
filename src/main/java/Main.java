/**
 * @author Victor Pérez
 * @since 25/03/2024
 * Clase principal para probar el patrón singleton
 */
public class Main {
    public static void main(String[] args) {
        AppConfig config = AppConfig.getInstance();
        config.setServerUrl("http://localhost");
        config.setPort(8080);
        config.setAdsEnabled(true);
        config.setMaxCacheSize(1024);
        config.setDefaultMaxConnection(4);

        System.out.println("URL servidor: " + config.getServerUrl());
        System.out.println("Puerto: " + config.getPort());
        System.out.println("Anuncios permitidos: " + config.isAdsEnabled());
        System.out.println("Máximo tamaño de caché: " + config.getMaxCacheSize());
        System.out.println("Máxima conexión por defecto: " + config.getDefaultMaxConnection());
    }
}