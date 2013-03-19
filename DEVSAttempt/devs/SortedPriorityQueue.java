package devs;

import java.util.Comparator;
import java.util.LinkedList;


public class SortedPriorityQueue<K, V> implements PriorityQueue<K, V> {
	public LinkedList<Entry<K, V>> entries;
	public Comparator<Entry<K, V>> comparator;
	
	public SortedPriorityQueue() {
		entries = new LinkedList<Entry<K, V>>();
		comparator = new DefaultComparator<Entry<K, V>>();
	}

	public SortedPriorityQueue(Comparator<Entry<K, V>> comparator) {
		this.comparator = comparator;
	}

	
	@Override
	public boolean isEmpty() {
		return entries.size() == 0;
	}

	@Override
	public int size() {
		return entries.size();
	}

	@Override
	public Entry<K, V> min() {
		return list.
	}

	@Override
	public void insert() {

	}

	@Override
	public void removeMin() {
		// TODO Auto-generated method stub

	}
}
