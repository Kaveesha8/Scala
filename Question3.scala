import scala.compiletime.ops.float
object ScalaTestExample2 {
  def main(args: Array[String]) = {
    var a:Int=2;
    var b:Int=3;
    var c:Int=4;
    var d:Int=5;
    var k:Float=4.3;
    var e:Int;

    b-= 1;
    d=-1;
    println(b*a+c*d);

    a=+1;
    println(a);

    println(-2*(g-k)+c);

    e=c+1;
    println(e);

    
    println((c+=1)*(a=+1));

  }
}