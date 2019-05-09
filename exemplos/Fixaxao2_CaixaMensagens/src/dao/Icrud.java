package dao;

public interface Icrud<T> {

	public abstract boolean create(T obj);
	
	public abstract T recuperate(String key);
	
	public abstract T recuperate(int key);
	
	public abstract boolean update(T obj);
	
	public abstract boolean delete(T obj);
	
}
