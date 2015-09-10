package extreme.test

import org.junit.Test


class ServerTest {
    
    @Test
    void init_noSystemPropsSet_shouldInitWithDefaults() {
        System.clearProperty 'extreme.name'
        System.clearProperty 'extreme.port'
        Server server = new Server()
        assert server.name == System.properties['user.name']
        assert server.port == 8080
    }

    @Test
    void init_SystemPropsSet_shouldInitWithProps() {
        def name = "some name"
        def port = "8181"
        System.properties['extreme.name'] = name
        System.properties['extreme.port'] = port
        Server server = new Server()
        assert server.name == name
        assert server.port == port as int
    }
    
}
