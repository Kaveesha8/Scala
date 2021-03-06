object ScalaTestExample4b {
  def main(args: Array[String]): Unit = {


    def attendees(price: Int): Int = 120 + (15 - price) / 5 * 20

    def revenue(price: Int): Int = attendees(price) * price

    def cost(price: Int): Int = 500 + 3 * attendees(price)

    def profit(price: Int): Int = revenue(price) - cost(price)

      println(profit(24))

  }
}