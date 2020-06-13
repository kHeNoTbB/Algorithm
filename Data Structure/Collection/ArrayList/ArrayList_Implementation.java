public class ArrayList_Implementation {
	private static final int INIT_SIZE = 10;
	static class ArrayList {
		private int size = 0;
		private Object[] elementData = new Object[INIT_SIZE];
		
		private void expandArray() {
			Object[] newArray = new Object[size*2];
			for(int i=0; i<elementData.length; i++) {
				newArray[i] = elementData[i];
			}
			elementData = newArray;
		}
		
		public boolean addLast(Object element) {
			if(elementData.length==size) expandArray();
			elementData[size++] = element;
			return true;
		}
		
		public boolean add(int idx, Object element) {
			if(elementData.length==size) expandArray();
			for(int i=size-1; i>=idx; i--) {
				elementData[i+1] = elementData[i]; 
			}
			elementData[idx] = element;
			size++;
			return true;
		}
		
		public boolean addFirst(Object element) {
			return add(0, element);
		}
		
		public Object remove(int idx) {
			Object removed = elementData[idx];			
			for(int i=idx+1; i<=size-1; i++) {
				elementData[i-1] = elementData[i];
			}
			elementData[size--] = null;
			return removed;
		}
		
		public Object removeFirst() {
			return remove(0);
		}
		
		public Object removeLast() {
			return remove(size-1);
		}
		
		public Object get(int idx) {
			return elementData[idx];
		}
		
		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("ArrayList = [");
			for(int i=0; i<size; i++) {
				sb.append(elementData[i]);
				if(i<size-1) sb.append(",");
			}
			return sb.append("]").toString();
		}
		
	}
	
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.addLast(10);
		arrayList.addLast(20);
		arrayList.addLast(30);
		arrayList.addLast(40);
		arrayList.addLast(10);
		arrayList.addLast(20);
		arrayList.addLast(30);
		arrayList.addLast(40);
		arrayList.addLast(10);
		arrayList.addLast(20);
		arrayList.add(2, 2000);
		System.out.println(arrayList.toString());
		
		arrayList.remove(6);
		arrayList.removeFirst();
		arrayList.removeLast();
		System.out.println(arrayList.toString());
		
		arrayList.get(0);
		System.out.println(arrayList.get(1));
	}
}
