

def isVowel(c: Char) : Boolean = "aeiou".contains(c)

isVowel('a')

for(c <- "aeiou") println(c);

def vowelsFor(s: String) = {
  var ret = "";
  for(c <- s)
    if (isVowel(c)) ret += c
  ret
}

vowelsFor("murcielago");

def vowelsYield(s: String)  =
  for(c <- s if isVowel(c)) yield c

vowelsYield("murcielago");


def vowelsYieldRecursive(s: String) : String = {
  if (s.isEmpty) return "";
  if (isVowel(s.head)) return s.head + vowelsYieldRecursive(s.tail)
  else return vowelsYieldRecursive(s.tail)
}

vowelsYieldRecursive("murcielago");


def vowelsYieldWhile(s: String) = {
  var ret = ""
  var s1 = s
  while (!s1.isEmpty) {
    if (isVowel(s1.head))
      ret += s1.head
    s1 = s1.tail
  }
  ret
}

vowelsYieldWhile("murcielago");


def isVowel(c: Char, vowels : String) : Boolean = vowels.contains(c)

def vowels(s: String, vowelsDef : String = "aeiou", ignoreCase : Boolean = true) : String =
  if(ignoreCase)
    vowels(s.toLowerCase, vowelsDef.toLowerCase, false)
  else
    for(c <- s if isVowel(c, vowelsDef)) yield c

vowels("Murcielago", "m", true);
