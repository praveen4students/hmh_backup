package hmh.util;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
 
public class Triple<L, M, R> {
	private final L left;
	private final M middle;
	private final R right;
 
	/**
	* Constructor. Accepts two objects and constructs a pair.
	*Neither can be null.
	*
	* @param left
	* The left object
	* @param right
	* The right object
	*/
	public Triple(L left, M middle, R right) {
		//Validate.notNull(left);
		this.left = left;
		//Validate.notNull(middle);
		this.middle = middle;
		//Validate.notNull(right);
		this.right = right;
	}
	 
	/**
	* Returns the left item of the pair.
	*
	* @return the left item
	*/
	public L getLeft() {
		return left;
	}
	 
	/**
	* Returns the right item of the pair.
	*
	* @return the left item
	*/
	public M getMiddle() {
		return middle;
	}
	 
	public R getRight() {
		return right;
	}
	 
	/**
	* Returns true if the the two pairs are equal.
	*
	* @param other
	* some other pair
	* @return true if equal
	*/
	@Override
	public boolean equals(Object other) {
		if (other == this)
			return true;
		if (!(other instanceof Triple))
			return false;
		Triple<?, ?, ?> that = (Triple<?, ?, ?>) other;
		return new EqualsBuilder().
			append(this.left, that.left).
			append(this.middle, that.middle).
			append(this.right, that.right).
			isEquals();
	}
	 
	/**
	* Returns a hash code for this pair
	*
	* @return the hash code
	*/
	@Override
	public int hashCode() {
		return new HashCodeBuilder().
			append(this.left).
			append(this.middle).
			append(this.right).
			toHashCode();
	}
	 
	/**
	* Returns the string form of this pair: "(left,right)"
	*/
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("(");
		sb.append(left.toString());
		sb.append(",");
		sb.append(middle.toString());
		sb.append(",");
		sb.append(right.toString());
		sb.append(")");
		return sb.toString();
	}
}
