package groovypractice

class Ex1_DataTypes {
	static void main(args) {
		def x
		int y
		def array=[10,20.5,"Hello",true,false,x,y]
		
		array.each { 
			println "Value is: "+it+" and Datatype is: "+it.getClass()
		}
		
	}
}
