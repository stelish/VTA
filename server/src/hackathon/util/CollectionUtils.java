package hackathon.util;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.google.common.collect.Lists;

public class CollectionUtils {

	/**
	 * From http://stackoverflow.com/a/23870892
	 * 
	 * Combines several collections of elements and create permutations of all
	 * of them, taking one element from each collection, and keeping the same
	 * order in resultant lists as the one in original list of collections.
	 * 
	 * <ul>
	 * Example
	 * <li>Input = { {a,b,c} , {1,2,3,4} }</li>
	 * <li>Output = { {a,1} , {a,2} , {a,3} , {a,4} , {b,1} , {b,2} , {b,3} ,
	 * {b,4} , {c,1} , {c,2} , {c,3} , {c,4} }</li>
	 * </ul>
	 * 
	 * @param collections
	 *            Original list of collections which elements have to be
	 *            combined.
	 * @return Resultant collection of lists with all permutations of original
	 *         list.
	 */
	public static <T> Collection<List<T>> permutations(
			List<Collection<T>> collections) {
		if (collections == null || collections.isEmpty()) {
			return Collections.emptyList();
		} else {
			Collection<List<T>> res = Lists.newLinkedList();
			permutationsImpl(collections, res, 0, new LinkedList<T>());
			return res;
		}
	}

	/** Recursive implementation for {@link #permutations(List, Collection)} */
	private static <T> void permutationsImpl(List<Collection<T>> ori,
			Collection<List<T>> res, int d, List<T> current) {
		// if depth equals number of original collections, final reached, add
		// and return
		if (d == ori.size()) {
			res.add(current);
			return;
		}

		// iterate from current collection and copy 'current' element N times,
		// one for each element
		Collection<T> currentCollection = ori.get(d);
		for (T element : currentCollection) {
			List<T> copy = Lists.newLinkedList(current);
			copy.add(element);
			permutationsImpl(ori, res, d + 1, copy);
		}
	}

}
