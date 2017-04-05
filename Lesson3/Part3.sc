val words = Array("Mary", "had", "a", "little", "lamb", "its", "fleece", "was", "white", "as")

words.groupBy(_.substring(0, 1))

words.groupBy(_.substring(0, 1)).getOrElse("w",0)


words.groupBy(_.length)

words.groupBy(_.length).getOrElse(1,0)
