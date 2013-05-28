package futureserver.server

import java.net.ServerSocket
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object Server {

  private val Port = 9090

  def main(args: Array[String]) {
    val server = Server(Port)
    server.start
    readLine
    server.stop
  }

  def apply(port: Int): Server = {
    new Server(new ServerSocket(port))
  }

}

class Server(socket: ServerSocket) {

  def start {
    Future {
      waitForConnection
    }
  }

  def stop {
    socket.close()
  }

  private def waitForConnection {
    val incoming = socket.accept()
    Future {
      IncomingRequest(incoming, this)
    }
    Future {
      waitForConnection
    }
  }

}