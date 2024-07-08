// Subject interface
interface Internet {
    void connectTo(String serverHost);
}

// Real Subject
class RealInternet implements Internet {
    @Override
    public void connectTo(String serverHost) {
        System.out.println("Connecting to " + serverHost);
    }
}

// Proxy
class ProxyInternet implements Internet {
    private RealInternet realInternet;
    private static final String[] bannedSites = {"blockedSite1.com", "blockedSite2.com"};

    @Override
    public void connectTo(String serverHost) {
        if (isAccessAllowed(serverHost)) {
            if (realInternet == null) {
                realInternet = new RealInternet();
            }
            realInternet.connectTo(serverHost);
        } else {
            System.out.println("Access denied to " + serverHost);
        }
    }

    private boolean isAccessAllowed(String serverHost) {
        for (String site : bannedSites) {
            if (serverHost.contains(site)) {
                return false;
            }
        }
        return true;
    }
}

// Client
public class ProxyExample {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();

        internet.connectTo("example.com");
        internet.connectTo("blockedSite1.com");
        internet.connectTo("example2.com");
    }
}
