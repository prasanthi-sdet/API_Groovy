package groovypractice

class Ex5_Lists {
	static void main(args) {
		def map=[:]
		map.put(1,"Cats")
		map.put(2, "Dogs")
		map.put(3, "Wolves")
		
		for (def item:map) {
			println item
		}
		
		map=map.plus([5:"Donkeys",4:"Horses"])
		
		println map.values().sort {it.length()}		
		
		
	}
}
