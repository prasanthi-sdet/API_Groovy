package groovypractice

class Ex7_Files {
	static void main(args) {
		File file = new File("src/newGroovy.txt")
		file.createNewFile();
		file.write("A quick brown Fox jumped over the lazy Cow\n")
		file.append("John Jimbo jingeled happily ever after\nTh1\$ 1\$ v3ry c0nfus1ng")
		file.each { line ->
			if(line ==~ /^A.*Cow$/) {
				println "Line ends with Cow is: $line"
			}
		}
		file.each { line ->
			if(line ==~ /^J.*/) {
				println "Line start with capital letter 'J' is: $line"
			}
		}
		
		"""
		println file.getText()
		"""
		
		def matchstr=file.getText() =~ /\S+er/
		println matchstr.findAll()
		
		matchstr=file.getText() =~ /\S*\d\W/
		println matchstr.findAll()
	}
}
 