package kotlin_intro.answers

// Application Plugin

class ApplicationPlugin(var mainClassName: String = "", var jvmOpts: List<String> = listOf()) {
    fun execute() = "java ${jvmOpts.joinToString(" ")} -cp app.jar $mainClassName"
}

fun application(configurer: ApplicationPlugin.() -> Unit) = ApplicationPlugin().apply(configurer)


// HTML Builder!

fun html(block: HTML.() -> Unit) = HTML().apply(block).toString()

class HTML {

    private val body = Body()

    fun body(block: Body.() -> Unit) {
        body.apply(block)
    }

    override fun toString() = body.toString()
}

class Body {
    private var divs = listOf<Div>()

    fun div(block: Div.() -> Unit) {
        divs += Div().apply(block)
    }

    override fun toString() = """
            <html>
                <body>
                    ${divs.joinToString(" ") { it.toString() }}
                </body>
            </html>
        """.trimIndent()
}

class Div {
    val attributes = mutableMapOf<String, String>()

    fun attribute(name: String, value: String) {
        attributes[name] = value
    }

    override fun toString() = "<div ${attributes.map { "${it.key}=\"${it.value}\"" }.joinToString(" ")}></div>"
}
