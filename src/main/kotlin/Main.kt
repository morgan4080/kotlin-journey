fun main() {
    println("This is a command line representation of the keyword cipher.")

    print("Select Encrypt (E) to encrypt, or (D) to decrypt: ")

    fun encryptedText(): String {
        print("Provide a PLAIN TEXT to encrypt: ")
        val plainText = readln()

        print("Provide a SECRET KEY: ")
        val secretKey = readln()

        val keywordCipher = KeywordCipher(secretKey, plainText)

        return keywordCipher.encryptPlainText()
    }

    fun decryptedText(): String {
        print("Provide a CIPHER TEXT: ")
        val cipherText = readln()

        print("Provide a SECRET KEY: ")
        val secretKey = readln()

        val keywordCipher = KeywordCipher(secretKey, cipherText)

        return keywordCipher.decryptCipherText()
    }

    when (readLine()) {
        "E" -> println(encryptedText())
        "e" -> println(encryptedText())
        "D" -> println(decryptedText())
        "d" -> println(decryptedText())
        else -> {
            println("characters not supported")
        }
    }
}