package core;

public interface IStack {
	int getSize() ;
	boolean isEmpty() ;
	void push(Object elm)throws Exception;
	Object top();
	boolean IsFull();
	Object pop();

}
