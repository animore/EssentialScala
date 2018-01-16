def badness = throw new Exception("Error")

null

val bar = if(true) 123 else badness

val baz = if(false) "it worked" else null