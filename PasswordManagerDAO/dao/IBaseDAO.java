package dao;

import java.util.List;

public interface IBaseDAO<T> {
    void insertar(T entidad);
    void actualizar(T entidad);
    void eliminar(String id);
    T obtenerPorId(String id);
    List<T> obtenerTodos();
}
