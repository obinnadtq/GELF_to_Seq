import org.slf4j.LoggerFactory

fun main(args: Array<String>) {
    val logger = LoggerFactory.getLogger("Gelf Logging")
    val message = "Welcome to Gelf Logging to Seq"
    logger.info(message)
}