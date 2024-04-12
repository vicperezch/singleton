/**
 * @author Victor Pérez
 * @since 25/03/2024
 * Clase con la configuración de la aplicación
 */
public class AppConfig {
    private static AppConfig instance;
    private String serverUrl;
    private int port;
    private boolean isAdsEnabled;
    private int maxCacheSize;
    private int defaultMaxConnection;

    /**
     * Constructor privado para evitar múltiples instancias
     */
    private AppConfig() {}

    /**
     * Método para obtener la instancia de la clase
     * @return instancia de la clase
     */
    public static AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }

        return instance;
    }

    // Getters y setters
    public static void setInstance(AppConfig instance) {
        AppConfig.instance = instance;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public boolean isAdsEnabled() {
        return isAdsEnabled;
    }

    public void setAdsEnabled(boolean isAdsEnabled) {
        this.isAdsEnabled = isAdsEnabled;
    }

    public int getMaxCacheSize() {
        return maxCacheSize;
    }

    public void setMaxCacheSize(int maxCacheSize) {
        this.maxCacheSize = maxCacheSize;
    }

    public int getDefaultMaxConnection() {
        return defaultMaxConnection;
    }

    public void setDefaultMaxConnection(int defaultMaxConnection) {
        this.defaultMaxConnection = defaultMaxConnection;
    }
}
