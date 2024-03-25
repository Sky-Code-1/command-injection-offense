
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[String],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(fileNames: List[String], result: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.43*/("""


"""),_display_(/*4.2*/main("Appsec Command Injection Testing")/*4.42*/ {_display_(Seq[Any](format.raw/*4.44*/("""
  """),format.raw/*5.3*/("""<h1>Welcome to Appsec Scala Command Injection Testing!</h1>
  """),_display_(/*6.4*/for(name <- fileNames) yield /*6.26*/{_display_(Seq[Any](format.raw/*6.27*/("""
    """),format.raw/*7.5*/("""<p>"""),_display_(/*7.9*/name),format.raw/*7.13*/("""</p>
  """)))}),format.raw/*8.4*/("""
  """),format.raw/*9.3*/("""<form action="/delete">
    <div>
      <label for="filename">Enter the name of file to from the list above to delete</label>
      <input id="filename" type="text" name="filename" placeholder="Enter File Name">
      <button class="delete-btn">Delete</button>
    </div>
  </form>
  """),_display_(if(result.length() > 0)/*16.27*/{_display_(Seq[Any](format.raw/*16.28*/("""
    """),format.raw/*17.5*/("""<p>Result of previous command</p>
    <p>"""),_display_(/*18.9*/result),format.raw/*18.15*/("""</p>
  """)))} else {null} ),format.raw/*19.4*/("""
""")))}),format.raw/*20.2*/("""
"""))
      }
    }
  }

  def render(fileNames:List[String],result:String): play.twirl.api.HtmlFormat.Appendable = apply(fileNames,result)

  def f:((List[String],String) => play.twirl.api.HtmlFormat.Appendable) = (fileNames,result) => apply(fileNames,result)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/index.scala.html
                  HASH: 4ebe513e6fd4735d5616d62f33b3228c8177e128
                  MATRIX: 742->1|878->42|910->49|958->89|997->91|1027->95|1116->159|1153->181|1191->182|1223->188|1252->192|1276->196|1314->205|1344->209|1686->524|1725->525|1758->531|1827->574|1854->580|1906->589|1939->592
                  LINES: 21->1|26->1|29->4|29->4|29->4|30->5|31->6|31->6|31->6|32->7|32->7|32->7|33->8|34->9|41->16|41->16|42->17|43->18|43->18|44->19|45->20
                  -- GENERATED --
              */
          