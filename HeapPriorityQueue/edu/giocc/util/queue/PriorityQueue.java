package edu.giocc.util.queue;

import edu.giocc.util.Queue;

/**
 * Priority Queue interface for prioritizing the removal sequence of elements.
 * 
 * @author Gio Carlo Cielo
 * 
 * @param <E> the elements contained by this queue.
 */
public interface PriorityQueue<E> extends Queue<E> {
	/**
	 * Returns true if this queue is empty.
	 * 
	 * @return true if this queue is empty.
	 */
	public boolean isEmpty();

	/**
	 * Returns the size of this queue.
	 * 
	 * @return the size of this queue.
	 */
	public int size();

	/**
	 * Clears the this queue and sets the size to zero.
	 */
	public void clear();
}
