import java.awt.Desktop
import java.io.IOException
import java.net.URI
import java.util.logging.Level

fun main() {
    val url = "http://bbs.ruliweb.com/best"
    try {
        if (Desktop.isDesktopSupported()) {
            val desktop = Desktop.getDesktop()
            if (desktop.isSupported(Desktop.Action.BROWSE)) {
                println("Attempting to open that address in the default browser now...")
                desktop.browse(URI.create(url))
            }
        }
    } catch (e: IOException) {

    } catch (e: InternalError) {
    }

}