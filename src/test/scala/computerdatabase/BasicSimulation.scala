package buyticket

import io.gatling.core.Predef._ // 2
import io.gatling.http.Predef._
import scala.concurrent.duration._


class AccessHomePage extends Simulation { // 3

  val httpConf = http // 4
    .baseURL("http://localhost:9000") // 5
    .baseHeaders(Map("token" -> "53e2f338-dbe0-11e3-b618-1a51128bbc12"))
    .acceptHeader("application/json") // 6
    .acceptLanguageHeader("en-US,en;q=0.5")
    .acceptEncodingHeader("gzip, deflate")
    .userAgentHeader("Mozilla/5.0 (Windows NT 5.1; rv:31.0) Gecko/20100101 Firefox/31.0")


  val scn = scenario("BasicSimulation") // 7
    .exec(http("visit home")  // 8
    .get("/")) // 9
    .pause(1) // 10

  setUp( // 11
    scn.inject(atOnceUsers(3000) // 12
    ).protocols(httpConf)) // 13

}
