import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.encodeToString
@Serializable
data class Data(val a: Int, val b: String)
fun main() {
    println("Hello World!")

    val json = Json.encodeToString(Data(42, "str"))
    println(json)
}