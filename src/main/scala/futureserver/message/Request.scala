package futureserver.message

abstract class Request(messageId: String, payload: String) {

  def encode = s"$messageId:$payload\n"

}

case class GetRequest(id: String) extends Request("Get", id)

object AllRequest {

  private val Regex= "Get:(.*)".r
  
  def unapply(content: String) : Option[GetRequest]= {
    content match {
      case Regex(id) =>
        Some(GetRequest(id))
      case _ =>
        None
    }
  }
}