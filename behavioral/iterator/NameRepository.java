package designpatterns.behavioral.iterator;

public class NameRepository implements Container {
	
	public String names[] = {"Tom", "Lolsman", "Cocaman", "Eroman"}; 

	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}
	
	private class NameIterator implements Iterator{
		
		int index; 

		@Override
		public boolean hasNext() {
			if(index < names.length)
				return true; 
			else return false; 
		}

		@Override
		public Object next() {
			if(this.hasNext())
				return names[index++]; 
			else return null;
		}
		
	}

}
