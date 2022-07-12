
package ammonite
package $file.src.main
import _root_.ammonite.interp.api.InterpBridge.{
  value => interp
}
import _root_.ammonite.interp.api.InterpBridge.value.{
  exit,
  scalaVersion
}
import _root_.ammonite.interp.api.IvyConstructor.{
  ArtifactIdExt,
  GroupIdExt
}
import _root_.ammonite.compiler.CompilerExtensions.{
  CompilerInterpAPIExtensions,
  CompilerReplAPIExtensions
}
import _root_.ammonite.runtime.tools.{
  browse,
  grep,
  time,
  tail
}
import _root_.ammonite.compiler.tools.{
  desugar,
  source
}
import _root_.mainargs.{
  arg,
  main
}
import _root_.ammonite.repl.tools.Util.{
  PathRead
}


object scala{
/*<script>*/object ScalaTestExample3 {
  def main(args: Array[String]): Unit = {


    var a:Int=2;
    var b:Int=3;
    var c:Int=4;
    var d:Int=5;
    var k:Double=4.3;
    var e:Int=0;

    b-= 1;
    d-=1;
    println(b*a+c*d);

    a+=1;
    println(a);

    //println(-2*(g-k)+c);

    e=c+1;
    println(e);
    c+=1
    a+=1

    println((c)-(a));



  }
}/*</script>*/ /*<generated>*/
def $main() = { scala.Iterator[String]() }
  override def toString = "scala"
  /*</generated>*/
}
