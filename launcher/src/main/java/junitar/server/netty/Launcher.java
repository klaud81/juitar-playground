package junitar.server.netty;

import java.io.IOException;

/**
 * @author sha1n
 * Date: 1/22/13
 */
public class Launcher {

    public static final void main(String... args) throws IOException {
        NettySpringContainer container = new NettySpringContainer();
        container.start();
    }

}
