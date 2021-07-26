import scala.collection.mutable

val something = Either[Throwable, String]
val something2 = Either[Nothing, String]



val something = null


class Bee(val myVal: Int) {
  //
  //  private this(myVal: Int, value: String) {
  //    this(myVal)
  //  }

  def this(myVal: Int, v1: String) {

  }

  private val honey: String = "honey"
  0
  private def printSomething() = Bee.something

  def som: Int = Bee.something

}

object Bee {

  def create(): Bee = {
    new Bee(4, "sss")
  }

  private def print(f: Bee) = {
    println(f.honey)
  }

  private val something : Int =4
}

new Bee().honey


class Email(
             var somethingElse: Int
           ) {

  val someExtraValue = 46


  def canEqual(other: Any): Boolean = other.isInstanceOf[Email]

  override def equals(other: Any): Boolean = other match {
    case that: Email =>
      (that canEqual this) &&
        someExtraValue == that.someExtraValue
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(someExtraValue)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }
}

//x = f(a)
//y = g(x)
//z = h(y)
//
//
//
//
//x = g(f)(a)
//h = x(a)
//
//
//h(g((f(a))))
//x(g)(f)(a)



// dict care sa dea eroare cand cheia deja exista
//if (dict.exists()){
//
//}
