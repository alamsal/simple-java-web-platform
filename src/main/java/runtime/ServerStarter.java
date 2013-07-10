package runtime;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class ServerStarter {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);

        WebAppContext context = new WebAppContext();
        context.setContextPath("/");

        if(ServerStarter.class.getClassLoader().getResource("WEB-INF") != null)
            context.setWar(ServerStarter.class.getProtectionDomain().getCodeSource().getLocation().toExternalForm());
        else
            context.setResourceBase("src/main/webapp");

        server.setHandler(context);

        server.start();
        server.join();
    }
}
