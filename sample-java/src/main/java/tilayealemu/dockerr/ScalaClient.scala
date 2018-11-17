package tilayealemu.dockerr

import org.rosuda.REngine.Rserve.RConnection

object ScalaClient {

  def main(args: Array[String]): Unit = {

    println("Establishing connection to Rserve")
    val connection = new RConnection("127.0.0.1", 6311)
    println("Defining function")
    connection.eval("multiply=function(a,b){return(a*b)}")
    println("Calling function")
    val result = connection.eval("multiply(4,5)")
    println("Result: " + result.asDouble())
    connection.close()
  }
}
