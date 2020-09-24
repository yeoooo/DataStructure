
public class DNode<E> {
	public DNode leftLink;
	public E data;
	public DNode rightLink;
	
	public DNode(DNode leftLink, E data, DNode rightLink) {
		super();
		this.leftLink = leftLink;
		this.data = data;
		this.rightLink = rightLink;
	}


	public DNode<E> getLeftLink() {
		return leftLink;
	}

	public void setLeftLink(DNode<E> leftLink) {
		this.leftLink = leftLink;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public DNode<E> getRightLink() {
		return rightLink;
	}

	public void setRightLink(DNode<E> rightLink) {
		this.rightLink = rightLink;
	}
}