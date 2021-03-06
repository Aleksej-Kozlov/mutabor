package mutabor;

import java.util.Collection;
import java.util.Iterator;

/**
 * Duplicates read-only methods of {@link Collection} API.
 * @param <E> the type of elements in this collection
 */
public interface ReadOnlyCollection<E> extends Iterable<E> {
	
	/**
	 * Returns the number of elements in this collection. If this collection
	 * contains more than <tt>Integer.MAX_VALUE</tt> elements, returns
	 * <tt>Integer.MAX_VALUE</tt>.
	 *
	 * @return the number of elements in this collection
	 */
	int size();
	
	/**
	 * Returns <tt>true</tt> if this collection contains no elements.
	 *
	 * @return <tt>true</tt> if this collection contains no elements
	 */
	boolean isEmpty();
	
	/**
	 * Returns <tt>true</tt> if this collection contains the specified element.
	 * More formally, returns <tt>true</tt> if and only if this collection
	 * contains at least one element <tt>e</tt> such that
	 * <tt>(o==null&nbsp;?&nbsp;e==null&nbsp;:&nbsp;o.equals(e))</tt>.
	 *
	 * @param o element whose presence in this collection is to be tested
	 * @return <tt>true</tt> if this collection contains the specified
	 * element
	 * @throws ClassCastException if the type of the specified element
	 * is incompatible with this collection
	 * @throws NullPointerException if the specified element is null and this
	 * collection does not permit null elements
	 */
	boolean contains(Object o);
	
	/**
	 * Returns <tt>true</tt> if this collection contains all of the elements
	 * in the specified collection.
	 *
	 * @param c collection to be checked for containment in this collection
	 * @return <tt>true</tt> if this collection contains all of the elements
	 * in the specified collection
	 * @throws ClassCastException if the types of one or more elements
	 * in the specified collection are incompatible with this
	 * collection
	 * @throws NullPointerException if the specified collection contains one
	 * or more null elements and this collection does not permit null
	 * elements or if the specified collection is null.
	 * @see	#contains(Object)
	 */
	boolean containsAll(Iterable<?> c);
	
	/**
	 * Returns an iterator over the elements in this collection. There are no
	 * guarantees concerning the order in which the elements are returned
	 * (unless this collection is an instance of some class that provides a
	 * guarantee).
	 *
	 * @return an <tt>Iterator</tt> over the elements in this collection
	 */
	@Override
	Iterator<E> iterator();
	
	/**
	 * Returns an array containing all of the elements in this collection.
	 * If this collection makes any guarantees as to what order its elements
	 * are returned by its iterator, this method must return the elements in
	 * the same order.
	 *
	 * <p>The returned array will be "safe" in that no references to it are
	 * maintained by this collection. (In other words, this method must
	 * allocate a new array even if this collection is backed by an array).
	 * The caller is thus free to modify the returned array.
	 *
	 * <p>This method acts as bridge between array-based and collection-based
	 * APIs.
	 *
	 * @return an array containing all of the elements in this collection
	 */
	Object[] toArray();
	
	/**
	 * Returns an array containing all of the elements in this collection;
	 * the runtime type of the returned array is that of the specified array.
	 * If the collection fits in the specified array, it is returned therein.
	 * Otherwise, a new array is allocated with the runtime type of the
	 * specified array and the size of this collection.
	 *
	 * <p>If this collection fits in the specified array with room to spare
	 * (i.e., the array has more elements than this collection), the element
	 * in the array immediately following the end of the collection is set to
	 * <tt>null</tt>. (This is useful in determining the length of this
	 * collection <i>only</i> if the caller knows that this collection does
	 * not contain any <tt>null</tt> elements.)
	 *
	 * <p>If this collection makes any guarantees as to what order its elements
	 * are returned by its iterator, this method must return the elements in
	 * the same order.
	 *
	 * <p>Like the {@link #toArray()} method, this method acts as bridge between
	 * array-based and collection-based APIs. Further, this method allows
	 * precise control over the runtime type of the output array, and may,
	 * under certain circumstances, be used to save allocation costs.
	 *
	 * <p>Suppose <tt>x</tt> is a collection known to contain only strings.
	 * The following code can be used to dump the collection into a newly
	 * allocated array of <tt>String</tt>:
	 *
	 * <pre>
	 *     String[] y = x.toArray(new String[0]);</pre>
	 *
	 * Note that <tt>toArray(new Object[0])</tt> is identical in function to
	 * <tt>toArray()</tt>.
	 *
	 * @param a the array into which the elements of this collection are to be
	 * stored, if it is big enough; otherwise, a new array of the same
	 * runtime type is allocated for this purpose.
	 * @return an array containing all of the elements in this collection
	 * @throws ArrayStoreException if the runtime type of the specified array
	 * is not a supertype of the runtime type of every element in
	 * this collection
	 * @throws NullPointerException if the specified array is null
	 */
	<T> T[] toArray(T[] a);
}
