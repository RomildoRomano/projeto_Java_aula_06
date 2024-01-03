package interfaces;

public interface GenericRepository<T> {
	
	void exportar(T obj) throws Exception;

}
