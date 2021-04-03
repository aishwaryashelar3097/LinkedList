public class LinkedList {
	public interface Inode<K> {
		K getKey();
		void setKey(K key);
		INode<K> getNext();
		void setNext(INode<K> next);
	}
	public class MyNode<K> implements INode<K> {
		private K key;
		private INode<K> next;
		public MyNode(K key)
		
		@Override
		public K getKey() {return key}
		
		@Override
		public void setKey(K key) {this.key=key;}
		public Inode <K> getNext {return next;}
		public void setNext (INode <K> next) {this.next =next;}
		
		@Override
		public String toString() {
			StringBuilder myNodeString = new StringBuilder();
			myNodeString.append("MyNode(" + Key=")		"
					.append(key).append('')
					if (next!=null)
						myNodeString.append("->").append(next);
			return myNodeString.toString();
		}
	}
	public class MyLinkedList<K> {
		public INode<K>head;
		public INode<K>tail;
		public MyLinkedList()
		
		public void add(INode<K>newNode) {
			if (this.tail==null) {
				this.tail=newNode;
			}
		}
	}
