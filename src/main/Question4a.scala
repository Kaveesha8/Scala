object ScalaTestExample4a {
  def main(args:Array [String]): Unit = {

      def wage(hours: Int):Int=hours*250 //wage is a function that takes an integer and returns an integer

      def ot(hours: Int):Int=hours*85 //ot is a function that takes an integer and returns an integer

      def income(hour1:Int,hour2:Int):Int=wage(hour1)+ot(hour2) //income is a function that takes two integers and returns an integer

      def tax(income:Int):Int =income*12/100//tax is a function that takes an integer and returns an integer

      def takeHome(hour1:Int,hour2:Int):Int=income(hour1,hour2)-tax(income(hour1,hour2)) //takeHome is a function that takes an integer and returns an integer

      //printf("%d\n",income(40,30)) //prints out the income of 40 hours and 30 hours
      println(takeHome(40,30))//prints out the takeHome of 40 hours and 30 hours








  }
}