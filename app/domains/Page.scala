package domains

object Page extends Enumeration {

  type Page = Value

  val HOME = Value("home")
  val KNOWLEDGE = Value("knowledge")
  val BUSINESS = Value("business")
  val FORUM = Value("forum")
  val HIRING = Value("hiring")

}
