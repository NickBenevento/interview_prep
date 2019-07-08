def recurring (string):
    letters = {}
    for letter in string:
        if letters.has_key(letter):
            return letter
        letters[letter] = 1

    return None

print("hello")
string = "abcdefd"
print("first recurring character in %s is %s" % (string, recurring(string)))
