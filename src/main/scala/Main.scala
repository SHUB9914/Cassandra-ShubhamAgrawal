import com.datastax.driver.core.Cluster

object Main extends App {

  val obj=new Opertion
  obj.userByEmail("shubham@gmail.com")
  obj.videoByName("ANDAZ")
  obj.videoByUserIdAndYear(1,1994)
  obj.videoByUserIdAndYearDesc(1,1994)

}

