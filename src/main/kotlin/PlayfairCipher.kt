class PlayfairCipher constructor(val inputText: String, val secretKey: String) {
    private fun generateKeySquare() {
        /*
            5×5 grid of alphabets that acts as the key for encrypting the plaintext
            Each of the 25 alphabets must be unique and one letter of the alphabet (usually J) is omitted from the table (as the table can hold only 25 alphabets).
            If the plaintext contains J, then it is replaced by letter I
        .*/

        /*
            The initial alphabets in the key square are the unique alphabets of the key in the order in which they appear followed by the remaining letters of the alphabet in order.

            PlainText: "instruments"
            After Split: 'in' 'st' 'ru' 'me' 'nt' 'sz'

            1. Pair cannot be made with same letter. Break the letter in single and add a bogus letter to the previous letter.

                Plain Text: “hello”

                After Split: ‘he’ ‘lx’ ‘lo’

                Here ‘x’ is the bogus letter.

            2. If the letter is standing alone in the process of pairing, then add an extra bogus letter with the alone letter

                Plain Text: “helloe”

                AfterSplit: ‘he’ ‘lx’ ‘lo’ ‘ez’

                Here ‘z’  is the bogus letter.
        */




    }

    private fun encryptPlainText(): String {
        return ""
    }

    private fun decryptCipherText(): String {
        return ""
    }
}