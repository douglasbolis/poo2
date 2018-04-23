package example.hibernate.persistencia;

import example.hibernate.model.Usuario;

/**
 *
 * @author douglas
 */
public interface UsuarioDAO extends GenericDAO<Usuario> {
  public Usuario buscaUsuarioPorNomeESenha(String nome, String senha);
}
