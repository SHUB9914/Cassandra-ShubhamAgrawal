import com.datastax.driver.core.Cluster

class Opertion {

  val cluster = Cluster.builder().addContactPoint("127.0.0.1").build()

  val session = cluster.connect("database")

  def userByEmail(email:String) = {

    val res = session.execute(s"SELECT * FROM user where email='$email'")

    val iterate = res.iterator()

    while (iterate.hasNext) {

      println(iterate.next())

    }
    
  }

  def videoByName(name:String) = {

    val res = session.execute(s"SELECT * FROM videobyname where video_name='$name'")

    val iterate = res.iterator()

    while (iterate.hasNext) {

      println(iterate.next())

    }
    
  }

  def videoByUserIdAndYear(id:Int,year:Int) = {

    val res = session.execute(s"SELECT * FROM videobyuserid where userid=$id AND year>$year")

    val iterate = res.iterator()

    while (iterate.hasNext) {

      println(iterate.next())

    }
  }

  def videoByUserIdAndYearDesc(id:Int,year:Int) = {

    val res = session.execute(s"SELECT * FROM videobyuserid where userid=$id AND year>$year ORDER BY year DESC")

    val iterate = res.iterator()

    while (iterate.hasNext) {

      println(iterate.next())

    }
    cluster.close()
  }
}
