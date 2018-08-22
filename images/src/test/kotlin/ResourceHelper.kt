import java.io.InputStreamReader

object ResourceHelper {

    fun getFileAsString(relPath: String): String {
//        ClassLoader.getSystemClassLoader()
        val fileStream = javaClass.classLoader.getResourceAsStream(relPath)
//        val fileStream = javaClass<T>().getClassLoader().getResourceAsStream(relPath)
        val fileReader: InputStreamReader? = fileStream.reader()
        val path: String? = javaClass.classLoader.getResource(relPath)?.getPath()
        println(path ?: "File not found!")
        return fileReader?.readText() ?: "// error: file not found or null"
    }
}