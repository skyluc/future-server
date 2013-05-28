package futureserver.server

import java.net.Socket
import java.io.StringReader
import java.io.InputStreamReader
import java.io.BufferedReader
import futureserver.message.GetRequest

object IncomingRequest {

  def apply(socket: Socket, server: Server) {
    new IncomingRequest(socket, server).process()
  }

}

class IncomingRequest private (socket: Socket, server: Server) {

  def process() {
    try {
      val reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))
      val content = reader.readLine()
      println(content)
      
//      content match {
//        case GetRequest(id) =>
//          processGetRequest(id)
//      }
      
    } finally {
      println('\n')
      socket.close()
    }
  }
  
  private def processAllRequest() {
    
  }

}