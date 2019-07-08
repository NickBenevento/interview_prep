def recurring (string):
    letters = {}
    for letter in string:
        if letters.has_key(letter):
            return letter
        letters[letter] = 1
    return None

string = "abcdefd"
print("first recurring character in %s is %s" % (string, recurring(string)))
