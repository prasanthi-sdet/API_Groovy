package groovypractice

class Ex6_Maps {
	static void main(args) {
		def list=[11, 2, 19, 5, "Mango", "Apple", "Watermelon"]
		def numlist=[], strlist=[]
		
		/*list.forEach{
			if(it.getClass() == "class java.lang.Integer") {
				numlist.add(it)
			}
			if(it.getClass() == "class java.lang.String"){
				strlist.add(it)
			}			
		}*/
		println "StringList: ${list.minus([11,2,19,5]).sort()}"
		println "NumberList: ${list.minus(["Mango", "Apple", "Watermelon"]).sort()}"
	}
}
