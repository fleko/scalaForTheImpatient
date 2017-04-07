abstract class Item
case class Article(description: String, price: Double) extends Item
case class Bundle(description: String, discount: Double, items: Item*) extends Item


val book = Article("Scala for the Impatient", 39.95)
val whiskey = Article("Old Potrero Straight Rye Whiskey ", 79.95)

val gift = Bundle("The book and a bottle of whiskey", 10.0, book, whiskey)


def price(it: Item) : Double = {
  it match {
    case Article(_, p) => p
    case Bundle(_, disc, its @ _*) => its.map(price).sum - disc
  }
}

price(book)
price(gift)


val special = Bundle("Father's day special", 20.0,
  Article("Scala for the Impatient", 39.95),
  Bundle("Anchor Distillery Sampler", 10.0,
    Article("Old Potrero Straight Rye Whiskey", 79.95),
    Article("Junípero Gin", 32.95)))

def getFirstArticle(it: Item) : Item = {
  it match {
    case Article(d, p) => Article(d,p)
    case Bundle(d, disc, its @ _*) => its.map(getFirstArticle).head
  }
}

getFirstArticle(special)

val Bundle(_,_,Article(descr,pr), _*) = special