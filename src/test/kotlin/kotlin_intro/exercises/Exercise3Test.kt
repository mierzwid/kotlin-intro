package kotlin_intro.exercises

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class Exercise3Test : StringSpec({
    "application plugin" {
//        //given
//        val applicationPlugin = application {
//            mainClassName = "com.cognified.Main"
//            jvmOpts = listOf("-Xms2G", "-Xmx2G")
//        }
//
//        //when
//        val result = applicationPlugin.execute()
//
//        //then
//        result shouldBe "java -Xms2G -Xmx2G -cp app.jar com.cognified.Main"
    }

    "HTML builder" {
//        //given
//        val document = html {
//            body {
//                div {
//                    attribute("id", "id-header")
//                    attribute("class", "header")
//                }
//                div {
//                    attribute("id", "id-content")
//                    attribute("class", "content")
//                }
//                div {
//                    attribute("id", "id-footer")
//                    attribute("class", "footer")
//                }
//            }
//        }
//
//        //when
//        val result = document.toString()
//
//        //then
//        result shouldBe """
//            <html>
//                <body>
//                    <div id="id-header" class="header"></div> <div id="id-content" class="content"></div> <div id="id-footer" class="footer"></div>
//                </body>
//            </html>
//        """.trimIndent()
    }
})