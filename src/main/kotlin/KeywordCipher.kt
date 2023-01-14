class KeywordCipher constructor(private val secretKey: String, private val inputString: String) {

    fun encryptPlainText(): String {
        // ENCRYPT PLAIN TEXT BACK TO PLAIN TEXT

        val plainText1 = stringNoWhiteSpaceMutableList(inputString)

        var cipherText = ""

        for (i in 0..plainText1.lastIndex) {
            cipherText += getSecretKeyToAlphabet(secretKey)[generateAlphabets().indexOf(plainText1[i])]
        }

        return cipherText
    }

    fun decryptCipherText(): String {
        // DECRYPT CIPHER TEXT BACK TO PLAIN TEXT

        val cipherText1 = stringNoWhiteSpaceMutableList(inputString)

        var plainText = ""

        for (i in 0..cipherText1.lastIndex) {
            plainText += generateAlphabets()[getSecretKeyToAlphabet(secretKey).indexOf(cipherText1[i])]
        }

        return plainText
    }

    private fun generateAlphabets(): MutableList<Char> {
        val alphabet = mutableListOf<Char>()

        var charater = 'A'

        while (charater <= 'Z') alphabet.add(charater++)

        return alphabet
    }

    private fun stringNoWhiteSpaceMutableList(str: String): MutableList<Char> {
        return str.uppercase().filterNot { it.isWhitespace() }.toMutableList()
    }

    private fun getSecretKeyToAlphabet(secretKey: String): MutableList<Char> {
        // filter white space and convert string to mutable list

        val secretKey1 = stringNoWhiteSpaceMutableList(secretKey)

        // remove duplicate characters from secret key

        val alphabetSecretKey = secretKey1.distinct().toMutableList()

        // add in alphabets that are not in alphabetSecretKey into the alphabetSecretKey

        for (i in 0..generateAlphabets().lastIndex) {
            if (!alphabetSecretKey.contains(generateAlphabets()[i])) {
                alphabetSecretKey.add(generateAlphabets()[i])
            }
        }

        return alphabetSecretKey
    }

}