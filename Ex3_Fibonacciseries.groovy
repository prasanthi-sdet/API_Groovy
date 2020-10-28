package groovypractice

class Ex3_Fibonacciseries {
	static void main(args) {
		int x=0,y=1,n=10
		print x
		n.times { 
			(x,y)=[y,x+y]
			print " ,$x"
		}
		
	}
}
