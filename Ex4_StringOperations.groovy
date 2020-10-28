package groovypractice

class Ex4_StringOperations {
	static void main(args) {
		def str="This is a Groovy Language"
		println "Reverse String of $str: "+ str.reverse()
		println "SubString: "+ str.substring(10, str.length())
		println "Words of the String: "+str.split(" ")
		println "Remove the words: "+str.minus("Groovy")
		println "Uppercase: "+str.toUpperCase()
		println "Lowercase:"+str.toLowerCase()
	}
}

