package extreme.test

import com.sun.net.httpserver.HttpHandler
import com.sun.net.httpserver.HttpServer

class Server {

    def name
    def port

    static void main(args) {
        new Server().start()
    }

    Server() {
        name = System.properties['extreme.name'] ?: System.properties['user.name']
        port = (System.properties['extreme.port'] ?: "8080") as int
    }

    void start() {
        def server = HttpServer.create(new InetSocketAddress(InetAddress.localHost.hostAddress, port), 0)
        def context = "/"
        def handler = { exchange ->
            exchange.sendResponseHeaders(200, 0)
            exchange.responseBody.write(name.bytes)
            exchange.close()
        } as HttpHandler
        server.createContext(context, handler)
        println "Listening as $name on http:/$server.address$context"
        server.start()
    }
    
}
