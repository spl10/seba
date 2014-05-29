
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object profSignIn extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*7.17*/title)),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css"))),format.raw/*8.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*9.59*/routes/*9.65*/.Assets.at("images/favicon.png"))),format.raw/*9.97*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*10.55*/routes/*10.61*/.Assets.at("stylesheets/bootstrap/css/bootstrap.css"))),format.raw/*10.114*/("""">
        <script src=""""),_display_(Seq[Any](/*11.23*/routes/*11.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*11.74*/("""" type="text/javascript"></script>
    </head>
    <body>
        <div class="page-header" style="padding-bottom: 0px; margin-top:5px;">
    	<img src=""""),_display_(Seq[Any](/*15.17*/routes/*15.23*/.Assets.at("images/logo.png"))),format.raw/*15.52*/("""" height="100px" width="300px"alt="Live Feed"> 
    </div> 
       <header class="navbar navbar-static-top bs-docs-nav"  id="top" role="banner">
  		<div class="well btn-group" style="margin-left:400px;margin-top:100px">
  		<p><a type="button" class="btn btn-primary btn-lg btn-block" href=".." style="width:200px;">Tutors</a></p>
  		<p><a type="button" class="btn btn-primary btn-lg btn-block" href=".." style="width:200px;">Students</a></p>
  		</div>
	</header>
	<div class="col-lg-4" style="margin-left:400px;">
	<h1> Please Sign In</h1>
	<div class="input-group" style="margin-top:20px;">
  		<span class="input-group-addon">Username</span>
  		<input type="text" class="form-control" placeholder="Username or e-mail">
	</div>
	<div class="input-group" style="margin-top:20px;">
  		<span class="input-group-addon">Password</span>
  		<input type="text" class="form-control" placeholder="Password">
	</div>
	<div style="margin-top:20px;"><input type="checkbox"> Remember Me  </div>
	<div class="btn-group-justified" style="margin-top:20px;">
		<a class="btn btn-primary" role="button" href="/DF/home/register">  Register  </a>
		<a class="btn btn-success" role="button">  Sign In  </a>
		<a class="btn btn-default" role="button" href="/DF/home/index">  Cancel  </a>
	</div>
</div>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    </body>
</html>"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu May 29 23:10:48 CEST 2014
                    SOURCE: /Users/roshinisachithanandan/Downloads/seba/seba/app/views/profSignIn.scala.html
                    HASH: 96eda0823660b6c978478e7b4cb2fbcb56999315
                    MATRIX: 784->1|908->31|996->84|1022->89|1119->151|1133->157|1188->191|1284->252|1298->258|1351->290|1444->347|1459->353|1535->406|1596->431|1611->437|1678->482|1867->635|1882->641|1933->670
                    LINES: 26->1|29->1|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|43->15|43->15|43->15
                    -- GENERATED --
                */
            